package Class_practice;

import java.util.Scanner;

public class demo_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tmp=input.nextInt();
        if(Tools_if(tmp)) {
            print("奇数");
        }else {
            print("偶数");
        }
        if(Tools_switch(tmp)) {
            print("tmp为奇数");
        }else {
            print("tmp为偶数");
        }
    }
    public static boolean Tools_if(int x){
        if(x%2==1) {
            return true;
        }else {
            return false;
        }
    }
    public static boolean Tools_switch(int y) {
        boolean tmp=true;
        switch(y%2) {
            case 1:tmp=true;break;
            case 0:tmp=false;break;
        }
        return tmp;
    }
    public static void print(Object obj) {
        System.out.println(obj);
    }
}
