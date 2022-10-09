import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class Materia implements Informacion{
    private Scanner leer = new Scanner(System.in);
    //Atributos
    private String nombre;
    private Profesor titular;
    private List<Estudiante> colecionEstudiante = new LinkedList<Estudiante>();

    //Constructor

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
    }


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

    public List<Estudiante> getColecionEstudiante() {
        return colecionEstudiante;
    }

    //Metodos

    public  void agregarEstudiante(Estudiante estudiante)
    {

        colecionEstudiante.add(estudiante);
    }

    public  void eliminarEstudiante(String nombre)
    {

        for (Estudiante estudiante: colecionEstudiante)
        {
            if (estudiante.getNombre().toLowerCase().contains(nombre.toLowerCase()))
            {
                colecionEstudiante.remove(estudiante);break;
            }
        }

    }

    public  void modificarTitular(Profesor profesor)
    {
        this.titular= profesor;
    }

    public boolean buscarEstudiante(String nombre){

        for (Estudiante estudiante: this.colecionEstudiante)
        {
            if (estudiante.getNombre().toLowerCase().contains(nombre.toLowerCase()))
            {
                System.out.println(estudiante.getLegajo()+
                        "\t"+estudiante.getApellido()+
                        ", "+estudiante.getNombre()+"\n");
            }
        }

        return true;
    }

    //Interfaces
    
    @Override
    public int verCantidad() {
        return this.colecionEstudiante.size();
    }

    @Override
    public String listarContenido() {
        String listaEstudiantes = "Legajo\t Apellido y Nombre\n";
        for (Estudiante estudiante: colecionEstudiante)
        {
            listaEstudiantes= listaEstudiantes+estudiante.getLegajo()+
                              "\t"+estudiante.getApellido()+
                              ", "+estudiante.getNombre()+"\n";
        }

        return listaEstudiantes;
    }
}
