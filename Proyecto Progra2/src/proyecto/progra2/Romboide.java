/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra2;

import java.util.Scanner;

public class Romboide extends Figuras2D {

    Scanner entrada = new Scanner(System.in);

    public Romboide() {
        nombre_figura = "Romboide";
        color = "negro ";
        área = 0;
    }

    public void área() {
        double Base;
        double altura;

        System.out.println("\nDigite el valor de la base: ");
        Base = entrada.nextDouble();
        System.out.println("Digite el valor de la altura: ");
        altura = entrada.nextDouble();

        área = (Base * altura);
        System.out.println("El área del romboide es: " + área);

    }

    public void perímetro() {
        double lado;

        System.out.println("Digite la medida del lado: ");
        lado = entrada.nextDouble();

        perímetro = lado * 4;
        System.out.printf("El perímetro del romboide es: %.2f", perímetro);
    }

    public void MostrarDatos() {
        System.out.println("El nombre de la figura es: " + nombre_figura);
        System.out.println("El color de la figura es: " + color + "\n");

    }

}
