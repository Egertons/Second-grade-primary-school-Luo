package Class_practice.class8_20;
//第四题
import java.util.Scanner;
public class demo_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("您一共要比较多少个厂商？");
        int t = input.nextInt();
        double[] arr = new double[t];
        System.out.println("请持续输入各个厂商的产品价格");
        for (int i = 0;i< arr.length;i++){
            double tmp = input.nextDouble();
            arr[i]= tmp;
        }
        min(arr);
    }
    public static void min(double[] a)
    {
        double y = a[0];
        for(int x = 1;x<a.length;++x)
        {
            y = Math.min(y, a[x]);
        }
        System.out.println("\n商品最小值是"+y);
    }
}
