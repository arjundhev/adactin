package org.info;

import org.openqa.selenium.WebElement;

public class Adactin extends Global {
	public static void main(String[] args) {
		Global glo=new Global();
		glo.getdriver("chrome");
		glo.launchUrl("https://adactinhotelapp.com/");
		WebElement txtUserName = glo.findById("xpath", "//input[@id='username']");
		glo.typeText(txtUserName, glo.getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\AdactinHotel\\workbook\\adactinhotel.xlsx", "Sheet1",1,0));
		WebElement txtPass = glo.findById("id", "password");
		glo.typeText(txtPass, glo.getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\AdactinHotel\\workbook\\adactinhotel.xlsx", "Sheet1", 1, 1));
		glo.btnClick(glo.findById("id", "login"));
		
		glo.btnClick(glo.findById("id", "location"));
		WebElement findById = glo.findById("id", "location");
		glo.selectByDropDown("index", findById, "6");
		
		glo.btnClick(glo.findById("id", "hotels"));
		WebElement findById2 = glo.findById("id", "hotels");
		glo.selectByDropDown("index", findById2, "2");
		
		glo.btnClick(glo.findById("id", "room_type"));
		WebElement findById3 = glo.findById("id", "room_type");
		glo.selectByDropDown("index", findById3, "4");
		
		glo.btnClick(glo.findById("id", "room_nos"));
		WebElement findById4 = glo.findById("id", "room_nos");
		glo.selectByDropDown("index", findById4, "1");
		
	//	glo.btnClick(glo.findById("id", "datepick_in"));
	//	WebElement findById5 = glo.findById("id", "datepick_in");
	//	glo.typeText(findById5, glo.getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\AdactinHotel\\workbook\\adactinhotel.xlsx", "Sheet1", 1, 2));
		
		
		glo.btnClick(glo.findById("id", "adult_room"));
		WebElement findById6 = glo.findById("id", "adult_room");
		glo.selectByDropDown("index", findById6, "1");
		
		glo.btnClick(glo.findById("id", "child_room"));
		WebElement findById7 = glo.findById("id", "child_room");
		glo.selectByDropDown("index", findById7, "0");
		
		glo.btnClick(glo.findById("id", "Submit"));
		
		glo.btnClick(glo.findById("id", "radiobutton_0"));
		
		glo.btnClick(glo.findById("id", "continue"));
		
		
		glo.btnClick(glo.findById("id", "first_name"));
		WebElement firstName = glo.findById("id", "first_name");
		glo.typeText(firstName, glo.getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\AdactinHotel\\workbook\\adactinhotel.xlsx", "Sheet1", 1,4 ));
		
		glo.btnClick(glo.findById("id", "last_name"));
		WebElement lastName = glo.findById("id", "last_name");
		glo.typeText(lastName, glo.getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\AdactinHotel\\workbook\\adactinhotel.xlsx", "Sheet1", 1,5 ));
		
		glo.btnClick(glo.findById("id", "address"));
		WebElement add = glo.findById("id", "address");
		glo.typeText(add, glo.getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\AdactinHotel\\workbook\\adactinhotel.xlsx", "Sheet1", 1,6 ));
		
		glo.btnClick(glo.findById("id", "cc_num"));
		WebElement creditNo = glo.findById("id", "cc_num");
		glo.typeText(creditNo, glo.getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\AdactinHotel\\workbook\\adactinhotel.xlsx", "Sheet1", 1,7 ));
		
		glo.btnClick(glo.findById("id", "cc_type"));
		WebElement cardType = glo.findById("id", "cc_type");
		glo.selectByDropDown("index", cardType, "3");
		
		
		glo.btnClick(glo.findById("id", "cc_exp_month"));
		WebElement month = glo.findById("id", "cc_exp_month");
		glo.selectByDropDown("index", month, "6");
		
		
		glo.btnClick(glo.findById("id", "cc_exp_year"));
		WebElement year = glo.findById("id", "cc_exp_year");
		glo.selectByDropDown("index", year, "12");
		
		
		glo.btnClick(glo.findById("id", "cc_cvv"));
		WebElement cvv = glo.findById("id", "cc_cvv");
		glo.typeText(cvv, glo.getDataFromExcel("C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\AdactinHotel\\workbook\\adactinhotel.xlsx", "Sheet1", 1,8 ));
		
		glo.btnClick(glo.findById("id", "book_now"));
		
		
		
		WebElement orderId = glo.findById("id", "order_no");
		glo.writeDataToExcel("C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\AdactinHotel\\workbook\\adactinhotel.xlsx","Sheet1", 1, 9,"orderId" );
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
