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
public class Rectángulo extends Figuras2D {

    Scanner entrada = new Scanner(System.in);

    public Rectángulo() {
        nombre_figura = "Rectángulo";
        color = "Anaranjado";
        área = 0;
        perímetro = 0;
    }

    public void área() {
        double Base;
        double Altura;

        System.out.println("\nDigite el valor de la base: ");
        Base = entrada.nextDouble();
        System.out.println("Digite el valor de la altura: ");
        Altura = entrada.nextDouble();

        área = (Base * Altura);
        System.out.printf("El área del Rectángulo es: %.2f", área);

    }

    public void perímetro() {
        double lado1, lado2;

        System.out.println("\nDigite la medida del lado 1: ");
        lado1 = entrada.nextDouble();
        System.out.println("Digite la medida del lado 2: ");
        lado2 = entrada.nextDouble();

        perímetro = (lado1 * 2) + (lado2 * 2);
        System.out.printf("El perímetro del rectángulo es: %.2f", perímetro);
    }

    public void MostrarDatos() {
        System.out.println("El nombre de la figura es:" + nombre_figura);
        System.out.println("El color del rectángulo es:" + color + "\n");

    }

}
