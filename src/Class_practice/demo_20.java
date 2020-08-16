package Class_practice;

public class demo_20 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.findArea();
    }
}
class Circle{
    double radius;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void findArea(){
        double tmp = Math.PI*Math.pow(radius,2);
        println(tmp);
    }
    public void println(Object obj){
        System.out.println(obj);
    }
}
