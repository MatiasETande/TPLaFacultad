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


    //Getter

    public String getNombre()
    {
        return nombre;
    }

    public ArrayList<Carrera> getColecionCarreras()
    {
        return colecionCarreras;
    }

    //Metodos

    public  void agregarCarrera(Carrera carrera)
    {
        this.colecionCarreras.add(carrera);
    }

    public  void eliminarCarrera(Carrera carrera)
    {
        for (Estudiante estudiante : colecionCarreras)
        {
            if (estudiante.getNombre().toLowerCase().contains(nombre.toLowerCase()))
            {
                colecionCarreras.remove(estudiante);
                break;
            }
        }

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