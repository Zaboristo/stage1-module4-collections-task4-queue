package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> sult = new ArrayDeque<>();
        sult.add(firstQueue.remove());
        sult.add(firstQueue.remove());
        sult.add(secondQueue.remove());
        sult.add(secondQueue.remove());
        while(!(firstQueue.isEmpty()) && !(secondQueue.isEmpty())){
            firstQueue.add(sult.removeLast());
            sult.add(firstQueue.remove());
            sult.add(firstQueue.remove());
            secondQueue.add(sult.removeLast());
            sult.add(secondQueue.remove());
            sult.add(secondQueue.remove());
        }

        return sult;
    }
}
