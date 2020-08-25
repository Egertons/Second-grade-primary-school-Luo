package Class_practice.class8_12;

public class demo_8 {
    public static void main(String[] args) {
        println("20以内的自然数中奇数分别为：");
        int tmp=0;
        for(int i = 0;i<20;i+=1){
            if(i%2!=0){
                print(i+"\t");
                tmp+=1;
            }
            if(tmp%5==0&&tmp!=0){
                System.out.println();
            }
        }
    }
    public static void print(Object obj){
        System.out.print(obj);
    }
    public static void println(Object obj){
        System.out.println(obj);
    }
}
