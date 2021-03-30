package org.booking;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.pojo.PojoClass;

public class HotelBooking extends BaseClass {
public static void main(String[] args) throws AWTException {
	launchBrowser();
	loadUrl("http://adactinhotelapp.com/");
	PojoClass p = new PojoClass();
	type(p.getUserid(), "Ezhilkumaran");
	type(p.getPass(), "45B267");
	toClick(p.getBtnlogin());
	selectIndex(p.getLocation(), 5);
	selectIndex(p.getHotelname(), 1);
	selectIndex(p.getRoom(), 1);
	selectIndex(p.getNoofrooms(), 1);
	toClick(p.getCheckin());
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_BACK_SPACE);
	type(p.getCheckin(), "28/04/202");
	toClick(p.getCheckout());
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_A);
	
	r.keyPress(KeyEvent.VK_BACK_SPACE);
	type(p.getCheckout(), "30/04/2021");
	selectIndex(p.getAdult(), 1);
	selectIndex(p.getChild(), 0);
	toClick(p.getBtnsearch());
	toClick(p.getBtnradio());
	toClick(p.getBtncontinue());
	type(p.getFirstname(), "siva");
	type(p.getLastname(), "shanmugam");
	type(p.getAddress(), "495,east");
	type(p.getCardno(), "1234567887456123");
	selectIndex(p.getCardtype(), 2);
	selectIndex(p.getCardexpmn(), 4);
	selectIndex(p.getCardexpyr(), 12);
	type(p.getCvv(), "789");
	toClick(p.getBtnbook());
//	txtweb(p.getReciptno());
//	String attribute = p.getAddress().getAttribute("Value");
//	System.out.println(attribute);
	
}
}
