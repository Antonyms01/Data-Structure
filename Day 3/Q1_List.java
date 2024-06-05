import java.util.Scanner;

public class Q1_List {
    Node1 root;
    void createlist()
    {
       
        root=null;
    }

    void addemp(int id,String name,double salary, String gender)
    {
        if(id>0)
        {
            if(root==null)
            {
                Node1 n=new Node1(id,name,salary,gender);
                root=n;
            }

            else
            {
                Node1 t=root;
                while(t!=null)
                {
                    if(id==t.id)
                    {
                        System.out.println("Emp Already Exist!!!");
                        break;
                    }
                    t=t.next;
                }
                if(t==null)
                {
                    Node1 t1=root;
                    while(t1.next!=null)
                    {
                        t1=t1.next;
                    }
                    Node1 n=new Node1(id, name, salary, gender);
                    t1.next=n;
                    System.err.println("Employee Added");
                }
            }
        }    
    }
      
   
    void delete(int id)
    {
        if(root==null)
        {
            System.out.println("List is Empty");
        }
        else{
            Node1 t,t2;
            t=t2=root;
            while(t.next!=null && t.id!=id)
            {
                t2=t;
                t=t.next; 
            }
            if(t==root)
            {
                root=null;
            }
            else
            {
                t2.next=null;
                System.out.println("Element Deleted:"+t.id);
            }
        }
      
    }

    void search(int id)
    {
        Node1 t;
        t=root;

        if(root==null)
        {
            System.out.println("Empty List");
        }
        else
        {
            while(t.next!=null && t.id!=id)
            {
                t=t.next;
            }
            if( t.id!=id)
            {
                System.out.println("Id Not Found");
            }
            else
            {

                System.out.println("=======================================================");

                System.out.println("ID:"+t.id);
                System.out.println("Name:"+t.name);
                System.out.println("Gender:"+t.gender);
                System.out.println("Salary:"+t.salary);
                System.out.println("=======================================================");

                
            }
            
        }
    }

    void printall()
    {
        if(root==null)
        {
            System.err.println("Empty List");
        }
        else
        {
            Node1 t;
            t=root;
            while(t!=null)
            {
                System.out.println("=======================================================");
                System.out.println("ID:"+t.id);
                System.out.println("Name:"+t.name);
                System.out.println("Gender:"+t.gender);
                System.out.println("Salary:"+t.salary);
                System.out.println("=======================================================");

                t=t.next;
            }

        }
    }

    void update(int id)
    {
        Node1 t;
        t=root;
        Scanner sc=new Scanner(System.in);
        int choice;
        if(id!=t.id)
        {
            System.out.println("ID DOES NOT EXIST!!!");
        }
        else
        {
            System.out.println("1.Name\n2.Salary\n3.Gender");
        System.out.println("Which Parameter You Want To Update");

        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Existing Name:"+t.name);
            System.out.println("Enter New Name:");
            String name=sc.next();
            t.name=name;
            System.err.println("Name is Updated");
            this.printall();
            break;

            case 2:
            System.out.println("Existing Salary:"+t.salary);
            System.out.println("Enter New Salary:");
           double salary=sc.nextInt();
            t.salary=salary;
            System.err.println("Salary is Updated");
            this.printall();
            break;

            case 3:
            System.out.println("Existing Gender:"+t.gender);
            System.out.println("Enter New Gender:");
            String gender=sc.next();
            t.gender=gender;
            System.err.println("Gender is Updated");
            this.printall();
            break;

            default:
            System.err.println("Wrong CHoice");

        } 
        }
       
    }

    public static void main(String[] args) {
        Q1_List obj=new Q1_List();
        Scanner sc=new Scanner(System.in);
        int choice;
        obj.createlist();

        do
        {
            System.out.println("\n0.Exit\n1.Add Employee\n2.Delete Employee\n3.Search Employee\n4.PrintAll\n5.Update data");
            choice=sc.nextInt();
            switch(choice)
            {
                case 0:
                System.out.println("Exiting...");
                break;

                case 1:
                System.out.println("Enter Emp ID:");
                int id=sc.nextInt();
                System.out.println("Enter Emp Name:");
                String name=sc.next();
                System.out.println("Enter Emp Gender:");
                String gender =sc.next();
                System.out.println("Enter Emp Salary:");
                double salary=sc.nextInt();
                obj.addemp(id, name, salary, gender);
                break;

                case 2:
                System.out.println("Enter id to delete:");
                int id1=sc.nextInt();
                obj.delete(id1);
                break;

                case 3:
                System.out.println("Enter ID to Search:");
                int id2=sc.nextInt();
                obj.search(id2);
                break;

                case 4:
                obj.printall();
                break;

                case 5:
                System.out.println("Enter Emp id to update:");
                int id3=sc.nextInt();
                obj.update(id3);
                break;

                default:
                System.out.println("Wrong Choice");
            }
        }
        while(choice!=0);
    }
    
}
