package class_object;

public class book {

	public static void main(String[] args) {
     
		Book1 b1=new Book1();
		b1.book_name="secrate";
	    b1.book_author="abc";
	    b1.book_language="english";
	    b1.book_price=100;
	    b1.book_pages=200;
	    
	    System.out.println(b1.book_author);
	    
	    System.out.println(b1.book_pages);
	    
    
	}

}
class Book1
{
	String book_name;
	int book_price;
	String book_author;
	int book_pages;
	String book_language;
}