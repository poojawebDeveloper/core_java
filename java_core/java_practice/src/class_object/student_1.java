package class_object;

public class student_1 {
	
	String name;
    int marks;
    
    void checkresult()
    {
    	System.out.println("name:"+name);
    	
    	if(marks>40)
    	{
    	System.out.println("marks:"+marks);
    	}
    	else
    	{
    		System.out.println("you fail");
    	}
    	if(marks>40)
    	{
    		System.out.println("pass"+name);
    	}
    }

	public static void main(String[] args) {

      student_1 stud=new student_1();
      
      stud.name="abc";
      stud.marks=50;
      
      stud.checkresult();
	}

}
