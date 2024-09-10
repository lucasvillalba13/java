package d;

public class Comida {

    String nombre;
    String ingredientes;
    String coccion;
    int minutosCoccion;

    Comida(String nombre, String ingredientes, String coccion, int minutosCoccion){
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.minutosCoccion = minutosCoccion;
        this.coccion = coccion;
    }

    @Override
    public String toString() {
        return "Comida: " +
                "nombre = '" + nombre + '\'' +
                ", ingredientes='" + ingredientes + '\'' +
                ", coccion='" + coccion + '\'' +
                ", minutosCoccion = " + minutosCoccion +
                '}';
    }
}
