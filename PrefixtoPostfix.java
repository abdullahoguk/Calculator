
public class PrefixtoPostfix
{
	private String prefix="";
	private String postfix="";
	private String reversedPrefix="";
	private String infix="";


	//Constructor of Class
	public PrefixtoPostfix (String prefix) 
	{
		this.prefix = prefix;
		this.postfix = "";

		convertToPostfix ();
	}




	//Getter Methods
	public String getPostfix () 
	{
		return postfix;
	}

	
	public String getInfix () 
	{
		return infix;
	}




	private void convertToPostfix () 
	{	
		String temp;

		SLLStack<String> stack = new SLLStack<String> ();
		reverse(prefix);
		int lengthRp = prefix.length ();
		for (int i = 0 ; i < lengthRp; i++) 
		{	
			String current = Character.toString (reversedPrefix.charAt (i));
				
			if (isOperand (current))
			{
				stack.push (current);
			}
				
			else if (isOperator (current)) 
			{
				temp=stack.pop();
				stack.push (current);
				stack.push (temp);
			}		
		}

		for (int i = 0; i < lengthRp; i++) 
		{	
			infix+= stack.pop();
		}
		InfixtoPostfix itopostfix = new InfixtoPostfix(infix);
		postfix=itopostfix.getPostfix();

	}





	//This method reverses input string
	private void reverse(String prefix)
	{
		SLLStack<String> stack = new SLLStack<String> ();
		int length = prefix.length ();
		
		for (int i = 0; i < length; i++) 
			{	
				String current = Character.toString (prefix.charAt (i));
				
				stack.push (current);
			}


		for (int i = 0; i < length; i++) 
			{	
				reversedPrefix+= stack.pop();
				
			}
		
	}




	//This method returns true if paramater character is an operator( (,),*,/,+,- )
	private boolean isOperator (String what) 
	{
		return ("*/+-".contains (what));
	}



	//This method returns true if paramater character is an operator(0,1,2,3,4,5,6,7,8,9)
	private boolean isOperand (String cur_temp) 
	{
		return ("0123456789".contains (cur_temp));

	}


}
