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
public class Pirámide extends Figuras3D {
    
    Scanner entrada= new Scanner(System.in);
    public Pirámide(){
        nombre_figura= "Pirámide ";
        color= " Dorado";
        superficie= 0;
        volumen= 0;
    }
    
    public void Superficie(){
        double p, b, h;
        System.out.println("Digite el valor del perímetro: ");
        p= entrada.nextDouble();
        System.out.println("Digite el valor de la apotema: ");
        h= entrada.nextDouble();
        System.out.println("Digite el valor del área de la base: ");
        b= entrada.nextDouble();
        
        superficie= (p*h/2)+b;
        System.out.printf("El valor de la superficie es: %.2f" , superficie);
    }
    
    public void Volumen(){
        double n, h, l, ap;
        System.out.println("Digite el número de lados: ");
        n=entrada.nextDouble();
        System.out.println("Digite el valor de la altura: ");
        h=entrada.nextDouble();
        System.out.println("Digite el valor de la longitud: ");
        l=entrada.nextDouble();
        System.out.println("Digite el valor de la apotema de la base: ");
        ap=entrada.nextDouble();
        
        
        volumen=(n*l*h*ap)/6 ;
        System.out.printf("El valor de volumen es: %.2f" , volumen);
    }
    
    public void MostrarDatos() {
        System.out.println("El nombre de la figura es: " + nombre_figura);
        System.out.println("El color de la figura es: " + color + "\n");
    }
    
    
}
