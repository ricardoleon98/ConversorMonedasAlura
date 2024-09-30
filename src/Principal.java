import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        CalcularMoneda calculo = new CalcularMoneda();

        int opcion=0;
        while (opcion != 8){
            System.out.println("******************\n" +
                    "Bienvenido al conversor de monedas\n" +
                    "Ingrese la conversion que desea realizar\n\n" +
                    "1. Dolar a peso argentino\n"+
                    "2. Peso Argentino a Dolar\n" +
                    "3. Dolar a Real Brasilero\n" +
                    "4. Real Brasilero a Dolar\n" +
                    "5. Dolar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dolar\n" +
                    "7. Convertir otra moneda\n" +
                    "8.Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    Conversor.convertir("USD", "ARS", calculo, lectura);
                    break;
                case 2:
                    Conversor.convertir("ARS", "USD", calculo, lectura);
                    break;
                case 3:
                    Conversor.convertir("USD", "BRL", calculo, lectura);
                    break;
                case 4:
                    Conversor.convertir("BRL", "USD", calculo, lectura);
                    break;
                case 5:
                    Conversor.convertir("USD", "COP", calculo, lectura);
                    break;
                case 6:
                    Conversor.convertir("COP", "USD", calculo, lectura);
                    break;
                case 7:
                    Conversor.convertirOtraMoneda(calculo, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo.....");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }
    }
}