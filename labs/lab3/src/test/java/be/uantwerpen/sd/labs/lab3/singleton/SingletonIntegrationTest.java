package be.uantwerpen.sd.labs.lab3.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api. Assertions.*;

class SingletonIntegrationTest {

    @Test
    void testTicketServiceUsesIdGeneratorSingleton() {
        // Create TicketService instance
        TicketService ticketService = new TicketService();

        // Create two tickets
        Ticket ticket1 = ticketService.create("First Ticket");
        Ticket ticket2 = ticketService.create("Second Ticket");

        // Verify tickets are created with sequential IDs from singleton
        assertNotNull(ticket1);
        assertNotNull(ticket2);
        assertEquals("First Ticket", ticket1.getTitle());
        assertEquals("Second Ticket", ticket2.getTitle());
        assertTrue(ticket2.getId() > ticket1.getId(), "Second ticket should have higher ID");

        // Verify singleton is being used (IDs are sequential)
        assertEquals(ticket1. getId() + 1, ticket2.getId(), "IDs should be sequential from singleton");
    }
}