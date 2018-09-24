import { TabComponent } from './../tab/tab.component';
import { Component, ContentChildren, QueryList, AfterContentInit,
  ViewChild, ViewContainerRef, ComponentFactoryResolver } from '@angular/core';

@Component({
  selector: 'app-tabs',
  templateUrl: './tabs.component.html',
  styleUrls: ['./tabs.component.css']
})
export class TabsComponent implements AfterContentInit {
  dynamicTabs: TabComponent[] = [];

  @ContentChildren(TabComponent)
  tabs: QueryList<TabComponent>;

  @ViewChild('container', {read: ViewContainerRef})
  dynamicTabPlaceholder;

  constructor(private _componentFactoryResolver: ComponentFactoryResolver) { }

  ngAfterContentInit() {

    const activeTabs = this.tabs.filter((child) => child.active);
    if (activeTabs.length === 0) {
      this.selectTab(this.tabs.first);
    }
  }

  openTab(title, template, data, isCloseable = false) {
    const componentFactory = this._componentFactoryResolver.resolveComponentFactory(TabComponent);

    const viewContainerRef = this.dynamicTabPlaceholder;

    const componentRef = viewContainerRef.createComponent(componentFactory);
    const instance: TabComponent = componentRef.instance as TabComponent;

    instance.tabTitle = title;
    instance.template = template;
    instance.dataContext = data;
    instance.isCloseable = isCloseable;

    this.dynamicTabs.push(componentRef.instance as TabComponent);

    this.selectTab(this.dynamicTabs[this.dynamicTabs.length - 1]);
  }

  selectTab(tab: TabComponent) {
    this.tabs.toArray().forEach(child => child.active = false);
    this.dynamicTabs.forEach(child => child.active = false);
    tab.active = true;
  }

  closeTab(tab: TabComponent) {
    for (let i = 0; i < this.dynamicTabs.length; i++) {
      if (this.dynamicTabs[i] === tab) {
        this.dynamicTabs.splice(i, 1);
        const viewContainerRef = this.dynamicTabPlaceholder.viewContainer;
        viewContainerRef.remove(i);
        this.selectTab(this.tabs.first);
        break;
      }
    }
  }

  closeActiveTab() {
    const activeTabs = this.dynamicTabs.filter((child) => child.active);
    if (activeTabs.length > 0) {
      this.closeTab(activeTabs[0]);
    }
  }
}
