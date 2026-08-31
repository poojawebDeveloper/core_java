package practice;

public class Grade {

	public static void main(String[] args) {
		int marks =125;
      if(marks>=35&&marks<=50) {
    	  System.out.println("Grade E");
      }
      else if(marks>=51&&marks<=60) {
    	  System.out.println("Grade D");
      }
      else if(marks>=61&&marks<=70) {
    	  System.out.println("Grade C");
      }
      else if(marks>=71&&marks<=80) {
    	  System.out.println("Grade B");
      }
      else if(marks>=81&&marks<=90) {
    	  System.out.println("Grade A");
      }
      else if(marks>=91&&marks<=100) {
    	  System.out.println("A+");
      }
      else {
    	  System.out.println("Fail & invalid marks");
      }
	}

}
