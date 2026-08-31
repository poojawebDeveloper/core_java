package practice;

public class Temprature {

	public static void main(String[] args) {
		int temp=12;
		
  if(temp>=1&&temp<=25)
  {
	  System.out.println("cold");
  }
  else if(temp>=26&&temp<=40)
  {
	  System.out.println("Normal");
  }
  else if(temp>=41&&temp<=60)
  {
	  System.out.println("hot");
  }
  else
	  {
		  System.out.println("high");
	  }

}
}