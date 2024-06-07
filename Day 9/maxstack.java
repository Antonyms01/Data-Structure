import java.util.Scanner;

public class maxstack {
        int MaxSize,tos,max_tos,stack[],maxstack[];
    void create_stack(int size)
    {
        MaxSize=size;
        tos=-1;
        stack=new int[MaxSize];
        //maxstack=new int[MaxSize];
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
}

class basic{
    public static void main(String[] args) {
        int size,element,choice;
        maxstack obj=new maxstack();
        maxstack obj1=new maxstack();
        System.out.println("Entr size of stack:");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        obj.create_stack(size);
        obj1.create_stack(size);
      
        
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
                    if(obj1.isEmpty())
                    {
                       // obj.push(element);
                        obj1.push(element);
                    }
                    else
                    {
                        if(element>obj1.peek())
                        {
                            obj1.push(element);
                            System.out.println("Enter to Max_stack:"+element);
                            
                        }
                        
                    }
                    
                }
                else
                {
                    System.out.println("Stack is Full...");
                }
                break;
                case 2:
                if(obj.isEmpty()!=true)
                {
                    int top=obj.pop();
                    System.out.println("Element Poped:"+top);
                    if(top==obj1.peek())
                    {
                        System.out.println("from Max Stack Element Poped:"+obj1.pop());
                    }

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
    //main code for menu driven 1.push 2.pop 3.peek 4.print
    