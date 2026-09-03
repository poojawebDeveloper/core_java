package loop;

public class Dowhileloo_even {

	public static void main(String[] args) {
     int num=1;
     int counter=0;
     int sum=0;
     
     do {
    	 
    	 num++;
    	 
    	 if(num%2==0){
    		 System.out.println(num);
    		 counter++;
    		 sum=sum+num;
    		 
    	 }
     }while(num<=20);
     
     System.out.println(counter);
     System.out.println(sum);
     
	}

}
