import { Injectable } from "@angular/core";
import { ActivatedRouteSnapshot, Resolve, RouterStateSnapshot } from "@angular/router";
import { Store } from "@ngrx/store";
import { Recipe } from "./recipe.model";
import * as fromApp from '../store/app.reducer';
import * as RecipesActions from './store/recipe.actions';
import { Actions, ofType } from "@ngrx/effects";
import { take, map, switchMap } from "rxjs/operators";
import { of } from "rxjs";

@Injectable({
	providedIn: 'root'
})
export class RecipesResolverService implements Resolve<Recipe[]> {

	constructor(private store: Store<fromApp.AppState>, private actions$: Actions) { }

	resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
		/*
		const recipes = this.recipeService.getRecipes();
		if (recipes.length === 0)
		return this.dataStorageService.fetchRecipes();
		return recipes
		*/
		return this.store.select('recipes').pipe(
			take(1),
			map(recipeState => {
				return recipeState.recipes
			}),
			switchMap(recipes => {
				if (recipes.length === 0) {
					this.store.dispatch(new RecipesActions.FetchRecipes());
					return this.actions$.pipe(
						ofType(RecipesActions.SET_RECIPES),
						take(1)
					)
				} else {
					return of(recipes)
				}
			})
		);
		
	}
}