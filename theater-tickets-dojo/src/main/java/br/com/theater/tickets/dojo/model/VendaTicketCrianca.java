package br.com.theater.tickets.dojo.model;

import java.math.BigDecimal;
import java.time.DayOfWeek;

/**
 *
 * @author luciano
 */
public class VendaTicketCrianca extends AbstractVendaTicket<TicketCrianca> {

    public VendaTicketCrianca() {
        this.ticket = new TicketCrianca();
    }

    @Override
    public BigDecimal calculaPrecoVenda(DayOfWeek dayOfWeek, boolean isApresentouCarteirinhaEstudante) {
        BigDecimal valor = this.ticket.getValor();
        if (isApresentouCarteirinhaEstudante) {
            valor = super.calculaPrecoVenda(dayOfWeek, isApresentouCarteirinhaEstudante);
        } else if (dayOfWeek.equals(DayOfWeek.TUESDAY)) {
            valor = valor.multiply(new BigDecimal("0.85"));
        } else if (dayOfWeek.equals(DayOfWeek.WEDNESDAY)) {
            valor = valor.multiply(new BigDecimal("0.70"));
        } else if (dayOfWeek.equals(DayOfWeek.FRIDAY)) {
            valor = valor.multiply(new BigDecimal("0.89"));
        } else {
            valor = super.calculaPrecoVenda(dayOfWeek, isApresentouCarteirinhaEstudante);
        }
        return valor.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

}
