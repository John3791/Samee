import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PackageDetailViewComponent } from './package-detail-view.component';

describe('PackageDetailViewComponent', () => {
  let component: PackageDetailViewComponent;
  let fixture: ComponentFixture<PackageDetailViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PackageDetailViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PackageDetailViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
