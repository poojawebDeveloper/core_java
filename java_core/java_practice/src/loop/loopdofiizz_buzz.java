package loop;

public class loopdofiizz_buzz {

	public static void main(String[] args) {
     int num=1;
     do
     {
    	 if(num%3==0 && num%5==0)
    	 {
    	 System.out.println("fizzbuzz"+num);
    	 }
    	 else if(num%5==0)
         {
        	 System.out.println("buzz" +num);
         }
         else if(num%3==0)
         {
        	 System.out.println("fizz" +num);
         }
         else 
         {
        	 System.out.println(num);
         }
    	 num++;
    	 }while(num<=100);
     
     
     
	}

}
