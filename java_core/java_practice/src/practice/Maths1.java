package practice;

public class Maths1 {

	public static void main(String[] args) {
		int num=20;
		                   //20+20-21+21
		System.out.println(num++ + --num - ++num + num++);
		
		int num1 = 5;     //5+7-6+6
		System.out.println(num1++ + ++num1 - --num1 + num1--);
		
		int num2 = 10;    //10+10-10+10
		System.out.println(num2-- + ++num2 - num2++ + --num2);

		int num3 = 5;     //6+6-6+6+6-6
		System.out.println(++num3 + num3++ - --num3 + num3-- + ++num3 - num3++);
 
		int num4 = 20;    //20+20-19+19-21+21
		System.out.println(num4-- + ++num4 - --num4 + num4++ - ++num4 + num4--);
        
		int num5 = 15;    //14+14-16+16+14+15
		System.out.println(--num5 + num5++ - ++num5 + num5-- + --num5 + ++num5);



	}

}
