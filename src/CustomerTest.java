import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {
	Customer testCustomer;
	@Before
	public void setUp() throws Exception {
		testCustomer = new Customer("Peter");
	}

	@Test
	public void testGetName() {
		assertEquals("Peter",testCustomer.getName());
	}

}
