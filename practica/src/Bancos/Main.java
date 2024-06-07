package Bancos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        CuentaBancaria c1 = new CuentaBancaria(154654,1500);
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Bienvenido-----");
        System.out.println("----Ingrese una opción-----");
        System.out.println("Menú:");
        System.out.println("1. Depositar 1");
        System.out.println("2. Retirar 2");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Deposito");
                c1.depositar(200.65);
                break;
            case 2:
                System.out.println("Retiro");
                c1.retirar(50);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
