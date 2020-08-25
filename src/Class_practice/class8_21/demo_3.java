package Class_practice.class8_21;

public class demo_3 {
    public static void main(String[] args) {
        System.out.println(tools(3));
    }
    public static double tools(int n){
        double tmp = 0;
        for(double i = 1.0;i<=n;i++){
            if(i%2!=0){
                tmp+=i/(i*2-1);
            }else{
                tmp-=i/(i*2-1);
            }
        }
        return tmp;
    }
}
