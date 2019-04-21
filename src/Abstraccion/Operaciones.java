/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraccion;

import java.util.ArrayList;

/**
 *
 * @author Luis Rondon
 */
public abstract class Operaciones {
    public abstract ArrayList Agregar(Object object);
    public abstract ArrayList Buscar();
    public abstract ArrayList Editar(Object object);
    public abstract void Eliminar();
}
