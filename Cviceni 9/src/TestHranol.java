import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestHranol {
	Hranol hranol;
	float podstava = 2.5f;
	float vyska = 2.2f;
	boolean drevena = false;
	@Before
	public void prepare() {
		hranol = new Hranol(podstava,vyska,drevena);
		
	}
	@Test
	public void testVypoctiObjem() {
		assertEquals(podstava*podstava*vyska, hranol.vypoctiObjem(), 0.001);
	}
	
	@Test
	public void testJeDreveny() {
		assertEquals(drevena, hranol.jeDreveny());
	}
	
	@Test
	public void testGetHrana() {
		assertEquals(vyska, hranol.getHrana(), 0.001);
	}

}
