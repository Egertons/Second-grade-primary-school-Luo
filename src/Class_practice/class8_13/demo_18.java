package Class_practice.class8_13;

public class demo_18 {
    public static void main(String[] args) {
        sum_6();
    }
    public static void sum_6(){
        int n,sum = 0;
        for(n = 1;n*(n+1)<2000;n++){
            sum+=n;
        }
        println(n-1);
        /*
        这里的“ n-1 ”是因为for循环的自身语法特性所导致的。
        当 n = 44 时完成了循环体中的“ sum+=n; ”这里的n是被实际加到sum里的。
        随后执行循环后更新计数器（n++）
        这里 n = 45 去判断是否符合 n*(n+1)<2000;
        判断为 : false   从而跳出循环
        但这时的n并未实质上加到sum中。
        而现在的n值是被自加1了的。
        故而在最后需要(n-1)再输出。
         * */
        println(sum);
    }
    public static void println(Object obj){
        System.out.println(obj);
    }
}
