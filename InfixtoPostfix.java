/**
* Celal Bayar University - Department of Computer Engineering
* CSE 2105 Data Structures 
* Project I
*
* Authors: Abdullah ÖĞÜK 
* 		   Ahmet KAŞİF 
* Date: NOV2014
*/ 
 
 //------------ This class includes methods to convert an INFIX string to POSTFIX one ---------------------
 

public class InfixtoPostfix 
{
	private String infix;
	private String postfix;

	

	//Constructor of Class
	public InfixtoPostfix (String infix) 
	{
		this.infix = infix;
		this.postfix = "";

		convertToPostfix ();
	}


	
	//Getter Method
	public String getPostfix () 
	{
		return postfix;
	}



	//Main Conversion Method
	private void convertToPostfix () 
	{
		SLLStack<String> stack = new SLLStack<String> ();

		for (int i = 0, length = infix.length (); i < length; i++) 
		{
			String current = Character.toString (infix.charAt (i));

			if (isOperator (current)) 
			{
				if (stack.isEmpty ()) 
				{
					stack.push (current);
				} 
				else if (hasHigherPrecedence (stack.top (), current)) 
				{
					postfix += addOperatorsToPostfix (stack);
					stack.push (current);
				} 
				else 
				{
					stack.push (current);
				}
			}

			else {
				postfix += current;
			}
		}

		postfix += addOperatorsToPostfix (stack);
	}


	

	//Method that add opeators from Stack to end of the Postfix string
	private String addOperatorsToPostfix (SLLStack<String> operators) {
		String string = "";

		while (!operators.isEmpty ()) {
			if (operators.top ().equals ("(") || operators.top ().equals (")")) {
				operators.pop ();
				continue;
			}

			string += operators.pop ();
		}

		return (string);
	}

	


	//Method that decides higher precedence between top of stack and current operator in the string
	private boolean hasHigherPrecedence (String operator1, String operator2) 
	{
		if (operator1.equals ("(")) 
		{
			return (false);
		} 
		
		else if (operator1.equals (")")) 
		{
			return (true);
		} 
		
		else if (operator1.equals ("*")) 
		{
			return (false);
		} 
		
		else if (operator1.equals ("/")) 
		{
				
				if ("*/".contains (operator2)) 
				{
					return (false);
				} 
				
				else if ("+-".contains (operator2)) 
				{
					return (true);
				}

				if ("*/+".contains (operator2)) 
				{
					return (false);
				}

				else if (operator2.equals ("-")) 
				{

					return (true);
				}


			return ("*/+-".contains (operator2)) ? false : false;

		} 

		else if (operator1.equals ("+")) 
		{
				if ("*/+".contains (operator2)) 
				{
					return (false);
				} 
				else if (operator2.equals ("-")) 
				{
					return (true);
				}

			return ("*/+-".contains (operator2)) ? false : false;

		} 
		
		else if (operator1.equals ("-")) 
		{
			return ("*/+-".contains (operator2)) ? false : false;
		}
		
		else 
		{
			return (false);
		}
	
	}

	

	//This method returns true if paramater character is an operator( (,),*,/,+,- )
	private boolean isOperator (String what) 
	{
		return ("()*/+-".contains (what));
	}
}
