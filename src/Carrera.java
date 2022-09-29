

import java.util.ArrayList;

public class Carrera
{
    //Atributos
    private String nombre;

    private ArrayList<Materia> ColecionMaterias = new ArrayList<Materia>();


    //setter


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColecionMaterias(ArrayList<Materia> colecionMaterias) {
        ColecionMaterias = colecionMaterias;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Materia> getColecionMaterias() {
        return ColecionMaterias;
    }
    //Metodos

    public  void agregarMatreia(Materia materia)
    {

        ColecionMaterias.add(materia);

    }

    public  void eliminarMateria(Materia materia)
    {
        ColecionMaterias.remove(materia);
    }

    public  void encontrarMateria(String nombre)
    {


    }

    @Override
    public String toString()
    {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", ColecionMaterias=" + ColecionMaterias +
                '}';
    }




}
