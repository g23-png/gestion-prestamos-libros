/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionprestamoslibros;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Matricular Usuario");
            System.out.println("2. Matricular Libro");
            System.out.println("3. Realizar Prestamo");
            System.out.println("4. Realizar Devolucion");
            System.out.println("5. Consultar usuario");
            System.out.println("6. Consultar Libro");
            System.out.println("7. Salir del Sistema");
            System.out.print("Elija una opción: ");
            
            // Validar que la entrada sea un entero
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. Ingrese un número: ");
                scanner.next();
            }
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola! Inscripcion Usuario.");
                    GestionUsuario.solicitarDatosParaRegistrar();
                    break;
                case 2:
                     System.out.println("¡Hola! Inscripcion Libro.");
                     GestionLibro.solicitarDatosParaRegistrar();
                    break;
                case 3:
                     System.out.println("¡Hola! Inscripcion Prestamo.");
                     GestionPrestamo.solicitarDatosParaRegistrar();
                         
                    break;
                case 4:
                    GestionDevolucion.solicitarDatosParaRegistrar();
                     System.out.println("¡Hola! Inscripcion Devolucion.");
                    break;
                case 5:
                    GestionUsuario.ImprimirUsuario();
                    break;
                 case 6:
                     GestionLibro.ImprimirLibro();
                    break;
                 case 7:
                     System.out.println("¡Hola! termino .");
                    break;   
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
        
        scanner.close();
    }
   
    
}
