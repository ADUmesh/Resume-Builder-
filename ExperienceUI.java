import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.*;

public class ExperienceUI extends JFrame implements ActionListener{
	public String Name, DOB, FatherName, Nationality,email,PhoneNo,School,College,University,SchoolFrom,SchoolTo,CollegeFrom,CollegeTo,UniversityFrom,UniversityTo,imagePath,English,German,French,Hindi;
	public JLabel l,l1,l2,l3,l4;
	public JTextField t1,t2,t3;
	public JButton b1;
	public JComboBox j1;
	public Font f;
	
	public ExperienceUI(String Name, String DOB, String FatherName, String Nationality ,String PhoneNo, String email,String School, String College, String University,String SchoolFrom, String SchoolTo, String CollegeFrom, String CollegeTo, String UniversityFrom, String UniversityTo,String imagePath,String English, String German, String French,String Hindi) {
		this.Name = Name;
		this.DOB = DOB;
		this.FatherName = FatherName;
		this.Nationality = Nationality;
		this.PhoneNo = PhoneNo;
		this.email = email;
		this.College = College;
		this.School=School;
		this.University = University;
		this.SchoolFrom =SchoolFrom;
		this.SchoolTo = SchoolTo;
		this.UniversityFrom = UniversityFrom;
		this.UniversityTo = UniversityTo;
		this.CollegeFrom = CollegeFrom;
		this.CollegeTo=CollegeTo;
		this.imagePath =imagePath;
		this.English=English;
		this.German=German;
		this.French=French;
		this.Hindi=Hindi;
		f = new Font("SansSerif", Font.BOLD, 20);
		l = new JLabel("Experience");
		l.setFont(f);
		l1 = new JLabel("Company");
		l2 = new JLabel("Designation");
		l3 = new JLabel("Salary");
		l4 = new JLabel("Years");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		j1 = new JComboBox();
		b1 = new JButton("Save");
		for(int i=1;i<=30;i++){
	        j1.addItem(i);
		}
		l.setBounds(150, 10, 250,50);
		l1.setBounds(50, 90, 250,40);
		l2.setBounds(50, 130, 250,40);
		l3.setBounds(50, 170, 250,40);
		l4.setBounds(50,210,250,40);
		t1.setBounds(150, 90, 200,40);
		t2.setBounds(150, 130, 200,40);
		t3.setBounds(150, 170, 200,40);
		j1.setBounds(150,210,100,40);
		b1.setBounds(300,300, 100,50);
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(j1);
		b1.addActionListener(this);
		setLayout(null);
		setSize(640,400);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Saved your details");
		new Resume(Name, DOB, FatherName, Nationality,email,PhoneNo,School,College,University,SchoolFrom,SchoolTo,CollegeFrom,CollegeTo,UniversityFrom,UniversityTo,t1.getText(), t2.getText(),t3.getText(),j1.getSelectedItem().toString(),imagePath,English,German,French,Hindi);
		String s = new String("harshithResume");
	}

}
