import java.util.Scanner;

public class Circular_List {
    Node root,last;
    void create_list()
    {
        root=last=null;
    }

    void insert_left(int data)
    {
        Node n=new Node(data);
        if(root==null)
        {
            
            root=last=n;
            last.next=root;
        }
        else
        {
            n.next=root;
            root=n;
            last.next=root;
        }
    }

    void delete_left()
    {
        Node t=root;
        if(root==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            root=root.next;
            last.next=root;
        }
        System.out.println("Deleted:"+t.data);
    }

    void insert_right(int data)
    {
        Node t=root;
        Node n=new Node(data);
       
        while(t.next!=null)
        {
            t=t.next;
        }
        t.next=n;
        root.next=last;
        System.out.println("data Inserted");

    }

    void delete_right()
    {
        Node t,t2;
        t=t2=root;
        if(root==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            while(t!=last)  //(t.next!=root)
            {
                t2=t;
                t=t.next;
            }
            if(t==root)
            {
                root=last=null;
            }
            else
            {
               last=t2;
               last.next=root;
                System.out.println("Deleted"+t.data);
            }
        }
    }

    void print()
    {
        Node t=root;
        if(root==null)
        {
            System.out.println("Empty List");
        }
        else
        {
            do
            {
                System.out.println(t.data);
                t=t.next;
            }
            while(last!=t);
            
        }
    }
  
    public static void main(String[] args) {
        int choice;
        Circular_List obj=new Circular_List();
        obj.create_list();
        Scanner sc=new Scanner(System.in);
       
        
        System.out.println("Enter Your Choice");
        

        do
        {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Search\n7.Delete on Data\n8.Insert at\n0.Exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter data:");
                int data=sc.nextInt();
                obj.insert_left(data);
                System.out.println("data is Inserted");
                break;
                
                case 2:
                System.out.println("Enter data:");
                int data1=sc.nextInt();
                obj.insert_right(data1);
                System.err.println("data is inserted");
                break;

                case 3:
                obj.delete_left();
                break;

                case 4:
                obj.delete_right();
                break;
    }
}
    }
}