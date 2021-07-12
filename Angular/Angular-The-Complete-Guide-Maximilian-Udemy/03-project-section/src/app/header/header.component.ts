import { Component, EventEmitter, OnDestroy, OnInit, Output } from "@angular/core";
import { Store } from "@ngrx/store";
import { Subscription } from "rxjs";
import { map } from 'rxjs/operators';
import * as fromApp from '../store/app.reducer';
import * as AuthActions from '../auth/store/auth.actions';
import * as RecipeActions from '../recipes/store/recipe.actions';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styles: ['./header.component.css']
})
export class HeaderComponent implements OnInit, OnDestroy {

  isAuthenticated = false;
  private userSub: Subscription;
  collapsed = true

  constructor(private store: Store<fromApp.AppState>) { }

  /* @Output()   
  featureSelected = new EventEmitter<string>();

  onSelect(feature: string) {
      this.featureSelected.emit(feature);
  } */

  ngOnInit() {
    this.userSub = this.store.select('auth').pipe(
      map(authState => authState.user)
    ).subscribe(
      user => {
        this.isAuthenticated = !!user;
        console.log(!user);
        console.log(!!user);
      }
    );
  }

  onSaveData() {
    // this.dataStorageService.storeRecipes()
    this.store.dispatch(new RecipeActions.StoreRecipes());
  }

  onFetchData() {
    // this.dataStorageService.fetchRecipes().subscribe();
    this.store.dispatch( new RecipeActions.FetchRecipes());
  }
  
  onLogout() {
    // this.authService.logout();
    this.store.dispatch(new AuthActions.Logout());
  }

  ngOnDestroy() {
    this.userSub.unsubscribe();
  }
}