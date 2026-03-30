/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionprestamoslibros;

/**
 *
 * @author Usuario
 */
public class Libro {
   
    

    private String codigo, titulo, autor, localizacion, signatura;
    private boolean prestado;

    public Libro(String codigo, String titulo, String autor, String localizacion, String signatura,
            boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }
    
    public Libro(String codigo, String titulo, String autor,
            boolean prestado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }
    
    public Libro(String codigo, String titulo, String autor          ) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSignatura() {
        return signatura;
    }

    public void setSignatura(String signatura) {
        this.signatura = signatura;
    }

    public boolean estaDisponible() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    
    
    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", prestado=" + prestado + '}';
    }
    
    
    

}


