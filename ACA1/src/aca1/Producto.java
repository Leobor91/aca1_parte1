/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aca1;

/**
 *
 * @author leonel.borja
 */
public class Producto {

    private int idProducto;
    private String codigoProducto;
    private String nombreProducto;
    private double precioProducto;
    private int catidadProducto;

    public Producto(int idProducto, String codigoProducto, String nombreProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public int getCatidadProducto() {
        return catidadProducto;
    }

    public void setCatidadProducto(int catidadProducto) {
        this.catidadProducto = catidadProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append("\n");
        sb.append("Id del Producto=").append(idProducto);
        sb.append("\n");
        sb.append("Codigo del Producto=").append(codigoProducto);
        sb.append("\n");
        sb.append("Nombre del Producto=").append(nombreProducto);
        sb.append("\n");
        sb.append("Precio del Producto=").append(precioProducto);
        sb.append("\n");
        sb.append("Catidad del Producto=").append(catidadProducto);
        sb.append("\n");        
        sb.append("");
        sb.append("\n");
        return sb.toString();
    }

    

}
