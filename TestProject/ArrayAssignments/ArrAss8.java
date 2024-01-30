package ArrayAssignments;

public class ArrAss8 {

	public static void main(String[] args) {
		String num1[][]= {{"A","B","C"},{"D","E","F"},{"G","H","I"}};
		String num2="";
		for(int i=0;i<num1.length;i++)
		{
			for(int j=0;j<num1[0].length;j++)
			{
				num2= num2+num1[i][j];
			}
			
			
		}
		System.out.print(num2);

	}

}
