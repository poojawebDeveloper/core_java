package practice;

public class Whileloop7 {

	public static void main(String[] args) {
        int num=1;
        int counter=1;
        while(counter<=80)
        {
        	if(num%8==0&&num%9==0)
        	{
        		System.out.println(num);
        		counter++;
        	}
        	num++;
        	
        }
        System.out.println(counter);
	}

}
