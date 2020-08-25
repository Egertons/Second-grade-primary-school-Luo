package Practice_project_demo;
//薛博文
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterFrame extends JFrame implements ActionListener {
    //定义各控件
    private JLabel lbAccount=new JLabel("请您输入账号");
    private JTextField tfAccount=new JTextField(10);
    private JLabel lbPassword=new JLabel("请您输入密码");
    private JPasswordField pfPassword=new JPasswordField(10);
    private JLabel lbPassword2=new JLabel("输入确认密码");
    private JPasswordField pfPassword2=new JPasswordField(10);
    private JLabel lbName=new JLabel("请您输入姓名");
    private JTextField tfName=new JTextField(10);
    private JLabel lbDept=new JLabel("请您选择部门");
    private JComboBox cbDept=new JComboBox();
    private JButton btRegister=new JButton("注册");
    private JButton btLogin=new JButton("登录");
    private JButton btExit=new JButton("退出");
    public RegisterFrame() {
        //界面初始化
        super("注册");

        String path = "/Practice_project_demo/img/favicon.png";
        try{
            Image img = ImageIO.read(this.getClass().getResource(path));
            this.setIconImage(img);
        }catch (IOException e){
            e.printStackTrace();
        }

        this.setLayout(new FlowLayout());
        this.add(lbAccount);
        this.add(tfAccount);
        this.add(lbPassword);
        this.add(pfPassword);
        this.add(lbPassword2);
        this.add(pfPassword2);
        this.add(lbName);
        this.add(tfName);
        this.add(lbDept);
        this.add(cbDept);
        cbDept.addItem("人力资源部");
        cbDept.addItem("财务部");
        cbDept.addItem("质量与品牌发展部");
        cbDept.addItem("学生部");
        this.add(btRegister);
        this.add(btLogin);
        this.add(btExit);
        this.setSize(240,220);
        GUIUtil.toCenter(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        //增加监听
        btLogin.addActionListener(this);
        btRegister.addActionListener(this);
        btExit.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btRegister) {
            String password1=new String(pfPassword.getPassword());
            String password2=new String(pfPassword2.getPassword());
            if(!password1.equals(password2)) {
                JOptionPane.showMessageDialog(this,"两个密码不相同");
                return;
            }
            String account=tfAccount.getText();
            FileOpe.getInfoByAccount(account);
            if(Conf.account!=null) {
                JOptionPane.showMessageDialog(this,"用户已经注册");
                return;
            }
            String name=tfName.getText();
            String dept=(String)cbDept.getSelectedItem();
            FileOpe.updateCustomer(account,password1,name,dept);
            JOptionPane.showMessageDialog(this,"注册成功");
        }
        else if(e.getSource()==btLogin) {
            this.dispose();//关闭窗体，释放空间，拆析函数
            new LoginFrame();//转至下一个页面
        }
        else {
            JOptionPane.showMessageDialog(this,"さようなら");
            System.exit(0);
        }
    }
}

