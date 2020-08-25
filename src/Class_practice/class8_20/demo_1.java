package Class_practice.class8_20;

import java.util.Scanner;
//第一题
public class demo_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您要输入数字的个数！");
        int num = input.nextInt();
        int[] arr = new int[num];
        for ( int a = 0;a< arr.length;a++ ){
            System.out.println("请输入数字！");
            int tmp = input.nextInt();
            arr[a]=tmp;
        }
        for (int i = arr.length;i>0;i--){
            System.out.print(arr[i-1]+"\t");
        }
    }
}
