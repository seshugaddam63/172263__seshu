import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodApp6Component } from './food-app6.component';

describe('FoodApp6Component', () => {
  let component: FoodApp6Component;
  let fixture: ComponentFixture<FoodApp6Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FoodApp6Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FoodApp6Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
