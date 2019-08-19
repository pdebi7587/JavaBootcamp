package sba3;

import java.util.Scanner;


public class CheckMate {
	
	public static void main(String [] args) {
		 //Create Scanner class
			Scanner input = new Scanner(System.in);
			
			String [][] board = new String[8][8];
			
			System.out.println("Indexes of Chess Board: ");
			
			for (int i= 7; i>=0;i--) {
				
				for (int j=0;j<=7;j++) {
					board[i][j]=  i + "," + j + "  ";
					System.out.print(board[i][j]);
				}
				System.out.println();
				
				
			}
			
			System.out.println("Enter index of Knight: (row,col) ");
			String knight = input.next();
			
			String[] kn = knight.split(",");
			
			int KnROW = Integer.parseInt(kn[0]);			
			int KnCOL = Integer.parseInt(kn[1]);
			
			
			
			System.out.println("Enter index of King: (row,col) ");
			String king = input.next();
			
			String [] kg = king.split(",");
			
			int KgROW = Integer.parseInt(kg[0]);			
			int KgCOL = Integer.parseInt(kg[1]);
			
			possibleMoves(KnROW,KnCOL);
			
			KnightKing(KnROW,KnCOL,KgROW,KgCOL);
			
			
			
			 
			
			
			
		
			
			
			
			
			
		
		
			
					
			
		//Close Scanner
			input.close();
	} // end main method
	
	public static void possibleMoves(int numKnROW, int numKnCOL) {
		
		int up1 = numKnROW+1;
		int down1 = numKnROW-1;
		int left1 = numKnCOL-1;
		int right1 = numKnCOL+1;
		
		int up2 = numKnROW+2;
		int down2 = numKnROW-2;
		int left2 = numKnCOL-2;
		int right2 = numKnCOL+2;
		
		System.out.println("Possible moves for Knight: ");
		
		
		if ((up1 >=0 && left2>=0) && (up1<=7 && left2<=7)){
			System.out.println("(" + up1 + "," + left2 + ")");
		}
		
		if ((up1 >=0 && right2>=0) && (up1<=7 && right2<=7)) {
			System.out.println("(" + up1 + "," + right2 + ")" );
		}
		
		if ((down1 >=0 && left2>=0) && (down1<=7 && left2<=7)) {
			System.out.println("(" + down1 + "," + left2 + ")");
		}
		
		if ((down1 >=0 && right2>=0) && (down1<=7 && right2<=7)) {
			System.out.println("(" + down1 + "," + right2 + ")");
		}
		
		if ((up2 >=0 && left1>=0) && (up2<=7 && left1<=7)) {
			System.out.println("(" + up2 + "," + left1 + ")");
		}
		
		if ((up2 >=0 && right1>=0) && (up2<=7 && right1<=7)) {
			System.out.println("(" + up2 + "," + right1 + ")" );
		}
		
		if ((down2 >=0 && left1>=0) && (down2<=7 && left1<=7)) {
			System.out.println("(" + down2 + "," + left1 + ")");
		}
		
		if ((down2 >=0 && right1>=0) && (down2<=7 && right1<=7)) {
			System.out.println("(" + down2 + "," + right1 + ")");
		}
		
	}
	
	public static boolean KnightKing(int numKnROW, int numKnCOL, int numKgROW , int numKgCOL) {
		
		boolean move = false;
		
		System.out.println("Knight can check King at index: ");
		
		int up1 = numKnROW+1;
		int down1 = numKnROW-1;
		int left1 = numKnCOL-1;
		int right1 = numKnCOL+1;
		
		int up2 = numKnROW+2;
		int down2 = numKnROW-2;
		int left2 = numKnCOL-2;
		int right2 = numKnCOL+2;
		
		if ((up1 == numKgROW) && (left2 == numKgCOL)) {
			System.out.println("(" + numKgROW + "," + numKgCOL + ")");
			move = true;
		}
		
		if ((up1 == numKgROW) && (right2 == numKgCOL)) {
			System.out.println("(" + numKgROW + "," + numKgCOL + ")");
			move = true;
		}
		
		if ((down1 == numKgROW) && (left2 == numKgCOL)) {
			System.out.println("(" + numKgROW + "," + numKgCOL + ")");
			move = true;
		}
		
		if ((down1 == numKgROW) && (right2 == numKgCOL)) {
			System.out.println("(" + numKgROW + "," + numKgCOL + ")");
			move = true;
		}
		
		if ((up2 == numKgROW) && (left1 == numKgCOL)) {
			System.out.println("(" + numKgROW + "," + numKgCOL + ")");
			move = true;
		}
		
		if ((up2 == numKgROW) && (right1== numKgCOL)) {
			System.out.println("(" + numKgROW + "," + numKgCOL + ")");
			move = true;
		}
		
		if ((down2 == numKgROW) && (left1 == numKgCOL)) {
			System.out.println("(" + numKgROW + "," + numKgCOL + ")");
			move = true;
		}
		
		if ((down2 == numKgROW) && (right1 == numKgCOL)) {
			System.out.println("(" + numKgROW + "," + numKgCOL + ")");
			move = true;
		}
		
		
		return move;
		
	}
	
	
	
	
	
	

}// end class
