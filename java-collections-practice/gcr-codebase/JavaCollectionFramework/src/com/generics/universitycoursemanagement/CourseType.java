package com.generics.universitycoursemanagement;
// Base abstract class for course evaluation types
public abstract class CourseType{
    protected String evaluationMethod;
    protected CourseType(String evaluationMethod){
        this.evaluationMethod=evaluationMethod;
    }
    public abstract void evaluate();
    public String getEvaluationMethod(){
        return evaluationMethod;
    }
}
