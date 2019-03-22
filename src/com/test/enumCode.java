package com.test;


enum Title{
	MR("Mr"),MRS("MRS"),MS("MS"),DR("DR");
	
	private String title;
	private Title(String s) {
		// TODO Auto-generated constructor stub
		title=s;
	}
	
	public String formate(String f, String l) {
		return title + " " + f+" "+ l;
	}
}


enum Title2{
	DR;
	private Title t;
	
}
public class enumCode {

	 void m1() {
		// TODO Auto-generated method stub
		 System.out.println(Title.MR.formate("ab", "singh"));

	}
	
public static void main(String[] args) {
	Title.DR
}
}
