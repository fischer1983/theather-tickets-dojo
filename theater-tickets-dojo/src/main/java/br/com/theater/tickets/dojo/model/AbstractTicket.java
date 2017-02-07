package br.com.theater.tickets.dojo.model;


import java.math.BigDecimal;

/**
 *
 * @author luciano
 */
public abstract class AbstractTicket {
    
    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }        
    
}
