package Homework;

public class HRManager  extends Employee{
String position;
    public  void work()
    {
        System.out.println("HR Manager creates HR strategies");
    }

    public  HRManager(int id, String name, String surname,int salary,String positon){
        super(id,name,surname,salary);
        this.position=positon;

           }

    public String toString() {
        return "{Id= " + id + ", Name= " + name + ", Surname= " + surname+", Position ="+position;
    }

    public void addEmployee(){
//

    }
}
