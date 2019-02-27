//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))



import java.text.SimpleDateFormat;
import java.util.*;
class SpecialStack {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer> stack=new Stack<>();
		Stack<Integer> temp=new Stack<>();
		int i=1;
		do
		{
			System.out.println("please enter your choice 1 for push 2 for pop 3 for min element 4 for display the stack 5 for exit");
			i=sc.nextInt();
			if(i==1)
			{
				System.out.println("please enter the number you want to push");
				int element=sc.nextInt();
				stack.push(element);
				if(!temp.empty())
				{
					if(temp.peek()>=stack.peek())
					{
						temp.push(element);
					}
				}
				else
				{
					temp.push(element);
				}
			}
			else if(i==2)
			{
				if(!stack.empty())
				{
					if(stack.peek()==temp.peek())
					{
						temp.pop();
					}
					stack.pop();
				}
				else
				{
					System.out.println("stack is empty");
				}
			}
			else if(i==3)
			{
				if(!stack.empty())
				{
					System.out.println("minimum element is"+temp.peek());
				}
				else
				{
					System.out.println("stack is empty");
				}
			}
			else if(i==4)
			{
				System.out.println("stack"+stack);
				System.out.println("temp"+temp);
			}
		}while(i<5 && i>=1);
	}
}