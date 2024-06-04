import java.util.Scanner;

public class queue {
    int MaxSize,rear,front,queue[];
    void Create_queue(int size)
    {
        MaxSize=size;
        rear=-1;
        front=0;
        queue=new int[MaxSize];
    }

    void enqueue(int num)
    {
        rear++;
        queue[rear]=num;
    }

    int dequeue()
    {
        int temp=queue[front];
        front++;
        return temp;   
    }

    boolean isFull()
    {
        if(rear==MaxSize-1)
        {
            return true;
        }
        else{
            return false;
        }
    }

    boolean isEmpty()
    {
        if(front>rear || rear==-1 || rear<MaxSize-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void printqueue()
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.println("Elemenets:"+queue[i]);
        }
    }
    public static void main(String[] args) {
        int front, rear;
        System.out.println("Size of Queue");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        queue obj=new queue();
        obj.Create_queue(size);
        int choice;

        do{
            System.out.println("1,Enqueue\n2.Dequeue\n3.Print\n");
            System.out.println("Enter Your Choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                if(obj.isEmpty()==true)
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
                    obj.printqueue();
               break;

                default:
                System.out.println("Wrong Choice Entered");

            }

        }
        while(choice!=0);
        

    }
}
