/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Modelos.Usuario;

/**
 *
 * @author Maidelys Dominguez y Dorelba Rivero
 */
public class TiendaOnline {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //Instancia Usuarios
        System.out.println("----------------Usuarios--------------------");
        //Usuario usuario = new Usuario();
//        usuario.Agregar("Maidelys ", "Dominguez", "04141551778", "Bna", "Maidelys.Dominguez@gmail.com", "MaidelysD", "12345");
//        usuario.Agregar("Dorelba ", "Rivero", "042454887", "PLC", "Dorelba.Rivero@gmail.com", "DorelbaR", "12345");
//        usuario.Buscar();

        //Instancia Productos
//        System.out.println("----------------Productos--------------------");
//        Productos producto = new Productos();
        //producto.Agregar(001, "Mouse", "Mouse usb", "Computacion", 100, 100.00);
        //producto.Agregar(002, "Teclado", "Teclado usb", "Computacion", 110, 140.00);
        //producto.Editar(002, "Teclado2", "Teclado usb2", "Computacion", 110, 145.00);
        //producto.Eliminar(002);
        //producto.Buscar();

        //Ventas
        System.out.println("----------------Ventas--------------------");
//        Ventas ventas = new Ventas();
//        ventas.Generar(001, "DorelbaR", 001, 2, 100.00, "2018-10-21");
//        ventas.Generar(002, "MaidelysD", 002, 2, 140.00, "2018-10-22");
//        ventas.Generar(003, "DorelbaR", 002, 2, 140.00, "2018-10-22");
//        ventas.Eliminar(002);
//        ventas.Buscar();
        
        //LLamar interface desktop
        //Productos tienda = new Productos();
        //tienda.show();
        
        InicioDeSesion inicioDeSesion = new InicioDeSesion();
        inicioDeSesion.setVisible(true);
    }

}
