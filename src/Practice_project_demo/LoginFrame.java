package Practice_project_demo;
//李颖
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener {
    //定义各控件
    private Icon welcomeIcon=new ImageIcon("welcome.png");
    private JLabel lbWelcome=new JLabel(welcomeIcon);

    private JLabel lbAccount=new JLabel("请您输入账号");
    private JTextField tfAccount=new JTextField(18);

    private JLabel lbPassword=new JLabel("请您输入密码");
    private JPasswordField pfPassword=new JPasswordField(20);

    private JButton btLogin=new JButton("登录");
    private JButton btRegister=new JButton("注册");
    private JButton btExit=new JButton("退出");
    public LoginFrame() {
        //界面初始化
        super("登录");

        String path = "/Practice_project_demo/img/favicon.png";
        try{
            Image img = ImageIO.read(this.getClass().getResource(path));
            this.setIconImage(img);
        }catch (IOException e){
            e.printStackTrace();
        }


        this.setLayout(new FlowLayout());
        this.add(lbWelcome);
        this.add(lbAccount);
        this.add(tfAccount);
        this.add(lbPassword);
        this.add(pfPassword);
        this.add(btLogin);
        this.add(btRegister);
        this.add(btExit);

        this.setSize(260,230);
        GUIUtil.toCenter(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(false);//不可更改大小
        this.setVisible(true);//设置可见性
        //增加监听
        btLogin.addActionListener(this);
        btRegister.addActionListener(this);
        btExit.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btLogin) {
            String account=tfAccount.getText();
            String password=new String(pfPassword.getPassword());
            FileOpe.getInfoByAccount(account);
            if(Conf.account==null||!Conf.password.equals(password)) {
                JOptionPane.showMessageDialog(this,"登录失败");
                return;
            }
            JOptionPane.showMessageDialog(this,"登录成功");
            this.dispose();
            new OperationFrame();
        }
        else if(e.getSource()==btRegister) {
            this.dispose();//关闭窗体，释放空间，拆析函数
            new RegisterFrame();//转至下一个页面
        }
        else {
            JOptionPane.showMessageDialog(this,"さようなら");
            System.exit(0);
        }
    }
}

