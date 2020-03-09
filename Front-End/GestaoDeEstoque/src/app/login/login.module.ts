import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { MatCommonModule, MatButtonModule } from '@angular/material';

import { LoginComponent } from './login.component';



@NgModule({
  declarations: [
    LoginComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    MatCommonModule,
    MatButtonModule
  ],
  exports: [
    LoginComponent
  ]
})
export class LoginModule { }
