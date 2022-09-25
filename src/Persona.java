public abstract class Persona { //Atributos
    private String nombre;
    private String apellido;
    private int legajo;

    //Constructor
    protected Persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    //Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }


    //Getter

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }


    //Metodos


    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                " \napellido='" + apellido + '\'' +
                " \nlegajo=" + legajo + "\n";
    }

    public abstract void modificarDatos();




}
