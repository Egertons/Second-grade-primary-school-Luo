package Class_practice.class8_10;

import java.util.Scanner;

public class demo_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tmp=input.nextInt();
        print(Tools(tmp));
    }
    public static int Tools(int x) {
        int y=0;
        if(x<0) {
            y=x;
        }else if(x < 10){
            y=x+5;
        }else {
            y=(int)Math.pow(x, 2);
        }
        return y;
    }
    public static void print(Object obj) {
        System.out.println(obj);
    }
}
