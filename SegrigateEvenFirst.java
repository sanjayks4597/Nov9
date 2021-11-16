package common_questions;

public class SegrigateEvenFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []x= {12, 34, 45, 9, 8, 90, 3};
		
		int low=0,high=x.length-1,mid;
		
		while(low<=high)
		{
			
			mid=low+(high-low)/2;
			if(x[mid]%2==0)
			{
				int temp=x[mid];
				x[mid]=x[low];
				x[low]=temp;
				low++;
			}
			else {
				int temp=x[mid];
				x[mid]=x[high];
				x[high]=temp;
				high--;
		}
			
		}	
		
		for(int m:x)
		{
			System.out.print(m+" ");
		}

	}

	}
