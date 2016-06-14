package com.practice.dataStrucures;

public class LinkedListImpl<T> {
private Node<T> head;
	public void add(T value){
		Node<T> node = new Node<T>();
		node.setValue(value);
		Node<T> temp = head;
		while(true){
			if(temp==null){
			head=node;
			break;
			}else if(temp.getNextRefrence()== null){
				temp.setRefrence(node);
				break;
			}else{
				temp=temp.getNextRefrence();
			}
		}
	}
	public void traverse(){
		Node<T> temp = head;
		while (true){
			if(temp.nextRefrence!=null){
				System.out.println(temp.getValue().toString());
				temp=temp.getNextRefrence();
			}else{
				System.out.println(temp.getValue().toString());
				break;
			}
		}
	}
	public void reverse(){
		Node<T> current = head;
		Node<T> next=null;
		Node<T> prev=null;
		while (current!=null){
			next = current.getNextRefrence();//  save next node in a reference
			current.setRefrence(prev); //set head to tail or reverse direction of reference pointer
			prev=current;// saving reference for head node 
			current = next;// move head to next node to head
		}
		head=prev;//last node is now at head 
		traverse();
	}
private class Node<T>{
	private T value;
	private Node<T> nextRefrence;
	
	public void setValue(T value){
		this.value=value;
	}
	public T getValue(){
		return this.value;
	}
	public void setRefrence(Node<T> ref){
		this.nextRefrence=ref;
	}
	public Node<T> getNextRefrence(){
		return this.nextRefrence;
	}
}
}
