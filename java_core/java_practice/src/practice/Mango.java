package practice;

 class Fruit {
	
	void show() {
		System.out.println("this is fruit");
	}
}

 class Mango extends Fruit {

	public static void main(String[] args) {
		Mango m1 = new Mango();
		m1.show();

	}

}
