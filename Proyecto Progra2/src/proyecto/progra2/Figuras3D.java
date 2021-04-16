/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.progra2;


abstract class Figuras3D {
    
    public String nombre_figura;
    public String color;
    public double superficie;
    public double volumen;
    
    public abstract void Superficie();
    public abstract void Volumen();
    public abstract void MostrarDatos();
    
   
    
    
}
