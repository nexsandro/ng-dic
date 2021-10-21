import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class KeywordService {

  private KEYWORDS_URL: string = '/api/keywords';

    httpOptions = {
        headers: new HttpHeaders({ 'Content-Type': 'application/json' })
    };

  constructor(private httpCliet : HttpClient) { }

  list() : Observable<Keyword[]> {
    return this.httpCliet.get<Keyword[]>(this.KEYWORDS_URL)
  }
}
