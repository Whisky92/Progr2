package gyak3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddSum extends JFrame {
	
	JTextField t1;
	JTextField t2;
	JButton b1, b2;
	JLabel l;
	
	public AddSum()
	{
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		b1 = new JButton("add");
		b2 = new JButton("sub");
		l = new JLabel("Result");
		
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(l);
		
		
		b1.addActionListener( ae -> 	
		{
			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());
			int value = 0;
			if(ae.getSource()==b1)
			{
				value=num1+num2;
			}
			else
			{
				value = num1-num2;
			}
			l.setText(value+"");
		});
		
		b2.addActionListener(ae ->{
			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());
			int value = 0;
			if(ae.getSource()==b1)
			{
				value=num1+num2;
			}
			else
			{
				value = num1-num2;
			}
			l.setText(value+"");
		});
		setTitle("Ez azért kurva komoly!");
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(1024,768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
	
}
