package BancosDatosQuemados;

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
        System.out.println("Deposito");
        double saldoFinal=saldo+monto;
        System.out.println(saldoFinal);
    }
    public void retirar(double monto){
        System.out.println("Retiro");
        double saldoFinal=saldo-monto;
        System.out.println(saldoFinal);
    }
}
