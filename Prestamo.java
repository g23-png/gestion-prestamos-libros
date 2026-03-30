/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionprestamoslibros;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */

class Prestamo {

    private String codigoLibro, numeroUsuario;
    private LocalDateTime fecha;

    public Prestamo(String codigoLibro, String numeroUsuario, LocalDateTime fecha) {
        this.codigoLibro = codigoLibro;
        this.numeroUsuario = numeroUsuario;
        this.fecha = fecha;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getNumeroSocio() {
        return numeroUsuario;
    }

    public void setNumeroSocio(String numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getFechaFormateada() {
        String formato = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
        return formateador.format(this.fecha);
    }

    @Override
    public String toString() {
        return "Prestamo{" + "codigoLibro=" + codigoLibro + ", numeroUsuario=" + numeroUsuario + ", fecha="
                + this.getFechaFormateada() + '}';
    }

}