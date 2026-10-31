package inheritance;

public class c7 {

	public static void main(String[] args) {

		Cd c1= new Cd(100);//A default A parameterized: " + 10 B default"B parameterized: " + 100"C parameterized: " + 100

	}

}
class Ad{
    Ad() {
        System.out.println("A default");
    }

    Ad(int x) {
        this();
        System.out.println("A parameterized: " + x);
    }
}

class Bd extends Ad {
    Bd() {
        super(10);
        System.out.println("B default");
    }

    Bd(int x) {
        this();
        System.out.println("B parameterized: " + x);
    }
}

class Cd extends Bd {
    Cd(int x) {
        super(x);
        System.out.println("C parameterized: " + x);
    }
}

