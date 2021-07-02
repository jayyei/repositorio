import { NgModule } from "@angular/core";
import { PreloadAllModules, RouterModule, Routes } from "@angular/router";

const appRoutes: Routes = [
    {path: '', pathMatch: 'full', redirectTo: '/recipes'},
    // Cargas como loadChildren el path relativo al modulo correspondiente y con # el nombre de la clase module
    // {path: 'recipes', loadChildren: './recipes/recipes.module#RecipesModule'}
    // Forma mas reciente de declarar el loadChildren
    { 
      path: 'recipes', 
      loadChildren: () => import('./recipes/recipes.module').then(m => m.RecipesModule)
    },
    {
      path: 'shopping-list',
      loadChildren: () => import('./shopping-list/shopping-list.module').then( m => m.ShoppingListModule)
    },
    {
      path: 'auth',
      loadChildren: () => import('./auth/auth.module').then( m => m.AuthModule)
    }

]

@NgModule({
    imports: [
        RouterModule,
        RouterModule.forRoot(appRoutes, 
            {
              useHash: true,
              preloadingStrategy: PreloadAllModules
            })
    ],
    exports: [RouterModule]
})
export class AppRoutingModule {

}