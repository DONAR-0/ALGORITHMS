package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
* Scenario27Tests
*/

@DisplayName("Find first repeating character")
public class Scenario27Tests {
	
	@Test
	@DisplayName("scenario27_Test_01")
	public void scenario27_Test_01() {
		String string = "abcdefcfeds";
		Scenario27 scenario27 = new Scenario27();
		assertThat(scenario27.first_repeating_character(string),is(equalTo(true)));
	}


	@Test
	@DisplayName("scenario27_Test_02")
	public void scenario27_Test_02() {
		String string = "abcdefhijklmnopqrstuvwxyz";
		Scenario27 scenario27 = new Scenario27();
		assertThat(scenario27.first_repeating_character(string),is(equalTo(false)));
	}


	@Test
	@DisplayName("scenario27_Test_03")
	public void scenario27_Test_03() {
		String string = "abcdefcfeds";
		Scenario27 scenario27 = new Scenario27();
		assertThat(scenario27.first_repeating_character_hashSet(string),is(equalTo(true)));
	}


	@Test
	@DisplayName("scenario27_Test_04")
	public void scenario27_Test_04() {
		String string = "abcdefhijklmnopqrstuvwxyz";
		Scenario27 scenario27 = new Scenario27();
		assertThat(scenario27.first_repeating_character_hashSet(string),is(equalTo(false)));
	}
}
