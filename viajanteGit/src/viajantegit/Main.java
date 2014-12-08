/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajantegit;

import java.util.ArrayList;

/**
 *
 * @author Ruben
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Nodo> matriz;
        LeerFichero lf = new LeerFichero();
        
        lf.leer();
        matriz =lf.MatrizNodos;
        
        TSP algoritmo = new TSP(matriz);
        algoritmo.CrearMatrizBidimensional();
        System.out.print("De:");
        for (Nodo nodo : algoritmo.RecorrerMatrizBidimensional())
            System.out.print(nodo.getPos()+" a ");
        
    }
    
}
