//Enunciado:
//
//Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe contener un método toString() que retorne el número de carta y el palo. La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
//
//Las operaciones que podrá realizar la baraja son:
//
//
//• barajar(): cambia de posición todas las cartas aleatoriamente.
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


public class TrabajoGrupalLab {

    public static void main(String[] args) {
        
        Baraja baraja=new Baraja();
        System.out.println("Testeo del Ejercicio");
     baraja.creaBaraja();
//     baraja.mostra();
    
     
        baraja.barajar();
      baraja.mostra();
        System.out.println("..............");
      baraja.siguienteCarta();
        System.out.println("");
      baraja.cartasDispo();
        System.out.println("");
      baraja.darCartas(5);
      baraja.cartasDispo();
      baraja.cartasMonton();
        System.out.println("");
      baraja.mostrarBaraja();
        
        
    }
}
