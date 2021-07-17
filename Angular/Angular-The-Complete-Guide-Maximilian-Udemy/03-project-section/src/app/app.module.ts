import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
// import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
// import { RecipesModule } from './recipes/recipes.module';
// import { ShoppingListModule } from './shopping-list/shopping-list.module';
import { SharedModule } from './shared/shared.module';
import { CoreModule } from './core.module';
// import { LoggingService } from './logging.service';
// import { AuthModule } from './auth/auth.module';

import { StoreModule } from '@ngrx/store';
import { EffectsModule } from '@ngrx/effects';
import { StoreDevtoolsModule } from '@ngrx/store-devtools';
import { StoreRouterConnectingModule } from '@ngrx/router-store';
import * as fromApp from './store/app.reducer';
import { AuthEffects } from './auth/store/auth.effects';
import { environment } from 'src/environments/environment';
import { RecipeEffects } from './recipes/store/recipe.effects';

@NgModule({
  // Declarations is the place where you put your components, directives and pipes
  // Components, directives and pipes only can be declared once
  declarations: [
    AppComponent,
    HeaderComponent
  ],
  // Split your app in multples modules
  // cuando importas un modulo, se dispone de todos los exports que dicho modulo define
  // Todo en un modulo trabaja standalone (de forma unica)
  // Los modulos aqui declarados no pueden tener acceso a propiedades declaradas en otros modulos
  imports: [
    BrowserModule.withServerTransition({ appId: 'serverApp' }),  // NgIf, ngFor, other features, etc. Se tiene que utilizar solo una vez en el app module (only run once)
    // FormsModule, // Relacionadas a los formularios por template
    // ReactiveFormsModule, // Relacionadas a los formularios reactivos
    AppRoutingModule, // Relacionado al routeo de la aplicacion
    HttpClientModule, // Servicios de HttpClient
    // Quitamos RecipesModule y ShoppingListModule y AuthModule porque lo hemos cargado de forma perezosa en el routing
    // RecipesModule,
    // ShoppingListModule,
    // AuthModule,
    SharedModule,
    CoreModule,
    StoreModule.forRoot(fromApp.appReducer),
    EffectsModule.forRoot([AuthEffects, RecipeEffects]),
    StoreDevtoolsModule.instrument({logOnly: environment.production}),
    StoreRouterConnectingModule.forRoot()
  ],
  // We define all the services
  // providers: [LoggingService],
  // The bootstrap is important to start the app
  bootstrap: [AppComponent],
  // use for components that we need for create without selectors or with the router configuration
  // Depending of you angular version you might not need it
  
})
export class AppModule { }
