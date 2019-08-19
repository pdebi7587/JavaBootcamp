package airline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SeatBooking {

	public static void main(String [] args) {
		
		//A4,A10,C5,D3,E6,F8
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		int counter = 0;
		
		String[][] seats = new String[26][12];
		
		int a=65;  //65 EQUAL TO A IN ASCII
		
		for (int i=0; i<26; i++, a++) {
			for (int j=0; j<12; j++) {
				
				if (j==3 || j==8) {
					seats[i][j]= " "; //AISLES
				}
				
				else if (j>= 4 && j<8) {
					seats[i][j]=  Character.toString((char)a) + (j);	//MIDDLE COLUMNS
				}
				
				else if (j<3){
					seats[i][j]=  Character.toString((char)a) + (j+1);  //RIGHT COLUMNS
					}
				
				else if (j>8 && j<12){
					seats[i][j]=  Character.toString((char)a) + (j-1);  //LEFT COLUMNS
				}
				
				System.out.print(seats[i][j]+ " ");
				
			}
			
			System.out.println();
			
		}
		
		
		//Take user input for occupied seats
		System.out.println("Enter occupied seat numbers (followed by commas):");
		String x = input.next();
		
		String[] space = x.split(",");
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(space); //array list separated by commas
		
		for (int k=0; k<al.size();k++) {
	//		System.out.print(s+ " ");
			
			for (int i=0; i<26; i++, a++) {
				for (int j=0; j<12; j++) {
					
					if (al.get(k).equals(seats[i][j])) {
						seats[i][j] = "X ";  //USER INPUTS MARKED X ON SEATING CHART
						
					}
					//System.out.print(seats[i][j]+ " ");
					
				}
				//System.out.println();
			}	
		}
		
		
		for (int i=0; i<26; i++, a++) {
			for (int j=0; j<12; j++) {
				System.out.print(seats[i][j]+ " "); //PRINT SEATING W/ X'S
			}
			System.out.println();
		}
		
		for (int c= 0; c<26; c++) {
			
					if ((!seats[c][0].equals( "X ")) && (!seats[c][1].equals( "X "))  && (!seats[c][2].equals( "X "))) {
						counter++;
						System.out.println(seats[c][0]+ " "+ seats[c][1] + " "+ seats[c][2]);
					}
				
			
					if (((!seats[c][4].equals( "X ")) && (!seats[c][5].equals( "X "))  && (!seats[c][6].equals( "X "))) 
						 || ((!seats[c][5].equals( "X ")) && (!seats[c][6].equals( "X "))  && (!seats[c][7].equals( "X ")))) {
						
						counter++;
						
						if ((!seats[c][4].equals( "X ")) && (!seats[c][5].equals( "X "))  && (!seats[c][6].equals( "X "))){
							System.out.println(seats[c][4]+ " "+ seats[c][5] + " "+ seats[c][6]);
						}
						
						else if ((!seats[c][5].equals( "X ")) && (!seats[c][6].equals( "X "))  && (!seats[c][7].equals( "X "))){
							System.out.println(seats[c][5]+ " "+ seats[c][6] + " "+ seats[c][7]);
						}
					}
					
			
				   if ((!seats[c][9].equals( "X ")) && (!seats[c][10].equals( "X "))  && (!seats[c][11].equals( "X "))) {
						
					   counter++;
					   System.out.println(seats[c][9]+ " "+ seats[c][10] + " "+ seats[c][11]);
					}
					
		}
		
		
		System.out.println(counter);
			
		//CLOSE
		input.close();
	
	}
		
}
