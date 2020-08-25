package Class_practice.class8_10;

public class demo_1 {
    public static void main(String[] args) {

        System.out.println(1%3);
    }
}
class Tools{
    Tools(int a,double b,float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    int a;
    double b;
    float c;
    public static void jia(int a,double b) {
        System.out.println("a+b="+(a+b));
    }
    public static void jian(int a,float c) {
        System.out.println("a-c="+(a-c));
    }
    public static void cheng(int a,float c) {
        System.out.println("a*c="+(a*c));
    }
    public static void cheng(int a,double b) {
        System.out.println("a/b="+(a/b));
    }
}
