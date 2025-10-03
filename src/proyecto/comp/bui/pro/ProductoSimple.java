/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.comp.bui.pro;

/**
 *
 * @author carlosmamut1
 */
public class ProductoSimple extends Componente {
    private String nombre;
    private double costo;
    public ProductoSimple(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
    @Override
    
    public String mostrar() {
        return "Producto: " + nombre + " - Precio: $" + costo;
    }

    @Override
    public double precio() {
        return costo;
    }

    @Override
    public Componente clonar() {
        return new ProductoSimple(this.nombre, this.costo);
    }
    
}
