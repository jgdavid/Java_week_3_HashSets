package hash_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	public static void main(String[] args) throws Exception {

		Map<String, String> MorseCode = new HashMap<>();

		String code = ".-- .- ...- .-//.. ...//-.-. --- --- .-..//--- -.-";

		MorseCode.put(".-", "a");
		MorseCode.put("-...", "b");
		MorseCode.put("-.-.", "c");
		MorseCode.put("-..", "d");
		MorseCode.put(".", "e");
		MorseCode.put("..-.", "f");
		MorseCode.put("--.", "g");
		MorseCode.put("....", "h");
		MorseCode.put("..", "i");
		MorseCode.put(".---", "j");
		MorseCode.put("-.-", "k");
		MorseCode.put("._..", "l");
		MorseCode.put("--", "m");
		MorseCode.put("-..", "n");
		MorseCode.put("---", "o");
		MorseCode.put(".--.", "p");
		MorseCode.put("--.-", "q");
		MorseCode.put(".-.", "r");
		MorseCode.put("...", "s");
		MorseCode.put("-", "t");
		MorseCode.put("..-", "u");
		MorseCode.put("...-.", "v");
		MorseCode.put(".--", "w");
		MorseCode.put("-..-", "x");
		MorseCode.put("-.--", "y");
		MorseCode.put("--..", "z");

		String toTranslate = ".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-";
		for (String i : toTranslate.split("")) {
			toTranslate += toTranslate;

			System.out.println(toTranslate);
		}
		System.out.println(MorseCode.get(code));
		System.out.println(MorseCode.get("..."));

	}
}
