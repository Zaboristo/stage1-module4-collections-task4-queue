package com.epam.collections.queue;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> sult = new PriorityQueue<>(Collections.reverseOrder());
        for(String e : firstList){
            sult.add(e);
        }
        for(String e : secondList){
            sult.add(e);
        }
        return sult;
    }
}
