package br.com.theater.tickets.dojo.model;

import java.math.BigDecimal;

/**
 *
 * @author luciano
 */
public class TicketIdoso extends AbstractTicket {

    public TicketIdoso() {
        this.setValor(new BigDecimal("6.00"));
    }
}
