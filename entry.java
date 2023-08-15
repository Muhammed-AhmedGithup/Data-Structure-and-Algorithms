package com.dsa;

public class entry {
	
	int key;
	int value;
	entry next;

	public entry(int key,int value) {
		// TODO Auto-generated constructor stub
		this.key=key;
		this.value=value;
		this.next=null;
	}
	public entry() {
		this.next=null;
	}
	
	
	public int get_value() {
		return this.value;
	}

}
