package ArrayAssignments;

public class ArrAss10 {

	public static void main(String[] args) {
		String arr[][]= {{"i","am","going"},{"to","college","without"},{"eating","anything","daily"}};
		String res="";
		for(int i=0;i<arr.length;i++)
		{
	      for(int j=0;j<arr[1].length;j++)
	      {
	    	res=arr[i][1];  
	      }
	      System.out.print(res);
		}
			
		

	}

}
