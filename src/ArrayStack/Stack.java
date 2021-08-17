package ArrayStack;

public class Stack {
	int A[] = new int[100];
	int top;
	Stack()
	{
		top = -1;
	}
	void push(int x)
	{	
		top ++;
		A[top] = x;
	}
	void clear()
	{
		top = -1;
	}
	int top()
	{
		return A[top];
	}
	int pop() 
	{
		int x = A[top];
		top --;
		return x;
	}
	boolean isEmpty()
	{
		return top == -1 ;
	}
	
	
	void print()
	{
		for(int i=0;i<=top;i++)
			System.out.print(A[i] + " ");
	}
	public static void main(String[] args)
	{
		Stack S= new Stack();
		S.push(3);S.push(1);S.push(4);S.push(2);S.push(6);
		S.pop();
	    S.print();
	}
}