package Class_practice.class8_18;

public class Telephone {
    String num;
    double yue;
    public Telephone(){ }
    public Telephone(String num, double yue) {
        this.num = num;
        this.yue = yue;
    }
    public double telephoneCharge(int time){
        return 0.3+(time-3)*0.1;
    }
    public double telephoneCharge(int time,double money){
        return money*time;
    }
    public double yue(int time){
        return yue-telephoneCharge(time);
    }
    public double yue(int time,double money){
        return yue-telephoneCharge(time,money);
    }
}
class Telephone_text{
    public static void main(String[] args) {
        Telephone t1 = new Telephone("13704402893",88.4);
        Telephone t2 = new Telephone("13704402893",44.2);
        t1.telephoneCharge(5);
        System.out.println(t1.yue(5));
        t2.telephoneCharge(2, 0.3);
        System.out.println(t2.yue(2, 0.3));
    }
}
