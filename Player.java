package Week8;

public class Player implements PlayerInterface{
	private char symbol;

	//Lets make a constructor
	public Player(char symbol) {
		this.symbol = symbol;
	}
	
	
	public char getSymbol() {
		//this is the getter for x
		return symbol;		
	}

	@Override
	public void setSymbol(char symbol) {
		//This is the setter for x
		this.symbol = symbol;		
	}

	

	
	
	
	///Check doc to see what this is supposed to do
		
	
}
