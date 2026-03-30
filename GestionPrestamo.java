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

public class GestionPrestamo {
  private  static ArrayList<Prestamo> archivoDePrestamo =new ArrayList<>();
    
     public static void solicitarDatosParaRegistrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese id del Usuario: ");
        String idusuario = sc.nextLine();
        System.out.println("Ingrese el Codigo de Libro: ");
        String codigo = sc.nextLine();
        
       GestionPrestamo.prestarLibro(idusuario, codigo);
       
    }
    
     // Método para agregar un nuevo libro
    public static void registrar(Prestamo prestamo) {
       

        archivoDePrestamo.add(prestamo);
        System.out.println("Tamano del archivo  " + archivoDePrestamo.size());
          System.out.println( archivoDePrestamo);
        
        System.out.println("Prestamo  registrado: " + prestamo.getNumeroSocio() + " con IDLibro " + prestamo.getCodigoLibro());
    }
      public static  void prestarLibro(String idUsuario, String idLibro) {
        Usuario usuario = GestionUsuario.buscarUsuario(idUsuario);
        Libro libro = GestionLibro.buscarLibro(idLibro) ;
       // Prestamo prestamo=GestionPrestamo.buscarPrestamo(idUsuario, idLibro);
        if (usuario != null && libro != null) {
            if (!libro.estaDisponible() && usuario.getLibrosPrestados().size() < 3) {
                libro.setPrestado(true);
                usuario.agregarLibroPrestado(libro);
                GestionPrestamo.registrar(new Prestamo(idLibro,idUsuario,LocalDateTime.now() ));
        System.out.println("Registrado exitosamente");
                System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado a " + usuario.getNombre());
            } else {
                System.out.println("El libro ya está prestado o el usuario supera el numero de libros prestados que es tres.");
            }
        } else {
            System.out.println("Usuario o libro no encontrado.");
        }
    }
      private static  Prestamo buscarPrestamo(String idUsuario,String codigo) {
        for (Prestamo prestamo : archivoDePrestamo) {
            if (prestamo.getNumeroSocio().equalsIgnoreCase(idUsuario) && prestamo.getCodigoLibro().equalsIgnoreCase(codigo)) {
                return prestamo;
            }
        }
        return null;
    }
}
