package Hausaufgabe7;

public class Board {
	private String board[][] = new String[3][3];
	private boolean hasWinner;
	private String winnerMark;
	
	public Board(){
		hasWinner = false;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				board[i][j] = "%";
			}
		}
	}
	
	public void drawBoard(){
		System.out.println();
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void setMark(String mark, int x, int y) throws InvalidPositionException {
		
		try{
			if (board[x][y].equals("%") /*|| x < 0 || x > 2 || y < 0 || y > 2*/){
				board[x][y] = mark;
			} else {
				throw new InvalidPositionException("("+x+"/"+y+") liegt nicht auf dem feld oder ist schon besetzt, bitte gültige Koordinaten eingeben!");
			}
		} catch (ArrayIndexOutOfBoundsException e){
			throw new InvalidPositionException("("+x+"/"+y+") liegt nicht auf dem feld oder ist schon besetzt, bitte gültige Koordinaten eingeben!");
		}
	}
	
	public boolean hasWinner(){
		
		for(int i=0;i<3;i++){
			if((board[i][0].equalsIgnoreCase(board[i][1])&& board[i][0].equalsIgnoreCase(board[i][2])) && (board[i][0].equalsIgnoreCase("x") || board[i][0].equalsIgnoreCase("o"))) {
				hasWinner = true;
				//winnerMark = board[i][0];
			} else if((board[0][i].equalsIgnoreCase(board[1][i])&& board[0][i].equalsIgnoreCase(board[2][i])) && (board[0][i].equalsIgnoreCase("x") || board[0][i].equalsIgnoreCase("o"))){
				hasWinner = true;	
				//winnerMark = board[0][i];
			}
		}
		if ((board[0][0].equalsIgnoreCase(board[1][1])&& board[0][0].equalsIgnoreCase(board[2][2])) && (board[0][0].equalsIgnoreCase("x") || board[0][0].equalsIgnoreCase("o"))){
			hasWinner = true;
			winnerMark = board[0][0];
		} else if ((board[0][2].equalsIgnoreCase(board[1][1])&& board[0][0].equalsIgnoreCase(board[2][0]))&& (board[2][0].equalsIgnoreCase("x") || board[2][0].equalsIgnoreCase("o"))){
			hasWinner = true;
			winnerMark = board[0][2];
		}
		return hasWinner;
	}

	public String getWinnerMark() {
		return winnerMark;
	}
}
