import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SaidaEstoqueComponent } from './saida-estoque.component';

describe('SaidaEstoqueComponent', () => {
  let component: SaidaEstoqueComponent;
  let fixture: ComponentFixture<SaidaEstoqueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SaidaEstoqueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SaidaEstoqueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
