package Util;

public class Shifter {
	private String origString = "";

	public Shifter(String input) {
		origString = input;
	}

	public String shifted() {
		String shifted = "";
		for (int i = 0; i < origString.length(); i++) {
			Character ch = origString.charAt(i);

//			System.out.println("in:" + ch);
			int numericValue = (int) ch;
//			 System.out.println(numericValue);

			String chOut = Character.toString(numericValue + 1);
//			 System.out.println("out:" + chOut);
			shifted += chOut;
		}

		return shifted;
	}
	
	public String getOrigString() {
		return origString;
	}

}
