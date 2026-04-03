import java.awt.*;
import javax.swing.*;
public class Layoutmenu {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Chat flow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(400,400);
        JMenuBar mb=new JMenuBar();
        JMenu m1=new JMenu("File");
        JMenu m2=new JMenu("Help");
        
        JMenuItem m11=new JMenuItem("Save");
        JMenuItem m22=new JMenuItem("Open");
        m1.add(m11);
        m1.add(m22);
        
        JPanel jp=new JPanel();
        JLabel jl=new JLabel("Enter your message");
        JTextField tf=new JTextField(10);
        JTextArea ta=new JTextArea();
        JButton jb1=new JButton("Send");
        JButton jb2=new JButton("Cancel");
        jp.add(jl);
        jp.add(tf);
        jp.add(jb1);
        jp.add(jb2);
        
        frame.getContentPane().add(BorderLayout.SOUTH,jp);
        frame.getContentPane().add(BorderLayout.NORTH,mb);
        frame.getContentPane().add(BorderLayout.CENTER,ta);
        frame.setVisible(true);
    }
}
