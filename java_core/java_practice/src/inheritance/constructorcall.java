package inheritance;

public class constructorcall {

	public static void main(String[] args) {


		Demo d = new Demo();
	}

}
class Demo {
    Demo() {
        this(100, 200);
        System.out.println("X");
    }

    Demo(int a, int b) {
        this(50);
        System.out.println("Y");
    }

    Demo(int a) {
        System.out.println("Z");
    }

   
}