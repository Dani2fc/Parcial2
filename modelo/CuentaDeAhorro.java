package modelo;

public class CuentaDeAhorro extends CuentaCorriente{
    // Atributos
    private static final double interes = 0.04;
    private String nuevoSaldo;

    // Constructor
    public CuentaDeAhorro(String nt, int s, int tap, int taa){
        super(nt, s, tap, taa);
    }

    // Método
    public void consignar(){
        if(saldo>totalAPagar){
            nuevoSaldo = Double.toString((saldo - totalAPagar)+(totalAPagar*interes));
        }else if(saldo<totalAPagar){
            nuevoSaldo = "No es posibler realizar la transacción, por favor verifique su saldo. " + Double.toString(saldo);
        }
    }

    public void retirar(){
        if(saldo>totalARetirar){
            nuevoSaldo = Double.toString(saldo - totalARetirar);
        }else if(saldo<totalAPagar){
            nuevoSaldo = "No es posibler realizar el retiro, por favor verifique su saldo. " + Double.toString(saldo);
        }
    }
}
