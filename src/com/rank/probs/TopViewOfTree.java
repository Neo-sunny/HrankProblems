package com.rank.probs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TopViewOfTree {

	TreeNode root;
	public TopViewOfTree(){
		root=null;
	}
	public TopViewOfTree(TreeNode n){
		this.root=null;
	}
	
	void printTopViewOf(){
		if(root== null){
			return;
		}
		Set<Integer> hDistance= new HashSet<>();
		Queue<QItem> nodes= new LinkedList<>();
		
	}
	
	
}

class TreeNode{
	int key;
	TreeNode left, right;
	public TreeNode(int k){
		this.key=k;
		left=right=null;
	}
}
class QItem{
	TreeNode node;
	int hd;
	public QItem(TreeNode n, int dist){
		this.node=n;
		this.hd=dist;
	}
}