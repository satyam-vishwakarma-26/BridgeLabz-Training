package com.BrowserBuddy;
import java.util.Stack;
public class ClosedTabManager{
    private Stack<String> closedTabs=new Stack<>(); // closed tabs
    public void closeTab(String url){
        closedTabs.push(url); // save closed tab
        System.out.println("Tab closed: "+url);
    }
    public String reopenTab(){
        if(!closedTabs.isEmpty()){
            String url=closedTabs.pop(); // reopen last tab
            System.out.println("Reopened tab: "+url);
            return url;
        }
        System.out.println("No tabs to reopen");
        return null;
    }
}
