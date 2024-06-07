

public class sum_target {

    static void sumofn(int a[],int target)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==target)
                {
                    System.out.println("("+a[i]+","+a[j]+")");
                    
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,8};
        int target=9;
        sum_target obj=new sum_target();
        sum_target.sumofn(arr,target);
    }
}
