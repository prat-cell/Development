package ArrayAssignments;

public class Array50to100 {
	public static void main(String args[])
	{
		int size=0;
		int sum=0;
	for(int i=50;i<=100;i++)
	{
		if(i%3==0)
		{
			size=size+1;
			sum=sum+i;
		}
	}
	int x[]= new int[size];
	int k=0;
	for(int j=50;j<=100;j++)
	{
		if(j%3==0)
		{
			x[k]=j;
			
			k++;
		}
		
	
	}
	 for(int z=x.length-1;z>=0;z--)
	 {
		 System.out.println(x[z]);
	 }
	 System.out.println("sum="+sum);
	
    }
}
