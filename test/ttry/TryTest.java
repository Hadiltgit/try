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
	}
	
	@Test
	void iter8Test() {
		apply(9);
		assertEquals("buzz",a.game());//10
		apply(9);
		assertEquals("buzz",a.game());//20
		apply(29);
		assertEquals("buzz",a.game());//50
	}
	
	@Test
	void iter9Test() {
		apply(14);
		assertEquals("fizzbuzz",a.game());//15
	}
	
	@Test
	void iter10Test() {
		assertEquals("1",a.game());
		assertEquals("2",a.game());
		assertEquals("fizz",a.game());
		assertEquals("4",a.game());
		assertEquals("buzz",a.game());
		assertEquals("fizz",a.game());
		assertEquals("7",a.game());
		assertEquals("8",a.game());
		assertEquals("fizz",a.game());
		assertEquals("buzz",a.game());
		assertEquals("11",a.game());
		assertEquals("fizz",a.game());
		assertEquals("13",a.game());
		assertEquals("14",a.game());
		assertEquals("fizzbuzz",a.game());
		assertEquals("16",a.game());
		assertEquals("17",a.game());
		assertEquals("fizz",a.game());
		assertEquals("19",a.game());
		assertEquals("buzz",a.game());
		assertEquals("fizz",a.game());
		assertEquals("22",a.game());
		assertEquals("23",a.game());
		assertEquals("fizz",a.game());
		assertEquals("buzz",a.game());
		assertEquals("26",a.game());
		assertEquals("fizz",a.game());
		assertEquals("28",a.game());
		assertEquals("29",a.game());
		assertEquals("fizzbuzz",a.game());
	}

}
