/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 1.  2
	   2
	   2
	   2
*/

public class P5_OddStuff {

	public static void main(String[] args) {
		int number = 4;
        for( int count = 1; count <= number; count++ ) {
            System.out.println( number );
            number = number / 2;
        }
    }
}




/* 3. I was incorrect and it seems that it first prints the number 4,
then it divides the number, but I don't understand how it printed the 2
without a print statement?
*/