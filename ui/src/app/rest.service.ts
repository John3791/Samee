import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';

import { Package } from './package';

import 'rxjs/add/operator/map';

import { values } from 'lodash';

const endpoint = 'http://localhost:8080/';
const packageEndpoint = 'http://localhost:8080/package';
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};


@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(private http: HttpClient) { }

  getPackages(): Observable<Package[]> {
    return  this.http.get<Package[]>(packageEndpoint).map(data => values(data));
  }

  getPackageById(packageId: String): Observable<Package> {
    return this.http.get<Package>(packageEndpoint + '/' + packageId);
  }

}
