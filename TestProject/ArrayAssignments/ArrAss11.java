package ArrayAssignments;

public class ArrAss11 {

	public static void main(String[] args) {
		String arr[][]= {{"i","am","going"},{"to","my","home"},{"withoot","taking","books"}};
		String cont="";
		for(int i=arr.length-1;i>=0;i--)
		{
			for (int j=arr[i].length-1;j>=0;j--)
			{
				cont=cont+ arr[i][j];
			}
		}
		System.out.print(cont+"  ");

	}

}
