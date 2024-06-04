//Stack is linear,static,one ended, nature:LIFO

import java.util.Scanner;

public class dec_to_binary 
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
        int size=64;                    //64 bits for processing
        int no,remainder;
       dec_to_binary obj=new dec_to_binary();
       Scanner sc=new Scanner(System.in);
       obj.create_stack(size);
       System.out.println("Enter a Num:");
       no=sc.nextInt();
       while(no>0)
       {
        remainder=no%2;                 //10%2=0//5%2=1//2%2=0
        obj.push(remainder);
        no=no/2;                        //10/2=5//5/2=2//0/2=0
       }
       System.out.println("in binary:");
       obj.print_stack();
      
    }
}
