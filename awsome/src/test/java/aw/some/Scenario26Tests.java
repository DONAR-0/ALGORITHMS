package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.Iterator;
/**
* Scenario26Tests
*/
@DisplayName("Resizing stack")
public class Scenario26Tests {
	
	@Test
	@DisplayName("scenario26_Test_01")
	public void scenario26_Test_01(){
		Scenario26<Integer> scenario26 = new Scenario26<>();
		assertThat(scenario26.isEmpty(),is(true));
		scenario26.push(1);
		scenario26.push(2);	
		assertThat(scenario26.isEmpty(),is(false));
	}

	@Test
	@DisplayName("scenario26_Test_02")
	public void scenario26_Test_02(){
		Scenario26<Integer> scenario26 = new Scenario26<>();
		assertThat(scenario26.isEmpty(),is(true));
		scenario26.push(1);
		scenario26.push(2);	
		scenario26.push(3);	
		scenario26.push(10);	
		scenario26.push(11);	
		scenario26.push(12);	
		assertThat(scenario26.isEmpty(),is(equalTo(false)));
		assertThat(scenario26.peek(),is(equalTo(12)));
	}


	@Test
	@DisplayName("scenario26_Test_03")
	public void scenario26_Test_03(){
		Scenario26<Integer> scenario26 = new Scenario26<>();
		assertThat(scenario26.isEmpty(),is(true));
		scenario26.push(1);
		scenario26.push(2);	
		scenario26.push(3);	
		scenario26.push(10);	
		scenario26.push(11);	
		scenario26.push(12);	
		assertThat(scenario26.isEmpty(),is(false));
		assertThat(scenario26.peek(),is(equalTo(12)));
		assertThat(scenario26.pop(), is(equalTo(12)));
	}

	
	@Test
	@DisplayName("scenario26_Test_04")
	public void scenario26_Test_04(){
		Scenario26<Integer> scenario26 = new Scenario26<>();
		assertThat(scenario26.isEmpty(),is(true));
		scenario26.push(1);
		scenario26.push(2);	
		scenario26.push(3);	
		scenario26.push(10);	
		scenario26.push(11);	
		scenario26.push(12);	
		assertThat(scenario26.isEmpty(),is(false));
		assertThat(scenario26.peek(),is(equalTo(12)));
		assertThat(scenario26.pop(), is(equalTo(12)));
	}

		
	@Test
	@DisplayName("scenario26_Test_05")
	public void scenario26_Test_05(){
		Scenario26<Integer> scenario26 = new Scenario26<>();
		assertThat(scenario26.isEmpty(),is(true));
		scenario26.push(1);
		scenario26.push(2);	
		scenario26.push(3);	
		scenario26.push(10);	
		scenario26.push(11);	
		scenario26.push(12);	
		assertThat(scenario26.isEmpty(),is(false));
		assertThat(scenario26.peek(),is(equalTo(12)));
		assertThat(scenario26.pop(), is(equalTo(12)));
		assertThat(scenario26.iterator().next(),is(equalTo(11)));	
	}
}
