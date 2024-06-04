import java.util.Scanner;

public class basic {
   
    int MaxSize,tos,stack[];

    void create_stack(int size)
    {
        MaxSize=size;
        tos=-1;
        stack=new int[MaxSize];
    }

    //push,pop,peek,print,empty,full

    void push(int p)
    {
            tos++;
            stack[tos]=p;
    }

    int pop()
    {
        int temp=stack[tos];
        tos--;
        return temp;
    }

    int peek()
    {
        return stack[tos];
    }

    boolean isEmpty()
    {
        if(tos==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isFull()
    {
        if(tos==MaxSize-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

        void print()
        {
            for(int i=tos;i>-1;i--)
            {
                System.out.println(stack[i]);
            }
        }
        
    public static void main(String[] args) {
        System.out.println("Enter Stack Size");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        basic b=new basic();
        b.create_stack(size);
        int choice;
       
        
        
        do
        {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n");
            System.out.println("Enter a choice:");
            choice=sc.nextInt();
            switch (choice) {

                case 0:
                System.out.println("Thanks!!!");
                break;
                
                case 1:
                    if(b.isFull()!=true)
                    {
                        System.out.println("Enter an Element");
                        int element=sc.nextInt();
                        b.push(element);
                    }
                    else
                    {
                        System.out.println("Stack is Full");
                    }
                    break;

                case 2:
                if(b.isEmpty()!=true)
                {
                    System.out.println("Element is popped\n"+b.pop());
                }
                else
                    {
                        System.out.println("Stack is Empty");
                    }
                break;

                case 3:
                if(b.isEmpty()!=true)
                {
                    System.out.println("Element is peek:"+b.peek());
                }
                else
                {
                    System.out.println("Stack is Empty");

                }
                break;

                case 4:
                if(b.isEmpty()!=true)
                {
                    System.out.println("In print:");
                    b.print();
                }
                else
                {
                    System.out.println("Stack is Empty");

                }
                break;

                default:
                System.out.println("Wrong Option Selected");    
            }
        }
        while(choice!=0);

    }
}

