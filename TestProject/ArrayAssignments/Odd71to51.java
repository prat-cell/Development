package ArrayAssignments;

public class Odd71to51 {

	public static void main(String[] args) {
		int size=0;
		for(int i=71;i>=51;i--)
		{
			if(i%2==1)
			{
			  size=size+1;	
			}
		}
		int x[]= new int[size];
		int k=0;
		for(int j=51;j<=71;j++)
		{
			if(j%2==1)
			{
				x[k]=j;
				k++;
			}
		}
	   for(int z=x.length-1;z>=0;z--)
	   {
		   System.out.println(x[z]);
	   }
		

	}

}
