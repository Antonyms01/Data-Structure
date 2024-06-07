package Revision;

import java.util.Scanner;

public class circularqueue {
    int front,rear,MaxSize,queue[],count;
    void createqueue(int size)
    {
        MaxSize=size;
        front=0;
        rear=-1;
        queue=new int[MaxSize]; 
    }

    void enqueue(int data)
    {
        count++;
        rear=(rear%MaxSize)+1;
        queue[rear]=data;
    }

    int dequeue()
    {
        int temp=front;
        front=(front%MaxSize)+1;
        count--;
        return temp;
    }

    boolean isEmpty()
    {
        return (count==0)?true:false;
    }

    boolean isFull()
    {
        return (count==MaxSize)?true:false;
    }

    void printqueue()
    {
        int i,c;
        i=front;
        c=0;
        while(c<count)
        {
            System.out.print(queue[i]+"-");
            i=(i%MaxSize)+1;
            c++;
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter size of Queue:");
        Scanner sc=new Scanner(System.in);
        circularqueue obj=new circularqueue();
        int size=sc.nextInt();
        obj.createqueue(size);
        int choice;

        do{
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit");
            System.out.println("Enter Yor Choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                if(!obj.isFull())
                {
                    System.out.println("Enter Data:");
                int data=sc.nextInt();
                obj.enqueue(data);
                }
                else
                {
                    System.out.println("Queue is Full!!!");
                }
                
                break;

                case 2:
                if(!obj.isEmpty())
                {
                    obj.dequeue();
                    System.out.println("Element removed");
                }
                else
                {
                    System.out.println("Queue is empty");
                }
                break;

                case 3:
                if(!obj.isEmpty())
                {
                    obj.printqueue();
                }
                else
                {
                    System.out.println("Queue is Empty");
                }
                break;

                case 0:
                System.out.println("Exiting...");
                break;

                default:
                System.out.println("Wrong Choice Entered!!!");
            }
        }while(choice!=0);
    }
}

