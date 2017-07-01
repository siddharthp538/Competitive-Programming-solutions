package com.siddharth;

import java.util.Scanner;

public class Pattern {
	static int sum = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Node a = new Node(1);
		a.left = new Node(2);
		
		System.out.println(GetSize(a, sum));

	}

	public static int GetSize(Node a, int sum) {
		if (a == null)
			return sum;
		
		sum=GetSize(a.left, sum);
		sum=GetSize(a.right, sum);
		sum++;

		return sum;
	}

}

class Node {
	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
	}
}