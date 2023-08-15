package com.dsa;


import java.util.Arrays;

public class dynamicarray<t> {
	
	Object[]arr;
	int size;
	
	public dynamicarray() {
		
		size=0;
		arr=new Object[1];
	}
	
	
	public int size() {
		return size;
	}
	public void push_back(t e) {
		sur(size);
		arr[size++]=e;
	}
	
	public void sur(int e) {
		int o_size=arr.length;
		int s=e;
		int newsize=arr.length;
		if(o_size>s)newsize=o_size;
		else {
			newsize=s+1;
		}
		arr=Arrays.copyOf(arr, newsize);
		
		
	}
	 
	public void print() {
		for(int i=0;i<arr.length;i++)System.out.print(arr[i]+" ");
	}

}
