package com.graph.pojo;

import java.util.LinkedList;

public class Node {

	int weight;

	public Node(int weight, int balue) {
		//super();
		this.weight = weight;
		this.balue = balue;
	}

	int balue;
	
	
	public static void main(String[] args) {
		LinkedList<Node>[] linkedList=new LinkedList[5];
		
		Node node=new Node(3, 5);
		
		linkedList[0].add(node);
		
		
	}
	

}
