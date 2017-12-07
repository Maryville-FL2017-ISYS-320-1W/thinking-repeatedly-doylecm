/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class P12_NumbersLeft {

	public static void main(String[] args) {
		final int TOP_SCALE = 5; // highest output
		for( int line = 1; line <= TOP_SCALE; line++ ) { // for each of 5 lines
			for( int spacesIndex = 5; spacesIndex >= TOP_SCALE + line; spacesIndex-- ) {  //print spaces
				System.out.print(" ");
		}
		for( int numbersIndex = 1; numbersIndex <= line; numbersIndex++ ) { //repeat the number on the output line
			System.out.print( line );
		}
		System.out.println();
	}

}

}
