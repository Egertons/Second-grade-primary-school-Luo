package Class_practice.class8_19;

public class demo_1 {
    public static void main(String[] args) {
        new Apple();
    }
}
interface Eatable{
    public abstract void eat();
}
abstract class Fruit{
    String color;
    public void print(){
        System.out.println(color);
    }
}

class Apple extends Fruit implements Eatable{
    public void eat(){
        System.out.println("苹果不用削皮就可以食用");
    }
}
