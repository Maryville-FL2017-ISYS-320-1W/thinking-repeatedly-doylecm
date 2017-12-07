/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class P1_Count5 {
    public static void main(String[] args) {
        for( int line = 1; line <= 4; line++ ) {	// for each of 4 lines
        	for ( int multiple = 5; multiple <= 5; multiple++) // using a multiple of 5
            System.out.println( "5 times " + line + " = " + multiple * line); //print line and multiply multiple times line
        }
    }
}
