package Revision;

public class Quicksort {
    void sort(int a[],int start,int end)
    {
        int i=start;
        int pivot=start;
        int j=end;
        
        while(i<j)
        {
            while(a[j]>a[pivot])
            {
                j--;
            }
            if(i<j)
            {
                int temp=a[j];
                a[j]=a[pivot];
                a[pivot]=temp;
            }
        }
        if(i<end)
        {
            sort(a,i+1,end);
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
	
    public static void main(String[] args) {
        int arr[]={20,30,10,40,50,60};
        Quicksort q=new Quicksort(); 
        q.sort(arr, 0,arr.length-1);
        q.print_Array(arr);

    }
}
