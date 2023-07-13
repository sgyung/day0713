package day0713;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SubWindow extends JDialog {
	private SubWindow sw;
	private MainWindow mw;
	
	public SubWindow(MainWindow mw) {
		super(mw,"자식창 타이틀 바", false);// true : Model, false : Non-Model
		this.mw = mw;
		// 기본 Layout BorderLayout
		JLabel jlbl = new JLabel(new ImageIcon("D:/dev/workspace/java_se/src/day0713/KakaoTalk_20230713_153354537.jpg"));
		
		JButton jbtn = new JButton("클릭");
		
		
		jbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(sw, "집에갈 때 비안오면 좋겠다.");
			}
		});
		
		setLayout(null);// BorderLayout 해제
		
		jlbl.setBounds(0,0,644,960);
		jbtn.setBounds(300,500,80,30);
		
		add(jlbl);
		add(jbtn);
		
//		setBounds(0,0,644,960);
		// 부모창의 좌표를 얻어와서 자식창 띄우기
		setBounds(mw.getX()+100,mw.getY()+150,644,960);
		setVisible(true);
		
		//Dialog는 setVisible전에 이벤트가 등록되어야 한다.
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
	
	
}
