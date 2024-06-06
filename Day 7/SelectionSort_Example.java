
public class SelectionSort_Example 
{
	void Selection_Sort(int a[])
	{
		int min,pos; 
		for(int i=0; i<a.length;i++)
		{
			min=a[i];
			pos=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<min)			//11<55//55<55
				{
					min=a[j];		//min=11
					pos=j;			//1
				}
			}
				// swap a[i] -a[pos]

				a[pos]=a[i];				//pos==a[i]
				a[i]=min;
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
		SelectionSort_Example obj = new SelectionSort_Example();
		int a[]= {55,11,22,99,33,66,44,77,88};
		obj.Selection_Sort(a);
		obj.print_Array(a);
	}

}
