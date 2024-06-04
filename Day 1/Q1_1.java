import java.util.Scanner;

public class Q1_1 {
    int MaxSize, tos;
    char stack[];
    void createStack(int size)
    {
        MaxSize = size;
        tos = -1;
        stack = new char[MaxSize];
    }
    public void push(char k)
    {
        tos++;
        stack[tos] = k;
    }
    public boolean isFull()
    {
        return (tos == MaxSize-1) ? true:false;
    }
    public char pop()
    {
        tos--;
        return stack[tos+1];
    }
    public boolean isEmpty()
    {
        return (tos==-1) ? true : false;
    }
    public char peek()
    {
        return stack[tos];
    }

    public int isPrecedence(char ch)
    {
        if(ch == '^')
        {
            return 3;
        }
        else if(ch == '*' || ch == '/' || ch == '%')
        {
            return 2;
        }
        else if(ch == '+' || ch == '-')
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Equation");
        Scanner sc = new Scanner(System.in);
        String eq = sc.nextLine();
        Q1_1 obj = new Q1_1();
        obj.createStack(eq.length());
        String post = "";
        char ch, pop;
        for(int i=0; i<eq.length(); i++)
        {   
            ch = eq.charAt(i);
            if (ch == '^' || ch == '*' || ch == '/' || ch == '%' || ch == '+' || ch == '-')
            {
                if(obj.isEmpty())
                {
                    obj.push(ch);
                }
                else if(obj.isPrecedence(ch) == obj.isPrecedence(obj.peek()))
                {
                    obj.push(ch);
                }
                else if(obj.isPrecedence(ch) > obj.isPrecedence(obj.peek()))
                {
                    obj.push(ch);
                }
                else if(obj.isPrecedence(ch) < obj.isPrecedence(obj.peek()))
                {
                    do
                    {
                        pop = obj.pop();
                        post = post + pop;
                    }while(!obj.isEmpty());
                    obj.push(ch);
                }
            }
            else
            {
                post = post+ch;
            }    
        }
        pop = obj.pop();
        post = post + pop;
        System.out.println(post);
    }
}
