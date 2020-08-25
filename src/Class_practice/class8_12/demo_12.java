package Class_practice.class8_12;

public class demo_12 {
    public static void main(String[] args) {
        int tmp=4;
        for (int i = 1;i<=5;i++){
            for (int j = 0;j<tmp;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=6;j++){
                if(j<=i){
                    System.out.print(j+" ");
                }else{
                    break;
                }
            }
            for (int j = 0;j<tmp;j++){
                System.out.print(" ");
            }
            System.out.println();
            tmp--;
        }
    }
}
