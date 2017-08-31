package Calendar;

import javax.swing.*;
import java.awt.event.*;
public class JTextEvents implements ActionListener{
    JLabel l1,l2;
    JTextArea area;
    JButton b;
    JTextEvents() {
        JFrame f= new JFrame("TextEvents");
        area=new JTextArea();
        area.setBounds(25,90,430,200);
        b=new JButton("Submit");
        b.setBounds(180,380,120,30);
        b.addActionListener(this);
        f.add(area);f.add(b);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String text=area.getText();
        JDB data = new JDB(text);
//        String words[]=text.split("\\s");
//        l1.setText("Words: "+words.length);
//        l2.setText("Characters: "+text.length());
    }
    public static void main(String[] args) {
        new JTextEvents();
    }
}