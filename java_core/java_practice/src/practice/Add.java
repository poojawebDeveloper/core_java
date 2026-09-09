package practice;

 class Number {

	static void show () {
	System.out.println("hello");
	}
}

 class Add {
    int a;
    int b;
    int c;
	public static void main(String[] args) {
		
		Add a1 =new Add();
		Number.show();
		a1.a=4;
		a1.b=2;
		a1.c=a1.a+a1.b;
		System.out.println("c:"+a1.c);
		
		}

}
