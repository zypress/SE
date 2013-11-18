package Hausaufgabe7;

public class Board {
	private String board[][];
	private boolean hasWinner;
	public Board(){
		hasWinner = false;
	}
	public void setMark(String mark, int x, int y) throws InvalidPositionException {
		if (board[x][y] != null || x < 0 || x > 2 || y < 0 || y > 2){
			throw new InvalidPositionException("("+x+"/"+y+") liegt nicht auf dem feld, bitte gültige Koordinaten eingeben!");
		} else {
			board[x][y] = mark;
		}
	}
	public boolean hasWinner(){
		for(int i=0;i<3;i++){
			if(board[i][0].equalsIgnoreCase(board[i][1])&& board[i][0].equalsIgnoreCase(board[i][2])) {
				hasWinner = true;
			} else if(board[0][i].equalsIgnoreCase(board[1][i])&& board[0][i].equalsIgnoreCase(board[2][i])){
				hasWinner = true;	
			}
		}
		if (board[0][0].equalsIgnoreCase(board[1][1])&& board[0][0].equalsIgnoreCase(board[2][2])){
			hasWinner = true;
		} else if (board[0][2].equalsIgnoreCase(board[1][1])&& board[0][0].equalsIgnoreCase(board[2][0])){
			hasWinner = true;
		}
		return hasWinner;
	}
}
