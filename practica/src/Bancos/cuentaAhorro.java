package Bancos;

public class cuentaAhorro extends CuentaBancaria{
    double tasaInteres;
    public cuentaAhorro(int numCuenta,double saldo,double tasaInteres){
        super(numCuenta,saldo);
        this.tasaInteres=tasaInteres;
    }
    public void calcularInteres(double tiempo){
        double interes=getSaldo()+(tasaInteres/100)*tiempo;
        double saldoFinal=getSaldo()+interes;
        System.out.println("Cuenta de ahorro N°:"+getNumCuenta());
        System.out.println("Interes= "+interes);
        System.out.println("Saldo final="+saldoFinal);

    }
}
