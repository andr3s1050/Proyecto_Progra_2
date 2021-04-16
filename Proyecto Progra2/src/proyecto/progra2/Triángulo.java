/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra2;

import java.util.Scanner;

public class Triángulo extends Figuras2D {

    Scanner entrada = new Scanner(System.in);

    public Triángulo() {
        nombre_figura = "Triángulo";
        color = "Amarillo";
        área = 0;
        perímetro = 0;
    }

    public void área() {
        double base;
        double altura;

        System.out.println("\nDigite el valor de la base: ");
        base = entrada.nextDouble();
        System.out.println("Digite el valor de la altura: ");
        altura = entrada.nextDouble();

        área = (base * altura) / 2;
        System.out.printf("El área del triángulo es: %.2f ", área);

    }

    public void Herón() {
        double lado1, lado2, lado3, S;

        System.out.println("\nDigite la medida del primer lado: ");
        lado1 = entrada.nextDouble();
        System.out.println("Digite la medida del segundo lado: ");
        lado2 = entrada.nextDouble();
        System.out.println("Digite la medida del tercer lado: ");
        lado3 = entrada.nextDouble();

        S = (lado1 + lado2 + lado3) / 2;

        double area_heron = (double) Math.sqrt(S) * (S - lado1) * (S - lado2) * (S - lado3);
        System.out.printf("El resultado calculado del área con fórmula de Herón es: %.2f ", area_heron, "\n");

    }

    public void perímetro() {
        double lado;

        System.out.println("\nDigite la medida del lado: ");
        lado = entrada.nextDouble();

        perímetro = lado * 3;
        System.out.printf("El perímetro del triángulo es: %.2f ", perímetro , "\n");
    }

    public void MostrarDatos() {
        System.out.println(" El nombre de la figura es: " + nombre_figura);
        System.out.println("El color de la figura es: " + color + "\n");

    }
}
