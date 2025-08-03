package com.guzenko.test.gueue_interface;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(1);
        pq.add(7);
        pq.add(9);
        pq.add(8);

        System.out.println("Внутреннее состояние кучи: " + pq);
        /*Внутреннее состояние кучи: [1, 4, 7, 9, 8]
        PriorityQueue не сортирует в привычном понимании для человека
        но удалять или получать будет как раз в приоритетном порядке

        Извлекаем элементы по одному:
            1
            4
            7
            8
        */

        System.out.println("\nИзвлекаем элементы по одному:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Всегда будет извлекаться наименьший элемент
        }
    }
}
