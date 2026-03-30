/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionprestamoslibros;

import java.util.ArrayList;

public class Usuario extends Persona {

    private ArrayList<Libro> librosPrestados;

    public Usuario(String numero, String nombre, String direccion, String telefono) {
        super(numero, nombre, direccion, telefono); 
        this.librosPrestados = new ArrayList<>();
    }

    // Métodos propios
    public void agregarLibroPrestado(Libro libro) {
        librosPrestados.add(libro);
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "numero=" + numero +
                ", nombre=" + nombre +
                ", direccion=" + direccion +
                ", telefono=" + telefono +
                '}';
    }
}

    
