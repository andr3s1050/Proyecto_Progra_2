/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra2;

import java.util.Scanner;

/**
 *
 * @author jfeli
 */
public class Círculo extends Figuras2D {

    Scanner entrada = new Scanner(System.in);

    public Círculo() {
        nombre_figura = "Círculo ";
        color = "rojo";
        área = 0;
        perímetro = 0;

    }

    public void área() {
        double radio;

        System.out.println("Indique el radio del circulo: ");
        radio = entrada.nextDouble();

        área = Math.PI * Math.pow(radio, 2);
        System.out.printf("El area del circulo es: %.2f", área);

    }

    public void perímetro() {
        double radio;

        System.out.println("\nDigite la medida del radio: ");
        radio = entrada.nextDouble();

        perímetro = 2 * Math.PI * radio;
        System.out.printf("El perímetro del círculo es: %.2f ", perímetro);
    }

    public void MostrarDatos() {
        System.out.println("El nombre de la figura es: " + nombre_figura);
        System.out.println("El color de la figura es: " + color + "\n");

    }

}
