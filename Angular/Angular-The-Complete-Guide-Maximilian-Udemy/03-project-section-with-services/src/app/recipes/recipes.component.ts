import { Component } from '@angular/core';
import { RecipeService } from './recipe.service';

@Component({
  selector: 'app-recipes',
  templateUrl: './recipes.component.html',
  styleUrls: ['./recipes.component.css']
})
export class RecipesComponent {

  // recipe: Recipe
  // constructor(private recipeservice: RecipeService) { }

  // ngOnInit(): void {
  //   this.recipeservice.recipeSelected
  //     .subscribe(
  //       (recipe: Recipe) => {
  //         this.recipe = recipe
  //       }
  //     );

  // }


}
