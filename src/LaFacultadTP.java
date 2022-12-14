
/*
*
*   Trabajo Practico realizado para la materia Lab de computación II
*   de la carrera TUP UTN FRRe
*
*   By Mazza Bruno & Tande Matias
*
* */

import java.util.InputMismatchException;
import java.util.Scanner;



public class LaFacultadTP {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Creo la Facultad

        Facultad facultad = new Facultad("UTN FRRe");
        Carrera c1 = new Carrera("IQ");
        facultad.agregarCarrera(c1);

        int opcion = -1;

        do {
            System.out.println("************************ Menu ************************");
            System.out.println("--> 1. Agregar carrera");
            System.out.println("--> 2. Eliminar carrera");
            System.out.println("--> 3. Eliminar Estudiante");
            System.out.println("--> 4. Ver carreras");
            System.out.println("--> 0. Salir");
            System.out.println("Ingrese su Opcion: ");


            try {
                opcion =leer.nextInt();

                switch (opcion){
                    case 1: {
                        System.out.println("--> Agregar carrera");
                        System.out.println("Ingrese nombre de la Carrera:");
                        Carrera carrera = new Carrera(leer.next());
                        facultad.agregarCarrera(carrera);
                        break;
                    }
                    case 2: {
                        System.out.println("--> Eliminar carrera");
                        System.out.println("Ingrese nombre de la Carrera:");
                        String nombre = leer.next();
                        facultad.eliminarCarrera(nombre);
                        break;
                    }
                    case 3: {
                        System.out.println("--> Eliminar Estudiante");
                        System.out.println("Ingrese nombre Estudiante:");

                        break;
                    }
                    case 4: {
                        System.out.println("--> Ver carreras");
                        System.out.println("Hay un total de "+facultad.verCantidad()+" Carreras");
                        System.out.println(facultad.listarContenido());

                        break;
                    }
                    case 0: {
                        System.out.println("*************** Finalizando Programa *****************");
                        break;
                    }
                    default:System.out.println("¡¡¡Por favor ingrese una opcion valida!!!");break;
                }

            }catch (InputMismatchException e){
                System.out.println("¡¡¡Error: por favor solo ingrese numeros!!!");
                leer.next();//Lee la siguiente linea para evitar un bucle con la exepcion
                opcion = -1;//Por si quedo alguna otra opcion anteriormente seleccionada
            }


        }while (opcion != 0);


    }


    Scanner leer = new Scanner(System.in);
    public Estudiante crearEstudiante(){

        Estudiante estudiante = new Estudiante("", "", 0);

        System.out.println("Ingrese Nombre del Estudiante");
        estudiante.setNombre(leer.next());

        System.out.println("Ingrese Apellido del Estudiante");
        estudiante.setApellido(leer.next());

        System.out.println("Ingrese Legajo del Estudiante");
        estudiante.setLegajo(leer.nextInt());


        return estudiante;
    }

    public Profesor crearProfesor(){

        Profesor profesor = new Profesor("","",0,0,0);

        System.out.println("Ingrese Nombre del Profesor");
        profesor.setNombre(leer.next());

        System.out.println("Ingrese Apellido del Profesor");
        profesor.setApellido(leer.next());

        System.out.println("Ingrese Legajo del Profesor");
        profesor.setLegajo(leer.nextInt());

        System.out.println ("Ingrese Sueldo Basico del Profesor" +
                            "\nPara valores decimales use ','(coma)");
        profesor.setBasico(leer.nextDouble());

        System.out.println("Ingrese Antiguedad del Profesor");
        profesor.setAntiguedad(leer.nextInt());


        return profesor;

    }



}
