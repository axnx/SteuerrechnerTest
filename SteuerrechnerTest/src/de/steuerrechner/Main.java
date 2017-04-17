package de.steuerrechner;

public class Main {
	
	public static void main(String[] args){
		 
		System.out.println("Lohnsteuer Rechner ONLINE");
		int ausgaben ;
		
		final String url = "https://www.bmf-steuerrechner.de/interface/2016V1.jsp?LZZ=1&RE4=2500000&STKL=1";
		 
		try {
			Steuerrechner.sendGet(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
