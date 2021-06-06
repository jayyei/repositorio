import { EventEmitter, Injectable } from "@angular/core";
import { Ingredient } from "../shared/ingredient.model";
import { ShoppingListService } from "../shopping-list/shopping-list.service";
import { Recipe } from "./recipe.model";

@Injectable()
export class RecipeService {

	recipeSelected = new EventEmitter<Recipe>();

	private recipes: Recipe[] = [
		{
			name: "A test Recipe",
			description: "This is simply a test",
			imagePath: "https://i.pinimg.com/originals/37/4e/f6/374ef6e7abbd5ab61adcccd730c98409.jpg",
			ingredients: [
				new Ingredient('Meat', 1),
				new Ingredient('French Fries', 20),
			]
		},
		{
			name: "Another Recipe",
			description: "This is another recipe",
			imagePath: "https://i.pinimg.com/originals/37/4e/f6/374ef6e7abbd5ab61adcccd730c98409.jpg",
			ingredients: [
				new Ingredient('Buns', 2),
				new Ingredient('Meat', 1)
			]
		}
	];

	constructor(private shoppingListService: ShoppingListService) {}
	getRecipes () {
		return this.recipes.slice();
	};

	addIngredientsToShoppingList(ingredients: Ingredient[]) {
		this.shoppingListService.addIngredients(ingredients)
	}
}