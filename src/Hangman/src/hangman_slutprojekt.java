import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class hangman_slutprojekt {
	
	static String gameWord = "";
	static ArrayList<Character> gameWordLetters = new ArrayList<>();
	static String playerName = "";
	
	
	
	/** 
	 * den delar ordens bokst�ver i en lista
	 */
	public static void fillGameWordLetters() {
	
	gameWordLetters.clear();
	for (int i = 0; i < gameWord.length(); i++) {
		
		gameWordLetters.add(gameWord.charAt(i));
		
	}
	
	/**
	 * Fr�gar efter spelarens nam noch sparar sedan detta v�rdet
	 */
	public static void chooseName() {
		
		System.out.println("Enter your name");
		playerName = input.nextLine();
	}
		
	}	
	
	
	
	
}