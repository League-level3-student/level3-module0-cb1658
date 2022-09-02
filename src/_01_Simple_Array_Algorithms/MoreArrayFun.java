package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String [] array = {"a","b","c","d","e","f","g","h","i"};
		//prin(array);
		//System.out.println("");
		//reverse(array);
		//System.out.println("");
		//everyother(array);
		random(array);
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void prin(String[] charlie) {
		for(int a = 0; a < charlie.length; a++) {
			System.out.println(charlie[a]);
		}
	}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	public static void reverse(String[] charlie) {
		for(int a = charlie.length-1; a >= 0; a--) {
			System.out.println(charlie[a]);
		}
	}



    //4. Write a method that takes an array of Strings and prints every other String in the array.
	
	public static void everyother(String[] charlie) {
		for(int a = 0; a < charlie.length; a++) {
			if(a % 2 == 0) {
				System.out.println(charlie[a]);
			}
		}
	

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
		public static void random(String[] charlie) {
			
		
			for(int a = 0; a < charlie.length;) {
				Random randomnum = new Random();
				int num = randomnum.nextInt(charlie.length);
				if(charlie[num] != null) {
					System.out.println(charlie[num]);
					charlie[num]= null;
					a++;
				}
			}

		}
}
