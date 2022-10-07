/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {
	
	

    public static int[] findWrongWayCow(final char[][] field) {
    	
    	// VERSION 0.2.0
    	
    	/* Notes:
    	 * 
    	 * P1 = cow
    	 * P2 = woc
    	 * 
    	 * P3 =
    	 * c
    	 * o
    	 * w      
    	 * 
    	 * P4 =
    	 * w
    	 * o
    	 * c
    	 * 
    	 */
    	
    	int P1 = 0;
    	int P2 = 0;
    	int P3 = 0;
    	int P4 = 0;
    	
    	for(int i = 0; i < field.length-2; i++) {
    		for(int j = 0; j < field[i].length; j++) {
    			if(field[i][j] == 'c' && field[i+1][j] == 'o' && field[i+2][j] == 'w') {
    				P1++;
    			}
    		}
    	}
    	
    	for(int i = 0; i < field.length-2; i++) {
    		for(int j = 0; j < field[i].length; j++) {
    			if(field[i][j] == 'w' && field[i+1][j] == 'o' && field[i+2][j] == 'c') {
    				P2++;
    			}
    		}
    	}
    	
    	for(int i = 0; i < field.length; i++) {
    		for(int j = 0; j < field[i].length-2; j++) {
    			if(field[i][j] == 'c' && field[i][j+1] == 'o' && field[i][j+2] == 'w') {
    				P3++;
    			}
    		}
    	}
    	
    	for(int i = 0; i < field.length; i++) {
    		for(int j = 0; j < field[i].length-2; j++) {
    			if(field[i][j] == 'w' && field[i][j+1] == 'o' && field[i][j+2] == 'c') {
    				P4++;
    			}
    		}
    	}
    	
    	System.out.println("P1: "+P1+",P2: "+P2+",P3: "+P3+",P4: "+P4); // Remove this later
    	
    	
    	return null; // Remove this later
    }
    	
	private static String String(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
