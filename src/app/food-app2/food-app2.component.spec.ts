import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodApp2Component } from './food-app2.component';

describe('FoodApp2Component', () => {
  let component: FoodApp2Component;
  let fixture: ComponentFixture<FoodApp2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FoodApp2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FoodApp2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
