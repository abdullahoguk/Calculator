/**
* Celal Bayar University - Department of Computer Engineering
* CSE 2105 Data Structures 
* Project I
*
* Authors: Abdullah ÖĞÜK 120315030
* 		   Ahmet KAŞİF 130315012
* Date: NOV2014
*/ 


 //---------------------------------Singly Linked List Class---------------------------- 

public class SLinkedList<E> implements LinkedList<E> 
{
	protected Node<E> head;		// head node of the list
	protected Node<E> tail;	    // tail node of the list
	protected int size;		// number of nodes in the list
  

  public SLinkedList() {
    head = null;
	tail = null;
    size = 0;
  }
  
  public int size() { 
    return size;
  }
  
	public boolean isEmpty() 
	{
    	return size == 0;
	}
  
	public void addFirst(Node<E> newNode) 
	{
    if(size == 0) //if list is empty
		tail = newNode;
	
	newNode.setNext(head);
	head = newNode;
	size++;
	}
  
	public void addLast(Node<E> newNode) 
 	{
		newNode.setNext(null);
	
		if(size == 0) //if list is empty
		head = newNode;
	
		if (size != 0) //if list is not empty
		tail.setNext(newNode);
	
		tail = newNode;
		size++;
	}
  
  	public Node<E> removeFirst() 
	{
		Node<E> tempNode = null;
		if (size != 0) 
		{
		if(size == 1)
			tail = null;
			
		tempNode = head;
		head = head.getNext();
		tempNode.setNext(null);
		size--;
	}

	//if list is empty then return null
	return tempNode; 
	
  }
  
  public Node<E> removeLast() 
  {
	Node tempNode = head;
	
	if(size == 0)
		return null;
	
	if(size == 1) 
	{
		head = null;
		tail = null;
		size--;
		return tempNode;
	}
	
	//size is greater than 1
	for(int i=1; i<=size-2; i++) 
	{
		tempNode = tempNode.getNext(); //go to element that before the tail
	}
	
	Node tempNode2 = tail;
	tail = tempNode;
	tail.setNext(null);
	size--;
	return tempNode2;
	
  }
  
  public int searchList(E searchKey)
   {
	if(size == 0)
		return -1;
		
	Node tempNode = head;
	for(int i=1; i<=size; i++) 
	{
		if(tempNode.getElement().equals(searchKey))
			return i; //return index of the node
		tempNode = tempNode.getNext();
	}
	
	return -1; //not found
  }
  
  public void printList() {
	Node tempNode = head;
	for(int i=1; i<=size; i++) 
	{
		System.out.print(tempNode.getElement());
		if(i!=size) //if it is not last element
			System.out.print(" - ");
		tempNode = tempNode.getNext();
	}
	System.out.println();
	
  }
}
