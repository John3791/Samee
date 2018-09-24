import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-package-list-view',
  templateUrl: './package-list-view.component.html',
  styleUrls: ['./package-list-view.component.css']
})
export class PackageListViewComponent implements OnInit {
  @Input() packages;
  @Output() addPackage = new EventEmitter<any>();
  @Output() editPackage = new EventEmitter<any>();

  constructor() { }

  ngOnInit() {
  }

}
