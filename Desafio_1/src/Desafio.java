import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Irais";
        String tipoCuenta = "Corriente";
        double saldo = 2158.30;
        int opcion = 0;

        System.out.println("**********************************");
        System.out.println("\n Cliente:" + nombre);
        System.out.println("Tipo cuenta: " + tipoCuenta);
        System.out.println("Saldo: " + saldo + "$");
        System.out.println("\n**********************************");

        String menu = """
                ***Seleeciona la opción deseada: ***
                1.- Consulta de saldo
                2.- Retiro
                3.- Depósito
                4.- Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion !=9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo es: " + saldo+ "$");
                    break;
                case  2:
                    System.out.println("¿Cuánto deseas retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo ){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo = saldo - valorARetirar;
                        System.out.println("Saldo actual: " +saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuánto deseas depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("Saldo actual: " +saldo);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }
}
