import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SharedModule } from './shared/shared.module';
import { LoginModule } from './login/login.module';
import { HomeModule } from './home/home.module';
import { CadastroProdutoModule } from './cadastro-produto/cadastro-produto.module';
import { CadastroEstoqueModule } from './cadastro-estoque/cadastro-estoque.module';
import { RemocaoEstoqueModule } from './remocao-estoque/remocao-estoque.module';

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
    CadastroProdutoModule,
    CadastroEstoqueModule,
    RemocaoEstoqueModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
