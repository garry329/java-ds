package tictactoe;

public class Board {

	public static final int DRAW = 0;
	public static final int PLAYER_1_WON = 1;
	public static final int PLAYER_2_WON = 2;
	public static final int NOT_FINISHED = 3;
	
	private char board[][];
	private char player1Symbol;
	private char player2Symbol;
	
	public Board(char symbol, char symbol2) {
		board = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';	
			}
		}
		player1Symbol = symbol;
		player2Symbol = symbol2;
	}

	public boolean makeAMove(char symbol, int x, int y) {
		if (symbol != player1Symbol && symbol != player2Symbol) {
			return false;
		}
		
		if (x < 0 || y < 0 || x > 2 || y > 2 || board[x][y] != ' ') {
			return false;
		}
		
		board[x][y] = symbol;
		return true;
	}

	public void print() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("----------");
		}
	}

	public int getStatus() {
		for (int i = 0; i <= 2; i++) {
			if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
				if (board[i][0] == player1Symbol) {
					return PLAYER_1_WON;
				} else if (board[i][0] == player2Symbol) {
					return PLAYER_2_WON;
				}
			}
		}
		
		for (int i = 0; i <= 2; i++) {
			if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
				if (board[0][i] == player1Symbol) {
					return PLAYER_1_WON;
				} else if (board[0][i] == player2Symbol) {
					return PLAYER_2_WON;
				}
			}
		}
		
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
			if (board[0][0] == player1Symbol) {
				return PLAYER_1_WON;
			} else if (board[0][0] == player2Symbol) {
				return PLAYER_2_WON;
			}
		}
		
		if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
			if (board[0][2] == player1Symbol) {
				return PLAYER_1_WON;
			} else if (board[0][2] == player2Symbol) {
				return PLAYER_2_WON;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] != player1Symbol && board[i][j] != player2Symbol) {
					return NOT_FINISHED;
				}
			}
		}
		return DRAW;
	}

	
	
	
	
	
	
	
}
