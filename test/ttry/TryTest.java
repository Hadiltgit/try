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
	
	

}
