/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejemplo02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero1 = 1;
        int numero2 = 1;
        int multiplicacion = 0;
        int numT;
        int limiteT;

        System.out.println("Ingrese hasta que tabla quiere generar");
        numT = entrada.nextInt();
        System.out.println("Ingrese el limite de la tabla");
        limiteT = entrada.nextInt();

        while (numero1 <= numT) {
            while (numero2 <= limiteT) {
                multiplicacion = numero1 * numero2;
                System.out.printf("%d * %d = %d\n",
                        numero1,
                        numero2,
                        multiplicacion);
                numero2 = numero2 + 1;
            }
            numero2 = 1;
            numero1 = numero1 + 1;
        }
    }
}
