import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.awt.*;

public class ResumeUI extends JFrame implements ActionListener {
	public JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
	public JTextField t1,t2,t3,t4,t5,t6;
	public JButton b1,b2;
	public Font f;
	public String ImagePath;
	
	public ResumeUI() {
		f = new Font("SansSerif", Font.BOLD, 20);
		l = new JLabel("Personal Details");
		l.setFont(f);
		l8 = new JLabel("");
		l8.setIcon(new ImageIcon("C:/Users/91812/eclipse-workspace/ResumeBuilder/src/placeholder-200x200.png"));
		l1 = new JLabel("Name");
		l2 = new JLabel("Date Of Birth");
		l3 = new JLabel("Father Name");
		l4 = new JLabel("Nationality");
		l5 = new JLabel("Phone Number");
		l6 = new JLabel("Email ID");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		b1 = new JButton("Education -->");
		b2 = new JButton("Browse ...");
		l.setBounds(150, 10, 250,50);
		l1.setBounds(50,90,100,40);
		l2.setBounds(50,130,100,40);
		l3.setBounds(50,170,100,40);
		l4.setBounds(50,210,100,40);
		l5.setBounds(50,250,100,40);
		l6.setBounds(50,290,100,40);
		l8.setBounds(450, 10, 400,400);
		t1.setBounds(200,90,200,40);
		t2.setBounds(200,130,200,40);
		t3.setBounds(200,170,200,40);
		t4.setBounds(200,210,200,40);
		t5.setBounds(200,250,200,40);
		t6.setBounds(200,290,200,40);
		b1.setBounds(600,400,130,50);
		b2.setBounds(490, 320, 110,30);
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l8);
		add(l6);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(null);
		setVisible(true);
		setSize(800,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getSource())==b1) {
			new EducationUI(t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText(),t6.getText(),this.ImagePath);
		}
		else{
			FileBrowser f = new FileBrowser();
			if(f.getAbsolutePath()!=null) {
				this.ImagePath=f.getAbsolutePath();
				ImageIcon icon = new ImageIcon(f.getAbsolutePath());
				Image scaleImage = icon.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
				l8.setIcon(new ImageIcon(scaleImage));
			}
		}
	}
}