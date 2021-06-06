import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { AuthGuard } from "./auth-guard.service";
import { ErrorPageComponent } from "./error-page/error-page.component";
import { HomeComponent } from "./home/home.component";
import { PageNotFoundComponent } from "./page-not-found/page-not-found.component";
import { CanDeactivateGuard } from "./servers/edit-server/can-deactivate-guard.service";
import { EditServerComponent } from "./servers/edit-server/edit-server.component";
import { ServerResolver } from "./servers/server/server-resolver.service";
import { ServerComponent } from "./servers/server/server.component";
import { ServersComponent } from "./servers/servers.component";
import { UserComponent } from "./users/user/user.component";
import { UsersComponent } from "./users/users.component";

// Wild card ** means 'Catch all routes you don't know' it has to be at the end of the route config
// { path: '', redirectTo: '/somewhere-else', pathMatch: 'full' } *PathMach para asegurar un matcheo directo con la ruta

const appRoutes: Routes = [
	// Don't add the slash at the start
	{ path: '', component: HomeComponent },
	{
		path: 'users', component: UsersComponent, children: [
			{ path: ':id/:name', component: UserComponent },
		]
	},
	{
		path: 'servers',
		canActivateChild: [AuthGuard],
		component: ServersComponent,
		children: [
			{ path: ':id', component: ServerComponent, resolve: {server: ServerResolver} },
			{ path: ':id/edit', component: EditServerComponent, canDeactivate: [CanDeactivateGuard] }
		]
	},
	// { path: 'not-found', component: PageNotFoundComponent },
	{ path: 'not-found', component: ErrorPageComponent, data: {message: 'Page not found'} },
	{ path: '**', redirectTo: '/not-found' }
]

@NgModule({
	imports: [
		RouterModule,
		// use hash for ...
		RouterModule.forRoot(appRoutes, {useHash: true})
	],
	exports: [RouterModule]
})
export class AppRoutingModule {

}