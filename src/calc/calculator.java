
package calc;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class calculator extends JFrame {
    double num1;
    double num2;
    JPanel p = new JPanel();
    JButton a = new JButton("Add");
    JButton m = new JButton("Multiply");
    JButton d = new JButton("Divide");
    JButton s = new JButton("Subtract");
    JTextArea t = new JTextArea("Enter Number");
    JTextField t1 = new JTextField("Enter a number.",30);
    
    public double add(double first, double second)
    {
    return first+second;
    }
    public double subtract(double first, double second)
    {
    return first-second;
    }
    public double multiply(double first, double second)
    {
        return first*second;
    }
    public double divide(double first, double second)
    {
        return first/second;
    }
    public calculator()   {
        super("Calculator");
        setSize(300,400);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        a.setBounds(50,-500,100,100);
        p.add(s);
        p.add(a);
        p.add(d);
        p.add(m);
        p.add(t);
        p.add(t1);
        add(p);
        t1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            String input = t1.getText();
            t.setText(input);
            }
        });
        p.add(t1);     
        num1=0;
        num2=0;
    }
        public static void main(String [] args)
    {  
        new calculator();
    }
}
