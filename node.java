package com.dsa;

public class node {
	
	int info;
	node next;

	public node(int info,node next) {
		this.info=info;
		this.next=next;
	}
	
	public node(int i) {
		this(i,null);
	}

}
