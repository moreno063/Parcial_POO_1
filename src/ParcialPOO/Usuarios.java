package ParcialPOO;

public class Usuarios {
    private String nombre;
    private String ID;

    public Usuarios(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

    public String setID(String ID) {
        this.ID = ID;
        return ID;
    }
    
    
    
}
