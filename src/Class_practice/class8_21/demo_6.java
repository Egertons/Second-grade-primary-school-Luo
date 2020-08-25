package Class_practice.class8_21;

import java.util.Random;

public class demo_6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0;i<10;i+=1){
            arr[i] = random.nextInt(10);
        }
        calculation(arr);
    }
    public static void calculation(int[] data){
        int max = 0,min=10,sum=0;
        for (int i : data){
            max = Math.max(max, i);
        }
        for (int o : data){
            min = Math.min(min, o);
        }
        for (int datum : data) {
            sum += datum;
        }
        double tmp = ((double)(sum-max-min) / (data.length-2));
        println("您所要计算的平均结果为："+tmp);
    }
    public static void println(Object obj){
        System.out.println(obj);
    }
    public static void print(Object obj){
        System.out.print(obj);
    }
}
