/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra2;

import java.util.Scanner;

public class Ulmann implements Conjeturas {

    Scanner entrada = new Scanner(System.in);

    public Ulmann() {
        String nombre = "Conjetura de Ulmann";

    }

    public void procedimiento() {
        int num;
        System.out.println("Digite un número");
        num = entrada.nextInt();
        System.out.println("La conjetura del número " + num + " es: ");
        if (num > 0) {

            while (num != 1) {
                System.out.println(num);
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = (num * 3) + 1;
                }
            }
        } else {
            System.out.println("El número ingresado no es válido");
        }

    }

}
