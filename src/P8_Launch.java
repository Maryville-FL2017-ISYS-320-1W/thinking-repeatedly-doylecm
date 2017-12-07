/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 1. T-minus 5, 4, 3, 2, 1,
 *    Blast off!

*/

public class P8_Launch {

	public static void main(String[] args) {
		System.out.println("T-minus ");
        for( int i = 5; i >= 1; i-- ) {
            System.out.print( i + ", " );
        }
        System.out.println("Blastoff!");
	}

}



// 3. I was close. I thought that the print statement would print on the 
//    same line as the println statement. But it didn't. But the second 
// 	  println statement did print on the same line as the print statement.