package Class_practice;

public class demo_16 {
    public static void main(String[] args) {
        flowerNumber();
    }
    public static void flowerNumber(){
        for (int i = 100;i<=999;i++){
            if((Math.pow((i/100),3)+Math.pow((i/10%10),3)+Math.pow((i%10),3))==i){
                print(i+"\t");
            }
        }
    }
    public static void print(Object obj){
        System.out.print(obj);
    }
}
