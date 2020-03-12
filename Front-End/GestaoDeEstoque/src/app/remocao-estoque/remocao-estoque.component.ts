import { Component, OnInit } from '@angular/core';

interface Product {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-remocao-estoque',
  templateUrl: './remocao-estoque.component.html',
  styleUrls: ['./remocao-estoque.component.css']
})
export class RemocaoEstoqueComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  products: Product[] = [
    {value: 'eletronico-0', viewValue: 'Eletrônicos'},
    {value: 'limpeza-1', viewValue: 'Limpeza'},
  ];

}
