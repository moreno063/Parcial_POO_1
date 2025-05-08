package ParcialPOO;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);           
        System.out.println("===Seleccione cual de las opciones quiere realizar===\n 1. Registrar un nuevo libro. \n 2. Registrar nuevo usuario. \n 3. Cerrar menú \n");
        int x = scanner.nextInt();
        Libros libro1 = new Libros("Categoria", "Nombre");
        Usuarios usuario1 = new Usuarios("Nombre", "ID");
        Biblioteca bibloteca = new Biblioteca();
        
        if (x == 1){
            System.out.println("De que categoria es el libro que desea registrar? (Historia, ciencia, matematicas: ");            
            String categoria = scanner.nextLine();
            String y= libro1.setCategoria(categoria);
            
            
            
            System.out.println("Cual es el nombre del libro que desea registrar?:");            
            String nombre = scanner.nextLine();
            String y1= libro1.setNombre(nombre);
            
            System.out.println("Libro registrado con exito");
                       
        }
        if (x==2){
            System.out.println("Cual es el nombre del usuario que desea registrar?: ");            
            String nombre = scanner.nextLine();
            String u1 = usuario1.setNombre(nombre);
            
            System.out.println("Cual es el ID del usuario?: ");            
            String ID = scanner.nextLine();
            String u2 = usuario1.setID(ID);
        
            if (x==3){
                System.out.println("Menu cerrado");
        }
      
}
