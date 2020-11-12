import { Component, Input, OnInit } from '@angular/core';
import { Article } from './article.model';
import {HostBinding} from '@angular/core';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit 
{
  @HostBinding('attr.class') cssClass = 'row';
 @Input() article: Article;

 constructor() {
 this.article = new Article(
 'Angular 2',
 'http://angular.io',
);
}

 voteUp(): boolean {
 this.article.voteUp();
 return false;
 }
voteDown(): boolean {
 this.article.voteDown();
 return false;
}
ngOnInit() {
 }


}
