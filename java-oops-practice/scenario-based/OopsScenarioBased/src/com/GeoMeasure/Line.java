package com.GeoMeasure;
// Represents a line segment on blueprint
public class Line{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    // Constructor to initialize line using this keyword
    public Line(double x1,double y1,double x2,double y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    // Calculate length of line
    public double calculateLength(){
        double dx=this.x2-this.x1;
        double dy=this.y2-this.y1;
        return Math.sqrt(dx*dx+dy*dy);
    }
}
