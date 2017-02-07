package br.com.theater.tickets.dojo.model;

import java.math.BigDecimal;
import java.time.DayOfWeek;

/**
 *
 * @author luciano
 */
public class VendaTicketEstudante extends AbstractVendaTicket<TicketEstudante> {

    public VendaTicketEstudante() {
        this.ticket = new TicketEstudante();
    }

    @Override
    public BigDecimal calculaPrecoVenda(DayOfWeek dayOfWeek, boolean isApresentouCarteirinhaEstudante) {
        BigDecimal valor = this.ticket.getValor();
        if (isApresentouCarteirinhaEstudante
                && ((!dayOfWeek.equals(DayOfWeek.SATURDAY))
                && (!dayOfWeek.equals(DayOfWeek.SUNDAY)))) {
            valor = super.calculaPrecoVenda(dayOfWeek, isApresentouCarteirinhaEstudante);
        } else if (dayOfWeek.equals(DayOfWeek.TUESDAY)) {
            valor = valor.multiply(new BigDecimal("0.95"));
        } else if (dayOfWeek.equals(DayOfWeek.WEDNESDAY)) {
            valor = valor.multiply(new BigDecimal("0.50"));
        } else if (dayOfWeek.equals(DayOfWeek.THURSDAY)) {
            valor = valor.multiply(new BigDecimal("0.70"));
        } else {
            valor = super.calculaPrecoVenda(dayOfWeek, isApresentouCarteirinhaEstudante);
        }
        return valor.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

}
