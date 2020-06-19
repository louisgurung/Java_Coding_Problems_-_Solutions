//Program to say whether the input is a palindrome or not:: 
//Test Input::: noon
//Ouput::: The word is palindrome
import java.util.Scanner;
public class checkPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Word::");
		String word = input.next();
		
		input.close();
		String reversedWord = "";
		for(int i =word.length()-1;i>=0;i--) {
			reversedWord += word.charAt(i);     //charAt() for index, String.equals() to compare strings
		}
		
		if(word.equals(reversedWord))
			System.out.print("The word is palindrome");
		else
			System.out.print("The word is not palindrome");
	 
	}
}

//inbuilt==> String Builder

//IN JS
//var isPalindrome = function(x) {
//    var rev="";
//    var word= x+"";
//    for(var i = word.length-1;i>=0;i--){
//        rev +=word.charAt(i);
//    }
//    if (rev===word)
//        return true;
//    return false;
//};