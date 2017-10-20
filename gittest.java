import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class gittest {
	
	Project test_one , test_two, test_three, test_four;
	
	@Before
	public void setUp(){
		test_one = new Project(new String[][]{{"A" , "D"} , {"C" , "E"}});
		test_two = new Project(new String[][]{{"A", "A"}});
		test_three = new Project(new String[][]{{"B", "C"}, {"C", "B"}});
		test_four = new Project(
		        new String[][]{
		            {"A", "C"}, {"C", "D"}, {"B", "C"},
		            {"A", "E"}, {"B", "F"}, {"E", "G"},		
		            {"D", "G"}, {"F", "G"}, {"C", "E"},
		            {"C", "F"}
		          }
		    );
	}

	@Test
	public void isWellSorted_test_one_true1() {
		assertTrue(test_one.isWellSorted(new String[]{"A", "B", "C", "D", "E"}));
	}
	
	@Test
	public void isWellSorted_test_two_false1(){
		assertFalse(test_two.isWellSorted(new String[]{"A"}));
	}
	
	@Test
	public void isWellSorted_test_two_false2(){
		assertFalse(test_two.isWellSorted(new String[]{}));
	}
	
	 @Test
	  public void isWellSorted_test_three_false1() {
	    assertFalse(test_three.isWellSorted(new String[]{"B", "C"}));
	  }
	 
	  @Test
	  public void isWellSorted_test_four_true1() {
	    assertTrue(test_four.isWellSorted(new String[]{"A","B","C","D","E","F","G"}));
	  }

	  @Test
	  public void isWellSorted_test_four_false1() {
	    assertFalse(test_four.isWellSorted(new String[]{"A","B","F","D","E","C","G"}));
	  }

}
