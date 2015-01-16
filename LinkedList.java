/**
* Celal Bayar University - Department of Computer Engineering
* CSE 2105 Data Structures 
* Project I
*
* Authors: Abdullah ÖĞÜK 120315030
* 		   Ahmet KAŞİF 130315012
* Date: NOV2014
*/ 


 //---------------------------------LinkedList Interface----------------------------
public interface LinkedList<E> {

	//add new node to the beginning of the list
	public void addFirst(Node<E> newNode);
	
	//add new node to the end of the list
	public void addLast(Node<E> newNode);
	
	//remove and return the first node of the list
	public Node<E> removeFirst();
	
	//remove and return the last node of the list
	public Node<E> removeLast();
	
	//search the list for the given search key and return its index
	public int searchList(E searchKey);
	
	//print the elements of the list
	public void printList();

	//return the number of items in the list
	public int size();

	//return if the list is empty
	public boolean isEmpty();
 
}
