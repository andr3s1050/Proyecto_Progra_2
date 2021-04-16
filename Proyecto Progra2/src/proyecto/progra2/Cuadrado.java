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
public class Cuadrado extends Figuras2D {

    Scanner entrada = new Scanner(System.in);

    public Cuadrado() {
        nombre_figura = "Cuadrado ";
        color = "verde";
        área = 0;
        perímetro = 0;

    }

    public void área() {
        double lado;

        System.out.println("\nDigite el valor de uno de los lados: ");
        lado = entrada.nextDouble();

        área = (lado * lado);
        System.out.println("El área del cuadrado es: " + área);

    }

    public void perímetro() {
        double lado;

        System.out.println("\nDigite la medida del lado: ");
        lado = entrada.nextDouble();

        perímetro = lado * 4;
        System.out.printf("El perímetro del cuadrado es: %.2f ", perímetro);
    }

    public void MostrarDatos() {
        System.out.println("El nombre de la figura es: " + nombre_figura);
        System.out.println("El color de la figura es: " + color + "\n");

    }
}
