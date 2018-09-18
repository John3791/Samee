import { Component, OnInit, Input} from '@angular/core';
import { Package } from "../package";

import { RestService } from '../rest.service';

@Component({
  selector: 'app-package-detail-view',
  templateUrl: './package-detail-view.component.html',
  styleUrls: ['./package-detail-view.component.css']
})
export class PackageDetailViewComponent implements OnInit {
   @Input()
   packageId: String;

   package: Package;

  constructor(public rest: RestService) { }

  ngOnInit() {
    console.log("PackageId: " + this.packageId)
    this.getPackage(this.packageId);
  }

  getPackage(packageId: String) {
    console.log(this.rest.getPackageById(packageId).subscribe(data => this.package = data));
    console.log("Package: " + this.package.name);
  }

}
