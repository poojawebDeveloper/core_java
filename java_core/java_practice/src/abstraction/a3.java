package abstraction;

public class a3 {

	public static void main(String[] args) {


		Animal a = new Dog();

        a.sound();//animal constructor  dog constructor dog barks
        a.eat();//animal is eating

        Animal b = new Cat();

        b.sound();//animal constructor cat constructor cat moves
        b.eat();//animal is eating
        

	}

}
abstract class Animal
{
    Animal()
    {
        System.out.println("Animal Constructor");
    }

    abstract void sound();

    void eat()
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal
{
    Dog()
    {
        System.out.println("Dog Constructor");
    }

    @Override
    void sound()
    {
        System.out.println("Dog barks");
    }

    void display()
    {
        System.out.println("Dog display method");
    }
}

class Cat extends Animal
{
    Cat()
    {
        System.out.println("Cat Constructor");
    }

    @Override
    void sound()
    {
        System.out.println("Cat meows");
    }

    void display()
    {
        System.out.println("Cat display method");
    }
}


