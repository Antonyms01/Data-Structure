import java.util.Scanner;

public class Circular_queue {
    int MaxSize,rear,front,queue[],count;
    void Create_queue(int size)
    {
        MaxSize=size;
        rear=-1;
        front=0;
        queue=new int[MaxSize];
        count=0;
    }

    void enqueue(int num)
    {
        count++;
        rear=(rear+1)%MaxSize;
        queue[rear]=num;
    }

    int dequeue()
    {
        int temp=queue[front];
        front=(front+1)%MaxSize;            //Test IMP
        //front++;
        count--;
        return (temp);   
    }

    boolean isFull()
    {
        if(count==MaxSize)
        {
            return true;
        }
        else{
            return false;
        }
       // return (count==MaxSize)?true:false;
    }

    boolean isEmpty()
    {
        
        if(count==0)
        {
            return true;
        }
        else
        {
            return false;
        }
        //return (count==0)?true:false;
    }

    void printqueue()
    {
        int i,c;
        i=front;
        c=0;
        while(c<count)
        {
            System.out.println(queue[i]+ "--");
            i=(i+1)%MaxSize;
            c++;
        }

    }

       public static void main(String[] args) {
        System.out.println("Size of Queue");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Circular_queue obj=new Circular_queue();
        obj.Create_queue(size);
        int choice;

        do{
            System.out.println("1,Enqueue\n2.Dequeue\n3.Print\n");
            System.out.println("Enter Your Choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                if(obj.isFull()==false)
                {
                    System.out.println("Enter Element:");
                    int element=sc.nextInt();
                    obj.enqueue(element);
                }
                else
                {
                    System.out.println("Queue is Full!!!");
                }
                break;

                case 2:
                if(obj.isEmpty()!=true)
                {
                    System.out.println("Element Popped:\t"+obj.dequeue());
                    
                }
                else
                {
                    System.out.println("Queue is Empty!!!");
                }
                break;

                case 3:
                if(!obj.isEmpty())
                {
                    obj.printqueue();
                }
                else
                {
                    System.out.println("Empty Queue!!!");
                }
                   
               break;

                default:
                System.out.println("Wrong Choice Entered");

            }

        }
        while(choice!=0);
        

    }
}
