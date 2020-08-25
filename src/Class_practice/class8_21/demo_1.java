package Class_practice.class8_21;

public class demo_1 {
    public static void main(String[] args) {
        Tools(1000);
    }
    public static void Tools(int num){
        int year = num/360;
        int month = (num-(year*360))/30;
        int day = num-year*360-month*30;
        println(year+"年"+month+"月"+day+"日");
    }
    public static void println(Object obj){
        System.out.println(obj);
    }
}
