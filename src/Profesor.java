import java.util.InputMismatchException;
import java.util.Scanner;

public class Profesor extends Persona{
    Scanner leer = new Scanner(System.in);
    //Atributos

    private double basico;
    private int antiguedad;

    //Constructor

    public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
        super(nombre, apellido, legajo);
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    //Setter

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    //Getter

    public double getBasico() {
        return basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    //Metodos

    public double calcularSueldo(){
        return this.basico*(1+0.1*this.antiguedad);
    }

    @Override
    public String toString() {
        return "Profesor{\n"+ super.toString()+
                "basico=" + basico +
                "\nantiguedad=" + antiguedad +
                "\n}";
    }

    @Override
    public void modificarDatos() {
        System.out.println("\t Menu de Modificación de Datos");
        System.out.println("\t\t\tde Un Profesor");
        System.out.println("\t------------------------------");
        int opcion;

        do {
            System.out.println("\t¿Que datos desea Modificar?");
            System.out.println  ("\t\t--> 1: Nombre" +
                    "\n\t\t--> 2: Apellido" +
                    "\n\t\t--> 3: Legajo" +
                    "\n\t\t--> 4: Basico" +
                    "\n\t\t--> 5: Antiguedad" +
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
                    case 4: {
                        System.out.println  ("\t-->modificando Basico" +
                                            "\n\tUtilice la ',' para los decimales" +
                                            "\n\tEjemplo: 500,46");
                        this.setBasico(leer.nextDouble());
                        break;
                    }
                    case 5: {
                        System.out.println("\t-->modificando Antiguedad");
                        this.setAntiguedad(leer.nextInt());
                        break;
                    }
                    case 0: System.out.println("\t-->Saliendo de modificaciones");break;
                    default:System.out.println("\t¡¡¡Por favor ingrese una opcion valida!!!");break;
                }

            }catch (InputMismatchException e){
                System.out.println("\t¡¡¡Error: por favor solo ingrese numeros!!!");
                leer.next();//lee la siguiente linea para evitar un bucle con la exepcion
                opcion = -1;//Por si quedo alguna otra opcion anteriormente seleccionada
            }



        }while (opcion != 0);

    }
}
