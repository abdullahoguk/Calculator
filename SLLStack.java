/**
* Celal Bayar University - Department of Computer Engineering
* CSE 2105 Data Structures 
* Project I
*
* Authors: Abdullah ÖĞÜK 120315030
* 		   Ahmet KAŞİF 130315012
* Date: NOV2014
*/ 


//  ---------------------Stack Class by using a Linked List----------------------------

public class SLLStack<E> implements Stack<E> 
{
	protected SLinkedList<E> S;		// Generic list used to implement the stack 
	
	public SLLStack() {
		S = new SLinkedList<E>();
	}
	
	public int size() { 
		return S.size();
	}
	
	public boolean isEmpty() {
		return S.isEmpty();
	}
	
	public void push(E element) {
		S.addFirst(new Node<E>(element,null));
	}
	
	public E top() throws EmptyStackException {
		if (isEmpty())
		  throw new EmptyStackException("Stack is empty.");
		return S.head.getElement();
	}
	
	public E pop() throws EmptyStackException {
		Node<E> n;
		if (isEmpty())
		  throw new EmptyStackException("Stack is empty.");
		n = S.removeFirst();

		return n.getElement();
	}
	
	public void printStack(){
		S.printList();
	}
}
