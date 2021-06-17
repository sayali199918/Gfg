class op
{
	int top;
	char a[];
	int cap;
	
	op(int len)
	{
		this.top =-1;
		a = new char[len];
		this.cap =len;
	}
	 
	boolean isFull()
	{
		if(top == cap-1)
			return true;
		return false;
	}
	
	boolean isEmpty()
	{
		if(top == -1)
			return true;
		return false;
	}
	
	void push(char w)
	{
		if(isFull())
			System.out.println("Full");
		else
		{
			top = top+1;
			a[top] = w;
			System.out.println(w+"is pushed");
		}
	}
	
	char pop()
	{
		if(isEmpty())
		{
			System.out.println("Empty");
			System.exit(0);
		}
			
				return a[top--];
			
			
	}
	char peek()
	{
		return a[top];
	}
	
}
public class BalnceBracket {

	public static void main(String[] args) {
		String eq = "({}()[])";
		int flag =1;
		op o = new op(eq.length());
		for(int i =0;i<eq.length();i++)
		{
			char p = eq.charAt(i);
			if(p =='{'|| p=='('|| p == '[')
			{
				o.push(p);
			}
			else if(p =='}'|| p==')'|| p == ']')
			{
				char ch=' ';
				if(!o.isEmpty())
				{
					ch = o.pop();
				}
				else
				{
					flag =0;
				}
				System.out.println(ch);
				
				if(p == '(' && ch!=')')
				{			
					flag = 0;
					break;
				}
				
				else if(p == '{' && ch!='}')
				{
					flag = 0;
					break;
				}
				
				else if(p == '[' && ch!=']')
				{
					flag = 0;
					break;
				}
			}
		}
		if(o.isEmpty() && flag ==1)
			System.out.println("Expression is balanced");
		else
			System.out.println("Expression is not balanced");

	}

}
