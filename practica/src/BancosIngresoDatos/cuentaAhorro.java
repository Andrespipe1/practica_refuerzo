package BancosIngresoDatos;

import BancosDatosQuemados.CuentaBancaria;

public class cuentaAhorro extends CuentaBancaria {
    double tasaInteres;
    public cuentaAhorro(int numCuenta, double saldo, double tasaInteres){
        super(numCuenta,saldo);
        this.tasaInteres=tasaInteres;
    }
    @Override
    public void retirar(double monto){
        super.retirar(monto);
        System.out.println("Cuenta ahorros");
        double saldoFinal=getSaldo()-monto;
        System.out.println(saldoFinal);
    }
    @Override
    public void depositar(double monto){
        super.depositar(monto);
        System.out.println("Cuenta ahorros");
        double saldoFinal=getSaldo()+monto;
        System.out.println(saldoFinal);
    }
    public void calcularInteres(int tiempo){
        double interes=getSaldo()+(tasaInteres/100)*tiempo;
        double saldoFinal=getSaldo()+interes;
        System.out.println("Cuenta de ahorro N°:"+getNumCuenta());
        System.out.println("Interes= "+interes);
        System.out.println("Saldo final="+saldoFinal);

    }
}
