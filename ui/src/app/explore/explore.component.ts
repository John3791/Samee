import { AngularSplitModule } from 'angular-split';
import { Component, OnInit, ViewChild } from '@angular/core';
import { v4 as UUID } from 'uuid';
import { RestService } from '../rest.service';

import { TabsComponent } from '../tabs/tabs.component';

@Component({
  selector: 'app-explore',
  templateUrl: './explore.component.html',
  styleUrls: ['./explore.component.css']
})
export class ExploreComponent implements OnInit {

  @ViewChild('packageEdit') editPackageTemplate;
  @ViewChild('about') aboutTemplate;
  @ViewChild(TabsComponent) tabsComponent;

  packages = [];
  constructor(public rest: RestService) { }

  ngOnInit() {
    this.getPackages();
  }

  getPackages() {
    this.rest.getPackages().subscribe(data => this.packages = data);
  }

  onEditPackage(package_) {
    this.tabsComponent.openTab(`Package ${package_.name}`, this.editPackageTemplate, package_, true);
  }
  onAddPackage(package_) {
    this.tabsComponent.openTab('New Package...', this.editPackageTemplate, {}, true);
  }
  onPackageFormSubmit(dataModel) {
    if (dataModel.id > '') {
      this.packages = this.packages.map(package_ => {
        if (package_.id === dataModel.id) {
          return dataModel;
        } else {
          return package_;
        }
      });
    } else {
      dataModel.id = UUID();
      this.packages.push(dataModel);
    }
    // could close the tab if desired - this.tabscomponent.closeActiveTab();
  }
  onOpenAbout(package_) {
    this.tabsComponent.openTab('About', this.aboutTemplate, {}, true);
  }
}
