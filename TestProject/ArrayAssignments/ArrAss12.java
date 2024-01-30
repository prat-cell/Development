package ArrayAssignments;

public class ArrAss12 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int size= a.length*a[0].length;
		int arr[]=new int[size];
		int k=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				arr[k]=a[i][j];
				k++;
				
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
		  System.out.print(arr[i]);

	}

}
	
}
