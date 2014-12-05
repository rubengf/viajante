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

//ALGORITMO HEURISTICO GREEDY
public class TSP {
    Double[][] matriz;
    int dimension;
    
    ArrayList<Nodo> listaNodosCerrados;
    ArrayList<Nodo> listaNodosAbiertos;
    
    public TSP(ArrayList<Nodo> matrizLeida){
        this.listaNodosAbiertos = matrizLeida;
    
    }
    
    
    public void CrearMatrizBidimensional(){
        dimension = listaNodosAbiertos.size();
        
        matriz = new Double[dimension][dimension];
        
        for(int i=0; i<dimension; i++){
            for(int j=0 ; j< dimension ; j++){
                matriz[i][j]= calculaDistanciaEuclidea(devolverNodoenPosicion(i), devolverNodoenPosicion(j));   
            }
        }
        
        
        
        
    }
    
    public void RecorrerMatrizBidimensional(){
        Nodo nodoActual= listaNodosAbiertos.get(0);
        listaNodosCerrados.add(listaNodosAbiertos.get(0));
        
       //saltar de un nodo a otro ( al de menor distancia euclidea )
        
        
        
        
    }
    
    public Nodo nodoMasCercado(int pos){
        
        double menorDistancia;
        
        if (pos != 0)
            menorDistancia = matriz[pos][0];
        
        else
        {
            menorDistancia = matriz[pos][1];
        }
        
        for(int i = 0 ; i< listaNodosAbiertos.size() ; i++){
            matriz[pos][i]== 
        }
    }
    
    public double calculaDistanciaEuclidea(Nodo a, Nodo b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
    
    public Nodo devolverNodoenPosicion(int posicion){
        Nodo nodoADevolver = null;
        for( Nodo n : listaNodosAbiertos ){
            if(n.getPos() == posicion){
                nodoADevolver =n;
            }
            
        }
        return nodoADevolver;
        
        
    }
    
}
