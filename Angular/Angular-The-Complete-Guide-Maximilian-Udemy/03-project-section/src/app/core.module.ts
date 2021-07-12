import { HTTP_INTERCEPTORS } from "@angular/common/http";
import { NgModule } from "@angular/core";
import { AuthInterceptorService } from "./auth/auth-interceptor.service";
import { LoggingService } from "./logging.service";
// import { RecipeService } from "./recipes/recipe.service";

@NgModule({
  providers: [
     // RecipeService, 
    {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptorService,
      multi: true
    },
  ],
  // Solo declaraciones y otros modulos necesitan ser exportados, si se requieren utilizar fuera del modulo.
  // Los providers trabajan de forma diferente
})
export class CoreModule {

}