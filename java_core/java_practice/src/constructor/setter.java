package constructor;

public class setter {

	public static void main(String[] args) {

    car c=new car();
    c.setmilage(45);
    System.out.println(c.getmilage());
    

	}

}
class car
{
	int milage;
	public void setmilage(int mile)
	{
		if(mile>50)
		{
		this.milage=mile;
	}
		else
		{
			this.milage=0;
		}
	}
	public int getmilage() 
	{
		return this.milage;
	}
}