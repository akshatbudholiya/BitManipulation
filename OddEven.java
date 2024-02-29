//This is the one of the efficient ways of determining odd or even number by  bit manipulation
//suppose there are two  numbers 4 & 5
//now if we convert 4 in binary = 100
//and 5 in binary = 101
//If you can see clerly then every even number has it's binary ending with 0 and odd number has its binary ending with 1
//now if we find odd number's AND with 1 then it will always result in 1
//5 AND 1 = 1
//Hence the code follows

import java.util.*;

public class OddEven {
	
	public static void main(String arge[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=sc.nextInt();
		
		if((n&1)==1) {
			System.out.println("Odd");
		}
		
		else
			System.out.println("Even");
	}

}
