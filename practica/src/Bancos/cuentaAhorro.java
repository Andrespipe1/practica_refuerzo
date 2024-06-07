package Bancos;

public class cuentaAhorro extends CuentaBancaria{
    double tasaInteres;
    public cuentaAhorro(int numCuenta,double saldo,double tasaInteres){
        super(numCuenta,saldo);
        this.tasaInteres=tasaInteres;
    }

}
