package Class_practice.class8_12;

import java.util.Scanner;

public class demo_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tmp = input.nextInt();
        int c = 1;
        while(c<=tmp){
            System.out.print("*");
            c+=1;
        }
    }
}

