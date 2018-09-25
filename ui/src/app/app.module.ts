import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { AngularSplitModule } from 'angular-split';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';

import { MatFormFieldModule, MatInputModule, MatTabsModule } from '@angular/material';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { TreeModule } from 'angular-tree-component';
import { AppComponent } from './app.component';
import { ExplorerComponent } from './explorer/explorer.component';
import { ExploreComponent } from './explore/explore.component';
import { TabsComponent } from './tabs/tabs.component';
import { TabComponent } from './tab/tab.component';
import { PackageDetailViewComponent } from './package-detail-view/package-detail-view.component';
import { AppRoutingModule } from './app-routing.module';
import { PackageListViewComponent } from './package-list-view/package-list-view.component';

@NgModule({
  declarations: [
    AppComponent,
    ExplorerComponent,
    ExploreComponent,
    TabsComponent,
    TabComponent,
    PackageDetailViewComponent,
    PackageListViewComponent
    ],
  imports: [
    AngularSplitModule,
    ReactiveFormsModule,
    NgbModule,
    HttpClientModule,
    TreeModule.forRoot(),
    BrowserModule,
    MatFormFieldModule,
    MatTabsModule,
    MatInputModule,
    BrowserAnimationsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents: [TabComponent]
})
export class AppModule { }
