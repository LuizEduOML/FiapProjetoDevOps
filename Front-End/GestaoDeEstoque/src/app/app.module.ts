import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SharedModule } from './shared/shared.module';
import { LoginModule } from './login/login.module';
import { HomeModule } from './home/home.module';
import { EntradaEstoqueModule } from './entrada-estoque/entrada-estoque.module';
import { SaidaEstoqueModule } from './saida-estoque/saida-estoque.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    SharedModule,
    LoginModule,
    HomeModule,
    EntradaEstoqueModule,
    SaidaEstoqueModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
