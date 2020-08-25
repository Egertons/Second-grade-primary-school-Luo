package Class_practice.class8_18;


public class Good {
    public Good(String name, double price) {
        Name = name;
        this.price = price;
    }

    String Name;
    double price;
    public void Expense(double discount){ }
}
class Milk extends Good{

    double MemberPrice;

    public Milk(String name, double price,double MemberPrice) {
        super(name, price);
        this.MemberPrice=MemberPrice;
    }

    public void Expense(double discount){
        System.out.println("普通会员的折扣价格为："+ price*discount);
    }
    public void Expense(double discount,double MemberPrice){
        System.out.println("高级会员的折扣价格为："+ MemberPrice*discount);
    }
}

class Good_test{
    public static void main(String[] args) {
        Milk m1 = new Milk("Milk", 3.0, 2.6);
        m1.Expense(0.8);
        m1.Expense(0.8, 2.6);
    }
}