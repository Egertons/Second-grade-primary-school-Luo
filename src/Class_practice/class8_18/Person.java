package Class_practice.class8_18;

class text{
    public static void main(String[] args) {
        new Student("张三",13,"man", "18005250805").study();
    }
}
public class Person {
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    String name;
    int age;
    String sex;
}
class Student extends Person{

    public Student(String name, int age, String sex,String id) {
        super(name, age, sex);
        this.id=id;
    }
    String id;
    public void study(){
        System.out.println(this.name+"能学习!");
    }
}
