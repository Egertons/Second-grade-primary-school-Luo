package Class_practice;

public class demo_19 {
    public static void main(String[] args) {

    }
}

class Employee{
    Employee(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    String name;
    int age;
    double salary;
    public void raise(double num){
        salary+=num;
        System.out.println(salary);
    }

}
