import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastroEstoqueComponent } from './cadastro-estoque.component';

describe('CadastroEstoqueComponent', () => {
  let component: CadastroEstoqueComponent;
  let fixture: ComponentFixture<CadastroEstoqueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CadastroEstoqueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastroEstoqueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
