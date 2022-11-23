import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {

	@Test
	void PigLatintest() {
		// What we expect to get back (i.e. return value)
				String expected = "appleway";
				// what the method actually gave us back
				String actual = PigLatin.translate("apple");
				// make sure they match
				assertEquals(expected, actual);
	}
	@Test
	void PigLatintest1() {
				String expected = "ineapplepay";
				String actual = PigLatin.translate("pineapple");
				assertEquals(expected, actual);
	}
	@Test
	void PigLatintest2() {
				String expected = "ocryptay";
				String actual = PigLatin.translate("Crypto");
				assertEquals(expected, actual);
	}
	@Test
	void PigLatintest3() {
				String expected = "ocryptay";
				String actual = PigLatin.translate("Crypto");
				assertEquals(expected, actual);
	}
	@Test
	void PigLatintest4() {
				String expected = "elseway";
				String actual = PigLatin.translate("else");
				assertEquals(expected, actual);
	}
	@Test
	void PigLatintest5() {
				String expected = "iraffegay";
				String actual = PigLatin.translate("giraffe");
				assertEquals(expected, actual);
	}
	

}
