package Bancos;

public class Main {
    public static void main(String[] args){
        CuentaBancaria c1 = new CuentaBancaria(154654,1500);
        c1.retirar(50);
        c1.depositar(200.65);
    }
}
