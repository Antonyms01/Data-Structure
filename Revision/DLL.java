package Revision;

import java.util.Scanner;



public class DLL {
    Dnode root;
    void create_list()
    {
     root=null;
    }

    void insertleft(int data)
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
            System.out.println("data inserted");
           
        }
    }

    void insertright(int data)
    {
        Dnode d=new Dnode(data);
        if(root==null)
        {
            root=d;
        }
        else
        {
            Dnode t1=root;
            while(t1.right!=null)
            {
              t1=t1.right;
            }
            t1.right=d;
            d.left=t1;
           
            System.out.println("data inserted");
        }
    }


    void deleteleft()
    {
        if(root==null)
        {
            System.out.println("list is Empty");
        }
        else{
            Dnode t=root;
            root=t.right;
            if(root!=null)
            {
            root.left=null;
            }
        }
    }


    void deleteright()
    {
        
        if(root==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Dnode t1=root;
            Dnode t2=root;
            while(t1.right!=null)
            {
                t2=t1;
                t1=t1.right;
            }
            t2.right=null;
        }
    }


    void search(int key)
    {
        if(root==null)
        {
            System.out.println("Empty List");
        }
        else
        {
            Dnode t=root;
            while(t!=null && t.data!=key)
            {
                t=t.right;
            }
            if(t==null) 
            {
                System.out.println(key+"\tKey Not Found");
            }
            else
            {
                System.out.println(key+"\tKey Found");
            }
        }
    }

    void print()
    {
        if(root==null)
        {
            System.out.println("Empty list");
        }
        else
        {
            Dnode t=root;
            while(t!=null)
            {
                System.out.print("|"+t.data+"|>");
                t=t.right;
            }
        }
    }

    void revprint()
    {
        if(root==null)
        {
            System.out.println("Empty list");
        }
        else
        {
            Dnode t=root;
            while(t.right!=null)
            {
                t=t.right;
            }

            while(t!=null)
            {
                System.out.print("|"+t.data+"|>");
                t=t.left;
            }
        }
    }

    public static void main(String[] args) {
        DLL obj=new DLL();
        obj.create_list();
        Scanner sc=new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("\n0.Exit\n1.Insertleft\n2.InsertRight\n3.DeleteLeft\n4.DeleteRight\n5.Search\n6.Print\n7.Reverse print\n");
            System.out.println("Enter Your Choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                System.out.println("Exiting !!!");
                break;

                case 1:
                System.out.println("Enter an Element:");
                int Element=sc.nextInt();
                obj.insertleft(Element);
                break;

                case 2:
                System.out.println("Enter an Element");
                int Element1=sc.nextInt();
                obj.insertright(Element1);
                break;

                case 3:
                obj.deleteleft();
                break;

                case 4:
                obj.deleteright();
                break;

                case 5:
                System.err.println("Enter Key to Search");
                int key=sc.nextInt();
                obj.search(key);
                break;

                case 6:
                obj.print();
                break;

                case 7:
                obj.revprint();
                break;

                default:
                System.out.println("Wrong Choice Entered");
                break;

                
            }
        }while(choice!=0);

    }
}
