package rjgc;

import static com.sun.javafx.fxml.expression.Expression.add;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.lang.String;
import java.awt.event.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
public class Generator extends JFrame implements ActionListener {
    JLabel L1 = new JLabel("选择语言（choose language）:");
    JButton B1 = new JButton("中文");
    JButton B2 = new JButton("English");
    Generator(){

        this.setTitle("四则运算");
        this.setSize(280, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JPanel p2 = new JPanel();
        JPanel p1 = new JPanel();
        p2.add(L1);
        p1.add(B1);
        p1.add(B2);
        add(p2, "Center");
        add(p1, "South");
        B1.addActionListener(new ActionListener(){


            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Frame();
            }
        });
        B2.addActionListener(new ActionListener(){


            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new English();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}