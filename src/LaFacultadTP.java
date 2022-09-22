/*
*
*   Trabajo Practico realizado para la materia Lab de computación II
*   de la carrera TUP UTN FRRe
*
*   By Mazza Bruno & Tande Matias
*
* */

public class LaFacultadTP {


    public static void main(String[] args) {

        Profesor p1 = new Profesor("Nico","Perez",22811,200.0f,5);
        Estudiante e1 = new Estudiante("Matias","Tande",22844);

        System.out.println(p1.toString());

        System.out.println(e1.toString());

        e1.modificarDatos();



    }

}
