package be.uantwerpen.sd.labs.lab3.observer;


import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
TODO: Implement Subject and notify observers when a new bid arrives.
Fields you will need:
  - Set<Observer> observers
Methods you will implement:
  - void addObserver(Observer o)
  - void removeObserver(Observer o)
  - void notifyObservers(String event, Object payload)
  - void place(Bid bid)
TIP: Pick an event name (e.g., 'bidPlaced') and send the Bid as payload.
*/
public class Auction implements Subject {
    private Bid highest;
    private Set<Observer> observers = new HashSet<Observer>();

    public void place(Bid bid) {
        /*
            TODO: Accept a bid, update the highest bid when appropriate, and notify observers.
            TIP: Compare with current highest; notify with your chosen event name.
        */
        if (highest == null || bid.getAmount() > this.highest.getAmount()) {
            highest = bid;
        }
        this.notifyObservers("bidPlaced", bid);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String event, Object payload) {
        observers.forEach((o) -> {o.update(event, payload);});
    }

    public Bid highest() {
        return highest;
    }
}
