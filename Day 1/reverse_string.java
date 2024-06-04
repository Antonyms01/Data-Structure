import java.util.Scanner;

public class reverse_string
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

    boolean isFull()
    {
        return (tos==-1)?true:false;
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
             
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Word:");
        String ch=sc.next();
        reverse_string obj=new reverse_string();
        obj.create_stack(ch.length());
        for(int i=0;i<ch.length();i++)
        {
            obj.push(ch.charAt(i));
        }

        String rword=" ";
        while(obj.isEmpty()!=true)
        {
            rword=rword+obj.pop();

        }

        System.out.println("reverse  Word:"+rword);
    }
}