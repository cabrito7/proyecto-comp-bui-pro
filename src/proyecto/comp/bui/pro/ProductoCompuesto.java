/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.comp.bui.pro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlosmamut1
 */
public class ProductoCompuesto extends Componente {
    private String nombre;
    private List<Componente> items = new ArrayList<>();

    public ProductoCompuesto(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Componente c) {
        items.add(c);
    }

    @Override
    public String mostrar() {
    StringBuilder sb = new StringBuilder();
    sb.append("Combo: ").append(nombre).append("\n");

    for (Componente c : items) {
        sb.append(c.mostrar()).append("\n");  
    }

    sb.append("Precio total: $").append(precio());
    return sb.toString();
}


    @Override
    public double precio() {
        double total = 0;
        for (Componente c : items) {
            total += c.precio();
        }
        return total;
    }

    @Override
    public Componente clonar() {
        ProductoCompuesto copia = new ProductoCompuesto(this.nombre);
        for (Componente c : items) {
            copia.agregar(c.clonar());
        }
        return copia;
    }
}
