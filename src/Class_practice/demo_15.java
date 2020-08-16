package Class_practice;

public class demo_15 {
    public static void main(String[] args) {

    }
    public static void choice(int num){
        if(num>=100 && num<1000){
            Totalsum_3(num);
        }else if(num>=1000 && num<10000){
            Totalsum_4(num);
        }else if(num>=10000 && num<100000){
            Totalsum_5(num);
        }else {
            println("暂不受理六位数业务");
        }
    }

    /*
    三位数版本
    * */
    public static int Totalsum_3(int num){
        int tmp_1 = num/100;
        int tmp_2 = num/10%10;
        int tmp_3 = num%10;
        return tmp_1+tmp_2+tmp_3;
    }

    public static int Totalsum_4(int num){
        int b1 = num/1000;
        int b2 = (num-b1*1000)/100;
        int b3 = (num-b1*1000-b2*100)/10;
        int b4 = (num - b1 * 1000 - b2 * 100 - b3 * 10);
        return b1+b2+b3+b4;
    }

    public static int Totalsum_5(int num){
        int b1 = num/10000;
        int b2 = (num-b1*10000)/1000;
        int b3 = (num-b1*10000-b2*1000)/100;
        int b4 = (num - b1 * 10000 - b2 * 1000 - b3 * 100)/10;
        int b5 = (num - b1 * 10000 - b2 * 1000 - b3 * 100 - b4*10);
        return b1+b2+b3+b4+b5;
    }

    public static void print(Object obj){
        System.out.print(obj);
    }
    public static void println(Object obj){
        System.out.println(obj);
    }
}
