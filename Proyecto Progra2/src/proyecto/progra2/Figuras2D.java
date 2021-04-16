/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra2;

/**
 *
 * @author jfeli
 */
abstract class Figuras2D {

    public String nombre_figura;
    public String color;
    public double área;
    public double perímetro;

    public abstract void área();

    public abstract void MostrarDatos();

    public abstract void perímetro();

}
