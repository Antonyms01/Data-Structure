package Revision;

public class insertionsort {

    void sort(int a[])
    {
        int i,j,ele;

       for( i=0;i<a.length-1;i++)
       {
            j=i+1;
            ele=a[i+1];
            while(j>0 && a[j-1]>ele)
            {
                a[j]=a[j-1];
                j--;
            }
            a[j]=ele;
       }
    }

    void print(int a[])
    {
        System.out.println("Sorted Insertion:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        insertionsort obj=new insertionsort();
        obj.sort(arr);
        obj.print(arr);
    }
}
