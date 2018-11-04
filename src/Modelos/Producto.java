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
public class Producto extends Operaciones{
    private ArrayList<Producto> arrayListProductos;
    
    //Atributos
    protected int codigo;
    protected String nombre;
    protected String descripcion;
    protected String categoria;
    protected int cantidad;
    protected double precio;
    protected LocalDateTime fecha;

    //Metodos constructor
    public Producto() {
        arrayListProductos = new ArrayList<>();
    }

    //Sobrecarga del constructor
    public Producto(int codigo, String nombre, String descripcion,
        String categoria, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    //Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    // Nuevo método para ver si dos productos son iguales.
    public boolean equals(Object otroProducto) {
        Producto producto = (Producto) otroProducto;
        return (this.codigo == producto.codigo);
    }
    
    //Implementacion de la abstraccion y polimorfismo
    @Override
    public ArrayList Agregar(Object object) {
        Producto producto = (Producto) object;
        arrayListProductos.add(producto);
        return arrayListProductos;
    }

    @Override
    public ArrayList Buscar() {
        return arrayListProductos;
    }

    @Override
    public ArrayList Editar(Object object) {
        Producto producto = (Producto) object;
        arrayListProductos.set(producto.getCodigo(), producto);
        return arrayListProductos;
    }

    @Override
    public void Eliminar() {
        
    }
}
