package Bancos;

public class CuentaBancaria {
    int numCuenta;
    double saldo;
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

    }
    public void retirar(double monto){}
}
