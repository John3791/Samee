import { TabComponent } from './../tab/tab.component';
import { Component, ContentChildren, QueryList, AfterContentInit } from '@angular/core';

@Component({
  selector: 'app-tabs',
  templateUrl: './tabs.component.html',
  styleUrls: ['./tabs.component.css']
})
export class TabsComponent implements AfterContentInit {

  tabs: TabComponent[] = [];
  constructor() { }

  ngAfterContentInit() {

    const activeTabs = this.tabs.filter((child) => child.active);
    if (activeTabs.length === 0) {
     // this.selectTab(this.tabs[0]);
    }
    const tab = new TabComponent('Test', true);
    this.addTab(tab);
  }

  selectTab(tab: TabComponent) {
    this.tabs.forEach(child => child.active = false);
    tab.active = true;
  }

  addTab(tab: TabComponent) {
    this.tabs.push(tab);
  }
}
