import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodApp5Component } from './food-app5.component';

describe('FoodApp5Component', () => {
  let component: FoodApp5Component;
  let fixture: ComponentFixture<FoodApp5Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FoodApp5Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FoodApp5Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
