package inheritance;

public class c9 {

	public static void main(String[] args) {

		Lion l1= new Lion();//animal 1 animal 2  tigeger 1 tiger2 lion 2 lion1

		
	}

}
class Animal {
    Animal() {
        System.out.println("Animal 1");
    }

    Animal(int x) {
        this();
        System.out.println("Animal 2: " + x);
    }
}

class Tiger extends Animal {
    Tiger() {
        super(5);
        System.out.println("Tiger 1");
    }

    Tiger(int x) {
        this();
        System.out.println("Tiger 2: " + x);
    }
}

class Lion extends Tiger {
    Lion() {
        this(20);
        System.out.println("Lion 1");
    }

    Lion(int x) {
        super(x);
        System.out.println("Lion 2: " + x);
    }
}

