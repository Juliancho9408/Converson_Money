import java.util.Scanner;

public class Main {

    // Tasas de cambio estáticas (estas tasas pueden actualizarse)
    static double tasaUsdToCop = 4480.00;
    static double tasaEurToCop = 4500.00;
    static double tasaGbpToCop = 5180.00;
    static double tasaJpyToCop = 28.00;
    static double tasaCopToUsd = 1 / tasaUsdToCop;
    static double tasaCopToEur = 1 / tasaEurToCop;
    static double tasaCopToGbp = 1 / tasaGbpToCop;
    static double tasaCopToJpy = 1 / tasaJpyToCop;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mostrar opciones de conversión
        System.out.println("Bienvenido al Conversor de Monedas");
        System.out.println("Elija una opción para convertir:");
        System.out.println("1. Dólares (USD) a Pesos Colombianos (COP)");
        System.out.println("2. Euros (EUR) a Pesos Colombianos (COP)");
        System.out.println("3. Libras Esterlinas (GBP) a Pesos Colombianos (COP)");
        System.out.println("4. Yenes Japoneses (JPY) a Pesos Colombianos (COP)");
        System.out.println("5. Pesos Colombianos (COP) a Dólares (USD)");
        System.out.println("6. Pesos Colombianos (COP) a Euros (EUR)");
        System.out.println("7. Pesos Colombianos (COP) a Libras Esterlinas (GBP)");
        System.out.println("8. Pesos Colombianos (COP) a Yenes Japoneses (JPY)");

        int opcion = sc.nextInt();
        double cantidad, resultado = 0;

        // Realizar la conversión basada en la opción seleccionada
        switch(opcion) {
            case 1:
                System.out.print("Ingrese la cantidad en USD: ");
                cantidad = sc.nextDouble();
                resultado = cantidad * tasaUsdToCop;
                System.out.println(cantidad + " USD son " + resultado + " COP");
                break;
            case 2:
                System.out.print("Ingrese la cantidad en EUR: ");
                cantidad = sc.nextDouble();
                resultado = cantidad * tasaEurToCop;
                System.out.println(cantidad + " EUR son " + resultado + " COP");
                break;
            case 3:
                System.out.print("Ingrese la cantidad en GBP: ");
                cantidad = sc.nextDouble();
                resultado = cantidad * tasaGbpToCop;
                System.out.println(cantidad + " GBP son " + resultado + " COP");
                break;
            case 4:
                System.out.print("Ingrese la cantidad en JPY: ");
                cantidad = sc.nextDouble();
                resultado = cantidad * tasaJpyToCop;
                System.out.println(cantidad + " JPY son " + resultado + " COP");
                break;
            case 5:
                System.out.print("Ingrese la cantidad en COP: ");
                cantidad = sc.nextDouble();
                resultado = cantidad * tasaCopToUsd;
                System.out.println(cantidad + " COP son " + resultado + " USD");
                break;
            case 6:
                System.out.print("Ingrese la cantidad en COP: ");
                cantidad = sc.nextDouble();
                resultado = cantidad * tasaCopToEur;
                System.out.println(cantidad + " COP son " + resultado + " EUR");
                break;
            case 7:
                System.out.print("Ingrese la cantidad en COP: ");
                cantidad = sc.nextDouble();
                resultado = cantidad * tasaCopToGbp;
                System.out.println(cantidad + " COP son " + resultado + " GBP");
                break;
            case 8:
                System.out.print("Ingrese la cantidad en COP: ");
                cantidad = sc.nextDouble();
                resultado = cantidad * tasaCopToJpy;
                System.out.println(cantidad + " COP son " + resultado + " JPY");
                break;
            default:
                System.out.println("Opción no válida.");
        }
        sc.close();
    }
}