package dmacc.model;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;

	public Game(String player1) {
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}
	
	

    public String getPlayer1() {
		return player1;
	}



	public void setPlayer1(String player1) {
		this.player1 = player1;
	}



	public String getComputerPlayer() {
		return computerPlayer;
	}



	public void setComputerPlayer(String computerPlayer) {
		this.computerPlayer = computerPlayer;
	}



	public String getWinner() {
		return winner;
	}



	public void setWinner(String winner) {
		this.winner = winner;
	}



	public void setComputerPlayer() {
        // Generate a random choice for the computer player
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        int randomIndex = random.nextInt(choices.length);
        computerPlayer = choices[randomIndex];
    }

    public void determineWinner() {
        if (player1 == null || computerPlayer == null) {
            winner = "No one - invalid input";
        } else if (player1.equals(computerPlayer)) {
            winner = "It's a tie!";
        } else if ((player1.equals("Rock") && computerPlayer.equals("Scissors")) ||
                   (player1.equals("Paper") && computerPlayer.equals("Rock")) ||
                   (player1.equals("Scissors") && computerPlayer.equals("Paper"))) {
            winner = "Player 1";
        } else {
            winner = "Computer";
        }
    }
}
