package practice;

public class LogicalORAND {

	public static void main(String[] args) {
		int num=60;
		int num1=40;
		
		System.out.println(num==num1||num!=num1);//true
		System.out.println(num==num1&&num!=num1);//false
		System.out.println(num>num1||num<num1);//true
		System.out.println(num>num1&&num<num1);//false
		System.out.println(num1<num&&num!=num1);//true
		System.out.println(num>=num1&&num<=num1);//false
		System.out.println(num1<=num&&num>=num1);//true
	}
	

}
