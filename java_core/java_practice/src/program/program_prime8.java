package program;

import java.util.Scanner;

public class program_prime8 {

	public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    System.out.println("enter a number");
    
    int n=sc.nextInt();
    int num=sc.nextInt();
    int sum=0;
    int counter=0;
    for(int i=n;i<num;i++)
    {
    	boolean flag=false;
    	for(int j=2;j<i;j++)
    	{
    		if(i%j==0)
    		{
    			flag=true;
    			break;
    		}
    		
    	}
    	if(!flag)
    	{
    		System.out.println("prime"+i);
    		counter++;
    		sum=sum+i;
    	}
    }
    System.out.println("sum:"+sum);
    System.out.println("couneter:"+counter);
	
     boolean flag=false;
	for(int k=2;k<counter;k++)
	{
		if(counter%k==0)
		{
			flag=true;
		}
	}
	if(!flag)
	{
	System.out.println("prime");
	}
	else
	{
		System.out.println("composite");
	}
	
	}
	
}
