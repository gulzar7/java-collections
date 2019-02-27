//Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.



import java.util.*;
class myComparator implements Comparator<Map.Entry<Character, Integer>>
{
	public int compare(Map.Entry<Character, Integer> o1,
	                   Map.Entry<Character, Integer> o2)
	{
		return (o1.getValue()).compareTo(o2.getValue());
	}
}
class ArrayDecresing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String temp=sc.nextLine();
		Map<Character, Integer> frequency = new LinkedHashMap<>();
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) != ' ') {
				if (frequency.containsKey(temp.charAt(i))) {
					int k = frequency.get(temp.charAt(i));
					k++;
					frequency.put(temp.charAt(i), k);
				} else {
					frequency.put(temp.charAt(i), 1);
				}
			}
		}
		List<Map.Entry<Character, Integer>> list =
				new LinkedList<Map.Entry<Character, Integer>>(frequency.entrySet());
		myComparator obj=new myComparator();
		Collections.sort(list, obj);
		HashMap<Character, Integer> temp1 = new LinkedHashMap<Character, Integer>();
		for (Map.Entry<Character, Integer> aa : list) {
			temp1.put(aa.getKey(), aa.getValue());
		}
		System.out.println(temp1.toString());
	}
}