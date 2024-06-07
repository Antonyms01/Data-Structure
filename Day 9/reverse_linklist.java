class Node{
    Node next;
    int data;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
 class list {
    Node root;
    void createlist()
    {
        root=null;
    }
    

    void insert_left(int data)
    {
       
        Node n=new Node(data);
        if(root==null)
        {
            root=n;
        }
        else
        {
            n.next=root;
            root=n;
        }
    }

    void print()
    {
        if(root==null)
        {
            System.out.println("List is EMpty");
        }
        else{
            Node t=root;
            while(t!=null)                     
            {
                System.out.print("|" + t.data + "|->");
                t=t.next;

            }

        }
    }


    void list_reversal()
    {
        if(root==null)
        {
            System.out.println("List is EMpty");
        }
        else{
            Node t=root;
            Stack s=new Stack();
            s.create_stack(10);
            while(t!=null)                     
            {
                s.push(t.data);
                t=t.next;

            }
            Node t1=root;
            while(t1!=null)
            {
                t1.data=s.pop();
                t1=t1.next;
            }
            System.out.println("List Reversed");

        }
    }
}

class Stack
{

    int MaxSize,tos,stack[];
    void create_stack(int size)
    {
        MaxSize=size;
        tos=-1;
        stack=new int[MaxSize];
    }

    int pop()
    {
        int temp=stack[tos];
         tos--;
         return(temp);
    }

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

    int peek() {
        return (stack[tos]);
    }

    boolean isEmpty() {
        if (tos == -1)//as array
            return true;
        else
            return false;
    }

    void print_Stack() {
        for (int i = tos; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }


   
}
public class reverse_linklist
{
    public static void main(String[] args) {
        list obj=new list();
        obj.createlist();
        obj.insert_left(10);
        obj.insert_left(20);
        obj.insert_left(30);
        obj.insert_left(40);
        obj.insert_left(50);
        obj.print();
        obj.list_reversal();
        obj.print();
    }
}