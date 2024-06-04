import java.util.Scanner;

public class adddash {
    
    String queue[],MaxSize,front,rear;
    void createQueue(int size)
    {
        rear=-1;
        front=0;
        MaxSize=size;
        queue=new int[MaxSize];

    }
    void enqueue( String element)
    {
        rear++;
        queue[rear]=element;
    }
    boolean is_Full()
    {
        if(rear==MaxSize-1)
            return true;
        else
            return false;
    }
    int dequeue()
    {
        int temp=queue[front];
        front++;
        return(temp);
    }
    boolean is_Empty()
    {
        if(front>rear)
            return true;
        else
            return false;
    }


    void print_queue()
    {
        for(int i=front;i<=rear;i++)
            System.out.print(queue[i]+"--");
    }

    public static String adddash1(String str)
    {
        adddash obj=new adddash();
       obj.createQueue(str.length());
       int arr[]=new int[str.length()];
      // arr=Integer.parseInt(str.toCharArray());
       for(int i=0;i<str.length();i++){
       {
        // k=str.charAt(i);
        arr[i]=str.charAt(i);

        //obj.enqueue(str.charAt(i));
       }
       for(int j=0;j<arr.length-1;j++){
        if(arr[j]%2!=0 && arr[j+1]%2!=0){
            obj.enqueue(arr[j]);
            obj.enqueue("-");
            
        }
        else{
            obj.enqueue(arr[j]);
        }
       }
    

        return str;
    }

    public static void main(String[] args) {
        String input="994679";      //9-9467-9
        
        System.err.println(adddash1(input));
    }
}
