package practice;

public class Decrement {

	public static void main(String[] args) {
     int num=20;       //20+20+20+20-20
     System.out.println(num-- + ++num + num-- + ++num - num--);

     int num1 = 100;   //99-98+99-98-98
     System.out.println(--num1 - --num1 + ++num1 - ++num1 - num1++);
	
     int num2=60;       //60-60+61+61+61
     System.out.println(num2++ - --num2 + ++num2 + num2++ + --num2);
     
     int num3=50;     //51-52+53-54+54
     System.out.println(++num3 - ++num3 + ++num3 - ++num3 + num3--);
     
     int num4=200;   //200+202+202+203
     System.out.println(num4++ + ++num4 + num4++ + num4++);
	}
}
