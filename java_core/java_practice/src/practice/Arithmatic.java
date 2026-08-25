package practice;

public class Arithmatic {

	public static void main(String[] args) {
		int a=20;
		int b=80;
		
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
        int g=a%b;
        //System.out.println(+c, "," +d,"," ,+e ,",", +f ,",", +g, ",");
        
        System.out.println("c:" +c);
        System.out.println("d:" +d);
        System.out.println("e:" +e);
        System.out.println("f:" +f);
        System.out.println("g:" +g);
	
        System.out.println("----------");
// increment decrement
int x =10,y;
 //y = ++x;//prefix
 y=x++;//postfix
System.out.println(x);
System.out.println(y);

System.out.println("----------");
// relational operator

int p=50,q=60;
 boolean  k=p>q;
 boolean l =p<q;
 boolean m=p==q;
 boolean n=p!=q;
 System.out.println(k);
 System.out.println(l);
 System.out.println(m);
 System.out.println(n);
 
 System.out.println("----------");
 //logical boolean
 boolean o=((p>q)&&(p<q));
 boolean r=((p<q)||(p>q));
 System.out.println(o);
 System.out.println(r);
 boolean w=((p<q)&(p<q));
 System.out.println(w);
	}
	}