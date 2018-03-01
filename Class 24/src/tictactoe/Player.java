package tictactoe;

import java.util.Scanner;

public class Player {

	private String name;
	private char symbol;
	
	public Player(String name, char symbol) {
		this.name = name;
		this.symbol = symbol;
	}
	
	public String getName() {
		return name;
	}
	
	public char getSymbol() {
		return symbol;
	}
	
	public static Player takePlayerInput() {
		System.out.println("Enter name of player");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		System.out.println("Enter player symbol");
		char symbol = s.next().charAt(0);
		Player p = new Player(name, symbol);
		return p;
	}
	
}
