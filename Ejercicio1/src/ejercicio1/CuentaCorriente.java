
package ejercicio1;

/**
 *
 * @author estudiante311
 */
public class CuentaCorriente extends Cuenta {
    
    protected float sobregiro;
    
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        sobregiro = 0;
    }
    
    public void retirar (float cantidad){
        float saldoTemporal = saldo - cantidad;
        
        if (saldoTemporal < 0){
            sobregiro = sobregiro - saldoTemporal;
            saldo = 0;
        } else {
            super.retirar(cantidad);
        }
    }
    
    public void consignar(float cantidad){
        float sobregiroTemporal = sobregiro - cantidad;
        //sobregiroTemporal = -3000
        
        if (sobregiro > 0){
            if(sobregiroTemporal > 0){
                sobregiro = sobregiroTemporal;
            } else {
                saldo = saldo - sobregiroTemporal;
                sobregiro = 0;
            }
        } else {
            super.consignar(cantidad);
        }
    }
    
    public void extractoMensual(){
        super.extractoMensual();
    }
    
    public void imprimir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("COMISION MENSUAL: " + comisionMensual);
        System.out.println("NUMERO DE TRANSACIONES: " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Sobregiro: " + sobregiro);
    }
}
