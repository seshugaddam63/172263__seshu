import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodApp4Component } from './food-app4.component';

describe('FoodApp4Component', () => {
  let component: FoodApp4Component;
  let fixture: ComponentFixture<FoodApp4Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FoodApp4Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FoodApp4Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
