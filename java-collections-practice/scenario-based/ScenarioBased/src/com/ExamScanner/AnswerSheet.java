package com.ExamScanner;
class AnswerSheet<T> {
    String studentName;
    T subject;
    String[] answers;

    public AnswerSheet(String studentName, T subject, String[] answers) {
        this.studentName = studentName;
        this.subject = subject;
        this.answers = answers;
    }
}
