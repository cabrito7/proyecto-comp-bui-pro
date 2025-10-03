/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.comp.bui.pro;

/**
 *
 * @author carlosmamut1
 */
public class ComboBuilder {
    public ProductoCompuesto crearComboBasico() {
        ProductoCompuesto combo = new ProductoCompuesto("Combo Básico");
        combo.agregar(new ProductoSimple("Hamburguesa", 8.0));
        combo.agregar(new ProductoSimple("Gaseosa", 3.0));
        return combo;
    }

    public ProductoCompuesto crearComboFamiliar() {
        ProductoCompuesto combo = new ProductoCompuesto("Combo Familiar");
        combo.agregar(new ProductoSimple("2 Hamburguesas", 16.0));
        combo.agregar(new ProductoSimple("Papas Grandes", 6.0));
        combo.agregar(new ProductoSimple("2 Gaseosas", 6.0));
        return combo;
    }  
}
