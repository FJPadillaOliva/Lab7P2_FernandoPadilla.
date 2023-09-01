
package lab7p2_fernandopadilla;


public class Vendedor {
    private String nombre ;
    private int cantCV;
    private double cantDG;

    public Vendedor() {
    }

    public Vendedor(String nombre, int cantCV, double cantDG) {
        this.nombre = nombre;
        this.cantCV = cantCV;
        this.cantDG = cantDG;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantCV() {
        return cantCV;
    }

    public void setCantCV(int cantCV) {
        this.cantCV = cantCV;
    }

    public double getCantDG() {
        return cantDG;
    }

    public void setCantDG(double cantDG) {
        this.cantDG = cantDG;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
