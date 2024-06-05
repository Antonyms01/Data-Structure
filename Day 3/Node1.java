public class Node1 {
    int id;
    String name;
    double salary;
    String gender;
    Node1 next;

    Node1(int id,String name,double salary, String gender)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.gender=gender;
        next=null;
    }
}
