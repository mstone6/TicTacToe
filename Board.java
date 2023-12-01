package Week8;

import java.util.Scanner;

public class Board {
	//This is the Board
	private String [][] board;
	
	public Board() {
		board = new String[3][3];
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = "-";
			}
		}
	}
	
	public String[][] getBoard(){
		return  board;
	}
	public void printBoard() {
		//Lets print out the board
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + "|");
			}
			System.out.println();
		}
		
	}
	
	public boolean checkWinStatus() {
		//Now lets see if we have a winner
		//This loop checks rows that all rows blocks equal each other
		for(int i = 0; i < board.length; i++) {
			if(board[i][0].equals(board[i][1])&& board[i][1].equals(board[i][2]) && !board[i][0].equals("-")) {
				return true;
			}
			if(board[0][i].equals(board[1][i])&& board[1][i].equals(board[2][i]) && !board[0][i].equals("-")) {
				return true;
			}
		}
		//check chat gpt to see what this does
		if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals("-")) {
			return true;
		}
		if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals("-")) {
			return true;
		}
		return false;	
	}
	
	public boolean isBoardFull() {
		//Now lets see if the board is full.
		for(int i = 0; i < 3; i ++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j].equals('-')) {
				return false;
				}
			}
		}
			return true;
		
	}
	
	
	
	
	public boolean makeAMove(char symbol) { 
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter the row (0-2) to place your symbol: ");
		int row = input.nextInt(); 
		System.out.println("Enter the column (0-2) to place your symbol: ");
		int col = input.nextInt(); 
		
		if(row < 0 || row > 2 || col < 0 || col > 2 || !board[row][col].equals("-")) {
			return false; 
		} 
		
		//This checks if the place they entered is full already
		if(board[row][col]== String.valueOf(symbol)) {
			return false;
		}
		
		//Lets reassign the symbol to the place the user entered
		board[row][col] = String.valueOf(symbol); // Set the value at the specified position
	   
	    
		return true;

	}
	
	
	public boolean gameOver() {
		if(isBoardFull() || checkWinStatus()) {
			System.out.println(" ");
			return false;
		}
		return true;
	}
}
