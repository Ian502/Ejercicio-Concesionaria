/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejconcesionaria;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Ian Araujo
 */
public class EjConcesionaria {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        ArrayList<Vehiculo>  autosEnVenta = new ArrayList<>();
        InitAutos(autosEnVenta); // inicializamos los autos al arraylist
        MostrarAutos(autosEnVenta); // mostramos los autos del arraylist
        System.out.println( "=======================================\n" ); // Separador
        EsCaroBarato(autosEnVenta); // hacemos las comparaciones Caro Barato, modelo contiene Y       
    }
    
    static void InitAutos(ArrayList<Vehiculo> AEV){
        //Agregar 206
        Auto peugeseis = new Auto();
        peugeseis.SetMarca("Peugeot");
        peugeseis.SetModelo("206");
        peugeseis.SetPuertas(4);
        peugeseis.SetPrecio("200000.00");
        AEV.add(peugeseis);
        
        //Agregar Honda Titan
        Moto htitan = new Moto();
        htitan.SetMarca("Honda");
        htitan.SetModelo("Titan");
        htitan.SetCilindrada(125);
        htitan.SetPrecio("60000.00");
        AEV.add(htitan);
        
        //Agregar 208
        Auto peugeocho = new Auto();
        peugeocho.SetMarca("Peugeot");
        peugeocho.SetModelo("208");
        peugeocho.SetPuertas(5);
        peugeocho.SetPrecio("250000.00");
        AEV.add(peugeocho);
        
        //Agregar Yamaha
        Moto yamaybr = new Moto();
        yamaybr.SetMarca("Yamaha");
        yamaybr.SetModelo("YBR");
        yamaybr.SetCilindrada(160);
        yamaybr.SetPrecio("80500.50");
        AEV.add(yamaybr);
    }
    
    static void MostrarAutos(ArrayList<Vehiculo> AEV){
        for (int i = 0; i<AEV.size(); i++){
            AEV.get(i).MostrarInfo();
            //System.out.println( "\n" );// Al final del Método Mostrar info ya hay un NewLine
        }
    }
    
    //implementar comparacion
    static void EsCaroBarato(ArrayList<Vehiculo> AEV){
        int indiceCaro = 0; // el índice en el que está el auto más caro
        double masCaro = 0; // lo que sale el más caro
        int indiceBarato = 0; // el índice en el que se encuetnra el auto más barato
        double masBarato = 9999999.99; // un precio alto para comparar con el más barato
        int indiceY = -1; // índice en el que se encuetnra el vehículo con Y, -1 porque si no retorna el primero de la lista.
        
        for (int i = 0; i<AEV.size(); i++){
            if ( Float.parseFloat(AEV.get(i).GetPrecio()) > masCaro ){ // Si es más caro que el actual
                indiceCaro = i; // poner el índice de la lista en la que se encuentra
                masCaro = Float.parseFloat(AEV.get(i).GetPrecio()); // cuánto sale?
            }
            
            if ( Float.parseFloat(AEV.get(i).GetPrecio()) < masBarato ){ // Sie s más barato que el más barato
                indiceBarato = i; // poner el índice de la lista en la que se encuentra
                masBarato = Float.parseFloat(AEV.get(i).GetPrecio()); // cuánto sale?
            }
            
            if ( AEV.get(i).GetModelo().contains("Y")){ // asume que un solo vehículo puede contener Y
                indiceY = i; // Se puede mejorar agregando los indíces a un arraylist, y después mostrándolos, en un forloop.
            }
        }
        System.out.println( "Vehiculo más caro: " + AEV.get(indiceCaro).GetMarca() + " " + AEV.get(indiceCaro).GetModelo() + "\n"  ); 
        System.out.println( "Vehiculo más barato: " + AEV.get(indiceBarato).GetMarca() + " " + AEV.get(indiceBarato).GetModelo() + "\n" );
        if (indiceY != -1){ // si cambió el índice, mostralo
            System.out.println( "Vehiculo que contiene en el modelo la letra 'Y': " + AEV.get(indiceY).GetMarca() + " " + AEV.get(indiceY).GetModelo() +  " $" + AEV.get(indiceY).GetPrecioFormat() + "\n" );
        }
    }
    
    //Extra
    static void OrdenarPorPrecio(ArrayList<Vehiculo> AEV){
        
    }
}
