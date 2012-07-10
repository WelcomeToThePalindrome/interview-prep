import static org.junit.Assert.*;

import org.junit.Test;


public class ReverseWordsTest {

	@Test
	public void test() {
		ReverseWords reverse = new ReverseWords();
		
		String input = "once upon a time";
		String expected = "time a upon once";
		String actual = reverse.reverse(input);
		assertEquals(expected, actual);
		
		input = "this is another example";
		expected = "example another is this";
		actual = reverse.reverse(input);
		assertEquals(expected, actual);
		
		input = "the cat chased five mice";
		expected = "mice five chased cat the";
		actual = reverse.reverse(input);
		assertEquals(expected, actual);
		
		input = "single";
		expected = "single";
		actual = reverse.reverse(input);
		assertEquals(expected, actual);
	}

}
