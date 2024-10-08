/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;
import java.util.Scanner;


/**
 *
 * @author Josue
 */
public class PROYECTOFINAL {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
            // Credenciales de ejemplo

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
     String USUARIO_VALIDO = "usuario";
     String CONTRASENA_VALIDO = "contrasena";

        System.out.print("Ingrese su nombre de usuario: ");
        String usuarioIngresado = scan.next();

        System.out.print("Ingrese su contraseña: ");
        String contrasenaIngresada = scan.next();

        if (validarCredenciales(usuarioIngresado, contrasenaIngresada)) {
            System.out.println("BIENVENIDO AL SISTEMA DE INVENTARIO:");
            MenuInventario ();
        } else {
            System.err.println("Usuario o contraseña incorrectos.");
        }

        scan.close();
        
    }

    private static boolean validarCredenciales(String usuario, String contrasena) {
        return  "USUARIO".equals(usuario) &&  "CONTRASENA".equals(contrasena);
    }
     private static void MenuInventario () {
      Scanner scan = new Scanner(System.in);
      int Opcion=0;
      System.out.print("1.Gestión de Productos. ");
      System.out.print("2.Control de Existencias. ");
      System.out.print("3.Pedidos de Compras. ");
      System.out.print("4.Informes y Estadísticas. ");
      Opcion=scan.nextInt();
      
      switch(Opcion) {
          case 1:
              GestióndeProductos();
              break;
              
  } 
    }    

    private static void GestióndeProductos() {
        Scanner scan = new Scanner(System.in);
      int Opcion=0;
      System.out.print("1.Definición de Categorias ");
      System.out.print("2.Control de Existencias. ");
      System.out.print("3.Pedidos de Compras. ");
      System.out.print("4.Informes y Estadísticas. ");
      Opcion=scan.nextInt();
      
      switch(Opcion) {
          case 1:
              DefinicióndeCategorias();
              break;
               }
    }

    private static void DefinicióndeCategorias() {
        }
    }
    

