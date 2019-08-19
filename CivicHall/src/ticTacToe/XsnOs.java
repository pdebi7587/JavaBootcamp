package ticTacToe;

import java.util.Scanner;

public class XsnOs{
	
	static String[][] board = new String[3][3];
	
	//Create Scanner Class
	static Scanner input = new Scanner(System.in);
	
	public static void main(String [] args){
		
		for (int i=0;i<2;i++) {
		System.out.println("     |       |      ");
		System.out.println("_____|_______|______");
		//System.out.println();
		}
		System.out.println("     |       |     ");
		System.out.println("     |       |     ");
		
		
		
		
		board[0][0]="1";
		board[0][1]="2";
		board[0][2]="3";
		board[1][0]="4";
		board[1][1]="5";
		board[1][2]="6";
		board[2][0]="7";
		board[2][1]="8";
		board[2][2]="9";
		
		for (int j=0;j<3;j++) {
			for(int k=0;k<3;k++) {
				System.out.print(board[j][k]);
			}
			System.out.println();
		}
		
		
		eX();
		oH();
		
		
		
		
		//Close Scanner
		input.close();
			
				
	} // end main method

	
	
	public static void eX(){
	
		
		board[0][0]="1";
		board[0][1]="2";
		board[0][2]="3";
		board[1][0]="4";
		board[1][1]="5";
		board[1][2]="6";
		board[2][0]="7";
		board[2][1]="8";
		board[2][2]="9";
		
		System.out.println("Player X pick a position: ");
		String move1 = input.next();
		String ex = "X";
		
		for (int j=0;j<3;j++) {
			for(int k=0;k<3;k++) {
				if (move1.equals(board[j][k])) {
				
					board[j][k]= ex;
				}
				System.out.print(board[j][k]);
			}
			System.out.println();
		}
		
	} //end eX method
	
	public static void oH(){
	
		
		board[0][0]="1";
		board[0][1]="2";
		board[0][2]="3";
		board[1][0]="4";
		board[1][1]="5";
		board[1][2]="6";
		board[2][0]="7";
		board[2][1]="8";
		board[2][2]="9";
		
		System.out.println("Player O pick a position: ");
		String move2 = input.next();
		String oh = "O";
		
		for (int j=0;j<3;j++) {
			for(int k=0;k<3;k++) {
				if (move2.equals(board[j][k])) {
				
					board[j][k]= oh;
				}
				System.out.print(board[j][k]);
			}
			System.out.println();
		}
		
	} //end eX method
} //end class




