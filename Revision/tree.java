/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
*/
class Node {
    int data;
    Node left;
    Node right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
     }
public class tree{
    

Node root;

    public boolean checkBST(Node root) {
        // int min=-10000;
        // int max=10000;
        // return Binarytree(root,min,max);
        boolean  L,R;
        L = R = false;
        if(root == null)
        {
            return true;
        }
        else
        {
            Node LN = root.left;
            Node RN = root.right;
          if (LN.data<root.data)
          {
             L = true;  
          }
            else if(RN.data>root.data)
            {
                R = true;
            }   
        }
          L= checkBST(root.left);
          R = checkBST(root.right);
        return L && R;
    }

public static void main(String []args)
{
 
    tree root = new tree();
        // Constructing the binary tree
        //Node root = new Node(10);
    

        // Creating an instance of the solution class
       

        // Calling the checkBST function and printing the result
        System.out.println("Is the tree a BST? " + solution.checkBST(root));
    }
}
