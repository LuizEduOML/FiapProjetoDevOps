import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { NotFoundComponent } from './shared/not-found/not-found.component';
import { CadastroProdutoComponent } from './cadastro-produto/cadastro-produto.component';
import { CadastroEstoqueComponent } from './cadastro-estoque/cadastro-estoque.component';
import { RemocaoEstoqueComponent } from './remocao-estoque/remocao-estoque.component';


const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'home', component: HomeComponent },
  { path: 'cadastro-produto', component: CadastroProdutoComponent},
  { path: 'cadastro-estoque', component: CadastroEstoqueComponent },
  { path: 'remocao-estoque', component: RemocaoEstoqueComponent },
  { path: '**', component: NotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
