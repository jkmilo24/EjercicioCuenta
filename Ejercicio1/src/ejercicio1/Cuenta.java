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
public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;
    
    public Cuenta (float saldo, float tasaAnual){
        this.saldo= saldo;
        this.tasaAnual= tasaAnual;
    }
    
    public void imprimir() {
        System.out.println("saldo: " +saldo);
        System.out.println("Numero de consignaciones: " +numeroConsignaciones);
        System.out.println("Numero de retiros: " +numeroRetiros);
        System.out.println("Tasa Anual: " +tasaAnual);
        System.out.println("Comision Mensual: " +comisionMensual);
    }
    
    public void consignar(float cantidad){
        saldo=saldo+cantidad;
    }
}
