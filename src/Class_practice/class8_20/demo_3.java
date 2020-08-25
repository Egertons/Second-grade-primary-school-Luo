package Class_practice.class8_20;

import java.util.Scanner;
//第三题
public class demo_3 {
    public static void main(String[] args) {
        System.out.println("请输入十个字符（不区分大小写）");
        Scanner input = new Scanner(System.in);
        char[] arr = new char[10];
        int count = 0;
        for (int i = 0;i< arr.length;i++){
            char tmp = input.next().charAt(0);
            arr[i]=tmp;
            if(arr[i]>='A' && arr[i]<='Z'){
                count+=1;
            }
        }
        System.out.println("一共有"+count+"个大写字符！");
    }
}
