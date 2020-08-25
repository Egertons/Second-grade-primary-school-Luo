package Practice_project_demo;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.Properties;
import javax.swing.JOptionPane;

public class FileOpe {
    private static final String fileName="E:\\IDEA_date\\Second grade primary school Luo\\out\\production\\Second grade primary school Luo\\Practice_project_demo2\\cus.txt";
    private static final Properties pps;
    static {
        pps=new Properties();

        try (FileReader reader = new FileReader(fileName)) {
            pps.load(reader);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "文件操作异常");
            System.exit(0);
        }

    }

    //写入文件
    private static void listInfo() {
        try (PrintStream ps = new PrintStream(fileName)) {
            pps.list(ps);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "文件操作异常");
            System.exit(0);
        }
    }

    //读文件
    public static void getInfoByAccount(String account) {
        String cusInfo=pps.getProperty(account); //返回的是键值对
        if(cusInfo!=null) {
            String[] infos=cusInfo.split("#");
            Conf.account=account;
            Conf.password=infos[0];
            Conf.name=infos[1];
            Conf.dept=infos[2];
        }
    }

    //更新数据
    public static void updateCustomer(String account,String password, String name,String dept) {
        pps.setProperty(account,password+"#"+name+"#"+dept);
        listInfo();
    }
}
