package com.BrowserBuddy;
public class HistoryNode{
    String url; // page url
    HistoryNode prev; // previous page
    HistoryNode next; // next page
    public HistoryNode(String url){
        this.url=url;
        this.prev=null;
        this.next=null;
    }
}
