package day0713;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainWindow extends JFrame implements ActionListener{

	
	public MainWindow() {
		super("자식창 띄우기");
		
		
		JButton jbtnOpenWin = new JButton("자식창을 띄웁니다.");
		
		// 글꼴변경
		// 1. Font 생성
		Font font = new Font("휴먼편지체",Font.ITALIC | Font.BOLD,25);
		// 2.컴포넌트에 적용
		jbtnOpenWin.setFont(font);
		// 글자색(전경색) 변경
		jbtnOpenWin.setForeground(Color.RED);
		// 바닥색(배경색) 뱐걍
		jbtnOpenWin.setBackground(Color.GRAY);
		
		jbtnOpenWin.addActionListener(this);
		
		add(jbtnOpenWin);
		
		setSize(400,400);
		setVisible(true);
		
		//Dialog는 setVisible전에 이벤트가 등록되어야 한다.
		
//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		new SubWindow(this);
	}

	public static void main(String[] args) {
		new MainWindow();
	}


}
