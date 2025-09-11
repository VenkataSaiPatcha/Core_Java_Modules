package LogicalPrograms;

import java.util.Stack;

public class ParenthisisLogic 
{
	public static void main(String[] args) 
	{
		String s1 = "{[()()]}";
		String s2 = "{[{)]}";
		
		System.out.println(s1+" -> "+(isBalanced(s1)?" balanced":"not balanced"));
		System.out.println(s2+" -> "+(isBalanced(s2)?" balanced":"not balanced"));
	}
	
	public static boolean isBalanced(String str)
	{
		Stack<Character> stack = new Stack<Character>();
		for(char c:str.toCharArray())
		{
			if(c =='(' ||c=='{'||c=='[')
			{
				stack.add(c);
			}
			else if(c==')'||c=='}'||c==']')
			{
				if(stack.isEmpty())
				{
					return false;
				}
			}
			
			char top = stack.pop();
			if ((c == ')' && top !='(')||
					(c=='}' && top != '{')||
					(c==']' && top!='[')
					)
			{
				return false;
			}
		}
		return stack.isEmpty();
	}
	
}
