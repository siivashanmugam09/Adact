package org.Junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.booking.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pojo.PojoClass;

public class HotelJunit extends BaseClass {

	@BeforeClass
	public static void StartBrdowser() {
		System.out.println("Start");
	}
	@Before
	public void Launch() {
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/");
	}
	@AfterClass
	public  static void End() {
		System.out.println("End");
	}
	@After
	public void Quit() {
		driver.quit();
	}

	@Test
	public void tc1() throws AWTException {
	
	PojoClass p = new PojoClass();
	type(p.getUserid(), "siva090195");
	String value = enterdTxt(p.getUserid());
	Assert.assertTrue("UseridTrue", value.contains("siva"));
//	Assert.asserte
	type(p.getPass(), "siva090195");
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
	type(p.getCheckin(), "28/04/2021");
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
	}
	@Test
	public void tc2() throws AWTException {
		PojoClass p = new PojoClass();
		type(p.getUserid(), "siva090195");
		String value = enterdTxt(p.getUserid());
		Assert.assertTrue("UseridTrue", value.contains("siva"));
		type(p.getPass(), "siva090195");
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
		type(p.getCheckin(), "28/04/2021");
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
	}
}
