

public class ReverseWords {
	
	/*
	 * Takes a string of words separated by whitespace
	 * and reverses the words in place 
	 * 
	 * For example, "this is a sentence" returns
	 * "sentence a is this"
	 */
	
	
	//TODO - is this considered in place?
	
	public String reverse (String input) {
		String[] words = input.split("\\s+");
		for (int i = 0; i < words.length/2; i++) {
			String temp = words[i];
			words[i] = words[words.length - 1 - i];
			words[words.length - 1 - i] = temp;
		}
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < words.length-1; i++) {
			builder.append(words[i] + " ");
		}
		builder.append(words[words.length-1]);
		return builder.toString();
	}

}
