package practice;

public class Unary {

	public static void main (String args[]){
		int num1=20;         //19+19+20
		System.out.println(--num1 + num1++ + num1--);
		
		int num2=50;
		               //   50+51+53
		System.out.println(num2++ + num2++ + ++num2);
		
		int num3=15;     //15-17+17
		System.out.println(num3++ - ++num3 +num3--);
		
		//int num=100,x;//101+102+103+104
		/*x=num++;//x 100,n=101
		x=++num;//x102 n 102
		x=num++;//x 102 103
		x=num++;//x 103 104
		System.out.println(num);
		System.out.println(x);*/
		
		//System.out.println(num++ + ++num + num++ + num++);
	
	int num4=30;       //30+30+31
	System.out.println(num4-- + ++num4 + ++ num4); 
	
	
	
	//int num=40;       //40+42+43-42
	//System.out.println(num++ + ++num + num++ - --num ); 
	
	

	
	//*int num=60;       //60+62+62-62
	//*System.out.println(num++ + ++num + num++ - --num ); 
	
	
		//int num=20;   //20+20+21
	  //System.out.println(num++ + --num + ++num);
		
		//int num=27;           //28+27+27+28
		  //System.out.println(++num + --num + num++ + num--);
	
		 // int num=34;           //34+34+34+34
		 // System.out.println(num-- + ++num + num++ + --num);
		  
		  
		  //int num=100;           //100-102+102+104
		 // System.out.println(num++ - ++num + num++ + ++num);
		  
		//int num=300;           //301+301+300-302
		 // System.out.println(++num + num-- + num++ - ++num);
		  
		 // int num=200;           //200+200+200+202
		  //System.out.println(num++ + --num + num++ + ++num);  
		  
		//int num = 100;   //99+99+101
		//System.out.println(--num + num++ + ++num); 
		
		//int num = 50;   //50+50+51
		//System.out.println(num++ + --num + ++num);
	
	}
	
	}
	
	

