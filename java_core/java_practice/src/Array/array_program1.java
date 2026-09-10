package Array;

public class array_program1 {

	public static void main(String[] args) {

     int marks[]= {45,89,53,788,456,982,2455,75445,354,6566,2433,554,899,465};
     
     int heights=32768;
     
     for(int i=0;i<marks.length;i++)
     {
    	 if(marks[i]<heights)
    	 {
    		 heights=marks[i];
    	 }
     }
     System.out.println(heights);
     
	}

}
