

import java.util.ArrayList;

public class Carrera implements Informacion
{
    //Atributos
    private String nombre;

    private ArrayList<Materia> colecionMaterias = new ArrayList<Materia>();


    //setter


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColecionMaterias(ArrayList<Materia> colecionMaterias) {
        colecionMaterias = colecionMaterias;
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Materia> getColecionMaterias() {
        return colecionMaterias;
    }
    //Metodos

    public  void agregarMatreia(Materia materia)
    {

        colecionMaterias.add(materia);

    }

    public  void eliminarMateria(Materia materia)
    {
        colecionMaterias.remove(materia);
    }

    public  void encontrarMateria(String nombre)
    {


    }

    @Override
    public String toString()
    {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", ColecionMaterias=" + colecionMaterias +
                '}';
    }

    @Override
    public int verCantidad() {
        return 0;
    }

    @Override
    public String listarContenido() {
        return null;
    }
}
