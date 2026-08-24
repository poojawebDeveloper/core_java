package practice;

public class Numeric {
 static byte b;
 static short s;
 static	int i;
 static  float f;
 static  double d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         b=127;
         s=32467;
         i=2147483647;
         f=6000000.235546f;
         d=6000000.12358495776785;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.printf("%.5f%n", f);
        System.out.printf("%.13f%n", d);
	}

}
