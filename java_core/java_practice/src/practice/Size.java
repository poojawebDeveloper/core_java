package practice;

public class Size {

	public static void main(String[] args) {
		int size=84;
    
	if(size<=10)
	{
		System.out.println("small");
	}
	else if(size<=25) {
		System.out.println("medium");
	}
	else if(size<=50)
	{
		System.out.println("large");
	}
	else if(size<=100)
	{
		System.out.println("extra large");
	}
	else if(size<=150)
	{
		System.out.println("huge");
	}
	else {
		System.out.println("invalid size");
	}
	}

}
