/**
* Celal Bayar University - Department of Computer Engineering 
* CSE 2105 Data Structures 
* Project I
*
* Authors: Abdullah ÖĞÜK 120315030
* 		   Ahmet KAŞİF 130315012
* Date: NOV2014
*/ 


public class PostfixEval
{
	private String postfix;
	private Double tempResult;

	
	//Constructor of class
	public PostfixEval(String input)
	{
		postfix=input;
		tempResult=0.0;
		
		evaluation ();
	}

	//This metod returns result of evaluation
	public String getResult () 
	{
		return ""+tempResult;
	}

	

	//This metod evaluate postfix
	private void evaluation () 
		{
			Double tempPop1=0.0;
			Double tempPop2=0.0;
			SLLStack<String> stack = new SLLStack<String> ();
			for (int i = 0, length = postfix.length (); i < length; i++) 
			{	
				String current = Character.toString (postfix.charAt (i));
				
				if (isOperand (current))
				{
					stack.push (current);
				}
				
				else if (isOperator (current)) 
				{
					switch(current)
					{
						case "+": 	tempPop2 = Double.parseDouble(stack.pop());
									tempPop1 = Double.parseDouble(stack.pop());
									tempResult=tempPop1+tempPop2;
									stack.push(""+tempResult);
									break;

						case "-":   tempPop2 = Double.parseDouble(stack.pop());
									tempPop1 = Double.parseDouble(stack.pop());
									tempResult=tempPop1-tempPop2;
									stack.push(""+tempResult);
									break;

						case "*":   tempPop2 =Double.parseDouble(stack.pop());
									tempPop1 =Double.parseDouble(stack.pop());
									tempResult=tempPop1*tempPop2;
									stack.push(""+tempResult);
									break;				
									
						case "/":   tempPop2 = Double.parseDouble(stack.pop());
									tempPop1 = Double.parseDouble(stack.pop());
									tempResult=tempPop1/tempPop2;
									stack.push(""+tempResult);
									break;

						default: System.out.println("Invalid character!!!");
					}
				}
				
				else
				{
					System.out.println("Invalid operand or operator!!!");
				}				
			}
	}		


	
	//This method returns true if paramater character is an operator(0,1,2,3,4,5,6,7,8,9)
	private boolean isOperand (String cur_temp) 
	{
		return ("0123456789".contains (cur_temp));

	}


	
	//This method returns true if paramater character is an operator( (,),*,/,+,- )
	private boolean isOperator (String cur_temp2) 
	{
		return ("()*/+-".contains (cur_temp2));
	}
}
