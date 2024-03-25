///• barajar(): cambia de posición todas las cartas aleatoriamente.
//
//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
//
//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
//
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.
//
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
//
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, mostrará las cartas que no se han sacado.
package com.mycompany.trabajogrupallab;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author esteb
 */
public class Baraja {

    ArrayList<Carta> cartas = new ArrayList<>();
    private int cartasUsadas;

    public void creaBaraja() {

        String[] palo = {"Basto", "Oro", "Espada", "Copa"};
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        for (String palos : palo) {
            for (int val : valores) {
                cartas.add(new Carta(palos, val));
            }
        }

    }
    public void mostra() {
        for (Carta ele : cartas) {
            System.out.println(ele);
        }
    }
    
    public void barajar(){
        Collections.shuffle(cartas);
        
        cartasUsadas=0;
        
    }
  //• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado 
//  al final, se indica al usuario que no hay más cartas.
    
    public void siguienteCarta(){
        
        if(cartasUsadas==cartas.size()){
            System.out.println("No hay mas cartas");            
        } else{
            Carta carta = cartas.get(cartasUsadas++);
            System.out.println("Siguiente carta: " + carta);
        }      
    }
    //• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasDispo(){
        
       int resta=cartas.size()-cartasUsadas;
       if(resta>0 ){
           System.out.println("Se puede repartir "+resta);          
       }else{
           System.out.println("no hay mas cartas ");
       }
       
    }
    
    //• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de cartas. 
//  En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero debemos indicárselo al usuario.

    public void darCartas(int cantidad){
        
        int dispo=cartas.size()-cartasUsadas;
        
        if(cantidad>dispo){
            System.out.println("No hay tantas cartas");
        }else{
            for (int i = 0; i < cantidad; i++) {
                Carta reparto=cartas.get(cartasUsadas);
                 System.out.println(reparto);
                 
                 cartasUsadas++;
            }
        }      
    }
    //• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna indicárselo al usuario
public void cartasMonton(){
    
    if(cartasUsadas>0){
        for (int i = 0; i < cartasUsadas; i++) {
            System.out.println(cartas.get(i));            
        }     
    }        
}
    
// mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, mostrará las cartas que no se han sacado.

public void mostrarBaraja() {
    if (cartasUsadas < cartas.size()) {
        System.out.println("Cartas restantes en la baraja:");
        for (int i = cartasUsadas; i < cartas.size(); i++) {
            System.out.println(cartas.get(i));
        }
    } else {
        System.out.println("No hay más cartas en la baraja.");
    }
}


}
