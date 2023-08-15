package com.dsa;

public class queulink {
	
	
	node head,tail;
	

	public queulink() {
		// TODO Auto-generated constructor stub
		head=tail=null;
	}
	
	
	public boolean isempty() {
		return head==null;
	}
	
	public void push(int e) {
		if(head==null) {
			head=new node(e,head);
			tail=head;
			return;
		}
		node n=new node(e);
		tail.next=n;
		n.next=null;
		tail=n;
	}
	
	public void pop() {
		head=head.next;
	}
	
	public void print() {
		node p=head;
		while(p!=null) {
			System.out.print(p.info+" ");
			p=p.next;
		}
	}
	
	public int front() {
		return head.info;
	}

}
