import com.sun.deploy.net.MessageHeader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wxy {
    private JButton a1主程序子程序Button;
    private JButton a2面向对象Button;
    private JButton a3事件系统Button;
    private JButton a4管道过滤Button;

    public static void main(String[] args) {

        Frame frame = new Frame("经典软件体系结构风格教学软件");
        Button button1=new Button("Main-Son");
        Button button2=new Button("Mian-Mode");
        Button button3=new Button("Event");
        Button button4=new Button("Pipe");
        MyActionListener myActionListener=new MyActionListener();
        button1.addActionListener(myActionListener);
        MyActionListener1 myActionListener1=new MyActionListener1();
        button2.addActionListener(myActionListener1);
        MyActionListener2 myActionListener2=new MyActionListener2();
        button3.addActionListener(myActionListener2);
        MyActionListener3 myActionListener3=new MyActionListener3();
        button4.addActionListener(myActionListener3);
        frame.setVisible(true);
        frame.setSize(1000,1000);
        frame.setBackground(new Color(255,255,88));
        frame.setLocation(200,200);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
    }
}
class MyActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("主程序-子程序");
        frame.setLayout(new FlowLayout()); // 设置布局管理器，默认为BorderLayout
//        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Ideacode\\tixiMode\\src\\demo\\MainSon.png"));
        Icon icon = new ImageIcon("D:\\Ideacode\\tixiMode\\src\\demo\\MainSon.png"); // 创建Icon对象，加载图片
        JLabel label = new JLabel(icon); // 创建JLabel对象，并传入Icon对象
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.setLocation(400,400);

    }
}
class MyActionListener1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("面向对象体系结构");
        frame.setLayout(new FlowLayout()); // 设置布局管理器，默认为BorderLayout
//        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Ideacode\\tixiMode\\src\\demo\\MainSon.png"));
        Icon icon = new ImageIcon("D:\\Ideacode\\tixiMode\\src\\demo\\Mian.png"); // 创建Icon对象，加载图片
        JLabel label = new JLabel(icon); // 创建JLabel对象，并传入Icon对象
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.setLocation(400,400);
    }
}
class MyActionListener2 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("事件系统");
        frame.setLayout(new FlowLayout()); // 设置布局管理器，默认为BorderLayout
//        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Ideacode\\tixiMode\\src\\demo\\MainSon.png"));
        Icon icon = new ImageIcon("D:\\Ideacode\\tixiMode\\src\\demo\\Event.png"); // 创建Icon对象，加载图片
        JLabel label = new JLabel(icon); // 创建JLabel对象，并传入Icon对象
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.setLocation(400,400);
    }
}
class MyActionListener3 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("管道-过滤");
        frame.setLayout(new FlowLayout()); // 设置布局管理器，默认为BorderLayout
//        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Ideacode\\tixiMode\\src\\demo\\MainSon.png"));
        Icon icon = new ImageIcon("D:\\Ideacode\\tixiMode\\src\\demo\\pipe.png"); // 创建Icon对象，加载图片
        JLabel label = new JLabel(icon); // 创建JLabel对象，并传入Icon对象
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.setLocation(400,400);
    }
}
