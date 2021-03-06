package ch_11;

/* 11.13 (Remove duplicates) Write a method that removes the 
 * duplicate elements from an array list of integers using the following header:
 *     public static void removeDuplicate(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 10 integers to a list 
 * and displays the distinct integers in their input order and 
 * separated by exactly one space.
 */



/**
 * @author Harry G. Dulaney IV
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise11_13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> testList = new ArrayList<>();
		
		System.out.println("Enter ten integers to put into the list now:");
		
		for (int i = 0; i < 10 ; i++) {
		testList.add(input.nextInt());
		}
		
		removeDuplicate(testList);
		
	
		System.out.print("The distinct integers are ");
		for (int j = 0; j < testList.size();j++) {
			
			System.out.print(testList.get(j) + " ");
		}
	input.close();}
	
public static void removeDuplicate(ArrayList<Integer> list) {
	
	
	Integer temp;
	 
	for (int i = 0; i < list.size();i++) {
		
		 temp = list.get(i);
		
		list.remove(i);
		
		while(list.contains(temp)) {
			
			list.remove(temp);
		}
		
		list.add(i,temp);
		
	}
		

	}
}
