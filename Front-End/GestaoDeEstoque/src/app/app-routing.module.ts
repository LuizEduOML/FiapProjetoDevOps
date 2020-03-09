import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { NotFoundComponent } from './shared/not-found/not-found.component';
import { EntradaEstoqueComponent } from './entrada-estoque/entrada-estoque.component';
import { SaidaEstoqueComponent } from './saida-estoque/saida-estoque.component';


const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'home', component: HomeComponent },
  { path: 'entrada-estoque', component: EntradaEstoqueComponent },
  { path: 'saida-estoque', component: SaidaEstoqueComponent },
  { path: '**', component: NotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
