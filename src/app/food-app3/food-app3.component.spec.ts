import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodApp3Component } from './food-app3.component';

describe('FoodApp3Component', () => {
  let component: FoodApp3Component;
  let fixture: ComponentFixture<FoodApp3Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FoodApp3Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FoodApp3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
