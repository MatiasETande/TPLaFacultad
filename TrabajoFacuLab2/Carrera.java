package TrabajoFacuLab2;

import java.util.ArrayList;

public class Carrera
{
    //Atributos
    private String nombre;

    private ArrayList<String> ColecionMaterias = new ArrayList<String>();

    //setter


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColecionMaterias(ArrayList<String> colecionMaterias) {
        ColecionMaterias = colecionMaterias;
    }
    //Getters

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getColecionMaterias() {
        return ColecionMaterias;
    }
    //Metodos

    public  void agregarMatreia()
    {

        ColecionMaterias.add();

    }
    public  void eliminarMateria()
    {

        ColecionMaterias.remove();
    }
    public  void encontrarMateria(String nombre)
    {


    }

}
