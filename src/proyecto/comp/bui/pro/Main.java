/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.comp.bui.pro;

/**
 *
 * @author carlosmamut1
 */
public class Main {
    public static void main(String[] args) {
        FabricaCombo fabrica = new FabricaComboConcreta();

        // Usando la fábrica
        ProductoSimple papas = fabrica.crearProductoSimple();
        System.out.println(papas.mostrar());

        // Usando el builder
        ComboBuilder builder = new ComboBuilder();
        ProductoCompuesto comboBasico = builder.crearComboBasico();
        System.out.println(comboBasico.mostrar());

        // Clonando con Prototype
        Componente comboClonado = comboBasico.clonar();
        System.out.println("\n-- Combo Clonado --");
        System.out.println(comboClonado.mostrar());
    }
}
