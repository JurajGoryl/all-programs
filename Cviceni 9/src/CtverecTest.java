import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CtverecTest {
	Ctverec ctverec;
	float podstava=2.2f;
	@Before
	public void prepare() {
		ctverec = new Ctverec(podstava);
	}
	@Test
	public void testGetHrana() {
		assertEquals(podstava, ctverec.getHrana(), 0.001);
	}
	
	@Test
	public void testGetObsah() {
		assertEquals(podstava*podstava, ctverec.vypoctiObsah(), 0.001);
	}

}
