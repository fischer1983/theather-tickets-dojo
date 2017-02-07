package br.com.theater.tickets.dojo.model;

import java.math.BigDecimal;
import java.time.DayOfWeek;

/**
 *
 * @author luciano
 */
public class VendaTicketIdoso extends AbstractVendaTicket<TicketIdoso> {

    public VendaTicketIdoso() {
        this.ticket = new TicketIdoso();
    }

    public BigDecimal calculaPrecoVendaFeriado(boolean isApresentouCarteirinhaEstudante) {
        BigDecimal valor = this.ticket.getValor();
        if (isApresentouCarteirinhaEstudante) {
            valor = this.calculaPrecoVendaEstudante();
        } else {
            valor = valor.multiply(new BigDecimal("0.95"));
        }
        return valor.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public BigDecimal calculaPrecoVenda(DayOfWeek dayOfWeek, boolean isApresentouCarteirinhaEstudante) {
        BigDecimal valor = this.ticket.getValor();
        if (isApresentouCarteirinhaEstudante
                && ((!dayOfWeek.equals(DayOfWeek.SATURDAY))
                && (!dayOfWeek.equals(DayOfWeek.SUNDAY)))) {
            valor = super.calculaPrecoVenda(dayOfWeek, isApresentouCarteirinhaEstudante);
        } else if (dayOfWeek.equals(DayOfWeek.TUESDAY)) {
            valor = valor.multiply(new BigDecimal("0.85"));
        } else if (dayOfWeek.equals(DayOfWeek.WEDNESDAY)) {
            valor = valor.multiply(new BigDecimal("0.60"));
        } else if (dayOfWeek.equals(DayOfWeek.THURSDAY)) {
            valor = valor.multiply(new BigDecimal("0.70"));
        } else if (dayOfWeek.equals(DayOfWeek.SATURDAY)) {
            valor = valor.multiply(new BigDecimal("0.95"));
        } else if (dayOfWeek.equals(DayOfWeek.SUNDAY)) {
            valor = valor.multiply(new BigDecimal("0.95"));
        } else {
            valor = super.calculaPrecoVenda(dayOfWeek, isApresentouCarteirinhaEstudante);
        }
        return valor.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

}
