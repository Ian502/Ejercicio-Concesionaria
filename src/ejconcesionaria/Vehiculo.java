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
public interface Vehiculo{

    public String GetMarca();
    public String GetModelo();
    public String GetPrecio();
    public String GetPrecioFormat();
    
    public void SetMarca(String nMarca);
    public void SetModelo(String nModelo);
    public void SetPrecio(String nPrecio);
    
    public void MostrarInfo();
}
