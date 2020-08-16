package Class_practice;

public class demo_21 {
    public static void main(String[] args) {
        new Product(3200).computeDiscount(0.3);
    }
}
/*
题目：定义类Product，属性包括商品名称name（String）、商品编号id(String)和价格price（double）三个属性，
1.有计算折扣价格并输出的方法，方法头为public void computeDiscount(double percent)，其中形参代表打折的百分比。
2.创建商品类的对象，调用计算折扣价格的方法。
* */
class Product{
    String name;
    String id;
    double price;
    Product(double price){
        this.price=price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void computeDiscount(double percent){
        double tmp = price*percent;
        println(tmp);
    }
    public void println(Object obj){
        System.out.println(obj);
    }
}