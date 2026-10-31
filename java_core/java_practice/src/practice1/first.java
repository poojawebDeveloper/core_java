package practice1;

public class first {

	public static void main(String[] args) {


		String s1 = "listen";
        String s2 = "silente";
        
        boolean anagram=false;
        
        for(int i=0;i<s1.length();i++)
        {
        	int count=0;
        	int count1=0;
        	for(int j=0;j<s2.length();j++)
        	{
        		if(s1.charAt(i)==s2.charAt(j))
        		{
        			count++;
        		}
        		if(s1.charAt(i)==s2.charAt(j))
        		{
        			count1++;
        		}
        	    if(s1.length()!=s2.length())
        	     {
        	        	anagram=true;
        	        	break;
        	     }
        	    if(count==count1)
        	    {
        	    	anagram=true;
        	    	break;
        	    }
        	    
        		
        	}
        }
        if(!anagram)
        {
        	System.out.println("string is anagram");
        }
        else
        {
        	System.out.println("string is not anagram");
        }
        
	}   
}
