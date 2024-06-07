package Revision;

public class Bubblesort {

    void sort(int a[])
    {
        int t,i,j;
        boolean flag;

        for( i=a.length-1;i>0;i--)
        {
            flag=true;
            for(j=0;j<i;j++)
            {
                if(a[j]>a[j+1])
                {
                    flag=false;
                    t=a[j+1];
                    a[j+1]=a[j];
                    a[j+1]=t;
                }
            }
            if(flag)
            break;
        }
    }
    void print(int arr[])
    {
        System.out.println("Bubble Sort");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
        Bubblesort obj = new Bubblesort();
        int arr[]={50,20,40,90,10,70};
        obj.sort(arr);
        obj.print(arr);
    }
}
