import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Facultad implements Informacion{
    private Scanner leer = new Scanner(System.in);
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

    public  void eliminarCarrera(String nombre)
    {
        for (Carrera unaCarrera : this.colecionCarreras)
        {
            if (unaCarrera.getNombre().toLowerCase().equals(nombre.toLowerCase()))
            {
                int opcion=-1;

                try {
                    do {
                        System.out.println("Realmente desea elinar la carrera " + unaCarrera.getNombre() + "?");
                        System.out.println("--> 1. SI");
                        System.out.println("--> 2. NO");
                        opcion = leer.nextInt();

                    } while (opcion != 1 && opcion != 2);
                }catch (InputMismatchException e){
                    System.out.println("\t¡¡¡Error: por favor solo ingrese numeros!!!");
                    leer.next();//Lee la siguiente linea para evitar un bucle con la exepcion
                    opcion = -1;//Por si quedo alguna otra opcion anteriormente seleccionada
                }

                if (opcion == 1){
                    colecionCarreras.remove(unaCarrera);
                }
                break;
            }
        }

    }

    public void eliminarEstudiante(String nombre){
        
    }



    //Interfaces

    @Override
    public int verCantidad() {
        return this.colecionCarreras.size();
    }

    @Override
    public String listarContenido() {
        String listaCarreras = "Lista de carreras:\n";
        for (Carrera carrera: this.colecionCarreras)
        {
            listaCarreras= listaCarreras+carrera.getNombre()+"\n";

        }

        return listaCarreras;
    }
}