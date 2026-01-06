package com.EventEase;

//Interface with abstract methods 
public interface ISchedulable{
    void schedule();
    void reschedule(String newDate);
    void cancel();
}
