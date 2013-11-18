package Hausaufgabe7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();
		Scanner scanner = new Scanner(System.in);
		String mark = "x";
		int i=0;
		while(board.hasWinner()== false){
			if (i%2==0)
				mark = "x";
			else 
				mark = "o";
			i++;
			
			try
			{
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				board.setMark(mark, x, y);
			}
			catch(InvalidPositionException e)
			{			
				System.out.print(e.getMessage());	
			}		
		}
		scanner.close();
	}
}
