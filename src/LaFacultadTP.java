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

        int opcion = -1;

        do {
            System.out.println("************************ Menu ************************");
            System.out.println("--> Agregar carrera");
            System.out.println("--> Eliminar carrera");
            System.out.println("--> Eliminar Estudiante");
            System.out.println("Ingrese su Opcion: ");
            //System.out.println("************ ---- ************");

            try {
                opcion =leer.nextInt();

                switch (opcion){
                    case 1: {
                        System.out.println("--> Agregar carrera");

                        break;
                    }
                    case 2: {
                        System.out.println("--> Eliminar carrera");

                        break;
                    }
                    case 3: {
                        System.out.println("-->Eliminar Estudiante");

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

















        /*Profesor p1 = new Profesor("Nico","Perez",22811,200.0f,5);
        Estudiante e1 = new Estudiante("Matias Emanuel","Tande",22844);
        Estudiante e2 = new Estudiante("lucas","Fantin",22844);
        Estudiante e3 = new Estudiante("Jesus de algo","Lopez",22844);
        Estudiante e4 = new Estudiante("Cristian","Tevez",22844);
        Estudiante e5 = new Estudiante("Javier Matias","Martinez",22844);

        Materia m1 = new Materia("Estadistica", p1);

        m1.agregarEstudiante(e1);
        m1.agregarEstudiante(e2);
        m1.agregarEstudiante(e3);
        m1.agregarEstudiante(e4);
        m1.agregarEstudiante(e5);

        System.out.println(m1.listarContenido());

        //m1.buscarEstudiante("Matias");

        Carrera c1 = new Carrera();
        c1.agregarMatreia(m1);

        c1.encontrarMateria("esta");*/




        /*String unString = "Matias Emanuel";

        System.out.println(unString.compareToIgnoreCase("Emanuel"));

        System.out.println(unString.equalsIgnoreCase("Emanuel"));

        System.out.println(unString.contains("Emanuel"));

        System.out.println(unString.toLowerCase().contains("Matias".toLowerCase()));*/








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
