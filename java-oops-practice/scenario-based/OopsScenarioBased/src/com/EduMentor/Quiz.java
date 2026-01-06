package com.EduMentor;

public class Quiz{
    private String[] questions=new String[5];
    private String[] answers=new String[5];
    private int score;
    private String difficulty;

    //constructor
    public Quiz(String difficulty){
        this.difficulty=difficulty;
    }

    //set question and answer (only once)
    public void setQuestion(int index,String question,String answer){
        questions[index]=question;
        answers[index]=answer;
    }

    //evaluate quiz
    public void evaluate(String[] userAnswers){
        score=0;
        for(int i=0;i<5;i++){
            if(answers[i].equalsIgnoreCase(userAnswers[i])){
                score++;
            }
        }
    }

    //percentage calculation
    public double getPercentage(){
        return (score*100.0)/5;
    }

    public void showResult(){
        System.out.println("Quiz Difficulty: "+difficulty);
        System.out.println("Score: "+score+"/5");
        System.out.println("Percentage: "+getPercentage()+"%");
    }

    //show questions only (answers hidden)
    public void showQuestions(){
        System.out.println("\n--- Quiz Questions ---");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+". "+questions[i]);
        }
    }
}
