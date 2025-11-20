package be.uantwerpen.sd.labs.lab3.singleton;

public class TicketService {
    public Ticket create(String title) {
        /*
            TODO: Create a Ticket with a new ID from the Singleton generator.
            TIP: Don't use `new IdGenerator`.
        */
        // Getting the generator .. if it already exists we get the old one
        IdGenerator generator = IdGenerator.getInstance();
        // Id gets the next id from the generator
        long id = generator.nextId();
        // Returnign both values in a ticket
        return new Ticket(id, title);
    }
}
