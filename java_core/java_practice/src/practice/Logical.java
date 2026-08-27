package practice;

public class Logical {

	public static void main(String[] args) {
		int num =80;
		int num1=90;
		
		System.out.println(num<num1||num==num1);//true
		System.out.println(num>num1||num1>num);//true
		System.out.println(num<num1||num!=num1);//true
		System.out.println(num>num1||num==num1);//false
		
		System.out.println("----------------------------");
		
		System.out.println(num<num1&&num==num1);//false
		System.out.println(num>num1&&num1>num);//false
		System.out.println(num<num1&&num!=num1);//true
		System.out.println(num>num1&&num==num1);//false
		
		
		
	}

}
