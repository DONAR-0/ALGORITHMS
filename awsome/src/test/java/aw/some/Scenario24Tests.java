package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;


/**
* Scenario24Tests
*/
@DisplayName("Resizing Array implementation")
public class Scenario24Tests {
	
	@Test
	@DisplayName("scenario24_Test_01")
	public void scenario24_Test_01(){
		Scenario24<Integer> scenario24 = new Scenario24<>();
		int[] values = new int[] {1,2,3,4,5,6,6,10,3,93,53,22,34,5,13,45};
		
		for (int i : values) {
			scenario24.push(i);
		}	
		assertThat("Peek Test", scenario24.peek(),is(equalTo(45)));	
	}	
}
