import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileSystemView;
import javax.swing.Icon;
import javax.swing.JFileChooser;
 
public class FileBrowser extends JFrame {
	public JPanel p;
	public String s;
	public FileBrowser() {
		p= new JPanel();
		JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int r = fileChooser.showOpenDialog(null);
		if(r == JFileChooser.APPROVE_OPTION) {
			s = fileChooser.getSelectedFile().getAbsolutePath();
		}
		else
		{
			fileChooser.setVisible(false);
		}
		fileChooser.setBounds(12, 0, 548, 326);
		p.add(fileChooser);
		p.setLayout(null);
	}
	
	public String getAbsolutePath() {
		return s;
	}
}
