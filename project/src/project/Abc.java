package project;

import java.awt.*;

import javax.swing.*;

public class Abc extends JFrame{
	public Abc()
	{
		setLayout(new FlowLayout() );
		
		JLabel l = new JLabel("Hello World");
		JLabel l1 = new JLabel("Welcome to Egyek!");
		JLabel l2 = new JLabel("Mehet a bogz!");
		add(l);
		add(l1);
		add(l2);
		
		setVisible(true);
		setSize(1024, 768);
		setTitle("Ez nem semmi");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
