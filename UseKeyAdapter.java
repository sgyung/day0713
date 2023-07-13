package day0713;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseKeyAdapter extends JFrame {

	private JTextField jtf; 
	private JTextArea jta;
	private UseKeyAdapter uka;
	
	
	public UseKeyAdapter() {
		super("키보드 이벤트 처리");
		
		jtf = new JTextField();
		jta = new JTextArea();
		
		JScrollPane jspCenter = new JScrollPane(jta);
		
		jtf.setBorder(new TitledBorder("아무키나 누르고 엔터"));
		jta.setBorder(new TitledBorder("눌린키의 결과"));
		
		add("North",jtf);
		add("Center",jspCenter);
		
		uka = this;
		
		
		setBounds(100,100,350,500);
		setVisible(true);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jtf.addKeyListener(new KeyAdapter(){
			
//			@Override
//			public void keyTyped(KeyEvent e) {
//				System.out.println("keyTyped " + e.getKeyCode() + " / " + e.getKeyChar());
//			}
		
//			@Override
//			public void keyReleased(KeyEvent e) {
//				System.out.println("keyReleased " + e.getKeyCode() + " / " + e.getKeyChar());
//			}
			
			@Override
			public void keyPressed(KeyEvent ke) {
//				System.out.println("keyPressed " + e.getKeyCode() + " / " + e.getKeyChar());
				jta.append("눌린키의 코드 : " + ke.getKeyCode() + ", 키 문자 : " + ke.getKeyChar() + "\n");
				jtf.setText("");
				if (ke.getKeyCode() == 27) {
//					this.dispose();// dispose는 JFrame에서 제공하는 method
					// this는 어디에서 사용되었느냐에 따라 달라집니다.
					// anonymous innerclass안에서 사용되면 keyAdapter이고
					// 생성자에서 사용되면 JFrame이된다.
//					dispose();// 외부클래스(JFrame)의 자원을 사용하게 된다.
					uka.dispose();
				}
			}
		});
		
	}
	
	public static void main(String[] args) {
		new UseKeyAdapter();
		
	}

}
