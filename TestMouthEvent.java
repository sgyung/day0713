package day0713;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextArea;

/**
 * 마우스 이벤트를 간단하게 차리하기 위해 MouthAdapter상속
 * @author USER
 */
public class TestMouthEvent extends MouseAdapter {

	private TestMouthDesign tmd;// null - 객체가 생성되지 않았다.
	
	/**
	 * TestMouthEvent클래스가 생성될 때 TestMouthDesign객체를 입력받아 생성한다.( has a 관계 )
	 * @param tmd
	 */
	public TestMouthEvent(TestMouthDesign tmd) {
		this.tmd = tmd;
	}
	
	
	

	@Override
	public void mouseClicked(MouseEvent me) {
//		System.out.println("마우스버튼이 클리 되었음");
		String buttonType = "";
		switch (me.getButton()) {
		case MouseEvent.BUTTON1:
			buttonType = "왼쪽 버튼";
			break;
		case MouseEvent.BUTTON2:
			buttonType = "가운데 버튼";
			break;
		case MouseEvent.BUTTON3:
			buttonType = "오른쪽 버튼";
			break;

		default:
			break;
		}
		
		tmd.getJta().setText(buttonType + "마우스버튼이 클릭 되었음");
		
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		System.out.println("마우스가 움직임");
	}
	
}
