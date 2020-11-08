import java.util.Random;
import java.util.Scanner;


public class FruitQuiz {
	static int userCounter = 0;
	static int counterA = 0;
	static int counterB = 0;
	static int counterC = 0;
	static int counterD = 0;
	static int counterE = 0;
	public static Scanner keyboard = new Scanner(System.in);
	static String userResponse;
	static Random rand = new Random(); 
	public static void main(String[] args) {
		startGameLines();
		
		while(true) {
			userResponse = keyboard.nextLine();
			//Begin game 
			if(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("**reset")) {
				//Clear variables for new game
				userCounter = 0; 
				counterA = 0;
				counterB = 0;
				counterC = 0; 
				counterD = 0;
				counterE = 0; 
					
				while(true) {
					//Print out the questions and ask for responses
					System.out.println("Here's the first question.");
					question1();
					userResponse= keyboard.nextLine();
					pointFunc(userResponse);
					
					question2();
					userResponse= keyboard.nextLine(); 
					pointFunc(userResponse);
					
					question3();
					userResponse= keyboard.nextLine(); 
					pointFunc(userResponse);
					
					question4();
					userResponse= keyboard.nextLine(); 
					pointFunc(userResponse);
					
					question5();
					userResponse= keyboard.nextLine(); 
					pointFunc(userResponse);
					
					//Determine fruit based on answer choices 
					if(userCounter >= 5) {
						if(counterA >= 3) {
							cutieResult(); 
							break;
						}//end if
						else if(counterB >= 3) {
							strawberryResult();
							break;
						}//end else if
						else if(counterC >= 3) {
							bananaResult();
							break;
						}//end else if
						else if(counterD >= 3) {
							blueberryResult(); 
							break;
						}//end else if
						else if(counterE >= 3) {
							watermelonResult(); 
							break;
						}//end else if 
						else {
							fruitSaladResult();
							break;
						}//end else
					}//end if
				}//end while
			}//end if
			
		
			//Command to close game
			else if(userResponse.equalsIgnoreCase("**exit")) {
				System.exit(0); 
			}//end else if
			else {
				System.out.println("Please type a valid response");
			}//end else
		}//end while
	}//end main
	
	//Function for startGameLines
	//Print instructions/ if user wants to play
	public static void startGameLines() {
		System.out.println("Hi, welcome to the Fruit Quiz. \nThis is a personality test that "
				+ "will tell you what fruit you are based on your answers."); 
			System.out.println("Please type A B C D or E to correspond with the choice "
					+ "you agree the most with.");
			System.out.println("Are you ready to begin? Type yes if so. If not, type **exit to close the game.");
			
	}//end startGameLines
	
	public static void pointFunc(String userResponse) {
		//Add user points depending on their responses 
		if(userResponse.equalsIgnoreCase("A")) {
			userCounter += 1;
			counterA++; 
		}//end if
		if(userResponse.equalsIgnoreCase("B")) {
			userCounter += 2;
			counterB++; 
		}//end if
		if(userResponse.equalsIgnoreCase("C")) {
			userCounter += 3;
			counterC++; 
		}//end if 
		if(userResponse.equalsIgnoreCase("D")) {
			userCounter += 4;
			counterD++; 
		}//end if
		if(userResponse.equalsIgnoreCase("E")) {
			userCounter += 5;
			counterE++; 
		}//end if 
		return;
	}//end if
	//Function for question1
	public static void question1() {
		System.out.println("1.What do you like to do on the weekend?\n");
		System.out.println("A. Go to virtual hackathons");
		System.out.println("B. Socially distance with some friends");
		System.out.println("C. Cozy up with a good book");
		System.out.println("D. Have a nap");
		System.out.println("E. Stream a movie");
		System.out.println("");
	
	}//end question1
	
	//Function for question2
	public static void question2() {
		System.out.println("2.What is your favorite color?\n");
		System.out.println("A. Orange");
		System.out.println("B. Red");;
		System.out.println("C. Yellow");
		System.out.println("D. Blue");
		System.out.println("E. Green");
		System.out.println("");
	}//end question2
	
