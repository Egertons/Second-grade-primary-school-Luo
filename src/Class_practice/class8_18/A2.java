package Class_practice.class8_18;

public class A2 {
    public void test(){
        System.out.println("This is A method");
    }
    String name = "AAA";

}
class B2 extends A2{
    public void test(){
        System.out.println("This is B method");
        super.test();
    }
    String name = "BBB";
    public void t(){
        System.out.println(name);
        System.out.println(super.name);
    }
}

class test{
    public static void main(String[] args) {
        B2 bb = new B2();
        bb.t();
    }
}