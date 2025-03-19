
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
        
        if (sobregiro){
            
        }
    }
}
