import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Recipe } from '../recipe.model';

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent implements OnInit {

  recipes: Recipe[] = [
    {
      name: "A test Recipe", 
      description: "This is simply a test", 
      imagePath: "https://i.pinimg.com/originals/37/4e/f6/374ef6e7abbd5ab61adcccd730c98409.jpg"
    },
    {
      name: "Another Recipe", 
      description: "This is another recipe", 
      imagePath: "https://i.pinimg.com/originals/37/4e/f6/374ef6e7abbd5ab61adcccd730c98409.jpg"
    }
  ];

  @Output()
  recipeSel: EventEmitter<Recipe> = new EventEmitter<Recipe>();

  constructor() { }

  ngOnInit(): void {
  }

  handleRecipe(recipe: Recipe) {
    this.recipeSel.emit(recipe);
  }

}
