package practice;

public class dowhile {

	public static void main(String[] args) {
		int salary=10000;
		
		do
		{
			int tax=salary*20/100;
			System.out.println(salary-tax);
			salary++;
		}while(salary<2000);
	}

}
