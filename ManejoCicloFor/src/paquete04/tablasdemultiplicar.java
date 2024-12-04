/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Scanner;
import java.util.Locale;

public class tablasdemultiplicar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int limite;
        int numTabla;
        int contador2 = 1;
        int numero = 1;
        int operacion;

        System.out.println("Ingrese hasta que tabla quiere presentar:");
        numTabla = entrada.nextInt();

        System.out.println("Ingrese el limite de las tablas:");
        limite = entrada.nextInt();

        while (numero <= numTabla) {
            System.out.println("Tabla del " + numero + ":");
            while (contador2 <= limite) {
                operacion = numero * contador2;
                System.out.printf("%d x %d = %d\n", 
                        numero, 
                        contador2, 
                        operacion);
                
                contador2 = contador2 + 1;
            }
            contador2 = 1;
            numero = numero + 1;
        }

    }

}
