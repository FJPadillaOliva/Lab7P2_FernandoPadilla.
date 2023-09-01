
package lab7p2_fernandopadilla;


public class Venta {
    private String vendedor, cliente;
    private double costo;
    private String carroV;
    private int idCarro;

    public Venta() {
    }

    public Venta(String vendedor, String cliente, double costo, String carroV,int idCarro) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.costo = costo;
        this.carroV = carroV;
        this.idCarro = idCarro;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getCarroV() {
        return carroV;
    }

    public void setCarroV(String carroV) {
        this.carroV = carroV;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }
    

    @Override
    public String toString() {
        return vendedor +", " + cliente + "," + carroV;
    }
    
    
}
