import java.util.Scanner;

public class Q1_BST {
    Dnode root;
    void create_tree()
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
                insert(r.left, n);
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
                    insert(r.right, n);
                }
            }
        }   
    }
    void inorder(Dnode r)
    {
        if(r!=null)
        {
            inorder(r.left);
            System.out.print(r.data+",");
            inorder(r.right);
        }
    }

    boolean search(Dnode r,int key)
    {
        boolean left,right;
        if(r==null)
        {
           return false;
        }
        else
        {
            if(r.data==key)
            {
                return true;
            }
            left=search(r.left,key);
            right=search(r.right,key);
            return left || right;
        }
    }

    int count(Dnode r)
    {
        int left,right;
        int count=1;
        if(r==null)
        {
            return 0;
        }
        else
        {
            left=count(r.left);
            right= count(r.right);
        }
        return left+right+1;
    }

    int depth(Dnode r)
    {
        int left;
        int right;
        if(r==null)
        {
            return 0;
        }
        else
        {
            left=depth(r.left);
            right=depth(r.right);
            return Math.max(left,right)+1;
        }
    }

    boolean balance(Dnode r)
    {
        int left,right;
        if(r==null)
        {
            return false;
        }
        else
        {
            left=depth(r.left);
            right=depth(r.right);
            return (left-right==0)?true:false;

        }
    }
    



public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int choice;
    Q1_BST obj=new Q1_BST();
    obj.create_tree();

    do
    {
        System.out.println("\n1.Insert\n2.Inorder\n3.Search\n4.Count\n5.Depth\n6.Balance\n0.Exit");
        System.err.println("Enter Your Choice:");
        choice=sc.nextInt();
        switch(choice)
        {
            case 0:
            System.out.println("Exiting...");
            break;

            case 1:
            System.out.println("Enter Element");
            int Element=sc.nextInt();
            Dnode d=new Dnode(Element);
            obj.insert(obj.root, d);
            System.out.println("Data Inserted");
            break;

            case 2:
            obj.inorder(obj.root);
            break;

            case 3:
            System.out.println("Enter key to FOund:");
            int key=sc.nextInt();
            System.out.println(key+" Found:"+obj.search(obj.root, key));
            break;

            case 4:
            System.out.println("Total Count:"+ obj.count(obj.root));
            break;

            case 5:
            System.err.println("Depth:"+(obj.depth(obj.root)-1));

            case 6:
            System.err.println("Balanced:"+obj.balance(obj.root));


        }
    }while(choice!=0);
}
}
