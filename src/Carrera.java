import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Carrera extends Estudiante implements Informacion
{
    //costructor


    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    //Atributos
    private String nombre;

    private List<Materia> colecionMaterias = new LinkedList<Materia>();


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

    public List<Materia> getColecionMaterias() {
        return colecionMaterias;
    }
    //Metodos

    public  void agregarMatreia(Materia materia)
    {

        colecionMaterias.add(materia);

    }

    public  void eliminarMateria()
    {
        for (Materia materia : colecionMaterias)
        {
            if (materia.getNombre().toLowerCase().contains(nombre.toLowerCase()))
            {
                colecionMaterias.remove(materia);break;
            }
        }
    }

    /* Busca en la coleccion una materia por su nombre y retorna el objeto Materia.
      Para esto debe recorrer la coleccion de materias, comparando el nombre de cada una con el nombre buscado.
     */
    public Materia encontrarMateria(String nombre)
    {
        for (Materia materia : this.colecionMaterias)
        {
            if (materia.getNombre().equals(nombre))
            {
                System.out.println(materia.toString());
                return materia;
            }
        }
        return null;
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