

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

    public  void agregarMatreia(String materia)
    {

        ColecionMaterias.add(materia);

    }

    public  void eliminarMateria(String materia)
    {
        ColecionMaterias.remove(materia);
    }

    public  void encontrarMateria(String nombre)
    {


    }

}
