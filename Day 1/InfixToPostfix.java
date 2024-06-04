import java.util.Scanner;

public class InfixToPostfix {
    int maxSize, tos;
    char stack[];
    //create stack: stack, init tos -1 and prepare stack for use
    void create_Stack(int size){
        maxSize = size;
        tos = -1;
        stack = new char[maxSize];
    }
    void push(char item){
        stack[++tos]=item; //first increment tos, then put item in stack
    }
    //isFull(): returns true if stack is full else false
    boolean isFull(){
        return (tos == maxSize-1);
    }
    //isEmpty(): returns true if stack is empty else false
    boolean isEmpty(){
        return (tos == -1);
    }
    //pop(): returns top item and removes it from stack
    char pop(){
        return stack[tos--];
    }
    //peek(): returns top item without removing it from stack
    char peek(){
        return stack[tos];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char exp[] = sc.nextLine().toCharArray();
        char postfix[] = new char[exp.length +1];
        InfixToPostfix obj = new InfixToPostfix();
        obj.create_Stack(exp.length);
        
        for(int i=0; i<exp.length; i++){
            if(exp[i] == '+' || exp[i] == '-' || 
                    exp[i] == '*' || exp[i] == '/' || 
                    exp[i] == '^' || exp[i]=='('){
                obj.push(exp[i]);
            }
            else if(exp[i] == ')'){
                while(!obj.isEmpty() && obj.peek() != '('){
                    postfix[i] = obj.pop();
                }
                obj.pop();
            }
            else{
                postfix[i] = exp[i];
            }
        }
        while(!obj.isEmpty()){
            postfix[exp.length] = obj.pop();
        }

        for(int i = 0; i < postfix.length; i++){
            System.out.print(postfix[i]);
        }
    }
}
