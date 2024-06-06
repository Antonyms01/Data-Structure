import java.util.Scanner;

public class Binary_Search {
	
	int binary_search(int a[], int start, int end, int key)
	{
		if(start<=end)
		{
			int mid=(start+end)/2;
			if(a[mid]==key)
				return mid;
			else
			{
				if(key<a[mid])
					return binary_search(a,start,mid-1,key);
				else
					return binary_search(a,mid+1,end,key);
			}
		}

		
			return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11,22,33,44,55,66,77,88,99};
		Binary_Search obj = new Binary_Search();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number to search: ");
		int k = sc.nextInt();
		int result = obj.binary_search(a,0,a.length-1,k);
		
		if(result== -1)
			System.out.println(k+" not found in array");
		else
			System.out.println(k+" found in array at index "+result);
		
		sc.close();
	}

}
