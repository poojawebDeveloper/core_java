package String;

public class scp1 {

	public static void main(String[] args) {


		
		String s =("Latur");//without new keyword litteral object stored in scp is part of heap
		String s1 =("latur");
		String s2 =("latur");
		
		
		String s3= new String ("latur");//using new keyword
		
		String s4= new String ("latur");
		
		
		System.out.println(s1==s);//falses1 and s is stored is scp but false because string is
		//case sensitive s is create second memory address  
		
		System.out.println(s1==s2);//trues1 and s2 is refer one object because value is same
		
		System.out.println(s3==s4);//falseis stored in heap not scp and each object is each seperated object 
		//it is condition always false
		
		System.out.println(s4==s1);//falses4 and s1 is different address beacuse display false
		
		
	}

}
