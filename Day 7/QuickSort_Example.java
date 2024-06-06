
public class QuickSort_Example 
{
	void Quick_Sort(int a[], int start, int end)
	{
		int i,pivot;
		i=pivot=start;
		int j=end;
		while(i<j)
		{
			while(a[j]>a[pivot])
			j--;

			if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		if(i<end)
		{
			Quick_Sort(a, i+1, end);
		}

	}

	void print_Array(int a[])
    {
        System.out.println("Array has:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" , ");
        }
    }
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		QuickSort_Example obj = new QuickSort_Example();
		int a[]= {55,11,22,99,33,66,44,77,88};
		obj.Quick_Sort(a, 0, a.length-1);
		obj.print_Array(a);
	}

}
