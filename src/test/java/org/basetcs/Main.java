package org.basetcs;

import java.io.IOException;

public class Main extends Basemaven{
	public static void main(String[] args) throws IOException {
		getdriver();
		loadUrl("http://adactinhotelapp.com/");
		ALoginPage login=new ALoginPage(); 
		sendkeys(login.getTxtusrname(),Basemaven.getdatafromexcel("C:\\Users\\radha\\eclipse-workspace\\Project\\src\\test\\java\\org\\basetcs\\excel\\rajeshlogin.xlsx", "sheet1", 0, 0));
	}

}
