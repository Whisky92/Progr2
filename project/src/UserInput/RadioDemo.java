package UserInput;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class RadioDemo extends JFrame {
	JTextField t;
	JButton b1;
	JRadioButton r1, r2;
	JLabel l;
	JCheckBox c1, c2;
	
	public RadioDemo()
	{
		t = new JTextField(15);
		b1 = new JButton("Ok");
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		l = new JLabel("Hi");
		c1 = new JCheckBox("Dancing");
		c2 = new JCheckBox("Playing PC games");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		add(t);
		add(b1);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(l);
		
		setTitle("Ez azért kurva komoly!");
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(1024,768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent ae)
			{
				String s = t.getText();
				if (r1.isSelected())
					s="Mr. "+s;
				else 
					s="Mrs. "+s;
				if(c1.isSelected())
					s=s + " Dancing";
				if(c2.isSelected())
					s=s+ " Playing PC games";
				l.setText(s);
			}	
		});
		
		c1.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Dancer");
				
			}
		});
		
		c2.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				System.out.println("PC Gamer");
				
			}
		});
	}
	

}
