import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class gittest {
	
	Project test_one , test_two;
	
	@Before
	public void setUp(){
		test_one = new Project(new String[][]{{"A" , "D"} , {"C" , "E"}});
		test_two = new Project(new String[][]{{"A", "A"}});
	}

	@Test
	public void isWellSorted_test_one_true() {
		assertTrue(test_one.isWellSorted(new String[]{"A", "B", "C", "D", "E"}));
	}
	
	@Test
	public void isWellSorted_test_two_false(){
		assertFalse(test_two.isWellSorted(new String[]{"A"}));
	}
	
	@Test
	public void isWellSored_test_two_false(){
		assertFalse(test_two.isWellSorted(new String[]{}));
	}

}
