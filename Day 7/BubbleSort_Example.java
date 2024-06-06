
public class BubbleSort_Example
{
	void Bubble_Sort(int a[])
	{
		int i,j,t;
		boolean flag;
		for(i=a.length-1;i>0;i--)
		{
			flag=true;
			for(j=0;j<i;j++)
			{
				if(a[j]>a[j+1])
				{
					flag=false;
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
			if(flag)	//(flag==true) ---- if true means no swap that means sorted list
				break;
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
		BubbleSort_Example obj = new BubbleSort_Example();
		int a[]= {50,20,40,90,10,70};
		obj.Bubble_Sort(a);
		obj.print_Array(a);
	}

}
