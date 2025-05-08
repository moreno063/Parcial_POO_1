package ParcialPOO;

public class Libros {
    private String categoria;
    private String nombre;

    public Libros(String categoria, String nombre) {
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String setCategoria(String categoria) {
        this.categoria = categoria;
        return categoria;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }
    
    public void mostrarResultado(String nombre){
        System.out.println("El nombre del libro registrado es: " + nombre + ", de la categoria" + categoria);
    }   
    
}
