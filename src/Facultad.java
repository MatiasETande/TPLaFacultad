import java.util.ArrayList;

public class Facultad implements Informacion{
    //Atributos

    String nombre;
    private  ArrayList<Carrera> colecionCarreras = new ArrayList<Carrera>();

   //Costructor



    public Facultad(String nombre)
    {
     this.nombre = nombre;

    }

    //Setter


    public void setNombre(String nombre) {
     this.nombre = nombre;
    }

    /*public void setColecionCarreras(ArrayList<String> colecionCarreras) {
     ColecionCarreras = colecionCarreras;
    }*/

    //Getter

    public String getNombre() {
     return nombre;
    }

   /* public ArrayList<String> getColecionCarreras() {
     return ColecionCarreras;
    }*/

   //Metodos

    public  void agregarCarrera(Carrera carrera)
    {
     this.colecionCarreras.add(carrera);
    }

    public  void eliminarCarrera(Carrera carrera)
    {
     this.colecionCarreras.remove(carrera);
    }

    public  void eliminarEstudiante(Estudiante Estudiante)
    {

    }

    //Interfaces

    @Override
    public int verCantidad() {
     return 0;
    }

    @Override
    public String listarContenido() {
     return null;
    }
}
