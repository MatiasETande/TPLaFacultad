
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Carrera implements Informacion
{
    private Scanner leer = new Scanner(System.in);
    
    //Atributos
    private String nombre;
    private ArrayList<Materia> colecionMaterias = new ArrayList<Materia>();

    //Constructor
    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    //setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /*public void setColecionMaterias(ArrayList<Materia> colecionMaterias) {
        this.colecionMaterias = colecionMaterias;
    }*/

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
    

        int opcion = -1;

        for (Materia materia:this.colecionMaterias)
        {
            if (materia.getNombre().toLowerCase().contains(nombre.toLowerCase()))
            {
                System.out.println("Se encontro la materia: "+materia.getNombre());

                do{
                    System.out.println("Desea eliminarla? - Ingrese 1 o 2");
                    System.out.println("--> 1 : Para eliminar" +
                            "\n--> 2 : Para Salir");
                    try {
                        opcion = leer.nextInt();

                    } catch (InputMismatchException e) {
                        System.out.println("\t¡¡¡Error: por favor solo ingrese numeros!!!");
                        leer.next();//Lee la siguiente linea para evitar un bucle con la exepcion
                        opcion = -1;//Por si quedo alguna otra opcion anteriormente seleccionada
                    }

                    switch (opcion){
                        case 1:System.out.println("Se elimina");break;
                        case 2:System.out.println("NO se elimina");break;
                        default:System.out.println("Ingrese una opcion valida");break;
                    }

                }while (opcion!=2 && opcion!=1);
            }
        }

        if (opcion==-1)
        {
            System.out.println("No se encontraron resultados");
        }


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

        return this.colecionMaterias.size();

    }

    @Override
    public String listarContenido() {

        String listaMaterias = "Materias de la carrera "+this.nombre+":\n";
        for (Materia materia: colecionMaterias)
        {
            listaMaterias = listaMaterias+materia.getNombre()+"\n";
        }

        return listaMaterias;
    }
}

