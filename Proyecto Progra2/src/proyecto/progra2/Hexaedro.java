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
public class Hexaedro extends Figuras3D {
    
       Scanner entrada= new Scanner(System.in);
    public Hexaedro(){
        nombre_figura= "Hexaedro ";
        color= " Amarillo ";
        superficie= 0;
        volumen= 0;
        
    }
    
    public void Superficie(){
        double a;
        System.out.println("Digite el valor de una de las aristas: ");
        a= entrada.nextDouble();
       
        superficie= 6* Math.pow(a, 2);
        System.out.printf("El valor de la superficie es: %.2f" , superficie);
        
    }
      public void Volumen(){
        double a;
        System.out.println("Digite el valor de una de las aristas: ");
        a= entrada.nextDouble();
       
        
        volumen= Math.pow(a, 3) ;
        System.out.printf("El valor del volumen es: %.2f" , volumen);
    }
      
      public void MostrarDatos() {
        System.out.println("El nombre de la figura es: " + nombre_figura);
        System.out.println("El color de la figura es: " + color + "\n");
    }
      
    
}
