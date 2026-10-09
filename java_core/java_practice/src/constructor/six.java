package constructor;

public class six {

	public static void main(String[] args) {

		employee emp = new employee(1,"abc",50000,20000);
		employee emp2 = new employee(2,"xyz",60000,30000);
		employee emp3 = new employee(3,"pqor",80000,40000);
		emp.getTotalSalary();
		emp.getcalculatetax();
		emp.displayemployee();
		emp2.getTotalSalary();
		emp2.getcalculatetax();
		emp2.displayemployee();
		emp3.getTotalSalary();
		emp3.getcalculatetax();
		emp3.displayemployee();

	}

}
class employee
{
	int id;
   String name;
	int basicSalary;
	int bonus;
	int TotalSalary;
    
	int calculateTax;
     int Tax;

	 
	public employee(int i,String n,int bs,int b)
	{
		this.id=i;
		this.name=n;
		this.basicSalary=bs;
		this.bonus=b;
	}
	public int getTotalSalary()
	{
		return TotalSalary=basicSalary+bonus;
		
	}

	public int getcalculatetax()
	{
		
		if(TotalSalary>= 100000)   
		{
			Tax = TotalSalary * 20 / 100;
			
		}
		else if(TotalSalary>=50000 && TotalSalary <100000)
		{
			Tax = TotalSalary * 10 / 100;
		}
		else
		{
			Tax = TotalSalary * 5 / 100;
		}
		return Tax;
	}
	public void displayemployee()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("basicsalary:"+basicSalary);
		System.out.println("bonus:"+bonus);
		System.out.println("calculateTotalSalary:"+TotalSalary);
		System.out.println("calculateTax:"+Tax);
	}
	
	{
		
	}

}
