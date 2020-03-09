import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator, MatTableDataSource } from '@angular/material';

interface Category {
  value: string;
  viewValue: string;
}

export interface Product {
  id: number;
  descricao: string;
  categoria: string;
  quantidade: number;
  ultimaAtualizacao: string;
}

const PRODUCT_DATA: Product[] = [
  {id: 1, descricao: 'Notebook', categoria: 'Eletrônicos', quantidade: 3, ultimaAtualizacao: 'Ontem'},
  {id: 1, descricao: 'Notebook', categoria: 'Eletrônicos', quantidade: 3, ultimaAtualizacao: 'Ontem'},
  {id: 1, descricao: 'Notebook', categoria: 'Eletrônicos', quantidade: 3, ultimaAtualizacao: 'Ontem'},
  {id: 1, descricao: 'Notebook', categoria: 'Eletrônicos', quantidade: 3, ultimaAtualizacao: 'Ontem'},
  {id: 1, descricao: 'Notebook', categoria: 'Eletrônicos', quantidade: 3, ultimaAtualizacao: 'Ontem'},
  {id: 1, descricao: 'Notebook', categoria: 'Eletrônicos', quantidade: 3, ultimaAtualizacao: 'Ontem'},
];

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }
  
  @ViewChild(MatPaginator, {static: true}) paginator: MatPaginator;
  
  ngOnInit() {
    this.dataSource.paginator = this.paginator;
  }

  categories: Category[] = [
    {value: 'eletronico-0', viewValue: 'Eletrônicos'},
    {value: 'limpeza-1', viewValue: 'Limpeza'},
  ];

  displayedColumns: string[] = ['id', 'descricao', 'categoria', 'quantidade', 'ultimaAtualizacao'];
  dataSource = new MatTableDataSource<Product>(PRODUCT_DATA);

}
