package com.siddharth;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TreeTraversal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Nodea a = new Nodea(1);
		a.left = new Nodea(2);
		a.right = new Nodea(3);
		a.left.left = new Nodea(4);
		a.left.right = new Nodea(5);
		a.right.left = new Nodea(6);
		a.right.right = new Nodea(7);
		// System.out.println("Levelorder traversal is : ");
		LeveLorder(a);
		System.out.println();
		spiraltraversal(a);
		System.out.println();
		Inorder(a);
		System.out.println();
		BottomToUpTreePrint(a);
		s.close();

	}

	public static void preorder(Nodea root) {
		if (root == null)
			return;
		Stack<Nodea> s = new Stack<Nodea>();
		// s.push(root);
		while (true) {
			if (root != null) {
				System.out.print(root.data + " ");
				s.push(root);
				root = root.left;
			} else {
				if (s.isEmpty())
					break;
				Nodea curr = s.peek();
				root = curr.right;
				s.pop();
			}
		}

	}

	public static void Postorder(Nodea root) {
		if (root != null) {
			Inorder(root.left);

			Inorder(root.right);
			System.out.print(root.data + " ");
		}
	}

	public static void Inorder(Nodea root) {
		if (root != null) {
			Inorder(root.left);
			System.out.print(root.data + " ");
			Inorder(root.right);
		}
	}

	public static void BottomToUpTreePrint(Nodea root) {
		if (root == null)
			return;
		Queue<Nodea> q = new LinkedList<>();
		Stack<Nodea> s = new Stack<>();
		q.add(root);
		while (!q.isEmpty()) {
			Nodea current = q.poll();
			if (current.right != null) {
				q.add(current.right);
			}
			if (current.left != null) {
				q.add(current.left);
			}
			s.push(current);

		}
		while (!s.isEmpty()) {
			System.out.print(s.peek().data + " ");
			s.pop();
		}

	}

	public static void spiraltraversal(Nodea root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		Stack<Nodea> s1 = new Stack<>();
		Stack<Nodea> s2 = new Stack<>();
		if (root.left != null) {

			s1.push(root.left);
		}
		if (root.right != null) {
			s1.push(root.right);
		}
		while (!s1.isEmpty() || !s2.isEmpty()) {
			while (!s1.isEmpty()) {
				Nodea current = s1.peek();
				System.out.print(current.data + " ");
				if (current.right != null) {
					s2.push(current.right);
				}
				if (current.left != null) {
					s2.push(current.left);

				}
				s1.pop();

			}
			while (!s2.isEmpty()) {
				Nodea curr = s2.peek();
				System.out.print(curr.data + " ");
				if (curr.left != null) {
					s1.push(curr.left);

				}
				if (curr.right != null) {
					s1.push(curr.right);
				}
				s2.pop();
			}
		}

	}

	public static void LeveLorder(Nodea root) {
		if (root == null)
			return;
		Queue<Nodea> q1 = new LinkedList<>();
		q1.add(root);
		while (!q1.isEmpty()) {
			Nodea current = q1.poll();
			System.out.print(current.data + " ");
			if (current.left != null) {
				q1.add(current.left);
			}
			if (current.right != null) {
				q1.add(current.right);
			}

		}

	}

}

class Nodea {
	Nodea left, right;
	int data;

	Nodea(int data) {
		this.data = data;

	}
}
