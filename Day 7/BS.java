import java.util.Scanner;

public class BS {
    
    int binary_search(int a[],int start,int end,int key)
    {
        
        if(start<=end)
        {
            int mid=(start+end)/2;

            if(a[mid]==key)

               return(mid);//position

    else
        {
            if(key<a[mid])
              return binary_search(a,start,mid-1,key);
            else
             return binary_search(a,mid+1,end,key);
        }
}
                return(-1);
}

public static void main(String[] args) {
    int arr[]={10,20,30,40,50,60,70};
    BS b = new BS();
    System.out.println("Enter a Key to Find:");
    Scanner sc=new Scanner(System.in);
    int key=sc.nextInt();
   int result= b.binary_search(arr, 0, arr.length-1, key);
   if(result==-1)
   {
    System.out.println("key Not FOund");
   }
   else{
    System.err.println("Key Found on Index:"+result);
   }
}
}
