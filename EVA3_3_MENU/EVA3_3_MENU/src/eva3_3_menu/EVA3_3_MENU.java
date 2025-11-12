/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_menu;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA3_3_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            imprimirMenu();
            opcion = input.nextInt();
            if (opcion == 1) {
                calcularPotencia();
            } else if (opcion == 2) {
                calcularSuma();
            }

        } while (opcion != 3);
        {
            System.out.println("Saliendo el sistema........");
        }
    }

    public static void imprimirMenu() {
        System.out.println("BIenvenido el sistema");
        System.out.println("1. Calcular una potencia");
        System.out.println("2. Sumar nuemreros");
        System.out.println("3. Salir del sistema");
        System.out.println("Selecciona una opcion: ");
    }

    public static void calcularPotencia() {
        Scanner input = new Scanner(System.in);
        int base, exp;
        System.out.println("Calculo de una potencia");
        System.out.println("Captura la base");
        base = input.nextInt();
        System.out.println("Captura el exponente");
        exp = input.nextInt();
        System.out.println(base + " elevado a " + exp + " = " + calcularPot(base, exp));
    }

    public static int calcularPot(int base, int expo) {
        int resu = 1;
        for (int i = 1; i <= expo; i++) {
            resu = resu * base; 

        }
        return resu;
    }

    public static void calcularSuma() {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Calculo de una suma");
        System.out.println("Captura el primer numero");
        num1 = input.nextInt();
        System.out.println("Cpatura el segundo numero");
        num2 = input.nextInt();
        System.out.println(num1 + "+" + num2 + "=" + calcularSum(num1, num2));

    }

    public static int calcularSum(int num1, int num2) {
        int resu = num1 + num2;
        return resu;
    }

}
