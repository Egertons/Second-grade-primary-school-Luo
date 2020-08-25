package Class_practice.class8_12;

public class demo_11 {
    public static void main(String[] args) {
        for (int i = 1;i<=5;i++){
            for(int j = 1;j<=6;j++){
                if(j<=i){
                    System.out.print(j+" ");
                }else{
                    break;
                }
            }
            System.out.println();
        }
    }
}
