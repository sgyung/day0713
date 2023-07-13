package day0713;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * XxxAdapter클래스를 상속받아 Override할 method를 최소화할 수 있다.
 * @author USER
 */
public class AdapterEvent extends WindowAdapter{

	private AdapterDesign ad;
	
	public AdapterEvent(AdapterDesign ad) {
		this.ad = ad;
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		ad.dispose();
	}

	
}
