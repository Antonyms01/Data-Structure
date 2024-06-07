package Revision;

public class selection {
    void sort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int min=a[i];
            int pos=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    pos=j;
                }
            }
            a[pos]=a[i];
            a[i]=min;
           
        }
    }
    void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+",");
    }
    public static void main(String[] args) {
        selection s=new selection();
        int arr[]={50,20,10,40,60};
        s.sort(arr);
        s.print(arr);
    }
}

