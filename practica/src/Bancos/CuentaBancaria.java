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
        double saldoFinal=saldo+monto;
        System.out.println(saldoFinal);
    }
    public void retirar(double monto){
        double saldoFinal=saldo-monto;
        System.out.println(saldoFinal);
    }
}
