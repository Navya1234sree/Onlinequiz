package quizApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Quiz q=new Quiz();
		q.logic();

	}

}

class Questions {
	
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	
	

	//  constructor with parameters
	
	public Questions(String question, String option1, String option2, String option3, String option4) {
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	@Override
	public String toString() {
		return "Questions [Question=" + question + ", option1=" + option1 + ", option2=" + option2 + ", option3="
				+ option3 + ", option4=" + option4 + "]";
	}
	
	
}
// here is the logic

  class  Quiz {
	
	Scanner sc=new Scanner(System.in);
	int correctAnsCount=0;
	int wrongAnsCount=0;
	
	public void logic() {
		
		//creating objects
		
		Questions q1=new Questions("who invented java programming?" , "a) Guido Van Rossum" , "b) James Gosling" ,  "c) Dennis Ritchie" , "d) None" );
		Questions q2=new Questions(" What is the extension of a Java source file?" ,  "a) .java" ,  "b) .class" ,   "c) .jar" ,   "d) .exe" );
		Questions q3=new Questions("What is the purpose of the \"public static void main\" method in Java?" ,  "a) To declare a variable" , "b) To define a class" , "c) To start the execution of a Java program" , "d) To import a package" );
		Questions q4=new Questions(" Which of the following is a Java keyword?" ,  "a) Public" ,  "b) Private" ,  "c) Protected" ,   "d) All of the above" );
		Questions q5=new Questions(" Which of the following is a Java data structure?" ,  "a) Array" ,  "b) Linked List" ,  "c) Stack" ,  "d) All of the above");
	
	
	Map<Questions,Character> hmap=new HashMap<>();
	hmap.put(q1, 'b');
	hmap.put(q2, 'a');
	hmap.put(q3, 'c');
	hmap.put(q4, 'd');
	hmap.put(q5, 'd');
	
	//to print the output
	
	for(Map.Entry<Questions,Character> map:hmap.entrySet()) {
		System.out.println(map.getKey().getQuestion());
		System.out.println(map.getKey().getOption1());
		System.out.println(map.getKey().getOption2());
		System.out.println(map.getKey().getOption3());
		System.out.println(map.getKey().getOption4());
		
	
		
      char ans;

        // Using do-while to ensure valid input
        do {
            System.out.println("Enter your answer (a/b/c/d): ");
            ans = sc.next().toLowerCase().charAt(0);  // Convert to lower case to handle both cases

            // Check if the answer is valid
            if (ans != 'a' && ans != 'b' && ans != 'c' && ans != 'd') {
                System.out.println("Invalid input! Please enter a valid option (a/b/c/d).");
            }
        } while (ans != 'a' && ans != 'b' && ans != 'c' && ans != 'd');  
		
		
		
		
    //comparing user answers with correct answer
		
		if(Character.compare(ans, map.getValue())==0)
		
		{
			
			correctAnsCount++;
		} 
		else
		{
			
			wrongAnsCount++;
		}
		
        System.out.println();
		
	}   
       
	//calculate and display result after all questions
	
	    System.out.println("--------------Result--------------");
		System.out.println("Total Questions: "+hmap.size());
		System.out.println("Correct answered questions: "+correctAnsCount);
		System.out.println("Wrong answered questions: "+wrongAnsCount);
		
		int percentage=(100*correctAnsCount)/hmap.size();
		System.out.println(" Percentage:"+ percentage);
		
		//performance evaluation
		
		if( percentage>75)
		{
			System.out.println("Performance: Very Good");
		}
		else if( percentage<35)
		{
			System.out.println("Performance: Very Low");
		}
		else
		{
			System.out.println("Performance: Medium");
		}
	
      }
	

	}
	

