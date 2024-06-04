import java.util.Scanner;

public class rev_string {
    int MaxSize,tos;
    char stack[];
    void create_stack(int size)
    {
        MaxSize=size;
        tos=-1;
        stack=new char[MaxSize];
    }
    void push(char e)
    {
        tos++;          
        stack[tos]=e;   
    }
    char pop()
    {
        char temp=stack[tos];
        tos--;
        return(temp);
    }
    public static String FirstReverse (String str)
    {
        String r="";
        rev_string obj=new rev_string();
        obj.create_stack(str.length());
        for(int i=0;i<str.length();i++)
        {
            obj.push(str.charAt(i));
        }

        for(int i=0;i<str.length();i++)
        {
            r=r+obj.pop();
        }
        

        return r;
    }

    public static void main(String[] args) {
        String input="Sohan Sarode";
        
        System.err.println(FirstReverse(input));
    }
}
