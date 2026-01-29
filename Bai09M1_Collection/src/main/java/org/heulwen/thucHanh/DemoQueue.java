package org.heulwen.thucHanh;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.add("Frist");
        queue.add("Second");
        queue.add("Third");

        System.out.println("Queue: " + queue);
        System.out.println("Remove: " + queue.remove());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
