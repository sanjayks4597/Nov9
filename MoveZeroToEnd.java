package common_questions;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []x= {1,1,0,0,1,0,1,0,0,1,1,1};
		
		int low=0,high=x.length-1,mid;
		while(low<=high)
		{
			mid=low+(high-low)/2;
			if(x[mid]==0)
			{
				int temp=x[mid];
				x[mid]=x[high];
				x[high]=temp;
				high--;
			}
			else if(x[mid]==1)
			{
				int temp=x[mid];
				x[mid]=x[low];
				x[low]=temp;
				low++;
			}
		}
		
		for(int m:x) {
			System.out.print(m+" ");
		}

	}

}
