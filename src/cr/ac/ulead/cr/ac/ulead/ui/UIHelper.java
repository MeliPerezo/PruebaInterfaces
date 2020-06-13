package cr.ac.ulead.cr.ac.ulead.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UIHelper {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    public void showMenu() {
        output.println("Calculadora de Interes simple");
        output.println("Indique el periodo de calculo");
        output.println("1. Dias");
        output.println("2. Meses");
        output.println("3. Annos");
        output.println("4. Salir");
    }

    public void wrongOption() {
        output.println("Opcion incorrecta!");
    }

    public void askForPeriod(String period) {
        output.println("Cuantos " + period + " desea calcular?");
    }

    public float readAmount() {
        output.println("Introduzca el monto: ");
        return input.nextFloat();
    }

    public float readInteres() {
        output.println("Introduzca la taza de interes: ");
        return input.nextFloat();
    }


    public int getPeriodSize(String period) {
        output.println("Introduzca la cantidad de " + period);
        return input.nextInt();
    }

    public void printResult(float resultado, String tipoPeriodo) {
        output.println("Para los " + tipoPeriodo + " dados, el interés es:" + resultado);
    }

    public void printMessage(String message) {
        output.println(message);
    }
}
