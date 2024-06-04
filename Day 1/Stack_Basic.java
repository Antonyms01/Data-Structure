//Stack is linear,static,one ended, nature:LIFO

import java.util.Scanner;

public class Stack_Basic 
{
    int MaxSize,tos,stack[];
    void create_stack(int size)
    {
        MaxSize=size;
        tos=-1;
        stack=new int[MaxSize];
    }

    //push=insert element into top of stack
    //tos+1
    void push(int e)
    {
        tos++;          //1
        stack[tos]=e;   //pushed ===stack[++tos]=e
    }

    boolean isFull()    //returns true if full else false
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
    
    //pop()=e remove & return element from tos,tos-1
    int pop()
    {
        int temp=stack[tos];
         tos--;
         return(temp);
    }

    boolean isEmpty()
    {
        if(tos==-1)         //That means stack is Empty
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //peek()=e only returns the element from tos/on the top
    int peek()
    {
        return (stack[tos]);
    }

    //print_stack()=print data in lifo manner,tos to 0
    void print_stack()
    {
        for(int i=tos;i>-1;i--)
        {
            System.out.println(stack[i]);
        }
    }

    //main code for menu driven 1.push 2.pop 3.peek 4.print
    public static void main(String[] args) {
        int size,element,choice;
        Stack_Basic obj=new Stack_Basic();
        System.out.println("Entr size of stack:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        obj.create_stack(size);
        do
        {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                if(obj.isFull()!=true)  //!obj.isFull()
                {
                    System.out.println("Enter an Element:");
                    element=sc.nextInt();
                    obj.push(element);
                }
                else
                {
                    System.out.println("Stack is Full...");
                }
                break;
                case 2:
                if(obj.isEmpty()!=true)
                {
                    System.out.println("Element Poped:"+obj.pop());

                }
                else
                {
                    System.out.println("Stack is Empty:2");
                }
                break;
                case 3:
                if(obj.isEmpty()!=true)
                {
                    System.out.println("Element Peek:"+obj.peek());

                }
                else
                {
                    System.out.println("Stack is Empty:3");
                }
                break;
                case 4:
                if(obj.isEmpty()!=true)
                {
                    System.out.println("Element in stack:");
                    obj.print_stack();
                }
                else
                {
                    System.out.println("Stack is Empty:4");
                    break;
                }
                break;
                case 0:
                System.out.println("Thanks for using Code");
                break;

                default:
                System.out.println("Wrong option selected");
                break;
            }
        }
        while(choice!=0);    //condition exit choice inverted to option
    }

}
