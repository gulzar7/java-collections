//Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name.

import java.util.*;
//		import java.util.ArrayList;
//		import java.util.Collections;
//		import java.util.Comparator;
//		import java.util.List;
class Salary implements Comparator<SortObjectAge>
{
	@Override
	public int compare(SortObjectAge o1, SortObjectAge o2) {
		if (o1.salary < o2.salary) return -1;
		if (o1.salary>o2.salary) return 1;
		else return 0;
	}
}
class SortObjectAge  {
	int age;
	int salary;
	String name;
	@Override
	public String toString() {
		return "SortObjectAge{" +
				"age=" + age +
				", salary=" + salary +
				", name='" + name + '\'' +
				'}';
	}
	public SortObjectAge(String name, int salary, int age)
	{
		this.age=age;
		this.salary=salary;
		this.name=name;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person 1 details: name, salary, age  ");

		SortObjectAge person1=new SortObjectAge(sc.nextLine(),sc.nextInt(),sc.nextInt());
		System.out.println("Enter person 2 details: ");
		Scanner vc=new Scanner(System.in);
		SortObjectAge person2=new SortObjectAge(vc.nextLine(),vc.nextInt(),vc.nextInt());
		System.out.println("Enter person 3 details: ");
		Scanner cc=new Scanner(System.in);
		SortObjectAge person3=new SortObjectAge(cc.nextLine(),cc.nextInt(),cc.nextInt());
		System.out.println("Enter person 4 details: ");
		Scanner fc=new Scanner(System.in);
		SortObjectAge person4=new SortObjectAge(fc.nextLine(),fc.nextInt(),fc.nextInt());
		List<SortObjectAge> person=new ArrayList<>();
		Salary salary=new Salary();
		person.add(person1);
		person.add(person2);
		person.add(person3);
		person.add(person4);
		Collections.sort(person,salary);
		System.out.println(person.toString());
	}
}