package practice;

public class Evennumadd {

	public static void main(String[] args) {
		
		
     int num=1;
     int sum=0;
     int counter=0;
     
     while(counter<50)
     {
    	 if(num%2==0)
    	 {
    		 System.out.println(num);
    		 sum=sum+num;
    		 counter++;
    	 }
    	 num++;
    	 }
     
     System.out.println(counter);
     System.out.println(sum);
     }
}
