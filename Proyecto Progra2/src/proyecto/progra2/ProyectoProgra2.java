/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra2;

import java.util.Scanner;

public class ProyectoProgra2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu;
        Triángulo triángulo1 = new Triángulo();
        Figuras2D cuadrado1 = new Cuadrado();
        Figuras2D rectangulo1 = new Rectángulo();
        Figuras2D Círculo1 = new Círculo();
        Figuras2D rombo1 = new Rombo();
        Figuras2D trapecio1 = new Trapecio();
        Figuras2D romboide1 = new Romboide();
        Figuras2D poligono1 = new Polígono();

        Figuras3D piramide1 = new Pirámide();
        Figuras3D esfera1 = new Esfera();
        Figuras3D cilindro1 = new Cilindro();
        Figuras3D hexaedro1 = new Hexaedro();
        Figuras3D prisma1 = new Prisma();
        Figuras3D cono1 = new Cono();

        Conjeturas ulmann1 = new Ulmann();
        Gilbreath gilbreath1 = new Gilbreath();

        do {
            System.out.println("\nElija una opción: ");
            System.out.println("--------------------------------");
            System.out.println("1) Areas de figuras planas (2D) ");
            System.out.println("2) Perimetros de figuras planas (2D) ");
            System.out.println("3) Superficies ");
            System.out.println("4) Volumenes ");
            System.out.println("5) Conjeturas ");
            System.out.println("6) Salir ");
            System.out.println("--------------------------------");
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    int figura;

                    do {
                        System.out.println("\nElija la figura de la que desea calcular el area: ");
                        System.out.println("--------------------------------");
                        System.out.println("1) Circulo ");
                        System.out.println("2) Triangulo ");
                        System.out.println("3) Cuadrado ");
                        System.out.println("4) Rectangulo ");
                        System.out.println("5) Rombo ");
                        System.out.println("6) Trapecio ");
                        System.out.println("7) Romboide ");
                        System.out.println("8) Poligonos regulares ");
                        System.out.println("9) Regresar al menu ");
                        System.out.println("--------------------------------");
                        figura = entrada.nextInt();

                        switch (figura) {
                            case 1:

                                Círculo1.MostrarDatos();
                                Círculo1.área();
                                break;

                            case 2:
                                int triangulo;

                                do {
                                    System.out.println("\nElija la forma en la que desea calcular el area del triangulo: ");
                                    System.out.println("--------------------------------");
                                    System.out.println("1) Formula tradicional ");
                                    System.out.println("2) Formula de Heron ");
                                    System.out.println("3) Regresar al menu ");
                                    System.out.println("--------------------------------");
                                    triangulo = entrada.nextInt();

                                    switch (triangulo) {
                                        case 1:
                                            triángulo1.MostrarDatos();
                                            triángulo1.área();
                                            break;

                                        case 2:
                                            triángulo1.MostrarDatos();
                                            triángulo1.Herón();
                                            break;

                                        default:
                                            System.out.println("Regresando al menu. ");
                                    }
                                } while (triangulo < 3);
                                break;

                            case 3: //Cuadrado
                                cuadrado1.MostrarDatos();
                                cuadrado1.área();
                                break;

                            case 4: //Rectángulo
                                rectangulo1.MostrarDatos();
                                rectangulo1.área();
                                break;

                            case 5: //Rombo
                                rombo1.MostrarDatos();
                                rombo1.área();
                                break;

                            case 6: //Trapecio
                                trapecio1.MostrarDatos();
                                trapecio1.área();
                                break;

                            case 7: //Romboide
                                romboide1.MostrarDatos();
                                romboide1.área();
                                break;

                            case 8: //Polígonos
                                poligono1.MostrarDatos();
                                poligono1.área();

                                break;

                            default:
                                System.out.println("Regresando al menu principal. ");
                        }
                    } while (figura < 9);
                    break;
                case 2:
                    int figuraP;

                    do {

                        System.out.println("\nElija la figura de la que desea calcular el perimetro: ");
                        System.out.println("--------------------------------");
                        System.out.println("1) Circulo ");
                        System.out.println("2) Triangulo ");
                        System.out.println("3) Cuadrado ");
                        System.out.println("4) Rectangulo ");
                        System.out.println("5) Rombo ");
                        System.out.println("6) Trapecio ");
                        System.out.println("7) Romboide ");
                        System.out.println("8) Poligonos regulares ");
                        System.out.println("9) Regresar al menu ");
                        System.out.println("--------------------------------");
                        figuraP = entrada.nextInt();

                        switch (figuraP) {
                            case 1:
                                Círculo1.MostrarDatos();
                                Círculo1.perímetro();

                                break;

                            case 2:
                                triángulo1.MostrarDatos();
                                triángulo1.perímetro();
                                break;

                            case 3:
                                cuadrado1.MostrarDatos();
                                cuadrado1.perímetro();
                                break;

                            case 4:
                                rectangulo1.MostrarDatos();
                                rectangulo1.perímetro();
                                break;

                            case 5:
                                rombo1.MostrarDatos();
                                rombo1.perímetro();

                                break;

                            case 6:
                                trapecio1.MostrarDatos();
                                trapecio1.perímetro();
                                break;

                            case 7:
                                romboide1.MostrarDatos();
                                romboide1.perímetro();
                                break;

                            case 8:
                                poligono1.MostrarDatos();
                                poligono1.perímetro();
                                break;

                            default:
                                System.out.println("Regresando al menu principal. ");
                        }
                    } while (figuraP < 9);
                    break;
                case 3:
                    int figuraS;

                    do {
                        System.out.println("\nElija la figura de la que desea calcular la superficie: ");
                        System.out.println("--------------------------------");
                        System.out.println("1) Esfera ");
                        System.out.println("2) Cilindro ");
                        System.out.println("3) Cono ");
                        System.out.println("4) Hexaedro regular ");
                        System.out.println("5) Prisma ");
                        System.out.println("6) Piramide regular ");
                        System.out.println("7) Regresar al menu ");;
                        System.out.println("--------------------------------");
                        figuraS = entrada.nextInt();

                        switch (figuraS) {
                            case 1://Esfera
                                esfera1.MostrarDatos();
                                esfera1.Superficie();
                                break;

                            case 2://Cilindro
                                cilindro1.MostrarDatos();
                                cilindro1.Superficie();
                                break;

                            case 3://Cono
                                cono1.MostrarDatos();
                                cono1.Superficie();
                                break;

                            case 4://Hexaedro
                                hexaedro1.MostrarDatos();
                                hexaedro1.Superficie();
                                break;

                            case 5://Prisma
                                prisma1.MostrarDatos();
                                prisma1.Superficie();
                                break;

                            case 6://Piramide
                                piramide1.MostrarDatos();
                                piramide1.Superficie();
                                break;

                            default:
                                System.out.println("Regresando al menu principal. ");
                        }
                    } while (figuraS < 7);
                    break;

                case 4:
                    int figuraV;

                    do {
                        System.out.println("\nElija la figura de la que desea calcular el volumen: ");
                        System.out.println("--------------------------------");
                        System.out.println("1) Esfera ");
                        System.out.println("2) Cilindro ");
                        System.out.println("3) Cono ");
                        System.out.println("4) Hexaedro regular ");
                        System.out.println("5) Prisma ");
                        System.out.println("6) Piramide regular ");
                        System.out.println("7) Regresar al menu ");;
                        System.out.println("--------------------------------");
                        figuraV = entrada.nextInt();

                        switch (figuraV) {
                            case 1:
                                esfera1.MostrarDatos();
                                esfera1.Volumen();
                                break;

                            case 2:
                                cilindro1.MostrarDatos();
                                cilindro1.Volumen();
                                break;

                            case 3:
                                cono1.MostrarDatos();
                                cono1.Volumen();
                                break;

                            case 4:
                                hexaedro1.MostrarDatos();
                                hexaedro1.Volumen();
                                break;

                            case 5:
                                prisma1.MostrarDatos();
                                prisma1.Volumen();
                                break;

                            case 6:
                                piramide1.MostrarDatos();
                                piramide1.Volumen();
                                break;

                            default:
                                System.out.println("Regresando al menu principal. ");
                        }
                    } while (figuraV < 7);
                    break;

                case 5:
                    int conjetura;

                    do {
                        System.out.println("\nElija la conjetura que desea probar: ");
                        System.out.println("--------------------------------");
                        System.out.println("1) Conjetura de Ulmann ");
                        System.out.println("2) Conjetura de Gilbreath ");
                        System.out.println("3) Regresar al menu ");
                        System.out.println("--------------------------------");
                        conjetura = entrada.nextInt();

                        switch (conjetura) {
                            case 1: //Ulmann
                                ulmann1.procedimiento();
                                break;

                            case 2: //Gilbreath
                                gilbreath1.primos();
                                gilbreath1.procedimiento();
                                break;

                            default:
                                System.out.println("Regresando al menu principal. ");
                        }
                    } while (conjetura < 3);
                    break;

                default:
                    System.out.println("Saliendo del menu");
            }
        } while (menu < 6);
    }

}
