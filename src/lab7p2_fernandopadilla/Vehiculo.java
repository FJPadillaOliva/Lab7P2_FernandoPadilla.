
package lab7p2_fernandopadilla;

import java.awt.Color;


public class Vehiculo {
private String marca;
private Color color;
private String modelo, año;
private double precioV;
private int idCarro;

    public Vehiculo() {
    }

    public Vehiculo(String marca, Color color, String modelo, String año, double precioV, int idCarro) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.año = año;
        this.precioV = precioV;
        this.idCarro = idCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public double getPrecioV() {
        return precioV;
    }

    public void setPrecioV(double precioV) {
        this.precioV = precioV;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    @Override
    public String toString() {
        return marca + modelo;
    }



}
