/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejconcesionaria;

/**
 *
 * @author Ian Araujo
 */
public class Auto implements Vehiculo {
    
    int puertas;
    String precio;
    String marca;
    String modelo;
        
    //Setters
    @Override
    public void SetMarca( String nMarca ){
        marca = nMarca;
    }
    
    @Override
    public void SetModelo( String nModelo ){
        modelo = nModelo;
    }
    
    @Override
    public void SetPrecio( String nPrecio ){
        precio = nPrecio;
    } 
    
    public void SetPuertas( int nPuertas ){
        puertas = nPuertas;
    }
    //Getters
    @Override
    public String GetMarca(){
        return marca;
    }
    
    @Override
    public String GetModelo(){
        return modelo;
    }
    
    @Override
    public String GetPrecio(){
        return precio;
    }
    
    public int GetPuertas(){
        return puertas;
    }
    
    @Override
    public String GetPrecioFormat(){
        String strPrecio = String.format ("%,.2f", Float.parseFloat(this.GetPrecio()));
        return strPrecio;
    }

    @Override
    public void MostrarInfo(){
        System.out.println("Marca: " + this.GetMarca() + " // Modelo: " + this.GetModelo() + " // Puertas: " + this.GetPuertas() + " // Precio: $" + this.GetPrecioFormat()+ "\n");
    }
}
