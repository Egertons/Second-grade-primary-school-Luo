package Class_practice;

public class demo_17 {
    public static void main(String[] args) {
        Triangle(7);
    }
    public static void Triangle(int num){
        for (int i = 1;i<=num;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void print(Object obj){
        System.out.print(obj);
    }
}
