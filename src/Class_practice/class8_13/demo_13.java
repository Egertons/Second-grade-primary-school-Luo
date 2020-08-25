package Class_practice.class8_13;

public class demo_13 {
    public static void main(String[] args) {
        print(sun(1, 5));
        print(sun(6.8, 7.2));
    }
    public static double sun(double a , double b){
        return a+b;
    }
    public static double sun(int a ,int b){
        return (double)a+b;
    }
    public static void print(Object obj){
        System.out.println(obj);
    }
}
