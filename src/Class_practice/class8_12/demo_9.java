package Class_practice.class8_12;

public class demo_9 {
    public static void main(String[] args) {
        double height = 100;
        int tmp = 0;
        int height_tmp=0;
        while(true){
            height_tmp+=height+height/2;
            height/=2;
            tmp+=1;
            if(height<3){
                break;
            }
        }
        println(tmp);
        println(height_tmp);
    }
    public static void println(Object obj){
        System.out.println(obj);
    }
}
