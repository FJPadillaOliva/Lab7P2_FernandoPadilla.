
package lab7p2_fernandopadilla;


public class Cliente {
    private String nombre;
    private int edad;
    private String profesion;
    private int cantCC;
    private double sueldoD;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, String profesion, int cantCC, double sueldoD) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.cantCC = cantCC;
        this.sueldoD = sueldoD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCantCC() {
        return cantCC;
    }

    public void setCantCC(int cantCC) {
        this.cantCC = cantCC;
    }

    public double getSueldoD() {
        return sueldoD;
    }

    public void setSueldoD(double sueldoD) {
        this.sueldoD = sueldoD;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
