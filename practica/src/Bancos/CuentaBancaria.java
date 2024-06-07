package Bancos;

public class CuentaBancaria {
    private int numCuenta;
    private double saldo;
    public CuentaBancaria(int numCuenta,double saldo){
        this.numCuenta=numCuenta;
        this.saldo=saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    private void depositar(double monto){

    }
    private void retirar(double monto){}
}
