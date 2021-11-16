package common_questions;

public class Dutch_The_Flag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {2,0,1,0,2,1};
		//{0,0,1,1,2,2}
		int low=0,mid=0,high=arr.length-1;
		while(mid<=high)
		{
			if(arr[mid]==2)
			{
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
			else if(arr[mid]==0)
			{
				int temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}

		}
		for(int n:arr)
		{
			System.out.print(n+" ");
		}

	}

}
