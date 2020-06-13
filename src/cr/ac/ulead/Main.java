package cr.ac.ulead;

import cr.ac.ulead.cr.ac.ulead.ui.UIHelper;
import cr.ac.ulead.logic.Logic;


import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    private static PrintStream output = new PrintStream(System.out);
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	    EjemploCalculadoraInteres();
    }

    private static void EjemploCalculadoraInteres() {

        UIHelper ui = new UIHelper();
        Logic logic = new Logic();

        int option = 0;
        do {
            ui.showMenu();
            option = input.nextInt();
            logic.execute(option);
        } while (option != 4);
    }
}
