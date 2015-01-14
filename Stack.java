/**
* Celal Bayar University - Department of Computer Engineering
* CSE 2105 Data Structures 
* Project I
*
* Authors: Abdullah ÖĞÜK 120315030
* 		   Ahmet KAŞİF 130315012
* Date: NOV2014
*/ 



//---------------------------------STACK INTERFACE----------------------------
public interface Stack<E> {
 
  public int size();
 
  public boolean isEmpty();
 
  public E top() 
    throws EmptyStackException;  
 
  public void push (E element); 
 
  public E pop()
    throws EmptyStackException; 

  

}
