package Class_practice.class8_21;

public class demo_2 {
    public static void main(String[] args) {
        System.out.println(tool(3));
    }
    public static double tool(int n){
        double tmp = 0;
        for(int i = 1;i<=n;i++){
            tmp+=1.0/(2*i-1);
        }
        return tmp;
    }
}
