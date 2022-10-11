
/*
 *
 *   Trabajo Practico realizado para la materia Lab de computación II
 *   de la carrera TUP UTN FRRe
 *
 *   By Mazza Bruno & Tande Matias
 *
 * */

import java.util.Scanner;

public class LaFacultadTP {


    public static void main(String[] args) {



        Profesor p1 = new Profesor("Nico","Perez",22811,200.0f,5);
        Profesor p2 = new Profesor("Bruno","Mazza",59897,100.0f,1);
        Profesor p3 = new Profesor("Nico","Perez",93142,300.0f,10);
        Estudiante e1 = new Estudiante("Matias Emanuel","Tande",22844);
        Estudiante e2 = new Estudiante("lucas","Fantin",22844);
        Estudiante e3 = new Estudiante("Jesus de algo","Lopez",22844);
        Estudiante e4 = new Estudiante("Cristian","Tevez",22844);
        Estudiante e5 = new Estudiante("Javier Matias","Martinez",22844);

        Carrera car1 = new Carrera("programacion");
        Materia m1 = new Materia("Estadistica", p1);
        Materia m2 = new Materia("dgfgfddgf", p2);
        Materia m3 = new Materia("laboratorio", p2);

        Carrera car2 = new Carrera("licenciatura en sistema");
        Materia m4 = new Materia("matematica", p3);
        Materia m5 = new Materia("Sistema de datos", p1);
        Materia m6 = new Materia("ingles", p3);


        m1.agregarEstudiante(e1);
        m1.agregarEstudiante(e2);
        m1.agregarEstudiante(e3);
        m1.agregarEstudiante(e4);
        m1.agregarEstudiante(e5);
        m2.agregarEstudiante(e2);
        m2.agregarEstudiante(e4);
        m3.agregarEstudiante(e5);


        System.out.println(m1.listarContenido());

        m1.buscarEstudiante("mati");

        System.out.println( car1.encontrarMateria("programacion"));







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

    //facultad

    //carrera
//crear materia
    public Materia agregarmateria(){

        Materia materia = new Materia("", crearProfesor());

        System.out.println("la materia que desa agregar a la carrera");
        materia.setNombre(leer.next());



        return materia;

    }




}