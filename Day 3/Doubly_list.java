//DONE
import java.util.Scanner;

public class Doubly_list 
{
    Dnode root;
    
    void create_list()
    {
        root=null;
    }

    void insert_left(int data)
    {
        Dnode d=new Dnode(data);
        if(root==null)
        {
            root=d;
        }
        else
        {
            d.right=root;
            root.left=d;
            root=d;
        }
    }

    void delete_left()
    {
        if(root==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Dnode d=root;
            root=d.right;
            if(root!=null)
            {
                root.left=null;
            }
           
        }
    }

    void insert_right(int data)
    {
        Dnode d=new Dnode(data);
        if(root==null)
        {
            root=d;
        }
        else
        {
            Dnode t=root;           //1
            while(t.right!=null)    //2
            {
                t=t.right;
            }
            t.right=d;      //3
            d.left=t;       //4
        }
        System.err.println("Data Inserted:"+d.data);
    }

    void delete_right()
    {
        Dnode t,t2;
        t=t2=root;
        if(root==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            while(t.right!=null)
            {
                t=t.right;
            }
            // if(t==root)
            // {
            //     root=null;
            // }
            t2=t.left;
            t2.right=null;
            System.err.println("Deleted");
        }
    }

    void print()
    {
        Dnode d=root;
        
        if(root==null)
        {
            System.out.println("Empty List");
        }
        else
        {
           
            while(d!=null)
            {
                System.out.println("|"+d.data+"|->");
                d=d.right;
            }
        }
    }

        void Reverse()
        {
            if(root==null)
            {
                System.err.println("Empty List");
            }
            else
            {
                Dnode d=root;
                while(d.right!=null)
            {
                d=d.right;
            }
            while(d!=null)
            {
                System.out.println("Printing Data in Reverse:"+d.data);
                d=d.left;
            }
            }
            
        }
       
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Choice:");
        int choice;
        Doubly_list obj=new Doubly_list();

        do{
            
            System.out.println("\n1.Insert left\n2.Insert Right\n3.Delete left\n4.Delete Right\n5.Print");
            System.out.println("Enter Choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                System.err.println("Enter Element:");
                int element=sc.nextInt();
                obj.insert_left(element);
                break;

                case 2:
                System.err.println("Enter Element:");
                int element1=sc.nextInt();
                obj.insert_right(element1);
                break;

                case 3:
                obj.delete_left();
                break;

                case 4:
                obj.delete_right();
                break;

                case 5:
                obj.print();

            }
        }while(choice !=0);
    }
}
