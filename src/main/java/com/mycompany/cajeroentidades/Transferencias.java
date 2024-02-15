package com.mycompany.cajeroentidades;

/**
 *
 * @author TeLesheo
 */
public class Transferencias extends Transaccion{

    private int id_transaccion;
    private int id_destino;

    public Transferencias() {
        super();
    }

    public Transferencias(int id_transaccion, int id_destino) {
        
        this.id_transaccion = id_transaccion;
        this.id_destino = id_destino;
    }
}
