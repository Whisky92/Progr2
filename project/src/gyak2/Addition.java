package gyak2;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Addition extends JFrame  {
	
	JTextField t1;
	JTextField t2;
	JLabel l;
	JButton b;
	
	public Addition()
	{
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		
		l = new JLabel("Eredmény");
		
		b = new JButton("NA EZ GOMB");
		
		ActionListener al = new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				int value=num1+num2;
				l.setText(value+"");
				
			}
		};
		
		b.addActionListener(al);
		
		
		add(t1);
		add(t2);
		add(l);
		add(b);
		
		setTitle("Nagyon jóó"); 
		
		setTitle("Ez azért kurva komoly!");
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(1024,768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
