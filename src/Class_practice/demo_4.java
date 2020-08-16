package Class_practice;

import java.util.Scanner;

public class demo_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c = input.next();
        tools(c);
    }
    public static void tools(String c) {
        int num = Integer.parseInt(c);
        int a=1;
        int b=2;
        int tmp=0;
        double tmp_2=0;
        switch(num) {
            case 1:tmp=a+b;break;
            case 2:tmp=a-b;break;
            case 3:tmp=a*b;break;
            case 4:
                if(c.contains(".")) {
                    tmp_2=(double)a/b;
                }else {
                }
        }
        if(c.contains(".")) {
            print(tmp_2);
        }else {
            print(tmp);
        }
    }
    public static void print(Object obj) {
        System.out.println(obj);
    }
}
