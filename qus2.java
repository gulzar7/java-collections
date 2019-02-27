//Write a method that takes a string and returns the number of unique characters in the string.


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Unique_Character {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String temp=sc.nextLine();
		Set<Character> unique=new HashSet<>();
		for (char charater:temp.toCharArray())
		{
			if(charater!=' ') {
				unique.add(charater);
			}
		}
		System.out.println(unique.toString());
	}
}