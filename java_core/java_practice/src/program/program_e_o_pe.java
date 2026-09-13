package program;

public class program_e_o_pe {

	public static void main(String[] args) {
      
     int num=1;
     int countere=0;
     int countero=0;
     int sume=0;
     int sumo=0;
     while(num<=100)
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
    		 if(num%2==0)
    		 {
    		 System.out.println("even prime:"+num);
    		 sume=sume+num;
    		 countere++;
    		 }
    	 }
    	 if(num%2!=0)
    	 {
    		 System.out.println("odd prime:"+num);
    		 sumo=sumo+num;
    		 countero++;
    	 }

    	 num++;
     }
     System.out.println("even prime count:"+countere);
     System.out.println("even prime sum:"+sume);
     System.out.println("odd prime count:"+countero);
     System.out.println("odd prime sum:"+sumo);
	}

}
