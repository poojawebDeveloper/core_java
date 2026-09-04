package loop;

public class dowhileeven_odd {

	public static void main(String[] args) {
      int num=1;
      int counter1=0;
      int counter2=0;
      
      do
      {
    	  if(num%2==0)
    	  {
    		  System.out.println(num);
    		  counter1++;
    	  }
    	  else
    	  {
    	  System.out.println(num);
    	  counter2++;
    	  }
    	  num++;
      }while(num<=100);
      
      System.out.println("even number count=" +counter1);
      System.out.println("odd number count=" +counter2);

	}

}
