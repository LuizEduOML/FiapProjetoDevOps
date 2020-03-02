import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCommonModule, MatButtonModule } from '@angular/material';
import { RouterModule } from '@angular/router';

import { NotFoundComponent } from './not-found/not-found.component';



@NgModule({
  declarations: [
    NotFoundComponent
  ],
  imports: [
    CommonModule,
    MatCommonModule,
    MatButtonModule,
    RouterModule
  ],
  exports: [
    NotFoundComponent
  ]
})
export class SharedModule { }
