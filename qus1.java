//Write Java code to define List .
// Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

import java.util.*;
class FloatSumUsingList {
	public static void main(String[] args) {
		float sum=0;
		Scanner sc=new Scanner(System.in);
		List<Float> Number=new ArrayList<>();
		System.out.println("Enter 5 number in the list");
		for(int i=0;i<5;i++)
		{
			Number.add(sc.nextFloat());
		}
		Iterator iterator = Number.iterator();
		while (iterator.hasNext())
		{
			sum=sum+(float)iterator.next();
		}
		System.out.println("sum is="+sum);
	}
}