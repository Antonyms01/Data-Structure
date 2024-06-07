package Revision;

import java.util.Scanner;

public class infix_post {
  
	int tos, Maxsize;
	char stack[];
	void createStack()
	{
		tos=-1;
		stack = new char[300];
	}
	void push(char el)
	{
		tos++;
		stack[tos] = el;
	}
	boolean isEmpty()
	{
		return ((tos == -1) ? true : false);
	}
	char pop()
	{
		tos--;
		return stack[tos+1];
	}
	char peek()
	{
		return stack[tos];
	}
	int precidence(char el)
	{
		if(el == '^')
			return 3;
		if(el == '*' || el == '/' || el == '%')
			return 2;
		if (el == '+' || el == '-')
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		infix_post obj = new infix_post();
		obj.createStack();
		System.out.println("Enter Equation: ");
		String eq = sc.nextLine();
		String result = "";
		char el;
		
		for(int i = 0; i<eq.length(); i++)
		{	
			el = eq.charAt(i);
			if(el == '^' || el == '*' || el == '/' || el == '%' || el == '+' || el == '-')
			{
				if(obj.isEmpty())
				{
					obj.push(el);
				}
				else
				{
					if( obj.precidence(el)>obj.precidence(obj.peek()))
					{
						obj.push(el);
					}
					 else
					 {
						 while(!obj.isEmpty()) 
							{	
								result = result + obj.pop()	;					
							}
							obj.push(el);
					 }
				}
			}
			else
			{
				result = result + el;
			}
		}
		while(!obj.isEmpty())
		{
			result = result + obj.pop();
		}
		System.out.println("Result: "+result);
	}


}
