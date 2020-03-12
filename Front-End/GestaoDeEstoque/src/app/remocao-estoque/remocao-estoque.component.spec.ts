import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RemocaoEstoqueComponent } from './remocao-estoque.component';

describe('RemocaoEstoqueComponent', () => {
  let component: RemocaoEstoqueComponent;
  let fixture: ComponentFixture<RemocaoEstoqueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RemocaoEstoqueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RemocaoEstoqueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
