import java.util.Scanner;

public class Dynamic_Queue
{
    Node front;
    Node rear;

    void createstack()
    {
        front=rear=null;
    }

    void enqueue(int data)
    {
        Node n=new Node(data);
        if(rear==null)
        
        {
            rear=front=n;
        }
        else
        {
            rear.next=n;
            rear=n;
        }
    }

    void dequeue()
    {
        if(front==null)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            Node t=front;
            if(front==rear)     //one node only
            {
                front=rear=null;
            }
            else
            {
                front=front.next;
            }
            System.out.println(t.data+"\tDequeued");
        }
    }

    void print_queue()
    {
        if(front==null)
        {
            System.out.println("Empty Queue");
        }
        else
        {
            Node t=front;
            while(t!=null)
            {
                System.err.print("|"+t.data+"|>");
                t=t.next;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choice:");
        int choice;
        Dynamic_Queue obj=new Dynamic_Queue();

        do{
            
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print");
            System.out.println("Enter Choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                System.err.println("Enter Element:");
                int element=sc.nextInt();
                obj.enqueue(element);
                System.out.println("Data is Inserted");
                break;

                case 2:
                obj.dequeue();
                break;

                case 3:
                obj.print_queue();
                break;

            }
        }while(choice !=0);
    }
}