package modelo;

public class Libreta2022 extends CuentaCorriente{
    // Atributos
    private String nuevoSaldo;

    // Constructor
    public Libreta2022(String nt, int s, int tap, int taa){
        super(nt, s, tap, taa);
    }

    // Método
    public void consignar(){
        if(saldo>totalAPagar){
            nuevoSaldo = Double.toString((saldo - totalAPagar)+(totalAPagar*0.08));
        }else if(saldo<totalAPagar){
            nuevoSaldo = "No es posibler realizar la transacción, por favor verifique su saldo. " + Double.toString(saldo);
        }
    }

    public void retirar(){
        if(saldo>totalAPagar){
            nuevoSaldo = Double.toString((saldo - totalAPagar)-(totalARetirar*0.02));
        }else if(saldo<totalAPagar){
            nuevoSaldo = "No es posibler realizar el retiro, por favor verifique su saldo. " + Double.toString(saldo);
        }
    }
}
