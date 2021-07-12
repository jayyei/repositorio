import { EventEmitter, Injectable } from "@angular/core";
import { Subject } from "rxjs";
import { Ingredient } from "../shared/ingredient.model";
import { ShoppingListService } from "../shopping-list/shopping-list.service";
import { Recipe } from "./recipe.model";

@Injectable()
export class RecipeService {

	recipesChanged = new Subject<Recipe[]>();
	// private recipes: Recipe[] = [
	// 	{
	// 		id: 0,
	// 		name: "A test Recipe",
	// 		description: "This is simply a test",
	// 		imagePath: "https://i.pinimg.com/originals/37/4e/f6/374ef6e7abbd5ab61adcccd730c98409.jpg",
	// 		ingredients: [
	// 			new Ingredient('Meat', 1),
	// 			new Ingredient('French Fries', 20),
	// 		]
	// 	},
	// 	{
	// 		id: 1,
	// 		name: "Another Recipe",
	// 		description: "This is another recipe",
	// 		imagePath: "https://i.pinimg.com/originals/37/4e/f6/374ef6e7abbd5ab61adcccd730c98409.jpg",
	// 		ingredients: [
	// 			new Ingredient('Buns', 2),
	// 			new Ingredient('Meat', 1)
	// 		]
	// 	}
	// ];
	private recipes: Recipe[] = [];
	
	constructor(private shoppingListService: ShoppingListService) {}

	setRecipes(recipes: Recipe[]) {
		this.recipes = recipes;
		this.recipesChanged.next(this.recipes.slice())
	}
	getRecipes () {
		return this.recipes.slice();
	};

	findRecipeById(id: number): Recipe {
	  return this.recipes.find((recipe: Recipe) => recipe.id === id);
	}

	addIngredientsToShoppingList(ingredients: Ingredient[]) {
	  this.shoppingListService.addIngredients(ingredients)
	}

	addRecipe(recipe: Recipe) {
	  this.recipes.push(recipe);
	  this.recipesChanged.next(this.recipes.slice());
	}
	
	updateRecipe(index: number, newRecipe: Recipe) {
		this.recipes[index] = newRecipe
		this.recipesChanged.next(this.recipes.slice());
	}

	deleteRecipe(index: number) {
		this.recipes = this.recipes.filter((recipe: Recipe) => recipe.id !== index)
		this.recipesChanged.next(this.recipes.slice())
	}
}