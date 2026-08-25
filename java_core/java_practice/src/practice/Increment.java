package practice;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=20;        //20+20+21+21
     System.out.println(num++ + --num + ++num + num--);
     
     int num1=30;      //31+31+33+34
     System.out.println(++num1 + num1++ + ++num1+ ++num1);
     
     int num2=100;     //100-100+99+99
     System.out.println(num2++ - --num2 + --num2+ num2++);
     
     int num3=50;     //49-50+50-52+52
     System.out.println(--num3 - ++num3 + num3++ - ++num3 + num3--);
     
     int num4=200;     //200-202+202-202+202-204
     System.out.println(num4++ - ++num4 + num4-- - ++num4 + num4++ - ++num4);
	}

}
