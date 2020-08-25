package Class_practice.class8_11;

import java.util.Scanner;

public class demo_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        tool(num);
    }
    public static void tool(int num){
        int a = num/100;
        int b = num/10%10;
        int c = num%10;
        int tmp = a+b+c;
        print(a+"+"+b+"+"+c+"="+tmp);
    }
    public static void print(Object obj){
        System.out.println(obj);
    }
}
