package BancosIngresoDatos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        cuentaAhorro c2 = new cuentaAhorro(154654,1000,17.80);
        cuentaCorriente c3 = new cuentaCorriente(154658, 2000, 5000, 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Bienvenido-----");
        System.out.println("----Ingrese una opción-----");
        System.out.println("Menú:");
        System.out.println("1. Cuenta Corriente");
        System.out.println("2. Cuenta de ahorros");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opcion: ");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("¿Que accion desea realizar?");
                System.out.println("1. Deposito");
                System.out.println("2. Retiro");
                System.out.println("3. Descubierto Bancario");
                System.out.print("Ingrese una opcion: ");
                int opcC = scanner.nextInt();
                switch (opcC) {
                    case 1:
                        System.out.println("Ingrese la cantidad que desea depositar");
                        double deposito = scanner.nextDouble();
                        c3.depositar(deposito);
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad que desea retirar");
                        double retiro = scanner.nextDouble();
                        c3.retirar(retiro);
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad que desea depositar");
                        double monto = scanner.nextDouble();
                        System.out.println("Descubierto bancario");
                        c3.limDescubierto(monto);
                        break;
                }
                break;
            case 2:
                System.out.println("¿Que accion desea realizar?");
                System.out.println("1. Deposito");
                System.out.println("2. Retiro");
                System.out.println("3. Ver interes");
                System.out.print("Ingrese una opcion: ");
                int opcA = scanner.nextInt();
                switch (opcA) {
                    case 1:
                        System.out.println("Ingrese la cantidad que desea depositar");
                        double deposito = scanner.nextDouble();
                        c2.depositar(deposito);
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad que desea retirar");
                        double retiro = scanner.nextDouble();
                        c2.retirar(retiro);
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad de dias");
                        double dias = scanner.nextDouble();
                        c2.retirar(dias);
                        break;
                }
                break;
            case 3:
                System.out.println("Gracias por usar nuestro sistema");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