	//Function for question3
	public static void question3() {
		System.out.println("3.What's your favorite movie genre?\n");
		System.out.println("A. Documentary- I now have free time to learn new things.");
		System.out.println("B. Romance- J'adore l'amour.(I love love!)");
		System.out.println("C. Action- because the world isn't crazy enough right now!");
		System.out.println("D. Horror- still in the mood from Halloween!");
		System.out.println("E. Comedy- it's nice to stay positive during these times.");
		System.out.println("");
	}//end question3
	
	//Function for question4
	public static void question4() {
		System.out.println("4.What do you miss most about the Pre-Covid world?\n");
		System.out.println("A. Attending classes in-person");
		System.out.println("B. Going to social events");
		System.out.println("C. Not wearing a mask everywhere");
		System.out.println("D. Hugging my friends and family");
		System.out.println("E. Dining in at my favorite restaurant");
		System.out.println("");
	}//end question4
	
	//Function for question5
	public static void question5() {
		System.out.println("5.What's your favorite new attire?\n");
		System.out.println("A. Business wear- I still have to get dressed for Zoom meetings.");
		System.out.println("B. Mask- I have some cool designs.");
		System.out.println("C. Sweats- I'm always cozy.");
		System.out.println("D. Pajamas- Every day is a sleepover!");
		System.out.println("E. My hair- I've never gone so long without a haircut!");
		System.out.println("");
	}//end question5
		
	//Function for Cutie Result 
	public static void cutieResult() {
		System.out.println("You got Cutie Orange! \nYou're the Cutie of the bunch!");
		System.out.println("You like to be productive while still maintaining a chill attitude.");
		System.out.println("Covid isn't going to stop you from achieving your goals!");
		System.out.println("Would you like to play again? Type yes if so."
				+ " If not, type **exit to close the game."); 
	}//end cutieResult

	//Function for Strawberry Result
	public static void strawberryResult() {
		System.out.println("You got Strawberry! \nYou're the life of the party; the ripest fruit in the room!");
		System.out.println("Covid hasn't kept you from being able to enjoy what you love to do best like having fun with your friends!");
		System.out.println("Would you like to play again? Type yes if so."
				+ " If not, type **exit to close the game."); 
	}//end strawberryResult
	
	//Function for Banana Result
	public static void bananaResult() {
		System.out.println("You got Banana! \nYou wish Covid would make like a banana and split!");
		System.out.println("You miss the routine you had prior to the pandemic, but you realize that this isn't so bad either.");
		System.out.println("Surely you'll get better adjusted as time goes on.");
		System.out.println("Would you like to play again? Type yes if so."
				+ " If not, type **exit to close the game."); 
	}//end bananaResult
	
	//Function for Blueberry Result
	public static void blueberryResult() {
		System.out.println("You got Blueberry! \nYou haven't let the pandemic turn you blue.");
		System.out.println("Your relaxed lifestyle fits almost perfectly with quarantining.");
		System.out.println("Would you like to play again? Type yes if so."
				+ " If not, type **exit to close the game."); 
	}//end blueberryResult
	
	//Function for Watermelon Result
	public static void watermelonResult() {
		System.out.println("You got Watermelon!");
		System.out.println("You're a well-rounded individual who although you miss things like dining out, "
				+ "you've adapted fairly to the post-pandemic world.");
		System.out.println("Would you like to play again? Type yes if so."
				+ " If not, type **exit to close the game."); 
	}//end watermelonResult
	
	//Function for if user choose a variety of answers
	//No clear majority of the same letter answers
	public static void fruitSaladResult() {
		System.out.println("You got Fruit Salad!");
		System.out.println("You are a unique mix of all kind of fruit personalities!");
		System.out.println("Would you like to play again? Type yes if so."
				+ "If not, type **exit to close the game."); 
	}//end fruitSaladResult
}//end class
