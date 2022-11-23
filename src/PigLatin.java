import java.util.*;

public class PigLatin {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String piglatin = "apple";
		System.out.println(translate(piglatin));
		
	}

	
public static String translate(String input) {
	ArrayList<String> vowels = new ArrayList<>();
	vowels.add("a");
	vowels.add("e");
	vowels.add("i");
	vowels.add("o");
	vowels.add("u");
	
	input = input.toLowerCase();
	String word = "";
	String firstletter = Character.toString(input.charAt(0));
	
	if (vowels.contains(firstletter)) {
		return (input + "way");
	}
	else {
		for (int i = 0; i < input.length(); i++) {
			if (vowels.contains(Character.toString(input.charAt(i)))) {
				break;
			}
			word = word + input.charAt(i);
		}
		input = input.replaceFirst(word, "");
		input = input.concat(word + "ay");
		return input;
	}


}

}
