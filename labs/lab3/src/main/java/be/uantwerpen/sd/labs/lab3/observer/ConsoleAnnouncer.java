package be.uantwerpen.sd.labs.lab3.observer;

import java.util.Objects;

/*
TODO: Announce new bids in the console.
Methods you will implement:
  - void update(String event, Object payload)
TIP: If event equals your chosen name (e.g., 'bidPlaced'), print bidder and amount.
*/
public class ConsoleAnnouncer implements Observer {
    @Override
    public void update(String event, Object payload) {
        if (Objects.equals(event, "bidPlaced") && payload instanceof Bid bid) {
            System.out.println("New bid placed by " + bid.getBidder() + " for amount " + bid.getAmount());
        }
    }
}
