package Calendar;

import javax.swing.*;
public class JDB {
    JFrame f;
    JDB(String text){
        f=new JFrame();
        String data[][]={{text}};
        String column[]={"EVENT"};
        JTable jt=new JTable(data,column);
        jt.setBounds(50,50,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(500,500);
        f.setVisible(true);
    }
//    public static void main(String[] args) {
//        new JDB();
//    }
}