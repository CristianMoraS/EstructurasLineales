package listas;

public class Node{
	// Atributos:
	public String name;
	public int age;
	public int id;
	
	//int* ponter = &a; en c/c++
	
	public Node next;// <--- Este es el puntero
	
	public Node() {}
	
	//nodo:
	public Node(String name, int age, int id) 
	{
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	// metodo to string
	public String toString()
	{
		return "Name: " + this.name + "\tAge:" + this.age + "\tId: " + this.id +"\n" ;
	}
	public Node clone() {
		Node clone = new Node(this.name,this.age,this.id);
		return clone;
	}
	
}
