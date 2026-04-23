package ttry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TryTest {
    
	Try a;
	
	@BeforeEach
	void setUp() throws Exception {
		a = new Try();
	}

	@Test
	void iter1Test() {
		assertEquals("1",a.game());
	}

	@Test
	void iter2Test() {
		a.game();
		assertEquals("2",a.game());
	}
	
	@Test
	void iter3Test() {
		a.game();
		a.game();
		assertEquals("fizz",a.game());
	}

	
	void apply(int nbr) {
		for (int i = 0 ; i < nbr ; i++) {
			a.game();
		}
	}
	
	
	@Test
	void iter4Test() {
		 apply(3);
		assertEquals("4",a.game());
	}
	
	@Test
	void iter5Test() {
		 apply(4);
		assertEquals("buzz",a.game());
	}
	
	@Test
	void iter6Test() {
		apply(6);
		assertEquals("7",a.game());
		assertEquals("8",a.game());
		apply(2);
		assertEquals("11",a.game());
	}
	
	@Test
	void iter7Test() {
		apply(5);
		assertEquals("fizz",a.game());//6
		apply(5);
		assertEquals("fizz",a.game());//12
		apply(2);
		assertEquals("fizz",a.game());//15
	}
	
	

}
