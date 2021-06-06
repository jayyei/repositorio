import { Component, OnInit } from '@angular/core';
import { Ingredient } from '../shared/ingredient.model';
import { ShoppingListService } from './shopping-list.service';

@Component({
  selector: 'app-shopping-list',
  templateUrl: './shopping-list.component.html',
  styleUrls: ['./shopping-list.component.css']
})
export class ShoppingListComponent implements OnInit {

  ingredients: Ingredient[] = []

  constructor(private shoppingListService: ShoppingListService) { }

  ngOnInit(): void {
    this.ingredients = this.shoppingListService.getIngredients();
    // Te subscribes una sola vez (por eso en el oninit), pero los cambios los recibes de forma constante
    this.shoppingListService.ingredientChanged
      .subscribe(
        (ingredients: Ingredient[]) => {
          this.ingredients = ingredients
        }
      )
  }

}
