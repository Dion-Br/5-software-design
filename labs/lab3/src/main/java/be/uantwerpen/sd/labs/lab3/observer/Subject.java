package be.uantwerpen.sd.labs.lab3.observer;

/*
TODO: Define how Observers subscribe and unsubscribe.
Methods you will implement:
  - void addObserver(Observer o)
  - void removeObserver(Observer o)
  - void notifyObservers(String event, Object payload)
TIP: Expose addObserver/removeObserver/notifyObservers.
*/
public interface Subject {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(String event, Object payload);
}