import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCommonModule, MatFormFieldModule, MatInputModule, MatSelectModule, MatOptionModule, MatButtonModule } from '@angular/material';

import { CadastroEstoqueComponent } from './cadastro-estoque.component';



@NgModule({
  declarations: [
    CadastroEstoqueComponent
  ],
  imports: [
    CommonModule,
    MatCommonModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatOptionModule,
    MatButtonModule
  ],
  exports: [
    CadastroEstoqueComponent
  ]
})
export class CadastroEstoqueModule { }
