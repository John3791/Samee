import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { Component, OnInit } from '@angular/core';

import { RestService } from '../rest.service';
import { Package } from '../package';

@Component({
  selector: 'app-explorer',
  templateUrl: './explorer.component.html',
  styleUrls: ['./explorer.component.css']
})
export class ExplorerComponent implements OnInit {

  packages: Package[];

  constructor(public rest: RestService) { }

  ngOnInit() {
    this.getPackages();
  }

  getPackages() {
    this.rest.getPackages().subscribe(data => this.packages = data);
  }
}
