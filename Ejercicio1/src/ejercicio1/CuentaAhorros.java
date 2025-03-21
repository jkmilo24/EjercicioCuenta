
package ejercicio1;

/**
 *
 * @author estudiante311
 */
public class CuentaAhorros extends Cuenta {
    protected boolean activa;
    
    
    private final float MONTO_MINIMO = 10000; /* CONSTANTE */
    private final float COSTO_COMISION_MENSUAL = 1000; /* CONSTANTE */
    
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo < MONTO_MINIMO){
            activa = false;
        } else {
            activa = true;
        }
    }
    
    public void consignar(float cantidad) {
        if (activa){
            super.consignar(cantidad);
        }
    }
    
    public void retirar(float cantidad) {
        if (activa){
            super.retirar(cantidad);
        }
    }
    
    public void extractoMensual() {
        if(numeroRetiros > 4) {
           comisionMensual = (numeroRetiros - 4) * COSTO_COMISION_MENSUAL;
        }
        
        super.extractoMensual();
        isActive();
    }
    
    public void imprimir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("COMISION MENSUAL: " + comisionMensual);
        System.out.println("NUMERO DE TRANSACIONES: " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Steven Estuvo aqui");
    }
    
    public void isActive() {
       if (saldo < MONTO_MINIMO){
           activa = false;
       } else {
           activa = true;
       }
    }
    
}
