package Revision;

import java.util.Scanner;

class Dnode
{
    Dnode left,right;
    int data;

    Dnode(int data)
    {
        this.data=data;
        left=right=null;
    }

}

public class bst {
    Dnode root;

    void createtree()
    {
        root=null;
    }

    void insert(Dnode r,Dnode n)
    {
        if(root==null)
        {
            root=n;
        }
        else
        {
            if(n.data<r.data)
            {
                if(r.left==null)
                {
                    r.left=n;
                }
                else
                {
                    insert(r.left,n);
                }
            }
            else
            {
                
                if(r.right==null)
                {
                    r.right=n;
                }
                else
                {
                    insert(r.right,n);
                }
            }
        }
    }

    void inorder(Dnode n)
    {
        if(n!=null)
        {
            inorder(n.left);
            System.out.println(n.data+",");
            inorder(n.right);
        }
    }

    boolean search(Dnode n,int key)
    {
        if(n==null)
        {
            return false;
        }
        else
        {
            if(n.data==key)
            {
                return true;
            }
            boolean left=search(n.left,key);
            boolean right=search(n.right,key);
            return left||right;
        }
    }

    int count(Dnode n)
    {
        if(n==null)
        {
            return 0;
        }
        else
        {
            int left=count(n.left);
            int right=count(n.right);
            return left+right+1;
        }
    }

    int depth(Dnode n)
    {
        if(n==null)
        {
            return 0;
        }
        else
        {
            int left=depth(n.left);
            int right=depth(n.right);
            return Math.max(left, right)+1;
        }
    }
    public static void main(String[] args) {
         Binary_tree obj=new Binary_tree();
        obj.create_tree();
        int choice;
        
        Scanner sc=new Scanner(System.in);
       

        do{
            System.out.println("\n1.Insert\n2.Inorder\n3.Preorder\n4.Postorder\n5.Search\n6.Count\n7.Depth\n0.Exit");
            System.out.println("Enter Your Choice");
             choice=sc.nextInt();

            switch(choice)
            {
                
                case 1:
                System.out.println("Enter the value to be inserted");
                int val=sc.nextInt();
                Dnode d=new Dnode(val);
                obj.insert(obj.root,d);
                break;

                case 2:
                obj.inorder(obj.root);
                break;

                case 3:
                obj.preorder(obj.root);
                break;

                case 4:
                obj.postorder(obj.root);
                break;

                case 5:
                System.err.println("Enter a Key to Search:");
                int key=sc.nextInt();
                System.out.println("Key Found:"+obj.search(obj.root, key));
                break;

                case 6:
                System.out.println("Count:"+obj.count(obj.root));
                break;

                case 7:
                System.out.println("Depth:"+(obj.depth(obj.root)-1));
                break;

                case 0:
                System.out.println("Exiting !!!");
                break;


                default:
                System.err.println("Wrong Choice Entered");
            }
        }while(choice!=0);
    
    
    }
}
