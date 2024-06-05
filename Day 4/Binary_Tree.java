import java.util.Scanner;

public class Binary_Tree {
    Dnode root;

    void create_tree()
    {
        root=null;
    }

    void insert(Dnode r,Dnode n)        //r:root as ref and n:new node to insert//root//obj
    {
        if(root==null)
        {
            root=n;
        }
        else                            //i.e.tree already exists
        {
            if(n.data<r.data)           //if lesser:left//here it checks if n pass from main is less or not than r.data
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
            else                            //right
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
        if(r!=null)                 //100
        {
            //Sequence:LPR
            inorder(r.left);    //L
            System.err.print(r.data+",");        //P
            inorder(r.right);   //R
        }
    }

    void preorder(Dnode r)
    {
        if(r!=null)
        {
            //Sequence:PLR
           System.out.print(r.data+",");      //p
           preorder(r.left);
           preorder(r.right);
        }
    }

    void postorder(Dnode r)
    {
        if(r!=null)
        {
            //Sequence:LRP
            preorder(r.left);
            preorder(r.right);
           System.out.print(r.data+",");      //p
          
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
        if(r==null)
        {
           return 0;
        }
        else
        {
            left=count(r.left);
            right=count(r.right);
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
            return Math.max(left, right)+1;
        }
     
    }

    public static void main(String[] args) {
        Binary_Tree obj=new Binary_Tree();
        Scanner sc=new Scanner(System.in);
        obj.create_tree();
        int choice;

        do{
            System.out.println("\n1.Insert\n2.Inorder\n3.Preorder\n4.Postorder\n5.Search\n6.Count\n7.Depth\n0.Exit");
            System.out.println("ENter Your Choice:");
            choice=sc.nextInt();
            switch(choice)
        {
            case 0:
            System.out.println("Exiting!!!");
            break;

            case 1:
            System.err.println("Enter Your Data");
            int n=sc.nextInt();
            Dnode d=new Dnode(n);
            obj.insert(obj.root, d);
            System.out.println("Data Inserted");
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
            System.out.println("Enter a Key you want to find:");
            int key=sc.nextInt();
            System.out.println(key+":Found in tree :"+obj.search(obj.root, key));
            break;

            case 6:
            System.out.println("Total Count:"+ obj.count(obj.root));
            break;

            case 7:
            System.out.println("Depth:"+ (obj.depth(obj.root)-1));
            break;

            default:
            System.out.println("Wrong Choice Entered");
            break;
            
        }
        }while(choice!=0);
        
    }
}
