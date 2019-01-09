package Ex_6_37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex_6_37Test {

	@Test
	void test() {
		assertEquals(Ex_6_37.format(6, 2), 02);
		assertEquals(Ex_6_37.format(53, 5), 00053);
		assertEquals(Ex_6_37.format(4534, 5), 04534);
	}


}
