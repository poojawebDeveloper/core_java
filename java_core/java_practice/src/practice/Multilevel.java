package practice;
class addition{
	void show() {
		
	int a=50;
	int b=40;
	int c=a+b;
	System.out.println("The addition of program" +c);
	}	
}

class substracation extends addition{
	void display() {
		int x=80;
		int y=40;
		int z=x-y;
		
		System.out.println("The substaction program"+z);
	}
}
class multiplication extends substracation{
	void dis() {
		int num1=40;
		int num2=20;
		int num3=num1*num2;
		System.out.println("The multiplication program"+num3);
		
	}
	
}

class division extends multiplication {
	void Show() {
		int p=80;
		int q=4;
		int r=p/q;
		System.out.println("The division of program"+r);
	}
}
 class Multilevel extends division {

	public static void main(String[] args) {
		
		Multilevel mul = new Multilevel();
		mul.show();
		mul.display();
		mul.dis();
		mul.Show();
		
		
	}

}
