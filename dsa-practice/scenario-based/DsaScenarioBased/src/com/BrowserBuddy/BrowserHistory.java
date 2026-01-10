package com.BrowserBuddy;
public class BrowserHistory{
    private HistoryNode current; // current page
    public BrowserHistory(String homepage){
        current=new HistoryNode(homepage); // start page
    }
    public void visit(String url){
        HistoryNode newNode=new HistoryNode(url); // new page
        current.next=null; // clear forward history
        newNode.prev=current; // link back
        current.next=newNode; // link forward
        current=newNode; // move current
        System.out.println("Visited: "+url);
    }
    public void back(){
        if(current.prev!=null){
            current=current.prev; // move back
            System.out.println("Back to: "+current.url);
        }else{
            System.out.println("No previous page");
        }
    }
    public void forward(){
        if(current.next!=null){
            current=current.next; // move forward
            System.out.println("Forward to: "+current.url);
        }else{
            System.out.println("No forward page");
        }
    }
    public String getCurrentPage(){
        return current.url; // return current url
    }
}
