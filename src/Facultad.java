package TrabajoFacuLab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Facultad

{



    //Atributos

 String nombre;

 private  ArrayList<String> ColecionCarreras = new ArrayList<String>();

//Costructor



 public Facultad(String nombre)
 {
  this.nombre = nombre;

 }

 //Setter


 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public void setColecionCarreras(ArrayList<String> colecionCarreras) {
  ColecionCarreras = colecionCarreras;
 }
 //Getter


 public String getNombre() {
  return nombre;
 }

 public ArrayList<String> getColecionCarreras() {
  return ColecionCarreras;
 }
 //Metodos

 public static void agregarCarrera(Carrera carrera)
 {
  ColecionCarreras.add();
 }
 public static void eliminarCarrera(String nombre)
 {
  ColecionCarreras.remove();
 }
 public static void eliminarEstudiante(Estudiante Estudiante)
 {

 }


}
