import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class hangman_slutprojekt {
	
	static String gameWord = "";
	static ArrayList<Character> gameWordLetters = new ArrayList<>();
	static String playerName = "";
	
	
	
	/** 
	 * den delar ordens bokstäver i en lista
	 */
	public static void fillGameWordLetters() {
	
	gameWordLetters.clear();
	for (int i = 0; i < gameWord.length(); i++) {
		
		gameWordLetters.add(gameWord.charAt(i));
		
	}
	
	/**
	 * Frågar efter spelarens nam noch sparar sedan detta värdet
	 */
	public static void chooseName() {
		
		System.out.println("Enter your name");
		playerName = input.nextLine();
	}
		
	}	
	
	/**
	 * välkommnar spelaren till spelet
	 */
	public static void welcome() {
		System.out.println("Welcome to a game called hangman!");
		System.out.println("In this game you are suppost to fot letters in words");
		System.out.println("If your guess is wrong the game will end and the man will be hung");
		System.out.println("You guess one letter at a time, if you guess all the letters to form the word you win");
		System.out.println("Good luck!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}