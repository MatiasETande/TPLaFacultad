import java.util.ArrayList;

public class Materia implements Informacion{

    //Atributos
    String nombre;
    Profesor titular;
    private  ArrayList<Estudiante> ColecionEstudiante = new ArrayList<Estudiante>();

    //Setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTitular(Profesor profesor)
    {
        this.titular = profesor;
    }


    //Getters


    public Profesor getTitular()
    {
        return titular;
    }

    public String getNombre() {
        return nombre;
    }

    /*public ArrayList<String> getColecionEstudiante() {
        return ColecionEstudiante;
    }*/

    //Metodos

    public  void agregarEstudiante(Estudiante estudiante)
    {
        ColecionEstudiante.add(estudiante);
    }

    public  void eliminarEstudiante(String nombre)
    {
        ColecionEstudiante.remove(nombre);
    }
    public  void modificarTitular()
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
