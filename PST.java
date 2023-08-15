package com.dsa;

public class PST {
	
	pstnode root;
	
	public PST() {
		root=null;
	}
	
	void insert(int e) {
		pstnode p=root;
		pstnode prev=null;
		while(p!=null) {
			prev=p;
			if(p.key<e)p=p.right;
			else p=p.left;
		}
		
		if(root==null)root=new pstnode(e);
		else {
			if(prev.key<e)prev.right=new pstnode(e);
			else prev.left=new pstnode(e);
		}
	}
	
	private void inorderoot(pstnode e) {
		if(e==null)return;
		inorderoot(e.left);
		System.out.print(e.key+" ");
		inorderoot(e.right);
		
	}
	
	public void inorder() {
		inorderoot(root);
	}
	
	public void delet_merge(int e) {
		pstnode p=root,prev=null,node,temp;
		
		while(p!=null&&p.key!=e) {
			prev=p;
			if(p.key<e)p=p.right;
			else p=p.left;
		}
		
		node =p;
		if(p!=null&&p.key==e) {
			
			if(node.right==null)node=node.left;
			else if(node.left==null)node=node.right;
			else {
				temp=node.left;
				while(temp.right!=null)temp=temp.right;
				
				temp.right=node.right;
				node=node.left;
				
				
			}
			if(p==root)root=node;
			else if(prev.right==p) {
				prev.right=node;
			}
			else prev.left=node;
			
		}
		else if(root!=null) {
			System.out.println("this element not found in tree");
		}
		else {
			System.out.println("this tree is empty");
		}
	}
	

}
