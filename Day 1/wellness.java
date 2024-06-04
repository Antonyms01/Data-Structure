
import java.util.Scanner;

public class wellness
{
    int MaxSize,tos;
    char stack[];
    void create_stack(int size)
    {
        MaxSize=size;
        tos=-1;
        stack=new char[MaxSize];
    }

    //push=insert element into top of stack
    //tos+1
    void push(char e)
    {
        tos++;          //1
        stack[tos]=e;   //pushed ===stack[++tos]=e
    }

   
    char pop()
    {
        char temp=stack[tos];
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
    char peek()
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
    
    public static void main(String[] args) {

        boolean flag=true;
        System.out.println("Enter to check:");
        Scanner sc=new Scanner(System.in);
        String line=sc.next();
        wellness obj=new wellness();
        obj.create_stack(line.length());
        for(int i=0;i<line.length();i++)
        {
            char c=line.charAt(i);
            if(c=='{')
            {
                obj.push(c);
            }
            else if(c=='}' && obj.isEmpty()!=true)
            {
                obj.pop();
            }
            else if(c=='}' && obj.isEmpty()==true)
             {
                    System.out.println("Error: } Unexpected");
                    flag=false;
                    break;
            }
        }

        if(obj.isEmpty()==true && flag==true)
        {
            System.out.println("Perfectly Balanced");
        }
        else if(obj.isEmpty()!=true){
            System.out.println("Error: } is expected");
        }
    }
}