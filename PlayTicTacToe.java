package Week8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PlayTicTacToe {
	
	//Now lets start a queue with all the players
	
	public static void main(String[] args) {
				Board board = new Board();
				Player player1 = new Player('x');
				Player player2 = new Player('o');
				Scanner keyboard = new Scanner(System.in);
				
				//Lets create the queue to hold our players
				Queue<Player> players = new LinkedList<>();
				players.add(player1);
				players.add(player2);
				
				//Instantiate to null so we can change in while loop
				Player currentPlayer = null;
				
				//Ask the user if they wanna play
				System.out.println("Would you like to play Tic Tac Toe?");
				String play = keyboard.nextLine();
				
				
				while(play.equals("y")) {
					
					System.out.println("Player X goes first.");
					
					while(!board.gameOver()) {
						//not sure if this complies with queue
		                currentPlayer = players.remove(); 
		                players.add(currentPlayer);
						board.printBoard();

						//Lets go to next players turn
						char symbol = currentPlayer.getSymbol();
						
						//Gets the symbol of that player and calls the move method
						System.out.println("It is " + symbol + "'s turn.");
						boolean validMove = board.makeAMove(symbol);
						
						//Always print the board after each move.
						board.printBoard();
						
						//Now if the player made an invalid move lets tell them
						if(!validMove) {
							System.out.println("Invalid move please try again.");
							validMove = board.makeAMove(symbol);

						}
						
						//This checks to see if a player won
						if(board.checkWinStatus()) {
							System.out.println("Player " + symbol + " wins!");
							break;
						}  else if(board.gameOver()){
							System.out.println("It's a tie!");
							break;
						}
						
						//Now lets re-add the current player to queue
						players.add(currentPlayer);
					
						
					}
				System.out.println("GAME OVER. Would you like to play again? (y for yes)");
				play = keyboard.nextLine();
				}
	}
}

	