
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class test {
	
	static String gameWord = "";
	static ArrayList<Character> gameWordLetters = new ArrayList<>();
	static String playerName = "";
	static int playerChooseDifficultie;
	static String[] easy = {"TABLE", "BED", "ISLAND", "TREE", "LION"};
    static String[] hard = {"MONITORING", "TELEVISION", "PERSONALITY"};
	static ArrayList<Character> hiddenWord = new ArrayList<>();
	static String playerGuess = "";
	static String displayWord = "";
	static ArrayList<Character> guessedLetters = new ArrayList<>();
	static int maxWrongs = 7;
	static Random random = new Random();
	static int amountWrongs = 0;
	static int playAgain;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		playGame();
		
	}
	
	/**
	 * Denna kallar på klassens metoder i rätt ordning
	 */
	private static void playGame() {
		welcome();
		chooseName();
		difficulty();
		initdisplayword();
		fillGameWordLetters();
		gamePlayer();
		gameEnder();
	}
	
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
	
	/**
	 * Här är en metod som spelaren får välja svårighetsgrad och förklarar vad varje det. Det sätter också värdet för det hämliga ordet
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
	
	/**
	 * den fyller en lista med ett visst antal understräck berorde på hur långt ordet är
	 */
	private static void initdisplayword() {
	
		hiddenWord.clear();
		for (int i = 0; i < gameWord.length();i++) {
			
			hiddenWord.add('_');
			
		}
		System.out.println(hiddenWord);
		}
	/**
	 * här får spelaren gissa på ordet och metoden kollar om det är rätt eller fel
	 */
	public static void gamePlayer() {

		for (int i = 0; i < maxWrongs; i++) {
			System.out.println("Enter a letter:");
			playerGuess = input.nextLine().toUpperCase();

			if (!guessedLetters.contains(playerGuess.charAt(0))) {

				guessedLetters.add(playerGuess.charAt(0));

				updatedisplayWord(playerGuess.charAt(0));
				System.out.println(displayWord);

				if (gameWord.equals(displayWord)) {
					// vinst
					break;
				}

				if (gameWordLetters.contains(playerGuess.charAt(0))) {
					// gissat rätt
					System.out.println("Correct");
					i--;

				}

				else {
					// felgissning
					System.out.println("Wrong, try again!");
					if (i == 0) {
						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                      |\r\n" + "                      |\r\n"
								+ "                      |\r\n" + "                     _|_''', '''");

					}

					else if (i == 1) {

						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                O     |\r\n" + "                      |\r\n"
								+ "                      |\r\n" + "                     _|_''', '''");
					}

					else if (i == 2) {
						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                O     |\r\n" + "                |     |\r\n"
								+ "                |     |\r\n" + "                     _|_''', '''");
					}

					else if (i == 3) {
						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                O     |\r\n" + "               /|     |\r\n"
								+ "                |     |\r\n" + "                     _|_''', '''");
					}

					else if (i == 4) {
						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                O     |\r\n" + "               /|\\    |\r\n"
								+ "                |     |\r\n" + "                     _|_''', ''' ");
					}

					else if (i == 5) {
						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                O     |\r\n" + "               /|\\    |\r\n"
								+ "                |     |\r\n" + "               /     _|_''', '''");
					}

					else if (i == 6) {
						System.out.println("                 _____\r\n" + "                |     |\r\n"
								+ "                O     |\r\n" + "               /|\\    |\r\n"
								+ "                |     |\r\n" + "               / \\   _|_''','''");
					}

				}

			} else {

				System.out.println("You already guess this!");
				i--;
			}
		}

	}
	
	/**
	 * uppdaterar det hämliga ordet efter vad spelaren svarar eller säger att du gissat fel
	 * @param playerGuess2 
	 */
	private static void updatedisplayWord(char playerGuess2) {

		if (gameWordLetters.contains(playerGuess.charAt(0))) {
			
			for (int i = 0; i < gameWord.length(); i++) {
				
				if (playerGuess.charAt(0) == gameWord.charAt(i)) {
					
					hiddenWord.set(i, playerGuess.charAt(0));
					
				}
				
			}
			
			System.out.println(hiddenWord);
			
		}
			
		else {
			System.out.println("Wrong letter guess");
		}

		}
	
	/**
	 * metoden visar/skriver vad svaret var och frågar om du skulle vilja spela igen eller avsluta
	 */
		public static void gameEnder() {

			System.out.println("The word was:" + "\t" + gameWord);

			System.out.println("Type: 1, To play again \n 2, To quit the game");
			while (playAgain < 1 || playAgain > 2) {


				playAgain = exception();
				
				if (playAgain == 1) {
					amountWrongs = 0;
					gameWord = "";
					playAgain = 0;
					guessedLetters.clear();
					playGame();
				} else if (playAgain == 2) {
					System.out.println("Thank you for playing!");
					System.exit(0);

				}

			}

		}
		
		/**
		 * den här metoden ser till att man bara kan skriva in siffror 
		 * @return den retunerar ett godkänt värde
		 */
		
		public static int exception() {
			int wrongFromUser;
			while (true) {

				try {
					wrongFromUser = input.nextInt();
					break;

				} catch (Exception e) {
					System.out.println("Wrong input! Please enter a number!");
					input.next();
				}
			}
			return wrongFromUser;
		}
	
}