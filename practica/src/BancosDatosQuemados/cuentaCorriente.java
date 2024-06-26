package BancosDatosQuemados;

class cuentaCorriente extends CuentaBancaria {
    double limiteDescubierto;
    int limitedias;

    public cuentaCorriente(int numCuenta,double saldo, double limiteDescubierto, int limitedias){
        super(numCuenta, saldo);
        this.limiteDescubierto = limiteDescubierto;
        this.limitedias = limitedias;
    }

    @Override
    public void retirar(double monto){
        System.out.println("Cuenta Corriente");
        double saldoFinal=getSaldo()-monto;
        System.out.println(saldoFinal);
    }
    @Override
    public void depositar(double monto){
        System.out.println("Cuenta Corriente");
        double saldoFinal=getSaldo()+monto;
        System.out.println(saldoFinal);
    }
    public void limDescubierto(double monto) {
        if (limitedias >= 7) {
            System.out.println("Lego al limite de 7 dias se le aplicara un cargo adicional si no cancela");
        } else if (limitedias < 6) {
            if (monto < 0) {
                double Disponible = limiteDescubierto + getSaldo();
                if (Disponible >= monto) {
                    monto -= getSaldo();
                    System.out.println("Monto: "+monto);
                } else {
                    System.out.println("Saldo insuficiente");
                }
            }
        }
    }
}
