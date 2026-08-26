package practice;

public class LogicalOR {

	public static void main(String[] args) {
		int num=90;
		int num1=20;
		System.out.println(num==num1||num!=num1);//true
        System.out.println(num>num1||num<num1);//true
	    System.out.println(num==num1||num<num1);//false
	    System.out.println(num<num1||num!=num1);//true
	
	}
	
}
