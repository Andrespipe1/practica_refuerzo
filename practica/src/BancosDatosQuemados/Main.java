package BancosDatosQuemados;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        CuentaBancaria c1 = new CuentaBancaria(154654,1500);
        cuentaAhorro c2 = new cuentaAhorro(154654,1000,17.80);
        cuentaCorriente c3 = new cuentaCorriente(154658, 2000, 5000, 7);
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Bienvenido-----");
        System.out.println("----Ingrese una opción-----");
        System.out.println("Menú:");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Descubierto Bancario");
        System.out.println("4. Interes");
        System.out.print("Ingrese una opcion: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Deposito");
                c1.depositar(200.65);
                c2.depositar(20);
                break;
            case 2:
                System.out.println("Retiro");
                c1.retirar(50);
                c2.retirar(20);
                break;
            case 3:
                System.out.println("Retiro");
                c1.retirar(50);
                c2.retirar(20);
                c3.limDescubierto(2000);
                break;
            case 4:
                System.out.println("Retiro");
                c1.retirar(50);
                c2.retirar(20);
                c2.calcularInteres(2);
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
