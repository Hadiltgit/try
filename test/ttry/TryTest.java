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
	void test() {
		assertEquals(1,Try.game());
	}

}
