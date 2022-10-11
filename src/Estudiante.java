
import java.util.InputMismatchException;
import java.util.Scanner;

public class Estudiante extends Persona {
    private Scanner leer = new Scanner(System.in);
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
        System.out.println("\t Menu de Modificación de Datos");
        System.out.println("\t\t\tde Un Estudiante");
        System.out.println("\t------------------------------");
        int opcion;

        do {
            System.out.println("\t¿Que datos desea Modificar?");
            System.out.println  ("\t\t--> 1: Nombre" +
                    "\n\t\t--> 2: Apellido" +
                    "\n\t\t--> 3: Legajo" +
                    "\n\t\t--> 0: Salir" +
                    "\n\tIngrese su opcion: ");

            try {
                opcion =leer.nextInt();

                switch (opcion){
                    case 1: {
                        System.out.println("\t-->modificando nombre");
                        this.setNombre(leer.next());
                        break;
                    }
                    case 2: {
                        System.out.println("\t-->modificando Apellido");
                        this.setApellido(leer.next());
                        break;
                    }
                    case 3: {
                        System.out.println("\t-->modificando legajo");
                        this.setLegajo(leer.nextInt());
                        break;
                    }
                    case 0: System.out.println("\t-->Saliendo de modificaciones");break;
                    default:System.out.println("\t¡¡¡Por favor ingrese una opcion valida!!!");break;
                }

            }catch (InputMismatchException e){
                System.out.println("\t¡¡¡Error: por favor solo ingrese numeros!!!");
                leer.next();//Lee la siguiente linea para evitar un bucle con la exepcion
                opcion = -1;//Por si quedo alguna otra opcion anteriormente seleccionada
            }

        }while (opcion != 0);

    }


}

