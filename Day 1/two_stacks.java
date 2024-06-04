import java.util.Scanner;

public class two_stacks {

    int MaxSize,tos1,tos2,stack[];
    void create_stack(int size)
    {
        MaxSize=size;
        tos1=-1;
        tos2=MaxSize;
        stack=new int[MaxSize];
    }

    //push1//push2//pop1//pop2//peek1//peek2//print1//print2//isempty1//isempty2//isfull1//isfull2

    void push1(int p1)
    {
        tos1++;
        stack[tos1]=p1;
    }

    void push2(int p2)
    {
        tos2--;
        stack[tos2]=p2;
    }

    int pop1()
    {
        tos1--;
        return(stack[tos1+1]);
    }

    int pop2()
    {
        tos2++;
        return(stack[tos2-1]);
    }

    int peek1()
    {
        return(stack[tos1]);
    }

    int peek2()
    {
        return(stack[tos2]);
    }

    void print1()
    {
        for(int i=tos1;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
    }

    void print2()
    {
        for(int i=tos2;i<MaxSize;i++)
        {
            System.out.println(stack[i]);
        }
    }

    boolean isEmpty1()
    {
        if(tos1==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isEmpty2()
    {
        if(tos2==MaxSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isFull1()
    {
        if(tos1==MaxSize-1 || tos1+1==tos2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isFull2()
    {
        if(tos2==-1 ||tos2-1==tos1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    

    public static void main(String[] args) {
        two_stacks obj=new two_stacks();
        System.out.println("Enter Size of Stack:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        obj.create_stack(size);
       
        int choice;
        int operation;
       
        do{
            System.out.println("\n1.Stack1\n2.Stack2");
            System.out.println("Enter you want to work on stack1 or stack 2???");
             choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n");
                System.out.println("Enter Operation Choice(1):");
                operation=sc.nextInt();
                switch(operation)
                {
                    case 1:
                    if(obj.isFull1()!=true)
                    {
                        System.out.println("Enter an Element:");
                        int element=sc.nextInt();
                        obj.push1(element);
                    }
                    else
                    {
                        System.out.println("Stack is Full(1.1)!!!");
                    }
                    break;
    
    
                    case 2:
                    if(obj.isEmpty1()!=true)
                    {
                        System.out.println("Poped Element:\t" +obj.pop1());
                    }
                    else
                    {
                        System.out.println("Stack is Empty(1.2)");
                    }
                    break;
    
                    case 3:
                    if(obj.isEmpty1()!=true)
                    {
                        System.out.println("Peek Element:\t"+obj.peek1());
                    }
                    else
                    {
                        System.out.println("Stack is Empty(1.3)");
                    }
                    break;
    
                    case 4:
                    if(obj.isEmpty1()!=true)
                    {
                        System.out.println("Elements in Stack:");
                        obj.print1();
                    }
                    else
                    {
                        System.err.println("Stack is Empty(1.4)");
                    }
                    break;
    
                    default:
                    System.out.println("Wrong Choice Entered");
                    break;

                }
                break;
                case 2:
                System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n");
                System.out.println("Enter Operation Choice(2):");
                operation=sc.nextInt();
                switch(operation)
                {
                case 1:
                if(obj.isFull2()!=true)
                {
                    System.out.println("Enter an Element:");
                    int element=sc.nextInt();
                    obj.push2(element);
                }
                else
                {
                    System.out.println("Stack is Full(2.1)!!!");
                }
                break;
                case 2:
                if(obj.isEmpty2()!=true)
                {
                    System.out.println("Element" +obj.pop2()+  "Popped\n");
                }
                else
                {
                    System.out.println("Stack is Empty(2.2)!!!");
                }
                break;

                case 3:
                if(obj.isEmpty2()!=true)
                {
                    System.out.println("Peek Element:\t"+obj.peek2());
                }
                else
                {
                    System.out.println("Stack is Empty(2.3)");
                }
                break;

                case 4:
                if(obj.isEmpty2()!=true)
                {
                    System.out.println("Elements in Stack:");
                    obj.print2();
                }
                else
                {
                    System.err.println("Stack is Empty(2.4)");
                }
                break;

                default:
                System.out.println("Wrong Choice Entered");
                break;
                }
                break;
            }
        }
        while(choice!=0);
    }
}

