package practice;

public class Forloop {

	public static void main(String[] args) {
		
		int counter=0;
		int sum=0;
      for(int i=1;i<=100;i++)
      {
    	  if(i%2==0)
    	  {
    	  System.out.println(i);
    	  counter++;
    	  sum=sum+i;
      
    	  }
	}
      System.out.println(counter);
      System.out.println(sum);
	}
}
