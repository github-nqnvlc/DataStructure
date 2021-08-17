package LinkedList;

public class LList {
	Node head;// tro den node dau tien	
	Node tail;// tro den node cuoi cung
	LList()
	{
		head = tail = null;
	}
	
	void AddLast(int x) // them x vao cuoi ds
	{
		Node P = new Node(x);
		if (head == null)
			head = tail = P;
		else	//L ko rong
		{
			tail.next = P;
			tail = P;
		}
	}
	
	void AddFirst (int x)
	{
		Node P = new Node(x);
		if (head == null)
			head = tail = P;
		else
		{
			P.next = head;
			head = P;
		}
	}
	
	void Traversal()
	{
		Node P = head;
		while (P != null)
		{
			System.out.print(P.data + " ");
			P = P.next; // chuyen qua node tiep theo
		}
	}
	
	void Find(int x)
	{
		int found = -1;
		int dem = 0;
		Node P = head;
		while (P != null)
		{
			if (P.data == x)
			{
				found = dem;
				break;
			}
			dem = dem +1;
			P = P.next;
		}
		if (found == -1)
			System.out.print("\nKhong tim thay " + x);
		else
			System.out.print("\nTim thay "+ x + " tai VT" + dem);
			
	}
	
	

	void clear() // xoa stack
	{
		head = null;
	}
	
	boolean isEmpty()
	{
		return head == null;
	
	}	
	
	void push(int x) // them x vao Stack
	{
		AddFirst(x);
	}
	
	int pop()
	{
		int x = head.data;
		head = head.next;
		return x;
	}
	
	int top()
	{
		return head.data;
	}
	
	public static void main(String[] args) 
	{
		LList L= new LList();// tao 1 ds L rong
		L.push(1); L.push(2); L.push(3);
		while (L.isEmpty() == false)
			System.out.print(L.pop() + " ");
		
	}

}
