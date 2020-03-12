import { Component, OnInit } from '@angular/core';

interface Category {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-cadastro-produto',
  templateUrl: './cadastro-produto.component.html',
  styleUrls: ['./cadastro-produto.component.css']
})
export class CadastroProdutoComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  categories: Category[] = [
    {value: 'eletronico-0', viewValue: 'Eletrônicos'},
    {value: 'limpeza-1', viewValue: 'Limpeza'},
  ];

}
