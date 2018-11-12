/**
* AUTOR Björn Widon
**/
import java.util.Scanner;

public class testat12112018bjoernwidon{
	
	public static void main (String [] args){
		double mwStCONST = 0.19;
		System.out.println("bitte $$$$$ eingeben");		
		Scanner myscan = new Scanner(System.in);
		String helpstring = myscan.next();

		double netto = Double.parseDouble(helpstring);
		
		if (netto <0){
			System.out.println("DUDE, YOU CANT PAY WITH NEGATIVE MONEY");
			System.exit(0);
		}
		double mwStVAR = netto*mwStCONST;
		double brutto = netto + mwStVAR;
		
		System.out.println("Netto: "+netto);
		System.out.println("MWST: "+mwStVAR);
		System.out.println("Brutto: "+brutto);
		
		
	}
	
	
	
	
	
	
	
}