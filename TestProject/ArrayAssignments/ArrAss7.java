package ArrayAssignments;

public class ArrAss7 {

	public static void main(String[] args) {
		int num1[][]= {{10,11,12},{13,14,15},{16,17,18}};
		int num2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int num3[][]=new int[num1.length][num2.length];
		for(int i=0;i<num1.length;i++)
		{
		  for(int j=0;j<num2.length;j++)
		  {
			 
			 num3[i][j]=num1[i][j]- num2[i][j];
			 System.out.print(num3[i][j]+"  ");
		  }
		  System.out.println();

	}

}
}
