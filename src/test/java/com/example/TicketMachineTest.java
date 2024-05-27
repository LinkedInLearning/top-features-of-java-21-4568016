package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicketMachineTest {

    @Test
    void testGetAdultTicketDetails() {
        TicketMachine ticketMachine = new TicketMachine();
        String result = ticketMachine.getDetails(new AdultTicket(28));
        assertEquals("Adult ticket has price 28.0", result);
    }

    @Test
    void testGetChildTicketDetails() {
        TicketMachine ticketMachine = new TicketMachine();
        String result = ticketMachine.getDetails(new ChildTicket(14));
        assertEquals("Child ticket has price 14.0", result);
    }

}
