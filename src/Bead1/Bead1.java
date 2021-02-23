package Bead1;

import Util.Shifter;

public class Bead1 {
	public static void main(String[] args) {
		String input = "";
		if (args.length < 1) {
			input = "alma,ALMA,Készítsen egy egyszerű titkosítást lehetővé alkalmazást, amely egy szöveges állományban a karaktereket a rákövetkezőre cseréli ki. (Pl alma bmnb) \n"
					+ "Az alkalmazástól elvárjuk, hogy tetszőleges hosszúságú szöveges állományokat képes legyen kezelni.";
		} else {
			input = args[0];
		}
		Shifter s1 = new Shifter(input);
		String shifted = s1.shifted();
		System.out.println(shifted);
	}

}
