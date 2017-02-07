package br.com.theather.tickets.dojo.model;

import br.com.theater.tickets.dojo.model.VendaTicketCrianca;
import br.com.theater.tickets.dojo.model.VendaTicketEstudante;
import br.com.theater.tickets.dojo.model.VendaTicketIdoso;
import java.math.BigDecimal;
import java.time.DayOfWeek;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luciano
 */
public class VendaTicketTest {

    @Test
    public void vendaTicketCriancaTest() {
        VendaTicketCrianca vendaCrianca = new VendaTicketCrianca();
        assertEquals(new BigDecimal("3.58"), vendaCrianca.calculaPrecoVenda(DayOfWeek.MONDAY, true));
        assertEquals(new BigDecimal("4.95"), vendaCrianca.calculaPrecoVenda(DayOfWeek.MONDAY, false));
        assertEquals(new BigDecimal("3.58"), vendaCrianca.calculaPrecoVenda(DayOfWeek.TUESDAY, true));
        assertEquals(new BigDecimal("4.68"), vendaCrianca.calculaPrecoVenda(DayOfWeek.TUESDAY, false));
        assertEquals(new BigDecimal("3.58"), vendaCrianca.calculaPrecoVenda(DayOfWeek.WEDNESDAY, true));
        assertEquals(new BigDecimal("3.85"), vendaCrianca.calculaPrecoVenda(DayOfWeek.WEDNESDAY, false));
        assertEquals(new BigDecimal("3.58"), vendaCrianca.calculaPrecoVenda(DayOfWeek.THURSDAY, true));
        assertEquals(new BigDecimal("5.50"), vendaCrianca.calculaPrecoVenda(DayOfWeek.THURSDAY, false));
        assertEquals(new BigDecimal("3.58"), vendaCrianca.calculaPrecoVenda(DayOfWeek.FRIDAY, true));
        assertEquals(new BigDecimal("4.90"), vendaCrianca.calculaPrecoVenda(DayOfWeek.FRIDAY, false));
        assertEquals(new BigDecimal("5.50"), vendaCrianca.calculaPrecoVenda(DayOfWeek.SATURDAY, true));
        assertEquals(new BigDecimal("5.50"), vendaCrianca.calculaPrecoVenda(DayOfWeek.SATURDAY, false));
        assertEquals(new BigDecimal("5.50"), vendaCrianca.calculaPrecoVenda(DayOfWeek.SUNDAY, true));
        assertEquals(new BigDecimal("5.50"), vendaCrianca.calculaPrecoVenda(DayOfWeek.SUNDAY, false));
    }

    @Test
    public void vendaTicketEstudanteTest() {
        VendaTicketEstudante vendaEstudante = new VendaTicketEstudante();
        assertEquals(new BigDecimal("5.20"), vendaEstudante.calculaPrecoVenda(DayOfWeek.MONDAY, true));
        assertEquals(new BigDecimal("7.20"), vendaEstudante.calculaPrecoVenda(DayOfWeek.MONDAY, false));
        assertEquals(new BigDecimal("5.20"), vendaEstudante.calculaPrecoVenda(DayOfWeek.TUESDAY, true));
        assertEquals(new BigDecimal("7.60"), vendaEstudante.calculaPrecoVenda(DayOfWeek.TUESDAY, false));
        assertEquals(new BigDecimal("5.20"), vendaEstudante.calculaPrecoVenda(DayOfWeek.WEDNESDAY, true));
        assertEquals(new BigDecimal("4.00"), vendaEstudante.calculaPrecoVenda(DayOfWeek.WEDNESDAY, false));
        assertEquals(new BigDecimal("5.20"), vendaEstudante.calculaPrecoVenda(DayOfWeek.THURSDAY, true));
        assertEquals(new BigDecimal("5.60"), vendaEstudante.calculaPrecoVenda(DayOfWeek.THURSDAY, false));
        assertEquals(new BigDecimal("5.20"), vendaEstudante.calculaPrecoVenda(DayOfWeek.FRIDAY, true));
        assertEquals(new BigDecimal("8.00"), vendaEstudante.calculaPrecoVenda(DayOfWeek.FRIDAY, false));
        assertEquals(new BigDecimal("8.00"), vendaEstudante.calculaPrecoVenda(DayOfWeek.SATURDAY, true));
        assertEquals(new BigDecimal("8.00"), vendaEstudante.calculaPrecoVenda(DayOfWeek.SATURDAY, false));
        assertEquals(new BigDecimal("8.00"), vendaEstudante.calculaPrecoVenda(DayOfWeek.SUNDAY, true));
        assertEquals(new BigDecimal("8.00"), vendaEstudante.calculaPrecoVenda(DayOfWeek.SUNDAY, false));
    }

    @Test
    public void vendaTicketIdosoTest() {
        VendaTicketIdoso vendaIdoso = new VendaTicketIdoso();
        assertEquals(new BigDecimal("3.90"), vendaIdoso.calculaPrecoVendaFeriado(true));
        assertEquals(new BigDecimal("5.70"), vendaIdoso.calculaPrecoVendaFeriado(false));

        assertEquals(new BigDecimal("3.90"), vendaIdoso.calculaPrecoVenda(DayOfWeek.MONDAY, true));
        assertEquals(new BigDecimal("5.40"), vendaIdoso.calculaPrecoVenda(DayOfWeek.MONDAY, false));
        assertEquals(new BigDecimal("3.90"), vendaIdoso.calculaPrecoVenda(DayOfWeek.TUESDAY, true));
        assertEquals(new BigDecimal("5.10"), vendaIdoso.calculaPrecoVenda(DayOfWeek.TUESDAY, false));
        assertEquals(new BigDecimal("3.90"), vendaIdoso.calculaPrecoVenda(DayOfWeek.WEDNESDAY, true));
        assertEquals(new BigDecimal("3.60"), vendaIdoso.calculaPrecoVenda(DayOfWeek.WEDNESDAY, false));
        assertEquals(new BigDecimal("3.90"), vendaIdoso.calculaPrecoVenda(DayOfWeek.THURSDAY, true));
        assertEquals(new BigDecimal("4.20"), vendaIdoso.calculaPrecoVenda(DayOfWeek.THURSDAY, false));
        assertEquals(new BigDecimal("3.90"), vendaIdoso.calculaPrecoVenda(DayOfWeek.FRIDAY, true));
        assertEquals(new BigDecimal("6.00"), vendaIdoso.calculaPrecoVenda(DayOfWeek.FRIDAY, false));
        assertEquals(new BigDecimal("5.70"), vendaIdoso.calculaPrecoVenda(DayOfWeek.SATURDAY, true));
        assertEquals(new BigDecimal("5.70"), vendaIdoso.calculaPrecoVenda(DayOfWeek.SATURDAY, false));
        assertEquals(new BigDecimal("5.70"), vendaIdoso.calculaPrecoVenda(DayOfWeek.SUNDAY, true));
        assertEquals(new BigDecimal("5.70"), vendaIdoso.calculaPrecoVenda(DayOfWeek.SUNDAY, false));
    }
}
