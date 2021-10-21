import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {KeywordService} from "../../../service/keyword/keyword.service";

@Component({
  selector: 'jlb-keyword-list',
  templateUrl: './keyword-list.component.html',
  styleUrls: ['./keyword-list.component.css']
})
export class KeywordListComponent implements OnInit {

  private keywords$ : Observable<Keyword[]>;

  constructor(private keywordService: KeywordService) { }

  ngOnInit() {
      this.list();
  }

  list() {
      this.keywords$ = this.keywordService.list();
  }
}
