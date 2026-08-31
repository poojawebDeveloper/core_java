package practice;

public class Speed {

	public static void main(String[] args) {
		int speed=203;
		
		if(speed>0&&speed<=40)
		{
			System.out.println("slow");
		}
		else if(speed>=41&&speed<=70)
		{
		System.out.println("medium");
		}
		else if(speed>70&&speed<=100) {
			System.out.println("fast");
		}
		else if(speed>=101&&speed<=200)
		{
			System.out.println("very fast");
		}
		else
		{
			System.out.println("cross");
		}
	}

}
