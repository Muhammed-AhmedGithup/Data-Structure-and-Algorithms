package com.dsa;

public class linkarray {
	
	node head;
	node tail;

	public linkarray() {
		// TODO Auto-generated constructor stub
		head=tail=null;
	}
	public boolean isempty() {
		return head==null;
	}
	
	public void push_front(int e) {
		node n=new node(e);
		n.next=head;
		head=n;
		if(tail==null)tail=head;
		
	}
	
	public void push_back(int e) {
		
		if(head==null) {
			head=new node(e,head);
			tail=head;
			return;
		}
		
		tail.next=new node(e,null);
		tail=tail.next;
		
	}
	
	public void pop_fron() {
		
		if(head==tail) {
			head=tail=null;
			return;
		}
		head=head.next;
	}
	
	public void pop_back() {
		
		if(head==tail) {
			head=tail=null;
			return;
		}
		node p=head;
		while(p.next!=tail)p=p.next;
		p.next=null;
		tail=p;
	}
	
	public void ears(int e) {
		if(head==tail&&head.info==e) {
			head=tail=null;
			return;
		}
		if(head.info==e) {
			head=head.next;
			return;
		}
		
		node pre=head,tem=head.next;
		while(tem.info!=e&&tem!=null) {
			tem=tem.next;
			pre=pre.next;
		}
		if(tem==null)return;
		
		pre.next=tem.next;
		if(tem==tail)tail=pre;
	}
	
	public void print() {
		node p=head;
		while(p!=null) {
			System.out.print(p.info+" ");
			p=p.next;
		}
		System.out.println();
	}

}
