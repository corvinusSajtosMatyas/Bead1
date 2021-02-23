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

			int numericValue = (int) ch;

			String chOut = Character.toString(numericValue + 1);
			shifted += chOut;
		}

		return shifted;
	}
	
	public String getOrigString() {
		return origString;
	}

}
