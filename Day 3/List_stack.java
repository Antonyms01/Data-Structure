class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }

}

public class List_stack {
    // int tos=-1;
    Node root;
    

   void create()
   {
        root=null;
   }

   void push(int key)
   {
    Node n=new Node(key);
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

   void pop()
   {
    if(root==null)
    {
        System.out.println("Stack is Empty");
    }
    Node t=root;
    root=root.next;
    System.out.println("Element Popped"+root.data);

   }

   int peek()
   {
        Node t=root;
        return(t.data);
   }

   void isEmpty()
   {
    Node t=root;
    if(t==null)
    {
        System.out.println("Stack is Empty!!!");
    }
   
   }
    public static void main(String[] args) {
        
    }
}
