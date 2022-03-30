public class RockPaperScissors {
	public static void main(String[] args) {
		System.out.println(rps("paper", "scissors"));
	}

	//If you're running this on edabit's 'code' page, you might want to copy everything below "rps"
	//and just plop it all in there.
	public static String rps(String s1, String s2) {
		if(validChoice(s1) && validChoice(s2)) {
			return game(s1, s2);
		}
		else return invalidChoice();
	}

	public static boolean validChoice(String playerChoice) {
		String validAnswer[] = {
			"rock",
			"paper",
			"scissors"
		};

		if(playerChoice == validAnswer[0] || playerChoice == validAnswer[1] || playerChoice == validAnswer[2]) {
			return true;
		}
		else return false;
	}

	public static String invalidChoice() {
		return "Error: Invalid choice. Must choose between 'rock', 'paper' or 'scissors'";
	}

	public static String game(String s1, String s2) {
		final String strPlayer1 = "Player 1 wins";
		final String strPlayer2 = "Player 2 wins";
		if(s1 == s2) {
			return "TIE";
		}
		if(s1 == "rock" && s2 == "scissors") {
			return strPlayer1;
		}
		if(s1 == "scissors" && s2 == "paper") {
			return strPlayer1;
		}
		if(s1 == "paper" && s2 == "rock") {
			return strPlayer1;
		}
		else return strPlayer2;
	}
}