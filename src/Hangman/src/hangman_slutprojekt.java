import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class hangman_slutprojekt {
	
	static String gameWord = "";
	static ArrayList<Character> gameWordLetters = new ArrayList<>();
	static String playerName = "";
	static int playerChooseDifficultie;
	static String[] easy = {"TABLE", "BED", "ISLAND", "TREE", "LION"};
    static String[] hard = {"MONITORING", "TELEVISION", "PERSONALITY"};
	
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
	
	/**
	 * v�lkommnar spelaren till spelet
	 */
	public static void welcome() {
		System.out.println("Welcome to a game called hangman!");
		System.out.println("In this game you are suppost to fot letters in words");
		System.out.println("If your guess is wrong the game will end and the man will be hung");
		System.out.println("You guess one letter at a time, if you guess all the letters to form the word you win");
		System.out.println("Good luck!");
	}
	
	/**
	 * H�r �r en metod som spelaren f�r v�lja sv�righetsgrad och f�rklarar vad varje det. Det s�tter ocks� v�rdet f�r det h�mliga ordet
	 */
	public static void difficulty() {
		System.out.println("Now you can choose between easy and hard.");
		System.out.println("Easy, In this difficultie you will be given a random word in the catagory easy. The word will be short and no hard spelling");
		System.out.println("Hard, This difficultie might contain a sentence or a very complicaded");
		System.out.println("You will have 8 chanses to guess the right word.");
		System.out.println("Difficultie: \n 1(Easy) \n 2(Hard)");
		do {
			playerChooseDifficultie = exception();
			input.nextLine();
		} while (playerChooseDifficultie < 1 || playerChooseDifficultie > 2); {
			
			if (playerChooseDifficultie == 1) {
				
				gameWord = easy[random.nextInt(easy.length)];
				
			}
			if (playerChooseDifficultie == 2) {
				
				gameWord = hard[random.nextInt(hard.length)];
			
			}
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}