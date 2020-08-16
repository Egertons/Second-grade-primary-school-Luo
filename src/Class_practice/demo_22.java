package Class_practice;

public class demo_22 {
    public static void main(String[] args) {
        Rectangle a1 = new Rectangle();
        Rectangle a2 = new Rectangle(3,2);
        println(a2.Area());
        println(a2.Long());
        a1.setC(5);
        a1.setL(6);
        println(a1.Area());
        println(a1.Long());
    }
    public static void println(Object obj){
        System.out.println(obj);
    }
}

class Rectangle{
    double L;
    double C;
    Rectangle(double L,double C){
        this.L=L;
        this.C=C;
    }
    Rectangle(){}

    public void setL(double l) {
        L = l;
    }

    public void setC(double c) {
        C = c;
    }

    public double Area(){
        return L*C;
    }
    public double Long(){
        return (L+C)*2;
    }
}
