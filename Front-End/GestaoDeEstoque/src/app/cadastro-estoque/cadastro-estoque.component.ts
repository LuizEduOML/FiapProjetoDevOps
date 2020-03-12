import { Component, OnInit } from '@angular/core';

interface Product {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-cadastro-estoque',
  templateUrl: './cadastro-estoque.component.html',
  styleUrls: ['./cadastro-estoque.component.css']
})
export class CadastroEstoqueComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  products: Product[] = [
    {value: 'eletronico-0', viewValue: 'Eletrônicos'},
    {value: 'limpeza-1', viewValue: 'Limpeza'},
  ];

}
