package tictactoe;

import java.util.Scanner;

public class BoardManager {

	public static void main(String[] args) {
		start();
//		BoardManager b = new BoardManager();
//		b.start();
	}

	private static void start() {
		Player p1 = Player.takePlayerInput();
		Player p2 = Player.takePlayerInput();
		
		while (p2.getSymbol() == p1.getSymbol()) {
			System.out.println("Player 2 please enter details again");
			p2 = Player.takePlayerInput();
		}
		
		Board b = new Board(p1.getSymbol(), p2.getSymbol());
		boolean isPlayer1Turn = true;
		Scanner s = new Scanner(System.in);
		
		while (b.getStatus() == Board.NOT_FINISHED) {
			Player currentPlayer = p1;
			if (!isPlayer1Turn) {
				currentPlayer = p2;
			}
			
			boolean done = false;
			while (!done) {
				b.print();
				System.out.println(currentPlayer.getName() + " your turn!");
				System.out.println("Enter x");
				int x;
				x = s.nextInt();
				System.out.println("Enter y");
				int y;
				y = s.nextInt();
				
				done = b.makeAMove(currentPlayer.getSymbol(), x, y);
			}
			isPlayer1Turn = !isPlayer1Turn;
		}
		
		b.print();
		int result = b.getStatus();
		if (result == Board.DRAW) {
			System.out.println("Draw!");
		} else if (result == Board.PLAYER_1_WON) {
			System.out.println(p1.getName() + " Won!");
		} else {
			System.out.println(p2.getName() + " Won!");
		}
		
		
		
	}
}
