package Class_practice.class8_17;

class Text{
    public static void main(String[] args) {
        Invoice a1 = new Invoice("0654", "MI_10", 2, 5499.00);
        System.out.println(a1.computeTotal());
    }
}
public class Invoice {
    public Invoice(String ID, String name, int number, double price) {
        this.ID = ID;
        this.Name = name;
        this.Number = number;
        this.price = price;
    }
    private String ID;
    private String Name;
    private int Number;
    private double price;
    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double computeTotal(){
        if (Number<0){
            return 0;
        }else{
            return (double) Number*price;
        }
    }
}
