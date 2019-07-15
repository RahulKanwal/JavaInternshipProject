// MainFrame

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class MainFrame extends JFrame
{
	Container c;
	JButton btnAdd, btnView, btnUpdate, btnDelete;

	public MainFrame()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		btnAdd = new JButton("Add");
		btnView = new JButton("View");
		btnUpdate = new JButton("Update");
		btnDelete = new JButton("Delete");
		c.add(btnAdd);
		c.add(btnView);
		c.add(btnUpdate);
		c.add(btnDelete);
		
		ActionListener a1 = (ae) -> {
			AddFrame a = new AddFrame();
			dispose();
		};
		btnAdd.addActionListener(a1);
		
		ActionListener a2 = (ae) -> {
			ViewFrame a = new ViewFrame();
			dispose(); 
		};
		btnView.addActionListener(a2);
		/*
		ActionListener a3 = (ae) -> {
			UpdateFrame a = new UpdateFrame();
			dispose(); 
		};
		btnUpdate.addActionListener(a3);
		
		ActionListener a4 = (ae) -> {
			DeleteFrame a = new DeleteFrame();
			dispose(); 
		};
		btnDelete.addActionListener(a4); 
		*/

		setTitle("Student Management System");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String args[]) 
	{
		MainFrame mf = new MainFrame();
	}
}