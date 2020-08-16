package Class_practice;

import java.util.Scanner;

public class demo_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(tools(a,b,c)){
            print(tools_2(a,b,c));
        }else{
            print("该三边不构成三角形");
        }

    }
    public static boolean tools(int a,int b,int c){
        return a + b > c && a + c > b && b + c > a;
    }
    public static double tools_2(int a,int b,int c){
        double tmp;
        double s=(double) (a+b+c)/2;
        tmp = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return tmp;
    }
    public static void print(Object obj){
        System.out.println(obj);
    }
}
