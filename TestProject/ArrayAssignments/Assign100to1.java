package ArrayAssignments;

public class Assign100to1 {

	public static void main(String[] args) {
		int size=0;
	   for(int i=1;i<=100;i++)
	   {
		   if(i%6==0)
		   {
			   size++;
		   }
	   }
	   
	   
		int x[]=new int[size];
		int k=0;
		for(int j=100;j>=1;j--)
		{
			if(j%6==0)
			{
			  x[k]=j;
			  System.out.println(x[k]);
			   k++;
			}
			
		}
		System.out.println("length of Array=" +x.length);
		
		for(int z= x.length/2;z<x.length;z++)
		{
		   System.out.println(x[z]);	
		}
		{
		
		}
		
	
	}
	

}
