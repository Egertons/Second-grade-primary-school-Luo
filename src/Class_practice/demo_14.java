package Class_practice;

public class demo_14 {
    public static void main(String[] args) {
        print(sum(20));
    }
    public static int sum(int num){
        int tmp = 0;
        for(int i = 1;i<=num;i++){
            if(i%2==0){
                tmp+=i;
            }
        }
        return tmp;
    }
    public static void print(Object obj){
        System.out.println(obj);
    }
}
