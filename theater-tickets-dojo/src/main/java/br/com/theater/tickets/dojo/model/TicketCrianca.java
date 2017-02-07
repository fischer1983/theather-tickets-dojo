
package br.com.theater.tickets.dojo.model;

import java.math.BigDecimal;

/**
 *
 * @author luciano
 */
public class TicketCrianca extends AbstractTicket{

    public TicketCrianca() {
        this.setValor(new BigDecimal("5.50"));
    }       
    
}
