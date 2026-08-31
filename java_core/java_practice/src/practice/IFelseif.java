package practice;

public class IFelseif {

	public static void main(String[] args) {
		int age =18;
		
		if(age<=10&&age<18)
		{
			System.out.println("child");
		}
		else if(age>=18&&age<=25)
		{
			System.out.println("Teenager");
		}
		else if(age>=26&&age<=60)
		{
			System.out.println("young");
		}
		else if(age>61&&age<120)
		{
			System.out.println("old");
		}
		else {
			System.out.println("Adult");
		}
	}

}
