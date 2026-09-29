package class_object;

public class second {

	public static void main(String[] args) {
		hospital first=new hospital();
		first.Name="golden care";
	    first. patient=43;
	    first.doctor="de jay";
	    System.out.println(first.doctor);
	   
	    bike second = new bike();
	    second.modeal="gt 650";
	    second.price=300000.00;
	    second.colour="silver";
	    System.out.println(second.price);
	    
	    driver third =new driver();
	    third.Name="veer";
	    third.Nunmerplate=6789;
	    third.gender='m';
	    
	    System.out.println(third.gender);
	    

	}

}
class hospital
{
	String Name;
	int patient;
	String doctor;
}
class bike
{
	String modeal;
	double price;
	String colour;
}
class driver
{
	String Name;
	int Nunmerplate;
	char gender;
}