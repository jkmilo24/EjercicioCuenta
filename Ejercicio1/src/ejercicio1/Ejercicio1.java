/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author estudiante308
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // crear objeto de la clase cuenta
        
        Cuenta cuenta1 = new Cuenta(10000, 0);
        cuenta1.imprimir();
        
        cuenta1.consignar(2501);
        System.out.println("");
        cuenta1.imprimir();
    }
    
}
