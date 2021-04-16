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
public class Rombo extends Figuras2D {

    Scanner entrada = new Scanner(System.in);

    public Rombo() {
        nombre_figura = "Rombo";
        color = "azul";
        área = 0;
        perímetro = 0;
    }

    public void área() {
        double D_mayor;
        double D_menor;

        System.out.println("\nDigite el valor de la diagonal mayor: ");
        D_mayor = entrada.nextDouble();
        System.out.println("Digite el valor de la diagonal menor: ");
        D_menor = entrada.nextDouble();

        área = (D_mayor * D_menor) / 2;
        System.out.printf("El área del rombo es: %.2f", área);

    }

    public void perímetro() {
        double lado;

        System.out.println("\nDigite la medida del lado: ");
        lado = entrada.nextDouble();

        perímetro = lado * 4;
        System.out.printf("El perímetro del rombo es: %.2f", perímetro);
    }

    public void MostrarDatos() {
        System.out.println("El nombre de la figura es: " + nombre_figura);
        System.out.println("El color de la figura es: " + color + "\n");

    }
}
