package Class_practice.class8_20;

import java.util.Scanner;

public class demo_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要判断的字符串。");
        String tmp = input.next();
        if (isHuiWen(tmp)){
            System.out.println("是回文串");
        }else {
            System.out.print("不是回文串");
        }
    }
    public static boolean isHuiWen(String s){
        int p = s.length();
        char[] arr = new char[p];
        boolean flag = false;
        if(s.length()==0||s.length()==1)
        {
            flag = true;
        }
        if(s.length()>1)
        {
            for(int i=0;i<s.length();i++)
            {
                arr[i]=s.charAt(i);
            }
            if(s.length()%2==0)
            {
                int k=0;
                flag=true;
                while(k <= (s.length() - 2) / 2)
                {
                    if(arr[k]==arr[s.length()-1-k])
                    {k=k+1;}
                    if(arr[k]!=arr[s.length()-1-k])
                    {flag=false;break;}
                }
            }
            if(s.length()%2==1)
            {
                int j=0;
                flag=true;
                while(j < (s.length() - 1) / 2)
                {
                    if(arr[j]==arr[s.length()-1-j])
                    {j=j+1;}
                    if(arr[j]!=arr[s.length()-1-j])
                    {flag=false;break;}
                }
            }
        }
        return flag;
    }
}