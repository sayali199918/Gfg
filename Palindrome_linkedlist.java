import java.util.Scanner;

class node2
{
	char data;
	node2 next;
	node2 head;
	node2()
	{
		data = 0;
		next = null;
	}
	node2(char x)
	{
		data = x;
		next = null;
	}
	
	void add(char x)
	{
		node2 nd = new node2(x);
		node2 temp = head;
		if(head==null)
		{
			head= nd;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next =nd;
			
		}
		
	}
	
	void display()
	{
		node2 temp = head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}
public class Palindrome_linkedlist {
//	node2 head;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str =sc.nextLine();
		int flag =0;
		int len =str.length();
		node2 nd = new node2();
		
		for(int i=0;i<len;i++)
		{
			char ch = str.charAt(i);
			nd.add(ch);		
		}
		nd.display();
		
		node2 temp =nd.head;
		for(int i =len-1;i>=0;i--)
		{
			if(temp.data!= str.charAt(i))
			{
				flag =1;
				break;

			}
			else
			{
				temp =temp.next;
			}
		}
		
		if(flag==0)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
		
		

	}

}