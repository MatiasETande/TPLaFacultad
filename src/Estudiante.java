import java.util.Scanner;

public class Estudiante extends Persona{

    //Atributos

    //Constructor

    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    //Setter

    //Getter

    //Metodos




    @Override
    public String toString() {
        return "Estudiante: {\n"+super.toString()+"}";
    }

    @Override
    public void modificarDatos() {
        int opcion = -1;

        while (opcion != 0){

            System.out.println("¿Que datos desea Modificar?");
            System.out.println  ("1: Nombre" +
                               "\n2: Apellido" +
                               "\n3: Legajo" +
                               "\n0: Salir" +
                               "\nIngrese su opcion: ");

            Scanner leer = new Scanner(System.in);
            opcion =leer.nextInt();

            switch (opcion){
                case 1: System.out.println("modificando nombre");break;
                case 2: System.out.println("modificando Apellido");break;
                case 3: System.out.println("modificando legajo");break;
                case 0: System.out.println("Saliendo de modificaciones");break;
                default:System.out.println("Error: porfavor ingrese una opcion valida");break;
            }
        }


    }
}
