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
    public void depositar(double monto){
        saldo=saldo+monto;
        System.out.println(saldo);
    }
    public void retirar(double monto){
        saldo=saldo-monto;
        System.out.println(saldo);
    }
}
