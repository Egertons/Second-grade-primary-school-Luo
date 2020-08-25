package Class_practice.class8_21;

public class demo_4 {
    public static void main(String[] args) {
        Prog_1 s = new Prog_1();
        s.pingshi = 100;
        s.qimo = 100;
        System.out.println(s.calculateScore());
    }
}
class Prog_1{
    int pingshi;
    int qimo;
    Prog_1(){}
    public double calculateScore(){
        return pingshi+qimo/2.0;
    }
}
