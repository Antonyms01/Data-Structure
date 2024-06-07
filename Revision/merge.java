package Revision;

public class merge {
    void merger(int a[],int start,int mid,int end)
    {
        int i=start;
        int j=mid+1;
        int ti=start;
        int t[]=new int[a.length];

        while(i<=mid && j<=end)
        {
            if(a[i]<a[j])
            {
                t[ti++]=a[i++];
            }
            else
            {
                t[ti++]=a[j++];
            }
        }
        while(i<=mid)
        t[ti++]=a[i++];

        while( j<=end)
        t[ti++]=a[j++];

        for(i=start;i<end;i++)
        a[i]=t[i];


    }
    void sort(int a[],int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            sort(a,mid,end);
            sort(a,mid+1,end);
            merger(a,start,mid,end);
        }
    }

    void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+",");
    }

    public static void main(String[] args) {
        int arr[]={20,10,30,50,60};
        Mergesort obj=new Mergesort();
        obj.sort(arr, 0, arr.length-1);
        obj.print(arr);

    }
}
