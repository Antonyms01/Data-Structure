public class time_buy_sell {

    static int calculation(int arr[])
    {
        
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]-arr[i]>max);
                {
                  //System.out.println(("Buy on:"+arr[i]+"\tSell:"+arr[j]));
                  max=arr[j]-arr[i];
                }
            }
        }
        return max;
    } 
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println("Max Profit:"+calculation(arr));

    }
}
