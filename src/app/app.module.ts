import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';

import { HttpClientModule } from '@angular/common/http';
//import { ServeComponent } from './serve/serve.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { NewCouponsComponent } from './new-coupons/new-coupons.component';

import { FoodAppComponent } from './food-app/food-app.component';
import { FoodApp2Component } from './food-app2/food-app2.component';
import { FoodApp3Component } from './food-app3/food-app3.component';
import { FoodApp4Component } from './food-app4/food-app4.component';
import { FoodApp5Component } from './food-app5/food-app5.component';
import { FoodApp6Component } from './food-app6/food-app6.component';


@NgModule({
  declarations: [
    AppComponent,
    //ServeComponent,
    HomeComponent,
    LoginComponent,
    NewCouponsComponent,
    RegisterComponent,
    FoodAppComponent,
    FoodApp2Component,
    FoodApp3Component,
    FoodApp4Component,
    FoodApp5Component,
    FoodApp6Component,
    
   
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot( [
      { 
        path: 'home', 
        component: HomeComponent
      },
      
      { 
        path: 'login',
        component: LoginComponent
      },  
      { 
        path: 'new-coupons',
        component: NewCouponsComponent
      },
      { 
        path: 'food-app',
        component: FoodAppComponent
      },
      { 
        path: 'food-app2',
        component: FoodApp2Component
      },
      { 
        path: 'food-app3',
        component: FoodApp3Component
      },
      { 
        path: 'food-app4',
        component: FoodApp4Component
      },
      { 
        path: 'food-app5',
        component: FoodApp5Component
      },
      { 
        path: 'food-app6',
        component: FoodApp6Component
      },
      { 
        path: 'register',
        component: RegisterComponent
      },
      ])
    ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
