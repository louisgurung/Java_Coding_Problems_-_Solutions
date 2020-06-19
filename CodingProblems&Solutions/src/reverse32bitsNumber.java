//Given a 32-bit signed integer, reverse digits of an integer.
//Example 1:
//Input: 123
//Output: 321
//Example 2:
//Input: -123
//Output: -321
//Example 3:
//Input: 120
//Output: 21
//Note:
//Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

import java.util.Scanner;

public class reverse32bitsNumber {
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		String ans = new StringBuilder(String.valueOf(-120)).append("-").reverse().toString();
		
		System.out.println(Integer.parseInt(ans));//prints Hello Java  
	}

	public static int reverse(int num) {
		return 0;
	}
}
////INCOMPLETE////
