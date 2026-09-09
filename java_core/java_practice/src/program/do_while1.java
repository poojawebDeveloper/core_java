package program;

public class do_while1 {

	public static void main(String[] args) {

     int num=1;
     int cube=0;
     do
     {
    	 if(num%2==0)
    	 {
    	 //System.out.println(num);
    	 cube=num*num*num;
    	 System.out.println("num::"+num +"cube::"+cube);
    	 }
    	 num++;
     }while(num<=100);
     
     }

}
