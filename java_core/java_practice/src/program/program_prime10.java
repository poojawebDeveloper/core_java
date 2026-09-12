package program;

import java.util.Scanner;

public class program_prime10 {

	public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    System.out.println("enetr the counter");
    int c2=sc.nextInt();
    int counter=0;
    int num=3;
    int sum=0;
    
    while(counter<c2)
    {
    	boolean flag=false;
    	for(int i=2;i<num;i++)
    	{
    		if(num%i==0)
    		{
    			flag=true;
    			break;
    		}
    	}
    	if(!flag)
    	{
    		System.out.println("prime"+num);
    		sum=sum+num;
    		counter++;
    	}
    	
    	num++;
    }
    System.out.println("counetr:"+counter);
    System.out.println("sum:"+sum);
    
    if(sum%2==0)
    {
    	System.out.println("even");
    }
    else
    {
    	System.out.println("odd");
    }
    System.out.println("square of sum:"+sum*sum);
	}

}
