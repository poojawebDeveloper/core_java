package program;

public class unary_operator {

	public static void main(String[] args) {
		int num=11;
                            //11-12+12+13-13
		System.out.println(num++ - num++ + --num + ++num - num-- );//11
		
		int num1=500;
		                     //501-500+499-500+499+500
		System.out.println(++num1 - --num1 + --num1 - ++num1 + --num1 + ++num1);//999
		
		
	}

}
