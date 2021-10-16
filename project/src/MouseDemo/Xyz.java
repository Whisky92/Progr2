package MouseDemo;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Xyz extends JFrame{
	
	
	public Xyz()
	{
		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				int x = e.getX();
				int y = e.getY();
				System.out.println(x + ", "+ y);
			}
		});
	
		setTitle("Ez azért kurva komoly!");
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(1024,768);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
