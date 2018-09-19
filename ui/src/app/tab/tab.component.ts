import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-tab',
  templateUrl: './tab.component.html',
  styleUrls: ['./tab.component.css']
})
export class TabComponent {
  @Input() tabTitle: string;
  @Input() active = false;

//  constructor(tabs: TabsComponent) {
//    tabs.addTab(this);
//  }

  constructor(tabTitle: string, active: boolean) {
    this.tabTitle = tabTitle;
    this.active = active;
  }
}
