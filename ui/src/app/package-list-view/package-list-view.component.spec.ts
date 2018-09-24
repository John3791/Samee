import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PackageListViewComponent } from './package-list-view.component';

describe('PackageListViewComponent', () => {
  let component: PackageListViewComponent;
  let fixture: ComponentFixture<PackageListViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PackageListViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PackageListViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
