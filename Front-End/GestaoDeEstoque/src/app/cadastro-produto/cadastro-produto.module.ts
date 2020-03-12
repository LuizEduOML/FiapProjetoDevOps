import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCommonModule, MatFormFieldModule, MatSelectModule, MatOptionModule, MatButtonModule, MatInputModule } from '@angular/material';

import { CadastroProdutoComponent } from './cadastro-produto.component';



@NgModule({
  declarations: [
    CadastroProdutoComponent
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
    CadastroProdutoComponent
  ]
})
export class CadastroProdutoModule { }
