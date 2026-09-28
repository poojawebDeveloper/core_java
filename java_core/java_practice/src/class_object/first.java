package class_object;

public class first {
	
	public static void main(String[] args) {

    bank b1=new bank();
    b1.id=11;
    b1.name="Bank of Maharashtra";
    b1.Branch="pune";
    b1.IFSCCODE="BOM56488";
    
    System.out.println(b1.name);
    

	}

}
class bank
{
	int id;
	String name;
	String Branch;
	String IFSCCODE;
}
