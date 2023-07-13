package day0713;

import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class TestMouthDesign extends JFrame {

	private JTextArea jta;
	
	
	public TestMouthDesign() {
		super("마우스 이벤트");
		jta = new JTextArea();
		
		TestMouthEvent tme = new TestMouthEvent(this);
		jta.addMouseListener(tme);
		
		add( jta );// BorderLayout은 컴포넌트를 배치하는 위치를 설정하지 않으면 Center에 배치
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public JTextArea getJta() {
		return jta;
	}
	
	public static void main(String[] args) {
		new TestMouthDesign();
	}

}
