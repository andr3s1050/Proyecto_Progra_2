/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra2;

import java.util.Scanner;

public class Esfera extends Figuras3D {

    Scanner entrada = new Scanner(System.in);

    public Esfera() {
        nombre_figura = "Esfera ";
        color = " Blanco";
        superficie = 0;
        volumen = 0;

    }

    public void Superficie() {
        double r;
        System.out.println("Digite el valor del radio: ");
        r = entrada.nextDouble();

        superficie = 4 * Math.PI * Math.pow(r, 2);
        System.out.printf("El valor de la superficie es: %.2f", superficie);
    }

    public void Volumen() {
        double r;
        System.out.println("Digite el valor del radio: ");
        r = entrada.nextDouble();

        volumen = (Math.pow(r, 3) * 4 / 3) * Math.PI;
        System.out.printf("El valor de volumen es: %.2f", volumen);
    }

    public void MostrarDatos() {
        System.out.println("El nombre de la figura es: " + nombre_figura);
        System.out.println("El color de la figura es: " + color + "\n");
    }
}
