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
public class Moto implements Vehiculo{
    
    int cilindrada;
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
    
    public void SetCilindrada( int nCilindrada ){
        cilindrada = nCilindrada;
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
    
    public int GetCilindrada(){
        return cilindrada;
    }
    
    @Override
    public String GetPrecioFormat(){
        String strPrecio = String.format ("%,.2f", Float.parseFloat(this.GetPrecio()));
        return strPrecio;
    }
    
    @Override
    public void MostrarInfo(){
        System.out.println("Marca: " + this.GetMarca() + " // Modelo: " + this.GetModelo() + " // PCilindrada: " + this.GetCilindrada() + "cc // Precio: $" + this.GetPrecioFormat());
    }
}
