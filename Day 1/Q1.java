//infix to postfix conversion

import java.util.Scanner;

public class Q1 {

    int prec(char c)
    {
        if(c=='^')
        {
            return 3;
        }
        if(c=='/'||c=='*' ||c=='%')
        {
            return 2;
        }

        if(c=='+' || c=='-')
        {
            return 1;
        }
        return -1;
    }

    void func(int size)
    {
        for(int i=0;i<size;i++)
        {
           
        }
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Expression:");
        s=sc.nextLine();
        Q1 obj=new Q1();
        obj.func(s.length());
        


    }
}
