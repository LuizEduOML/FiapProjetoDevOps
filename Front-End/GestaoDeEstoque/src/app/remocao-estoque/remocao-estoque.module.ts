import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCommonModule, MatFormFieldModule, MatInputModule, MatSelectModule, MatOptionModule, MatButtonModule } from '@angular/material';

import { RemocaoEstoqueComponent } from './remocao-estoque.component';



@NgModule({
  declarations: [
    RemocaoEstoqueComponent
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
    RemocaoEstoqueComponent
  ]
})
export class RemocaoEstoqueModule { }
