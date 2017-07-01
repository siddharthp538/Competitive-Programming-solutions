package com.siddharthapril17;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new MyCompartor());

		priorityQueue.add(6);
		priorityQueue.add(12);
		priorityQueue.add(-1);

		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());

	}

}

class MyCompartor implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		if (o1.intValue() < o2.intValue()) {

			return 1;
		} else if (o1.intValue() == o2.intValue()) {

			return 0;
		} else {
			return -1;
		}
	}

}
