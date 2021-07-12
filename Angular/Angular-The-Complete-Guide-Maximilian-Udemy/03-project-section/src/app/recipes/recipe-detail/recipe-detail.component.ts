import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { Store } from '@ngrx/store';
import { Subscription } from 'rxjs';
import { Recipe } from '../recipe.model';
import * as fromApp from '../../store/app.reducer';
import { map, switchMap } from 'rxjs/operators';
import * as RecipeActions from '../store/recipe.actions';
import * as ShoppingListActions from '../../shopping-list/store/shopping-list.actions';

@Component({
  selector: 'app-recipe-detail',
  templateUrl: './recipe-detail.component.html',
  styleUrls: ['./recipe-detail.component.css']
})
export class RecipeDetailComponent implements OnInit {

  // @Input()
  recipe: Recipe;
  paramsSubscription: Subscription;
  id: number;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private store: Store<fromApp.AppState>) { }

  ngOnInit(): void {
    this.paramsSubscription = this.route.params
      .pipe(
        map(params => {
          return +params['id']
        }),
        switchMap(id => {
          this.id = id;
          return this.store.select('recipes');
        }),
        map(recipeState => {
          return recipeState.recipes.find((recipe,i) => {
            return recipe.id === this.id
          })
        })
      )
     .subscribe( recipe => {
        this.recipe = recipe
      })

  }

  onAddToShoppingList(){
    // this.recipeService.addIngredientsToShoppingList(this.recipe.ingredients);
    this.store.dispatch( new ShoppingListActions.AddIngredients(this.recipe.ingredients))
  }

  onEditRecipe() {
    // this.router.navigate(['edit'], {relativeTo: this.route});
    this.router.navigate(['../', this.recipe.id, 'edit'], {relativeTo: this.route})
  }
  onDeleteRecipe() {
    // this.recipeService.deleteRecipe(this.recipe.id);
    this.store.dispatch(new RecipeActions.DeleteRecipe(this.recipe.id))
    this.router.navigate(['/recipes'])
  }

}
