package ArrayAssignments;

public class Assign100to200 {

	public static void main(String[] args) {
		int size=0;
		for(int i=100;i<=200;i++)
		{
			if(i%10==0)
			{
		      size=size+1;	
			}

	    }
     int x[]=new int[size];
     int k=0;
     for(int j=100;j<=200;j++)
     {
       if(j%10==0)
    	 {
    	x[k]=j;
    	System.out.println(x[k]);
    	k++;
          }
    	   
}
     System.out.println("length of an Array is ="+x.length);
     int mid=x.length/2;
     System.out.println("First Half Elements Of An Array");
     for(int z=0;z<mid;z++)
     {
    	 System.out.println(x[z]);
     }
     
     
     
}
}
