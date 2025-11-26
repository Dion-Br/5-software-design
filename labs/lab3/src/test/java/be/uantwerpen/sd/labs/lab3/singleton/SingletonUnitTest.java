package be.uantwerpen.sd.labs.lab3.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api. Assertions.*;

class SingletonUnitTest {

    @Test
    void ticketConstructorSetsIdAndTitle() {
        Ticket ticket = new Ticket(1L, "Test ticket");
        assertEquals(1L, ticket.getId());
        assertEquals("Test ticket", ticket.getTitle());
    }

    @Test
    void ticketGettersReturnCorrectValues() {
        Ticket ticket = new Ticket(42L, "Printer broken");
        assertEquals(42L, ticket.getId());
        assertEquals("Printer broken", ticket.getTitle());
    }

    @Test
    void ticketSettersUpdateValues() {
        Ticket ticket = new Ticket(1L, "Original title");

        ticket.setId(99L);
        ticket.setTitle("Updated title");

        assertEquals(99L, ticket.getId());
        assertEquals("Updated title", ticket. getTitle());
    }

    @Test
    void idGeneratorReturnsSameInstance() {
        IdGenerator gen1 = IdGenerator.getInstance();
        IdGenerator gen2 = IdGenerator.getInstance();

        assertSame(gen1, gen2, "getInstance() should return the same instance");
    }

    @Test
    void ticketServiceCreatesTicketWithTitle() {
        TicketService service = new TicketService();
        Ticket ticket = service. create("Test issue");

        assertNotNull(ticket);
        assertEquals("Test issue", ticket.getTitle());
        assertTrue(ticket.getId() > 0, "Ticket ID should be positive");
    }
}