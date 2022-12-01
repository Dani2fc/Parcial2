package modelo;

public class CuentaCorriente {
    // Atributos
    protected double saldo;
    protected double totalAPagar;
    protected String nombreTitular;
    protected double totalARetirar;
    private String nuevoSaldo;
    public String cuenta;
    

    // Constructor
    public CuentaCorriente(String nt, int s, int tap, int taa){
        this.nombreTitular = nt;
        this.saldo = s;
        this.totalAPagar = tap;
        this.totalARetirar = taa;
    }

    public CuentaCorriente(){
        this.nombreTitular = "";
        this.saldo = 0;
        this.totalAPagar = 0;
        this.totalARetirar = 0;
    }

    // Métodos
    public void pagar(){
        if(saldo>totalAPagar){
            nuevoSaldo = Double.toString(saldo - totalAPagar);
        }else if(saldo<totalAPagar){
            nuevoSaldo = "No es posibler realizar la compra, por favor verifique su saldo. " + Double.toString(saldo);
        }
    }

    public String toString(){
        return "El estado de su cuenta en este momento es: " + nuevoSaldo;
    }

    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }
    
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getTotalARetirar() {
        return totalARetirar;
    }

    public void setTotalARetirar(double totalARetirar) {
        this.totalARetirar = totalARetirar;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
