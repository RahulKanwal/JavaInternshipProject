// AddFrame

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AddFrame extends JFrame
{
	Container c;
	JLabel lblRno, lblName, lblMrk;
	JTextField txtRno, txtName, txtMrk;
	JButton btnSave, btnBack;

	public AddFrame()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());

		lblRno = new JLabel("Enter Roll Number");
		lblName = new JLabel("Enter Name");
		lblMrk = new JLabel("Enter Marks");
		txtRno = new JTextField(10);
		txtName = new JTextField(10);
		txtMrk = new JTextField(10);
		btnSave = new JButton("Save");
		btnBack = new JButton("Back");

		c.add(lblRno);
		c.add(txtRno);
		c.add(lblName);
		c.add(txtName);
		c.add(lblMrk);
		c.add(txtMrk);
		c.add(btnSave);
		c.add(btnBack);

		ActionListener a1 = (ae) -> {
			//int rno = Integer.parseInt(txtRno.getText());
			//String name = txtName.getText();
			//int mark = Integer.parseInt(txtMrk.getText());
			//DbHandler db = new DbHandler();
			//db.addStudent(rno, name);
		};
		btnSave.addActionListener(a1);

		ActionListener a2 = (ae) -> {
			MainFrame a = new MainFrame();
			dispose();
		};
		btnBack.addActionListener(a2);

		setTitle("Add Student");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}