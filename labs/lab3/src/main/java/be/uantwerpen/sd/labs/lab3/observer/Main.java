package be.uantwerpen.sd.labs.lab3.observer;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        /*
            TODO: Create an Auction, attach observers, then place a few bids to see notifications.
            TIP: auction.addObserver(new ConsoleAnnouncer()); ...
        */
        Auction auction = new Auction();
        auction.addObserver(new MaxBidTracker());
        auction.addObserver(new ConsoleAnnouncer());

        auction.place(new Bid("Alice", 100));
        auction.place(new Bid("Bob", 150));
        auction.place(new Bid("Charlie", 120)); // ignored, not higher
        auction.place(new Bid("Diana", 200));
    }
}
