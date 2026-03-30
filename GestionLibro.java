/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Usuario
 */



package gestionprestamoslibros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GestionLibro 
{ 
 private  static ArrayList<Libro> ArchivoDeLibro =new ArrayList<>();
 private ArrayList<Libro> DatosLibro;

    
    public static void solicitarDatosParaRegistrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Codigo de Libro: ");
        String codigo = sc.nextLine();
        System.out.println("Ingrese Titulo del Libro: ");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el Autor del Libro: ");
        String autor = sc.nextLine();
       
        GestionLibro.registrar(new Libro(codigo, titulo, autor ));
        System.out.println("Registrado exitosamente");
    }
//  guarda un libro en ArrayList de libros
    public static void registrar(Libro libro) {
        libro.setPrestado(false);

        ArchivoDeLibro.add(libro);
        
          System.out.println("Tamano del archivo  " + ArchivoDeLibro.size());
          System.out.println( ArchivoDeLibro);
        
        
        System.out.println("Libro registrado: " + libro.getTitulo() + " con ID: " + libro.getCodigo());
    }
    // encuentra un libro dado un numero o codigo del libro
    
     public static int buscarLibroPorNumero(String numero, ArrayList<Libro> libro) {
        for (int x = 0; x < libro.size(); x++) {
            
            Libro  respuesta = libro.get(x);
            //if (socio.getCodigo().equals(numero)) 
            if (respuesta.getCodigo().equals(numero)) {
                return x;
            }
        }
        return -1;
    }
     
     
     public static Libro buscarLibro(String idLibro) {
        for (Libro libro : ArchivoDeLibro) {
            if (libro.getCodigo().equalsIgnoreCase(idLibro) ) {
                return libro;
            }
          
        } 
      
        return null;
    }
      public static void imprimirLibros(ArrayList<Libro> libros) 
          {
            
        System.out.println(
                "+-----+----------+----------------------------------------+----------------------------------------+--------------------+");
        System.out.printf("|%-5s|%-10s|%-40s|%-40s|%-20s|\n", "#", "No. socio", "Nombre", "Direccion",
                "Libros prestados");
        System.out.println(
                "+-----+----------+----------------------------------------+----------------------------------------+--------------------+");
        for (int x = 0; x < libros.size(); x++) {
            Libro salida = libros.get(x);
          
            System.out.printf("|%-5s|%-10s|%-40s|%-40s|%-20s|\n", x + 1, salida.getCodigo(), salida.getAutor(),
                    salida.getTitulo(),salida.estaDisponible() ?  "SI" : "NO");
                  
            System.out.println(
                    "+-----+----------+----------------------------------------+----------------------------------------+--------------------+");
        }
    }
      
   public static void marcarComoPrestado(String codigoLibro,ArrayList<Libro> libro) {
       
        int indice =  GestionLibro.buscarLibroPorNumero(codigoLibro, libro);
        if (indice == -1) {
            return;
        }
        libro.get(indice).setPrestado(true);
       
    }  
   
   public static Usuario ImprimirLibro() {
        for(int i=0; i < ArchivoDeLibro.size(); i++){
         System.out.println("El Libro en la posicion  " + i + " " +  ArchivoDeLibro.get(i) )   ;
            
        }
        return null;
}
}