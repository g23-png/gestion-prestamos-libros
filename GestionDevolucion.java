/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionprestamoslibros;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */

/*
 public Prestamo(String codigoLibro, String numeroUsuario, LocalDateTime fecha) {
        this.codigoLibro = codigoLibro;
        this.numeroUsuario = numeroUsuario;
        this.fecha = fecha;
    }
*/

public class GestionDevolucion {
  private  static ArrayList<Devolucion> archivoDeDevolucion =new ArrayList<>();
  private  static ArrayList<Prestamo> archivoDePrestamo =new ArrayList<>();
    
     public static void solicitarDatosParaRegistrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese id del Usuario: ");
        String idusuario = sc.nextLine();
        System.out.println("Ingrese el Codigo de Libro: ");
        String codigo = sc.nextLine();
        
       GestionDevolucion.devolverLibro(idusuario, codigo);
       
    }
    
     // Método para agregar un nuevo libro
    public static void registrar(Devolucion devolucion) {
       

        archivoDeDevolucion.add(devolucion);
        
        System.out.println("Prestamo  registrado: " + devolucion.getNumeroSocio() + " con IDLibro " + devolucion.getCodigoLibro());
    }
     
    /*
     
      private static  Prestamo buscarPrestamo(String idUsuario,String codigo) {
        for (Prestamo prestamo : archivoDePrestamo) {
            if (prestamo.getNumeroSocio().equalsIgnoreCase(idUsuario) && prestamo.getCodigoLibro().equalsIgnoreCase(codigo)) {
                return prestamo;
            }
        }
        return null;
    }
     */
    
      
      
      // Método para devolver un libro
    public static void devolverLibro(String idUsuario, String idLibro) {
        Usuario usuario = GestionUsuario.buscarUsuario(idUsuario);
        Libro libro = GestionLibro.buscarLibro(idLibro);
        //Prestamo prestamo =GestionPrestamo.
        if (usuario != null && libro != null) {
            if (libro.estaDisponible()) {
                 
                libro.setPrestado(false);
                usuario.devolverLibro(libro);
                System.out.println(102);
                Prestamo prestamo=GestionDevolucion.buscarPrestamo(idUsuario, idLibro);
                System.out.println(103);
               archivoDePrestamo.remove(prestamo);
               GestionDevolucion.registrar(new Devolucion(idLibro,idUsuario,LocalDateTime.now() ));
               
                System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto por " + usuario.getNombre());
            } else {
                System.out.println("El libro no estaba prestado.");
            }
        } else {
            System.out.println("Usuario o libro no encontrado.");
        }
        
    }
    
    private static  Prestamo buscarPrestamo(String idUsuario,String codigo) {
        
        for (Prestamo prestamo : archivoDePrestamo)
        {
            System.out.println(" usuario antes =  " + idUsuario  + "libro  " + codigo);
            if (prestamo.getNumeroSocio().equalsIgnoreCase(idUsuario) && prestamo.getCodigoLibro().equalsIgnoreCase(codigo)) {
                System.out.println(" usuario antes =  " + idUsuario  + "libro  " + codigo);
                return prestamo;
            }
        }
        return null;
    }
    

}
