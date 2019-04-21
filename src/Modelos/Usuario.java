/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Principal.Home;
import Principal.InicioDeSesion;
import Principal.Productos;
import javax.swing.JFrame;

/**
 *
 * @author Luis Rondon
 */
public class Usuario extends Persona {

    protected String nombreUsuario;
    protected String contrasena;
    private String Usuarios[] = {"Luis", "Rondon"};
    private String Contrasenas[] = {"clave1", "clave2"};
    
    
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String telefono, String direccion, String email, String nombreUsuario, String contrasena) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Nuevo método para ver si dos usuarios son iguales.
    public boolean equals(Object otroUsuario) {
        Usuario usuario = (Usuario) otroUsuario;
        return (this.nombreUsuario == usuario.nombreUsuario);
    }
    
    //Agrege este metodo para inicio de sesion
    public void Session(String Usuario, String Contrasena){
        Home home = new Home();
        InicioDeSesion inicioDeSesion = new InicioDeSesion();
        
        if(Usuario.equals(this.Usuarios[0]) && Contrasena.equals(this.Contrasenas[0])){
           home.setVisible(true);
           inicioDeSesion.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }if(Usuario.equals(this.Usuarios[1]) && Contrasena.equals(this.Contrasenas[1])){
            home.setVisible(true);
            inicioDeSesion.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
    }
}
