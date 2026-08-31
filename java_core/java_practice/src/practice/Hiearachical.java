package practice;

class Birds{
	void show() {
	   
		System.out.println("This is Birds");
	
	}
	
}

class Crow extends Birds{
	void display() {
		String Name ="Crow";
		System.out.println(Name);
		
	}
}

class Peacock extends Birds{
	void dis() {
		String Name ="PEACOCK";
		System.out.println(Name);
		
	}
}
 class Hiearachical extends Birds {

	public static void main(String[] args) {
		Crow c1=new Crow();
		c1.show();
		c1.display();
		Peacock p1=new Peacock();
		p1.show();
		p1.dis();
		
	}

}
