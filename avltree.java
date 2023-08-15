package com.dsa;






public class avltree {
	
	private class nodev {
		nodev rightchild,leftchild;
		
		int h,value;
		public nodev(int e) {
			rightchild=leftchild=null;
			h=0;
			value=e;
		}
		
	}
	
	private nodev root;

	public avltree() {
		// TODO Auto-generated constructor stub
		root=null;
	}
	
	private int height(nodev e) {
		return e==null?-1:0;
	}
	
	private int maxheight(int e,int e1) {
		return e1>e?e1:e;
	}
	
	
	
	private nodev insert(nodev n,int e) {
		
		if(n==null)return new nodev(e);
		else if(n.value<e) {
			n.rightchild=insert(n.rightchild, e);
			if(height(n.rightchild)-height(n.leftchild)==2) {
				if(n.rightchild.value<e) {
					n=rotetright(n);
				}
				else {
					n=doubleroteteright(n);
				}
			}
		}
		else {
			n.leftchild=insert(n.leftchild, e);
			if(height(n.rightchild)-height(n.leftchild)==2) {
				if(n.rightchild.value>e) {
					n=rotetleft(n);
				}
				else {
					n=doubleroteteleft(n);
				}
			}
		}
		n.h=maxheight(height(n.rightchild),height(n.leftchild))+1;
		return n;
	}
	
	public void insert_e(int e) {
		if(root==null)root=insert(root, e);
		else insert(root, e);
	}
	
	private void in_order(nodev e) {
		if(e==null)return;
		in_order(e.leftchild);
		System.out.print(e.value+" ");
		in_order(e.rightchild);
	}
	
	public void inordertransver() {
		in_order(root);
	}
	
	private nodev rotetright(nodev e) {
		nodev v=e.rightchild;
		e.rightchild=v.leftchild;
		v.leftchild=e;
		v.h=maxheight(height(v.rightchild),height(v.leftchild))+1;
		e.h=maxheight(height(e.rightchild),height(e.leftchild))+1;
		return v;
	}
	
	private nodev rotetleft(nodev e) {
		nodev v=e.leftchild;
		e.leftchild=v.rightchild;
		v.rightchild=e;
		v.h=maxheight(height(v.rightchild),height(v.leftchild))+1;
		e.h=maxheight(height(e.rightchild),height(e.leftchild))+1;
		return v;
	}
	
	private nodev doubleroteteright(nodev v) {
		 v=rotetleft(v.rightchild);
		return rotetright(v);
	}
	
	private nodev doubleroteteleft(nodev v) {
		 v=rotetright(v.rightchild);
		return rotetleft(v);
	}

}
