/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra2;

import java.util.Scanner;

public class Polígono extends Figuras2D {

    Scanner entrada = new Scanner(System.in);

    public Polígono() {
        nombre_figura = "Poligono regular";
        color = "gris ";
        área = 0;
    }

    public void área() {
        double Apotema;
        double Lado;
        double nLados;

        System.out.println("\nDigite el valor de la apotema: ");
        Apotema = entrada.nextDouble();
        System.out.println("Digite el valor de uno de los lados: ");
        Lado = entrada.nextDouble();
        System.out.println("Digite el número de lados: ");
        nLados = entrada.nextDouble();

        área = (nLados * Lado * Apotema) / 2;
        System.out.println("El área del polígono es: " + área);

    }

    public void perímetro() {
        double lado, nLados;

        System.out.println("Digite el número de lados: ");
        nLados = entrada.nextDouble();
        System.out.println("Digite la medida del lado: ");
        lado = entrada.nextDouble();

        perímetro = lado * nLados;
        System.out.printf("El perímetro del polígono es es: %.2f ", perímetro);
    }

    public void MostrarDatos() {
        System.out.println("El nombre de la figura es: " + nombre_figura);
        System.out.println("El color de la figura es: " + color + "\n");

    }
}
