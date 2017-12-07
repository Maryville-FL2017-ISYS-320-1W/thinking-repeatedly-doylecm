/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class P13_NumbersRight {

	public static void main(String[] args) {
		final int TOP_SCALE = 5;// highest output number
		for( int line = 1; line <= TOP_SCALE; line++ ) { // for each of 5 lines
			for( int spacesIndex = 1; spacesIndex <= TOP_SCALE - line; spacesIndex++ ) {  // for each line add spaces
				System.out.print(" ");
		}
		for( int numbersIndex = 1; numbersIndex <= line; numbersIndex++ ) { //for each line print and repeat each number the same times as its quantity
			System.out.print( line );
		}
		System.out.println();// move to a new output line
	}

}

}

