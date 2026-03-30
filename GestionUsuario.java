/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionprestamoslibros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GestionUsuario 
{ 
    private ArrayList<Usuario> usuarios;

 private  static ArrayList<Usuario> ArchivoDeUsuarios=new ArrayList<>();
 private ArrayList<Usuario> DatosUsuario;

    
    public static void solicitarDatosParaRegistrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de Usuario: ");
        String numero = sc.nextLine();
        System.out.println("Ingrese nombre de Usuario: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese direccion de Usuario: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese telefono del Usuario: ");
        String telefono = sc.nextLine();
        GestionUsuario.registrar(new Usuario(numero, nombre, direccion, telefono));
        System.out.println("Registrado exitosamente");
    }
//  guarda un usuario en ArrayList de usuarios
    public static void registrar(Usuario usuario) {
        
        ArchivoDeUsuarios.add(usuario);
        
          System.out.println("Tamano del archivo  " + ArchivoDeUsuarios.size());
          System.out.println( ArchivoDeUsuarios);
        System.out.println("Usuario registrado: " + usuario.getNombre() + " con ID: " + usuario.getNumero());
    }
    // encuentra un usuario dado un numero de indentificacion
     public static int buscarUsarioPorNumero(String numero, ArrayList<Usuario> usuario) {
        for (int x = 0; x < usuario.size(); x++) {
            Usuario respuesta = usuario.get(x);
            //if (socio.getNumero().equals(numero)) 
            if (respuesta.getNumero().equals(numero)) {
                return x;
            }
        }
        return -1;
    }
     
      public static void imprimirUsuario(ArrayList<Usuario> usuarios) {
       
        System.out.println(
                "+-----+----------+----------------------------------------+----------------------------------------+--------------------+");
        System.out.printf("|%-5s|%-10s|%-40s|%-40s|%-20s|\n", "#", "No. socio", "Nombre", "Direccion",
                "Libros prestados");
        System.out.println(
                "+-----+----------+----------------------------------------+----------------------------------------+--------------------+");
        for (int x = 0; x < usuarios.size(); x++) {
            Usuario salida = usuarios.get(x);
            System.out.printf("|%-5s|%-10s|%-40s|%-40s|%-20s|\n", x + 1, salida.getNumero(), salida.getNombre(),
                    salida.getDireccion());
                    //, ControladorPrestamos.cantidadLibrosPrestados(socio.getNumero(), prestamos));
            System.out.println(
                    "+-----+----------+----------------------------------------+----------------------------------------+--------------------+");
        }
    }
      
      public static Usuario buscarUsuario(String idusuario) {
        for (Usuario usuario : ArchivoDeUsuarios) {
            if (usuario.getNumero().equalsIgnoreCase(idusuario) ) {
                return usuario;
            }
          
        } 
      
        return null;
    }
      
    public static int ImprimirUsuario() {
         for (Usuario usuario : ArchivoDeUsuarios){
        //for(int i=0; i < ArchivoDeUsuarios.size(); i++){
        // System.out.println("El Usuario en la posicion  " + i + " " +  ArchivoDeUsuarios.get(i) +Usuario.)   ;
          System.out.println(usuario.getNombre() + " " + "Telefono:  " +   usuario.getTelefono() +  "  Tiene prestado los siguiente Libros : " + usuario.getLibrosPrestados()) ;  
        }
        
      
        return 1;
    }
         
}