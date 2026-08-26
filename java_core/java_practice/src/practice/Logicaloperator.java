package practice;

public class Logicaloperator {

	public static void main(String[] args) {
		int num=60;
		int num1=40;
		System.out.println(num==num1&&num!=num1);//false
		System.out.println(num>num1&&num<num1);//false
		System.out.println(num>num1&&num!=num1);//true
		System.out.println(num<=num1&&num>=num1);//false
		
	}

}
