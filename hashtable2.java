package com.dsa;

public class hashtable2 {
	
	
	
	int size;
	entry[] a;

	public hashtable2(int size) {
		// TODO Auto-generated constructor stub
		this.size=size;
		a=new entry[this.size];
		for(int i=0;i<a.length;i++)a[i]=new entry();
	}
	
	int get_hash(int k) {
		return k%size;
	}
	
	public void emplace(int k,int value) {
		int id=get_hash(k);
		entry n=a[id];
		entry ne=new entry(k,value);
		n.next=ne;
		
	}
	
	public int  get_value(int k) {
		int id=get_hash(k);
		entry n=a[id];
		if(n.next==null) {
			return -1;
		}
		return n.next.value;
		
	}
	
	

}
