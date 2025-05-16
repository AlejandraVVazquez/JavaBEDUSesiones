
import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //solicitar datos al usuario
        System.out.println("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.println("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.println("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        //Calculo total
        double totalSinDescuento = precioUnitario * cantidad;

        //Evaluar si aplica descuento usando operador ternario
        var aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

        //Total con descuento
        double totalConDescuento = totalSinDescuento - descuento;

        //Resumen
        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento; " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

        scanner.close();
    }
}
