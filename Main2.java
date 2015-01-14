/**
* Celal Bayar University - Department of Computer Engineering
* CSE 2105 Data Structures 
* Project I
*
* Authors: Abdullah ÖĞÜK 120315030
*        Ahmet KAŞİF 130315012
* Date: NOV2014
*/ 


//Main Method to test Hot potato game
import java.util.Scanner;
public class Main2 
{

  public static void main(String[] args) 
  {


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
    System.out.println("                          HOT POTATO GAME");
    System.out.println("_____________________________________________________________");
    Scanner scan = new Scanner(System.in);
    Potato pt = new Potato();
    boolean state = false;
    System.out.print("Passes : ");
    int p = scan.nextInt();
    System.out.print("Enter name of players, then just type 'OK' to start the game : ");
    NodeQueue<String> Q = new NodeQueue<String>();
    while (!state) 
    {
      String names = scan.next();
      if (names.equals("OK")) 
      {
        state = true;
      } 
      else 
      {
         Q.enqueue(names);
      }
    }
    System.out.println("" + pt.Potato(Q,p)+ " WON");
  }
}
