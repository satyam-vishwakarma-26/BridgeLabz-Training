package com.ExamResultUploader;
class ExamRecord<T> {
    int rollNo;
    String name;
    T examType;   // MidTerm / Final / Internal
    String subject;
    int marks;

    public ExamRecord(int rollNo, String name, T examType,
                      String subject, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.examType = examType;
        this.subject = subject;
        this.marks = marks;
    }
}
