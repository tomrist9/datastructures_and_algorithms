package main.java.stack;

import java.util.PriorityQueue;

public class SeatReservationManager {
    PriorityQueue<Integer> pq;

    public SeatReservationManager(int n) {

        pq = new PriorityQueue<>();
        for(int i=1; i<=n; i++){
            pq.offer(i);
        }
    }

    public int reserve() {
        Integer seat = pq.poll();

        return seat;
    }

    public void unreserve(int seatNumber) {

        pq.offer(seatNumber);

    }
}