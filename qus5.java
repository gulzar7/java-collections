//Write a program to sort the Student objects based on Score , if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age}


import java.util.*;
class Sort implements Comparator<SortObjectMarks>
{
	@Override
	public int compare(SortObjectMarks o1, SortObjectMarks o2) {
		if(o1.Score>o2.Score)
			return 1;
		if(o1.Score<o2.Score)
			return -1;
		else
			return o1.Name.compareTo(o2.Name) ;
	}
}
class SortObjectMarks {
	String Name;
	double Score;
	int age;
	@Override
	public String toString() {
		return "SortObjectMarks{" +
				"Name='" + Name + '\'' +
				", Score=" + Score +
				", age=" + age +
				'}';
	}
	SortObjectMarks(String name, double score, int age)
	{
		this.Name=name;
		this.Score=score;
		this.age=age;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person 1 details: name, score, age  ");
		List<SortObjectMarks> list=new ArrayList<>();
		list.add(new SortObjectMarks(sc.nextLine(),sc.nextDouble(),sc.nextInt()));
		System.out.println("Enter person 2 details: ");
		Scanner vc=new Scanner(System.in);
		list.add(new SortObjectMarks(vc.nextLine(),vc.nextDouble(),vc.nextInt()));
		System.out.println("Enter person 3 details: ");
		Scanner cc=new Scanner(System.in);
		list.add(new SortObjectMarks(cc.nextLine(),cc.nextDouble(),cc.nextInt()));
		System.out.println("Enter person 4 details: ");
		Scanner dc=new Scanner(System.in);
		list.add(new SortObjectMarks(dc.nextLine(),dc.nextDouble(),dc.nextInt()));
		System.out.println("Enter person 5 details: ");
		Scanner fc=new Scanner(System.in);
		list.add(new SortObjectMarks(fc.nextLine(),fc.nextDouble(),fc.nextInt()));
		Sort sort=new Sort();
		Collections.sort(list,sort);

		System.out.println(list);

	}

}