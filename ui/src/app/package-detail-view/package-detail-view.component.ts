import { Component, OnInit, Input, Output, EventEmitter} from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Package } from '../package';

import { RestService } from '../rest.service';

@Component({
  selector: 'app-package-detail-view',
  templateUrl: './package-detail-view.component.html',
  styleUrls: ['./package-detail-view.component.css']
})
export class PackageDetailViewComponent implements OnInit {
  packageForm: FormGroup;

  @Input() package: Package;
  @Output() savePackage = new EventEmitter<any>();


  constructor(private fb: FormBuilder) {
    this.packageForm = this.fb.group({
      id: '',
      name: '',
      shortDescription: '',
      longDescription: ''
    });
   }

  ngOnInit() {
    this.packageForm.setValue({
      id: this.package.id || -1,
      name: this.package.name || '',
      shortDescription: this.package.shortDescription || '',
      longDescription: this.package.longDescription || ''
    });
  }

//  getPackage(packageId: string) {
//    this.rest.getPackageById(packageId).subscribe(data => this.package = data);
//  }

  onPackageFormSubmit() {
    const dataModel = this.packageForm.value;
    this.savePackage.emit(dataModel);
  }
}
