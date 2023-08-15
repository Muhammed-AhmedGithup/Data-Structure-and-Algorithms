package com.dsa;

public class stacklink {
	node head;
	public stacklink() {
		// TODO Auto-generated constructor stub
		head=null;
	}
	
	
	public void push(int e) {
		head=new node(e,head);
	}
	public boolean isempty() {
		return head==null;
	}
	
	public void print() {
		node p=head;
		while(p!=null) {
			System.out.print(p.info+" ");
			p=p.next;
		}
	}
	
	public void pop() {
		head=head.next;
	}
	public int top() {
		return head.info;
	}

}
