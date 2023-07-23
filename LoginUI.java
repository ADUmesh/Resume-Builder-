import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.awt.*;

public class LoginUI extends JFrame implements ActionListener{
	public JLabel l,l1,l2,l3;
	public JTextField t1;
	public JPasswordField t2;
	public JButton b1;	
	public Font f;
	
	public LoginUI() {
		f = new Font("SansSerif", Font.BOLD, 20);
		l = new JLabel("Login");
		l.setFont(f);
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		l3=new JLabel("");
		t1=new JTextField();
		t2=new JPasswordField();
		b1=new JButton("Login");
		l.setBounds(150, 1, 100, 100);
		l1.setBounds(50,100,100,40);
		l2.setBounds(50,140,100,40);
		l3.setBounds(160,5,300,150);
		t1.setBounds(150,100,200,40);
		t2.setBounds(150,140,200,40);
		b1.setBounds(160,200,100,50);
		b1.addActionListener(this);
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		add(t1);
		add(t2);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			try {
				String fileName = "C:/Users/91812/OneDrive/Desktop"+ t1.getText().trim()+ ".txt";
				File f = new File(fileName);
				Scanner s = new Scanner(f);
				String pass = s.next();
				s.close();
				if(f.exists()) {
					String password = new String(t2.getPassword());
					if(password.equals(pass)) {
						new ResumeUI();
					}else {
						JOptionPane optionPane = new JOptionPane(l3,JOptionPane.WARNING_MESSAGE);
					    optionPane.showMessageDialog(l3,"Please provide a valid username and password.");
					}
				}
			}catch(Exception w) {
				System.out.println(w);
				JOptionPane optionPane = new JOptionPane(l3,JOptionPane.WARNING_MESSAGE);
			    optionPane.showMessageDialog(l3,"Please provide a valid username and password.");
			}
		}
	}
}