//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//Example:
//Given nums = [2, 11,7, 15], target = 9,
//Because nums[0] + nums[2] = 2 + 7 = 9,
//return [0, 2].
		
import java.util.Arrays;
import java.util.Scanner;		
public class twoSumProblem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of items in the array::");
		int arrayLength = input.nextInt();
		
		int[] array = new int[arrayLength];
		
		for(int i =0;i<array.length;i++) {
			System.out.print("Enter the element at "+i+" index::");
			array[i] = input.nextInt();
		}
		
		System.out.print("Enter the target number::");
		int targetNum = input.nextInt();
		
		int[] resultArray = findIndex(array,targetNum);
		
		System.out.print("The indices are"+Arrays.toString(resultArray));
	}
	
	public static  int[] findIndex(int[] array, int targetNum) {
		int[] resultArray =  new int[2];
		
		for(int i = 0;i<array.length;i++) {
			for(int j = i+1;j<array.length;j++) {
			if(array[i]+array[j] == targetNum) {
				resultArray[0]= i;
				resultArray[1]=j;
			}	
			}
		}
		
		return resultArray;
	}
}
