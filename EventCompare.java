package day0713;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class EventCompare extends JFrame implements ActionListener {

	private JButton jbtn1;
	private JButton jbtn2;
	
	public EventCompare() {
		super("이벤트 비교");
		jbtn1 = new JButton("버튼1");
		jbtn2 = new JButton("버튼2");
		
		setLayout(new GridLayout(2,1));
		
		add(jbtn1);
		add(jbtn2);
		
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		
		
//		System.out.println(jbtn1);// 주소가 안나오고 메시지가 나오는 이유는  toString을 오버라이드 했기 때문.
//		System.out.println(jbtn2);
		
		setBounds(100,100,250,200);
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		System.out.println(ae.getSource());
		// 이벤트 비교
		// 버튼1이 눌렸을 때는 콘솔에 "안녕"을 출력
//		if(ae.getActionCommand().equals("버튼1")) {// ActionEvent만 사용가능
		if(ae.getSource() == jbtn1){// 모든 Event
			System.out.println("안녕");			
		}
		
		// 버튼2가 눌렸을 때는 MessageDialog로 "오늘은 목요일"을 출력
//		if(ae.getActionCommand().equals("버튼2")) {
		if(ae.getSource() == jbtn2){
			JOptionPane.showMessageDialog(this, "오늘은 비오는 목요일");
		}
	}

	public static void main(String[] args) {
		new EventCompare();
	}

}
