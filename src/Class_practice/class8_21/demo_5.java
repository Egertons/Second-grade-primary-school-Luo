package Class_practice.class8_21;

public class demo_5 {
    public static void main(String[] args) {
        new Apple("red", "text").print();
    }
}
class fruit{
    public String color = "yellow";//定个默认初始值
    private String name;
    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    public fruit(String color, String name) {
        this.color = color;
        this.name = name;
    }
    public fruit(String name) {
        this.name = name;
    }
}
class Apple extends fruit{
    public Apple(String color, String name) {
        super(name);
        this.color=color;
    }
    String place;
    String color;
    public void print(){
        System.out.println(super.color);
        System.out.println(this.color);
    }
}
