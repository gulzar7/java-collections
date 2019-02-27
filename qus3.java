//Write a method that takes a string and print the number of occurrence of each character characters in the string.

import java.util.*;
class FrequencyOfCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String temp=sc.nextLine();

		Map<Character,Integer> frequency=new LinkedHashMap<>();
		for(int i=0;i<temp.length();i++)
		{
			if(temp.charAt(i)!=' ')
			{
				if(frequency.containsKey(temp.charAt(i)))
				{
					int k=frequency.get(temp.charAt(i));
					k++;
					frequency.put(temp.charAt(i),k);
				}
				else
				{
					frequency.put(temp.charAt(i),1);
				}
			}
		}
		System.out.println(frequency.toString());
	}
}