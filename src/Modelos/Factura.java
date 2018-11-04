/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Abstraccion.Operaciones;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Maidelys Dominguez y Dorelba Rivero
 */
public class Factura extends Operaciones{
    private ArrayList<Factura> arrayListFacturas;
        
    protected int codigo;
    protected double total;
    protected LocalDateTime fecha;

    public Factura() {
        arrayListFacturas = new ArrayList<>();
    }

    public Factura(int codigo, double total, LocalDateTime fecha) {
        this.codigo = codigo;
        this.total = total;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    // Nuevo método para ver si dos facturas son iguales.
    public boolean equals(Object otraFactura) {
         Factura factura = (Factura) otraFactura;
        return (this.codigo == factura.codigo);
    }
    
    //Implementacion de la abstraccion y polimorfismo
    @Override
    public ArrayList Agregar(Object object) {
        Factura factura = (Factura) object;
        arrayListFacturas.add(factura);
        return arrayListFacturas;
    }

    @Override
    public ArrayList Buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList Editar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
