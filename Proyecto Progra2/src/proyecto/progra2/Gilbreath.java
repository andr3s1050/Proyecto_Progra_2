/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra2;

import java.util.Scanner;
import static java.lang.Math.abs;

/**
 *
 * @author jfeli
 */
public class Gilbreath {

    int Primos[];
    int Primos2[];
    int n;

    public void primos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la cantidad de números primos que desea");
        n = sc.nextInt();
        Primos = new int[n];
        int count = 0;
        int num = 2;

        while (count != n) { 
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) { 
                if (num % i == 0) {
                    prime = false; 
                    break;
                }
            }
            if (prime) {
                Primos[count] = num;
                count++;
                System.out.print(num + " ");

            }
            num++;
        }
        
    }

    public void procedimiento() {
        System.out.println("");

        while (Primos.length > 1) {
            Primos2 = new int[Primos.length - 1];
            for (int x = 0; x < Primos.length; x++) {
                if (x != (Primos.length - 1)) {
                    Primos2[x] = abs(abs(Primos[x + 1]) - abs(Primos[x]));
                    System.out.print(Primos2[x] + " ");
                }
            }
            Primos = Primos2;
            System.out.print("\n");
        }

    }

}
