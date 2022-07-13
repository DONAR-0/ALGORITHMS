package aw.some;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
* Scenario05Tests
*/
@DisplayName("Common Questions Tests")
public class Scenario05Tests {

	private static final Logger LOGGER = LoggerFactory.getLogger(Scenario05Tests.class);

	@Test
	@DisplayName("Find the missing number")
	public void scenario05_Test_01() {
		int[] array = {1,2,3,4,5,7,8,9,10};
		Scenario05 scenario05 = new Scenario05();
		Integer intValue = scenario05.getMissingNumber(array, 10);
		LOGGER.info("Missing Number is {}",intValue);
		assertThat("Happy check",intValue,is(6));	
	}

	@Test
	@DisplayName("Duplicate Character values in a word")
	public void scenario05_Test_02() {
		String word = "cabsdabdbadmjkfbenfemfakelnlfefabbfenw";
		Scenario05 scenario05 = new Scenario05();
		scenario05.printDuplicateCharaters(word);
		LOGGER.info("printDuplicateCharaters one more check with same word");
		scenario05.printDuplicateCharaters(word);
	}
	
	@Test
	@DisplayName("Anagram check values")
	public void scenario05_Test_03() {
		LOGGER.info("Check Anagram by removing the value from anagram");
		String word = "night";
		String anagram = "thing";
		String anagramNot = "thigh";
		Scenario05 scenario05 = new Scenario05();
		scenario05.isAnagram(word, anagram);
		LOGGER.info("Anagram check value");
		assertThat("Check the value ",scenario05.isAnagram(word, anagram),is(true));
		assertThat("Check the value ",scenario05.isAnagram(word, anagramNot),is(false));

	}
	
	@Test
	@DisplayName("Anagram check values using sort")
	public void scenario05_Test_04() {
		LOGGER.info("Check Anagram by sorting and equals");
		String word = "night";
		String anagram = "thing";
		String anagramNot = "thigh";
		Scenario05 scenario05 = new Scenario05();
		LOGGER.info("Anagram check value using sort");	
		assertThat("Check the value ",scenario05.isAnagramO(word, anagram),is(true));
		assertThat("Check the value ",scenario05.isAnagramO(word, anagramNot),is(false));

	}

	@Test
	@DisplayName("Anagram using String builder to remove")
	public void scenario05_Test_05() {
		LOGGER.info("Check Anagram by using string builders");
		String word = "night";
		String anagram = "thing";
		String anagramNot = "thigh";
		Scenario05 scenario05 = new Scenario05();
		LOGGER.info("Anagram check value using sort");	
		assertThat("Check the value ",scenario05.isAnagramT(word, anagram),is(true));
		assertThat("Check the value ",scenario05.isAnagramT(word, anagramNot),is(false));
	}
	
	@Test
	@DisplayName("Non Repeating Character")
	public void scenario05_Test_06() {
		LOGGER.info("Non Repeating Character");
		String word = "night";
		Scenario05 scenario05 = new Scenario05();
		LOGGER.info("Checking non repeating char");	
		assertThat("Check the value ",scenario05.getFirstNonRepeatingCharacter(word),is('n'));
		assertThat("Check the value ",scenario05.getFirstNonRepeatingCharacterO(word),is('n'));
	}
}
