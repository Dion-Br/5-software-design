package be.uantwerpen.sd.labs.lab3.singleton;

/*
TODO: Turn this into a Singleton that hands out increasing IDs.
Fields you will need:
  - IdGenerator INSTANCE
Methods you will implement:
  - IdGenerator getInstance()
TIP: Make sure to define the constructor and variables correctly. A counter field; nextId() returns the next value.
*/
public class IdGenerator {
    private static IdGenerator instance;
    private long counter = 0;

    private IdGenerator() {
        
    }

    public static synchronized IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }

    public long nextId() {
        return ++counter;
    }
}