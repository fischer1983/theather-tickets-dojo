package br.com.theater.tickets.dojo.model;

import java.math.BigDecimal;
import java.time.DayOfWeek;

/**
 *
 * @author luciano
 */
public abstract class AbstractVendaTicket<T extends AbstractTicket> /*implements ITicketVendavel*/{

    protected T ticket;

    public BigDecimal calculaPrecoVenda(DayOfWeek dayOfWeek, boolean isApresentouCarteirinhaEstudante) {
        BigDecimal valor = ticket.getValor();
        if (isApresentouCarteirinhaEstudante
                && ((!dayOfWeek.equals(DayOfWeek.SATURDAY))
                && (!dayOfWeek.equals(DayOfWeek.SUNDAY)))) {
            valor = this.calculaPrecoVendaEstudante();
            //Regra da Segunda - Válida para todos
        } else if (dayOfWeek.equals(DayOfWeek.MONDAY)) {
            valor = valor.multiply(new BigDecimal("0.90"));
        }
        return valor.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    protected BigDecimal calculaPrecoVendaEstudante() {
        BigDecimal valor = ticket.getValor();
        valor = valor.multiply(new BigDecimal("0.65"));
        return valor.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

}
