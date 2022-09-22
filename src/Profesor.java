import java.util.Scanner;

public class Profesor extends Persona{

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


    @Override
    public String toString() {
        return "Profesor{\n"+ super.toString()+
                "basico=" + basico +
                "\nantiguedad=" + antiguedad +
                "\n}";
    }

    @Override
    public void modificarDatos() {
        int opcion = -1;

        while (opcion != 0){

            System.out.println("¿Que datos desea Modificar?");
            System.out.println  ("1: Nombre" +
                    "\n2: Apellido" +
                    "\n3: Legajo" +
                    "\n4: Basico" +
                    "\n5: antiguedad" +
                    "\n0: Salir" +
                    "\nIngrese su opcion: ");

            Scanner leer = new Scanner(System.in);
            opcion =leer.nextInt();

            switch (opcion){
                case 1: System.out.println("modificando nombre");break;
                case 2: System.out.println("modificando Apellido");break;
                case 3: System.out.println("modificando legajo");break;
                case 4: System.out.println("modificando basico");break;
                case 5: System.out.println("modificando antiguedad");break;
                case 0: System.out.println("Saliendo de modificaciones");break;
                default:System.out.println("Error: porfavor ingrese una opcion valida");break;
            }
        }
    }
}
