import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

import { HomeComponent } from './home.component';
import { MatCommonModule, MatButtonModule, MatInputModule, MatFormFieldModule, MatSelectModule, MatOptionModule, MatTableModule, MatPaginatorModule } from '@angular/material';



@NgModule({
  declarations: [
    HomeComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    MatCommonModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatOptionModule,
    MatButtonModule,
    MatTableModule,
    MatPaginatorModule
  ],
  exports: [
    HomeComponent
  ]
})
export class HomeModule { }
