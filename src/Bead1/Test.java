package Bead1;

import static org.junit.jupiter.api.Assertions.*;
import Bead1.Bead1;
import Util.Shifter;

class Test {

	@org.junit.jupiter.api.Test
	void init() {
		Shifter s1 = new Shifter("123");
	}
	
	@org.junit.jupiter.api.Test
	void shifted() {
		Shifter s2 = new Shifter("123abcdABC");
		System.out.println(s2.getOrigString());
		System.out.println(s2.shifted());
	}


}
