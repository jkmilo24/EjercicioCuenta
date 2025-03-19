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
        
        System.out.println("Cuenta de Ahorros: ");
        
        final float SALDO = 15000;
        final float TASA_ANUAL = 0.10f;
        
        CuentaAhorros cuentaAhorros1 = new CuentaAhorros(SALDO, TASA_ANUAL);
        
        System.out.println("");
        
        cuentaAhorros1.imprimir();
        
        System.out.println("");
        
        cuentaAhorros1.consignar(5000);
        cuentaAhorros1.consignar(2000);
        cuentaAhorros1.consignar(3000);
        cuentaAhorros1.consignar(1000);
        cuentaAhorros1.imprimir();
        
        System.out.println("");
        
        System.out.println();
        // retirar valor de 2000
        cuentaAhorros1.retirar(2000);
        cuentaAhorros1.retirar(1000);
        cuentaAhorros1.retirar(100);
        cuentaAhorros1.retirar(200);
        cuentaAhorros1.retirar(500);
        cuentaAhorros1.retirar(500);
        cuentaAhorros1.retirar(10000);
        
        cuentaAhorros1.imprimir();

    }
    
}
