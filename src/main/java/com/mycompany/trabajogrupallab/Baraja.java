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
import java.util.HashSet;

/**
 *
 * @author esteb
 */
public class Baraja {

    ArrayList<Carta> cartas = new ArrayList<>();
    ArrayList<Carta> monton = new ArrayList<>();

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
        
        for(Carta ele:cartas){
            System.out.println(ele);
        }
    }
  //• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o se haya llegado 
//  al final, se indica al usuario que no hay más cartas.
    
    public void siguienteCarta(){
        
        int acu=1;
       
        if(acu<=3){
            cartas.get(acu+1);
            acu+=1;
        }else if(acu>3){
            System.out.println("No hay mas cartas");
        }
        
    }
  
    
    
    
}
