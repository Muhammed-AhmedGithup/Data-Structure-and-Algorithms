package com.dsa;

public class heaptree {
	
	private int size,maxsize;
	private int[]heap;

	public heaptree(int size) {
		// TODO Auto-generated constructor stub
		this.size=0;
		this.maxsize=size;
		this.heap=new int[size];
	}
	
	private void swap(int x,int  y) {
		int h=heap[x];
		heap[x]=heap[y];
		heap[y]=h;
	}
	
	
	private boolean isleaf(int po) {
		if((po+1)*2>size&&po<=size)return true;
		else return false;
	}
	private int p(int po) {return (po-1)/2;}
	private int right(int po) {return (po*2)+2;}
	
	private int left(int po) {return (po*2)+1;}
	
	public void insert(int e) {
		if(size==maxsize) {
			System.out.println("the heap is full");
			return;
		}
		heap[size]=e;
		int c=size;
		while(heap[c]>heap[p(c)]) {
			swap(c, p(c));
			c=p(c);
		}
		size++;
	}
	
	
	private void heapmodfy(int e) {
		if(isleaf(e))return;
		
		if(heap[e]<heap[right(e)]||heap[e]<heap[left(e)]) {
			if(heap[left(e)]<heap[right(e)]) {
				swap(e,right(e));
				heapmodfy(right(e));
			}
			else {
				swap(e,left(e));
				heapmodfy(left(e));
			}
		}
	}
	
	public void pop() {
		heap[0]=heap[--size];
		heapmodfy(0);
	}
	
	
	public void print() {
		for(int i=0;i<size;i++) {
			System.out.print(heap[i]+" ");
		}
	}
	
	

}
