package Class_practice.class8_20;

import java.util.Scanner;

public class demo_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请持续输入学生成绩");
        double[] arr = new double[5];
        double sum = 0;
        for (int i = 0;i< arr.length;i++){
            double tmp = input.nextDouble();
            arr[i]= tmp;
            sum+=arr[i];
        }
        System.out.println("平均分为："+sum/ arr.length);
    }
}
