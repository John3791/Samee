import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AngularSplitModule } from 'angular-split';
import { HttpClientModule } from "@angular/common/http";

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { TreeModule } from 'angular-tree-component';
import { AppComponent } from './app.component';
import { ExplorerComponent } from './explorer/explorer.component';
import { ExploreComponent } from './explore/explore.component';
import { TabsComponent } from './tabs/tabs.component';
import { TabComponent } from './tab/tab.component';
import { PackageDetailViewComponent } from './package-detail-view/package-detail-view.component';

@NgModule({
  declarations: [
    AppComponent,
    ExplorerComponent,
    ExploreComponent,
    TabsComponent,
    TabComponent,
    PackageDetailViewComponent
    ],
  imports: [
    AngularSplitModule,
    NgbModule,
    HttpClientModule,
    TreeModule.forRoot(),
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
