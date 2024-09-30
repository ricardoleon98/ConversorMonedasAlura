import java.util.Scanner;

public class Conversor {

    public static void convertir(String monedaFrom, String monedaTo, CalcularMoneda calculo, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = calculo.buscarMoneda(monedaFrom, monedaTo);
        System.out.println("La tasa de conversion para hoy es "+monedaFrom+ " = "+monedas.conversion_rate()+" "+monedaTo);
        System.out.println("Ingrese la cantidad de " + monedaFrom);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+ " " + monedaFrom +" = " +cantidadConvertida + " " + monedas.to_code());
    }
    public static void convertirOtraMoneda(CalcularMoneda calculo, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda a convertir: ");
        String monedaFrom = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda que desea");
        String monedaTo = lectura.nextLine().toUpperCase();
        convertir(monedaFrom, monedaTo, calculo, lectura);
    }

}
