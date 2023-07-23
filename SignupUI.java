import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.awt.*;

public class SignupUI extends JFrame implements ActionListener{
	public JLabel l,l1,l2,l3,l4,l5,l6,l7;
	public JTextField t1,t4;
	public JRadioButton b1,b2,b3;
	public ButtonGroup bg=new ButtonGroup();
	public JPasswordField t2,t3;
	public JButton b4;	
	public Font f;
	
	public SignupUI() {
		f = new Font("SansSerif", Font.BOLD, 20);
		l = new JLabel("Sign Up");
		l.setFont(f);
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		l3=new JLabel("Confirm Password");
		l4=new JLabel("Mobile No");
		l5=new JLabel("Gender");
		l6 = new JLabel("");
		t1=new JTextField();
		t2=new JPasswordField();
		t3=new JPasswordField();
		t4=new JTextField();
		b1=new JRadioButton("Male");
		b2=new JRadioButton("Female");
		b3=new JRadioButton("Others");
		b4=new JButton("Sign Up");
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		l.setBounds(150, 10, 100, 100);
		l1.setBounds(50,100,100,40);
		l2.setBounds(50,140,100,40);
		l3.setBounds(50,180,200,40);
		l4.setBounds(50,220,100,40);
		l5.setBounds(50,260,100,40);
		l6.setBounds(120,10,300,150);
		t1.setBounds(200,100,200,40);
		t2.setBounds(200,140,200,40);
		t3.setBounds(200,180,200,40);
		t4.setBounds(200,220,200,40);
		b1.setBounds(200,260,100,20);
		b2.setBounds(200,280,100,20);
		b3.setBounds(200,300,100,20);
		b4.setBounds(160,380,100,50);
		b4.addActionListener(this);
		add(b4);
		add(b1);
		add(b2);
		add(b3);
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		setLayout(null);
		setSize(500,500);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String s1 = new String(t2.getPassword());
		String s2 = new String(t3.getPassword());
		if(s1.equals(s2) && !t1.getText().isEmpty() && !t4.getText().isEmpty()) {
			String fileName = "C:/Users/91812/OneDrive/Desktop"+ t1.getText().trim()+ ".txt";
			try {
				File f = new File(fileName);
				FileWriter writer = new FileWriter(f);
				writer.write(s1);
				writer.close();
			}catch(Exception s){System.out.println(s);}
			new LoginUI();
		}else if(t1.getText().isEmpty() || t4.getText().isEmpty()){
			JOptionPane optionPane = new JOptionPane(l6,JOptionPane.WARNING_MESSAGE);
		    optionPane.showMessageDialog(l6,"Fill the above details");  
		}else {
		    JOptionPane optionPane = new JOptionPane(l6,JOptionPane.WARNING_MESSAGE);
		    optionPane.showMessageDialog(l6,"Passwords are not same!");  
		}
	}
}
