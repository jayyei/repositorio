import { Component, OnInit } from '@angular/core';
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
    }
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
