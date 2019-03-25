import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule, Pipe } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule, PickerController } from 'ionic-angular';
import { SplashScreen } from '@ionic-native/splash-screen';
import { StatusBar } from '@ionic-native/status-bar';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { AboutPage } from '../pages/about/about';
import { CustomerPage } from '../pages/customer/customer';
import { MypipePipe } from '../pipes/mypipe/mypipe';
import { PipesModule } from '../pipes/pipes.module';
import { CreateAccountPage } from '../pages/create-account/create-account';
import { StudentsProvider } from '../providers/students/students-service';
import { HttpClientModule } from '@angular/common/http';
import { LoginProvider } from '../providers/login/login';
import { LoginProviderMock } from '../mock/loginProviderMock';
import { EventManagerProvider } from '../providers/event-manager/event-manager';
import { CardComponent } from '../components/card/card';

@NgModule({
  declarations: [
    MyApp,
    HomePage,
    AboutPage,
    CustomerPage, 
    CardComponent,
    CreateAccountPage
  ],
  imports: [
    BrowserModule,
    PipesModule,
    IonicModule.forRoot(MyApp),
    HttpClientModule
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    AboutPage,
    CustomerPage,
    CreateAccountPage,
    CardComponent
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
    StudentsProvider,
    // {
      // provide: 
      LoginProvider,
    EventManagerProvider,
    //   useClass: LoginProviderMock
    // }
  ]
})
export class AppModule {}
