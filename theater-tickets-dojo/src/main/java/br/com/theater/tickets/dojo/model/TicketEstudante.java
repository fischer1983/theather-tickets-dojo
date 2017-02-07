package br.com.theater.tickets.dojo.model;

import java.math.BigDecimal;

/**
 *
 * @author luciano
 */
public class TicketEstudante extends AbstractTicket {

    public TicketEstudante() {
        this.setValor(new BigDecimal("8.00"));
    }

}
