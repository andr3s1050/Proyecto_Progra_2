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
public class Cilindro extends Figuras3D {
    
     Scanner entrada= new Scanner(System.in);
    public Cilindro(){
        nombre_figura= "Cilindro ";
        color= " Café";
        superficie= 0;
        volumen= 0;
        
    }
    public void Superficie(){
        double r, h;
        System.out.println("Digite el valor del radio: ");
        r= entrada.nextDouble();
        System.out.println("Digite el valor de la altura: ");
        h= entrada.nextDouble();
   
        superficie= (2* Math.PI * r*h) + (2* Math.PI *Math.pow(r, 2));
        System.out.printf("El valor de la superficie es: %.2f" , superficie);
    }
    
    public void Volumen(){
        double r, h ;
        System.out.println("Digite el valor del radio: ");
        r=entrada.nextDouble();
        System.out.println("Digite el valor de la altura: ");
        h=entrada.nextDouble();
        
        volumen= Math.PI * Math.pow(r, 2) * h;
        System.out.printf(" El valor del volumen es: %.2f" , volumen);
    }
    
     public void MostrarDatos() {
        System.out.println("El nombre de la figura es: " + nombre_figura);
        System.out.println("El color de la figura es: " + color + "\n");
    }
    
}
