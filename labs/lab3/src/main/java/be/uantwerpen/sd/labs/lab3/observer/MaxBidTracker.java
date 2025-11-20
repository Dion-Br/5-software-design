package be.uantwerpen.sd.labs.lab3.observer;

import java.util.Objects;

/*
TODO: Track and print the current maximum bid.
Methods you will implement:
  - void update(String event, Object payload)
TIP: Keep an int field; update it when a higher bid arrives.
*/
public class MaxBidTracker implements Observer {
    private int max = 0;

    @Override
    public void update(String event, Object payload){
        if (Objects.equals(event, "bidPlaced") && payload instanceof Bid bid) {
            if (this.getMax() < bid.getAmount()) {
                this.max = bid.getAmount();
            }
            System.out.println("Current max bid: " + this.getMax());
        }
    }
    public int getMax() {
        return max;
    }
}
