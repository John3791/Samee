import { Component, OnInit, Input} from '@angular/core';
import { Package } from '../package';

import { RestService } from '../rest.service';

@Component({
  selector: 'app-package-detail-view',
  templateUrl: './package-detail-view.component.html',
  styleUrls: ['./package-detail-view.component.css']
})
export class PackageDetailViewComponent implements OnInit {
   @Input()
   packageId: string;

   package: Package;

  constructor(public rest: RestService) { }

  ngOnInit() {
    this.getPackage(this.packageId);
  }

  getPackage(packageId: string) {
    this.rest.getPackageById(packageId).subscribe(data => this.package = data);
  }

}
