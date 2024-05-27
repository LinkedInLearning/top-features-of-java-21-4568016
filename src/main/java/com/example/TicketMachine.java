package com.example;

public class TicketMachine {

    public String getDetails(Ticket ticket) {
        if (ticket instanceof AdultTicket(double price)) {
            return "Adult ticket has price " + price;
        } else if (ticket instanceof ChildTicket(double price)) {
            return "Child ticket has price " + price;
        } else {
            return "Unknown ticket type";
        }
    }

}
