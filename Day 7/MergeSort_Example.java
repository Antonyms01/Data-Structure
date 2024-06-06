
public class MergeSort_Example 
{
	void Merger(int a[], int start, int mid, int end)
	{
		int i = start;
		int j = mid+1;
		int t[]=new int[a.length];
		int ti=start;
		while(i<=mid && j<=end)
		{
			if(a[i]<a[j])
				t[ti++]=a[i++];
			else
				t[ti++]=a[j++];
		}
		while(i<=mid)
		{
			t[ti++]=a[i++];
		}
		while(j<=end)
		{
			t[ti++]=a[j++];
		}
		for(i=start;i<=end;i++)
			a[i]=t[i];
	}
	
	void Merge_Sort(int a[],int start,int end)
	{
		if(start<end)
		{
			int mid = (start+end)/2;
			Merge_Sort(a, start, mid);
			Merge_Sort(a,mid+1,end);
			Merger(a,start,mid,end);
		}
	}
	
	void print_Array(int a[])
	{
		System.out.println("Array has");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" , ");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MergeSort_Example obj =new MergeSort_Example();
		int a[]= {55,11,22,99,33,66,44,77,88};
		obj.Merge_Sort(a, 0, a.length-1);
		obj.print_Array(a);
	}

}
