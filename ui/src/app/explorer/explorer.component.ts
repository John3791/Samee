import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { Component, OnInit } from '@angular/core';

import { RestService } from '../rest.service';

@Component({
  selector: 'app-explorer',
  templateUrl: './explorer.component.html',
  styleUrls: ['./explorer.component.css']
})
export class ExplorerComponent implements OnInit {

  packages: any = [];

  constructor(public rest: RestService) { }

  ngOnInit() {
    this.getPackages();
  }

  getPackages() {
    this.packages = [];
    this.rest.getPackages().subscribe((data: {}) => {
      this.packages = data;
    });
  }
}
