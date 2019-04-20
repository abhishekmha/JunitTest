package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.countA("AbhishekAA");
		assertEquals(1435, output);
	}

}
