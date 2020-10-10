package week3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Week3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

		int [] ages = {3, 9, 23, 64, 2,8 ,28, 93};
		
		for (int i = 0; i < 1; i = i + 1) {
			System.out.println(ages[ages.length-1] - ages [0]);
		}
		for (int num : ages) {
			int sum = IntStream.of(ages).sum();
			double average = (sum/ages.length);
			System.out.println("The average of the array is: " + average);
		}

		//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		//b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		
			int average = 0;
			for (String name : names) {
				System.out.println(name);
				average = average + name.length();
			}
				average = average / names.length;
				System.out.println("The average length of each person's name is: " + average + " letters.");
				System.out.println();
		
		for (int i = 0; i < 1; i = i + 1) {
			System.out.println(names [0] + " " + names [1] + " " + names [2] + " " + names [3] + " " + names [4] + " " + names [5]);
		}
		
		
		
		//5.	Create a new array of int called nameLengths. 
		//Write a loop to iterate over the previously created names array and add the length of each 
		//name to the nameLengths array.
		
		ArrayList<Integer> nameLengths = new ArrayList<Integer>();
		for (int z = 0; z < names.length; z++) {
			int strLength = names[z].length();
			nameLengths.add(strLength);
			System.out.println(nameLengths.get(z));
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the word you wish to concatenate?");
		String words = sc.nextLine();
		System.out.println("How many times would you like to concatenate?");
		int times = sc.nextInt();
		
		String name = createReturn(words , times);
		System.out.println(name);
	
	
	
	//6.	Write a loop to iterate over the nameLengths 
	//       array and calculate the sum of all the elements in the array. Print the result to the console.
	
		int sum = 0;
		for (int num : nameLengths){
		sum = sum + num;
		}
		System.out.println("The sum of the elements is" + " " + sum); 
	}
	//7.Write a method that takes a String, word, and an INT, n, as arguments 
	//and returns the word concatenated to itself n number of times. (i.e. IF I pass in 
	//“Hello” and 3, I would expect the method to RETURN “HelloHelloHello”).

	
	
	public static String createReturn(String words, int times) {
		String newWord = "";
		for (int z = 0; z < times; z++ ) {
			newWord = newWord + words;
		}
		return newWord;
	}
	
	
	
	
}
