/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.comp.bui.pro;

/**
 *
 * @author carlosmamut1
 */
public class FabricaComboConcreta implements FabricaCombo{

    @Override
    public ProductoSimple crearProductoSimple() {
        return new ProductoSimple("Papas Fritas", 5.0);
    }

    @Override
    public ProductoCompuesto crearProductoCompuesto() {
        return new ProductoCompuesto("Combo Genérico");
    }
    
}
