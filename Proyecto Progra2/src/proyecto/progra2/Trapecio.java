/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra2;

import java.util.Scanner;

public class Trapecio extends Figuras2D {

    Scanner entrada = new Scanner(System.in);

    public Trapecio() {
        nombre_figura = "Trapecio";
        color = "morado ";
        área = 0;
        perímetro = 0;
    }

    public void área() {
        double B_mayor;
        double B_menor;
        double altura;

        System.out.println("\nDigite el valor de la base mayor: ");
        B_mayor = entrada.nextDouble();
        System.out.println("Digite el valor de la base menor: ");
        B_menor = entrada.nextDouble();
        System.out.println("Digite el valor de la altura: ");
        altura = entrada.nextDouble();

        área = ((B_mayor + B_menor) / 2) * altura;
        System.out.println("El área del trapecio es: " + área);

    }

    public void perímetro() {
        double lado;

        System.out.println("\nDigite la medida del lado: ");
        lado = entrada.nextDouble();

        perímetro = lado * 4;
        System.out.printf("El perímetro del trapecio es: %.2f", perímetro);
    }

    public void MostrarDatos() {
        System.out.println("El nombre de la figura es:" + nombre_figura);
        System.out.println("El color de la figura es: " + color + "\n");

    }
}
