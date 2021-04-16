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
public class Prisma extends Figuras3D {

    Scanner entrada = new Scanner(System.in);

    public Prisma() {
        nombre_figura = "Prisma hexagonal ";
        color = " Rojo ";
        superficie = 0;
        volumen = 0;

    }

    /*
    sout opción
    switch (case 1 (triangular), case 2 (cubo, rectangulo), case 3 más lados (sout pida lados)
     */
    public void Superficie() {
        double l, ap, h;
        System.out.println("Digite el valor de uno de los lados: ");
        l = entrada.nextDouble();
        System.out.println("Digite el valor de la apotema: ");
        ap = entrada.nextDouble();
        System.out.println("Digite el valor de la altura: ");
        h = entrada.nextDouble();

        superficie = 6 * l * (ap + h);
        System.out.printf("El valor de la superficie es: %.2f", superficie, "\n");

    }

    //hace falta terminar el volumen del prisma
    public void Volumen() {
        double l, ap, h;
        System.out.println("Digite el valor de uno de los lados: ");
        l = entrada.nextDouble();
        System.out.println("Digite el valor de la apotema: ");
        ap = entrada.nextDouble();
        System.out.println("Digite el valor de la altura: ");
        h = entrada.nextDouble();

        volumen = 3*l * ap*h;
        System.out.printf(" El valor del volumen es: %.2f", volumen , "\n");
    }

    public void MostrarDatos() {
        System.out.println("El nombre de la figura es: " + nombre_figura);
        System.out.println("El color de la figura es: " + color + "\n");
    }

}
