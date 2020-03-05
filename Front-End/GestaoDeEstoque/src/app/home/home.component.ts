import { Component, OnInit } from '@angular/core';

interface Category {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }

  ngOnInit() {}

  categories: Category[] = [
    {value: 'eletronico-0', viewValue: 'Eletrônicos'},
    {value: 'limpeza-1', viewValue: 'Limpeza'},
  ];

}
