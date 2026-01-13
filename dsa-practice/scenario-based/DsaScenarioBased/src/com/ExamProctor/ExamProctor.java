package com.ExamProctor;
import java.util.*;

// Core exam logic using stack and map
public class ExamProctor{
   
	private Stack<Integer> navigationStack=new Stack<>();
    private HashMap<Integer,String> answers=new HashMap<>();
    private HashMap<Integer,Question> questions=new HashMap<>();
    
    // Add question to exam
    public void addQuestion(int id,String correctAnswer){
        questions.put(id,new Question(id,correctAnswer));
    }
   
    // Navigate to a question
    public void visitQuestion(int id){
        if(!questions.containsKey(id)){
            System.out.println("Question not found");
            return;
        }
        navigationStack.push(id);
        System.out.println("Visited Question: "+id);
    }
    // Store answer
    public void submitAnswer(int id,String answer){
        if(!questions.containsKey(id)){
            System.out.println("Question not found");
            return;
        }
        answers.put(id,answer);
        System.out.println("Answer saved");
    }
   
    // Go back to last question
    public void goBack(){
        if(navigationStack.isEmpty()){
            System.out.println("No previous question");
            return;
        }
        int last=navigationStack.pop();
        System.out.println("Returned from Question: "+last);
    }
   
    // Calculate score
    public void evaluate(){
        int score=0;
        for(Integer id:answers.keySet()){
            Question q=questions.get(id);
            if(q!=null&&q.correctAnswer.equalsIgnoreCase(answers.get(id))){
                score++;
            }
        }
        System.out.println("Final Score: "+score+" / "+questions.size());
    }
}
