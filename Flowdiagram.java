import java.awt.*;
import javax.swing.*;
public class Flowdiagram {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        JButton jb1=new JButton("1");
        JButton jb2=new JButton("2");
        JButton jb3=new JButton("3");
        JButton jb4=new JButton("4");
        JButton jb5=new JButton("5");
        JButton jb6=new JButton("6");
        JButton jb7=new JButton("7");
        JButton jb8=new JButton("8");
        JButton jb9=new JButton("9");
        JButton jb0=new JButton("0");
        
        jf.add(jb1);
        jf.add(jb2);
        jf.add(jb3);
        jf.add(jb4);
        jf.add(jb5);
        jf.add(jb6);
        jf.add(jb7);
        jf.add(jb8);
        jf.add(jb9);
        
        jf.setLayout(new GridLayout(3,3));
        jf.setSize(300,300);
        jf.setVisible(true);
        
        
    }
}
