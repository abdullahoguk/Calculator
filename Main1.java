/**
* Celal Bayar University - Department of Computer Engineering
* CSE 2105 Data Structures 
* Project I
*
* Authors: Abdullah ÖĞÜK 120315030
* 		   Ahmet KAŞİF 130315012
* Date: NOV2014
*/ 


//Main Method to test calculator
import java.util.Scanner;
public class Main1 {


	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);

		System.out.println(" ");
		System.out.println("************************************************************");
		System.out.println("PROJECT I");
		System.out.println("*************************************************************");
		System.out.println("* Celal Bayar University - Department of Computer Engineering");
		System.out.println("* CSE 2105 Data Structures");
		System.out.println("* ");
		System.out.println("* Abdullah ÖĞÜK 120315030");
		System.out.println("* Ahmet KAŞİF   130315012");
		System.out.println("_____________________________________________________________");
		System.out.println("");
		System.out.println("");
		System.out.println("                          CALCULATOR");
		System.out.println("_____________________________________________________________");
		System.out.println("");

		//int selection=1;
		System.out.println("-------------INFIX TO POSTFIX AND CALCULATE---------------");
		System.out.print("Enter a valid Infix equation (e.g: 3+(8*5): ");
		String infix = scan.nextLine();
		InfixtoPostfix itopostfix = new InfixtoPostfix(infix);
	
		String postfix= itopostfix.getPostfix();
		System.out.println("Postfix:"+postfix);
		
		PostfixEval eval =new PostfixEval(postfix);
		String finalresult1= eval.getResult();
		System.out.println("Result:"+finalresult1);



		System.out.println("-------------PREFIX TO POSTFIX AND CALCULATE---------------");
		System.out.println("Enter a valid Prefix equation (e.g: +3*52 ): ");
		String prefix = scan.nextLine();
		PrefixtoPostfix pretopostfix = new PrefixtoPostfix(prefix);
		
		String postfix2= pretopostfix.getPostfix();
		System.out.println("Postfix:"+postfix2);


		PostfixEval eval2 =new PostfixEval(postfix2);
		String finalresult2=eval2.getResult();
		System.out.println("Result:"+finalresult2);
		
	}
}
