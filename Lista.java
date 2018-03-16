package listas;
import java.io.*;
public class Lista {
	
	Node head = null;//Empty List
	public boolean isEmpty()
	{
		// operador ternario.
		return head == null ? true : false;
	}
	
	public void Serch_Node(int age) {

	}
	
	public void insertAtEnd(Node newNode){
		if(isEmpty()) {
			head = newNode;
		}else {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		}
	}
	public void insertAtIndex(Node newNode, int Index){
		Node temp;
		Node pre = head;
		for(int i = 0; i < Index-1; i++) {
			pre.next=pre;
		}
		temp = pre.next;
		newNode.next = temp;
		pre.next = newNode;
	}
	
	public void insertAtBegin(Node newNode){
		newNode.next = head;
		head = newNode;
	}
	
	public void deletAtIndex(int delIndex) {// here is the delete index
		Node temp;
		Node pre = head;
		for(int i = 0; i < delIndex-1; i++) {
			temp = pre.next;
			pre.next = temp.next;
			temp = null;
			System.gc();
		}
	}
	
	public void deleteAtBegin(){
		Node temp = head;
		head = head.next;
		temp = null;
		System.gc();
	}
	
	public void deleteAtEnd() {
		Node temp;
		Node pre = head;
		while(pre.next.next != null){
			pre = pre.next;
		}
		temp = pre.next;
		pre.next = null;
		temp = null;
		System.gc();
	}
	public void printList() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Node temp = head;
		while(temp != null)
		{
			bw.write(temp.toString());
			temp = temp.next;
		}
		bw.flush();

	}
	public void reverse() {
		Stack tempList = new Stack();
		Node temp = head;
		
		while(temp != null) {
			
			tempList.push(temp.clone());
			temp = temp.next;
		}
		head = tempList.head;
	}
	public Node quickSort() {
		if(!isEmpty()) {
			
		Lista leftList = new Lista();
		Lista rightList = new Lista();
		
		Node pivot = head;
		Node temp = head.next;
		
		while(temp !=null)
		{
			if(temp.age < pivot.age)
				leftList.insertAtEnd(temp.clone());
			else
				rightList.insertAtEnd(temp.clone());
			temp = temp.next;
		}
		
		leftList.quickSort();
		rightList.quickSort();
		pivot.next = rightList.head;
		leftList.insertAtEnd(pivot);
		head = leftList.head;
		
		}	
		return null;
	}
	
	public int listSize()
	{
		int count = 0;
		Node temp = head;
		while(temp != null)
		{
			count += 1;
			temp = temp.next;
		}
		return count;
	}
	public Node getNode(int index)
	{
		if (listSize() < index) {
			return null;
		}else {
			Node temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
			return temp;
		}
	}
	public Node binarySearch()
	{
		int max = listSize();
		int min = 0;
		int middle = (max+min)/2;
		while(min <= max)
		{
			;
			
		}
		return null;
	}
	public static void main(String []args) throws IOException{
		Lista students = new Lista();
		//inicio:
		students.insertAtBegin(new Node("Cristian", 18, 610171));
		//Siguiente:
		students.insertAtBegin(new Node("Camilo", 19, 601171));
		//Ingresar al final:
		students.insertAtBegin(new Node("ElmO", 10, 45845212));
		
		students.quickSort();
		
		students.printList();
		/*
		System.out.println("-----------------");
		students.deleteAtBegin();
		students.printList();
		
		System.out.println("------------------");
		students.deleteAtEnd();
		students.printList();
		
		System.out.println("----------------------");
		students.deletAtIndex(1);
		students.printList();
		*/
		System.out.println("----------------------------");
		students.reverse();
		students.printList();
		//tarea: funcion que busque lo que tenga el nodo, Actualizar informacion, eliminar en cualquier posicion.
		
		
	}
}
