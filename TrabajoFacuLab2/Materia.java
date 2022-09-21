package TrabajoFacuLab2;

import java.util.ArrayList;

public class Materia
{
    //Atributos
    String nombre;

    private  ArrayList<String> ColecionEstudiante = new ArrayList<String>();

    //Setters


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColecionEstudiante(ArrayList<String> colecionEstudiante) {
        ColecionEstudiante = colecionEstudiante;
    }
    //Getters


    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getColecionEstudiante() {
        return ColecionEstudiante;
    }

    //Metodos

    public  void agregarEstudiante()
    {
        ColecionEstudiante.add();
    }

    public  void eliminarEstudiante(String nombre)
    {
        ColecionEstudiante.remove();
    }
    public  void modificarTitular()
    {

    }


}
