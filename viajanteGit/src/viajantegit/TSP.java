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
    
    //matriz de distancias euclideas
    public void CrearMatrizBidimensional(){
        dimension = listaNodosAbiertos.size();
        
        matriz = new Double[dimension][dimension];
        
        for(int i=0; i<dimension; i++){
            for(int j=0 ; j< dimension ; j++){
                matriz[i][j]= calculaDistanciaEuclidea(devolverNodoenPosicion(i+1), devolverNodoenPosicion(j+1));
                System.out.println("Matriz : "+matriz[i][j]+" ");
            }
        }
        
       // System.out.println("Resultado : "+matriz[10][10]+" ");
        
        
    }
    
    public ArrayList<Nodo> RecorrerMatrizBidimensional(){
        Nodo nodoActual= listaNodosAbiertos.get(0);
        if( listaNodosAbiertos.isEmpty()){
            System.out.println("Lista NodosAbiertos esta Vacio");
        }
        listaNodosCerrados = new ArrayList<Nodo>();
        listaNodosCerrados.add(listaNodosAbiertos.get(0));
        
       //saltar de un nodo a otro ( al de menor distancia euclidea ) //llamar al Nodo más cercano
        
        // Si el tamaño de nodos cerrados es distinto la numero total de nodos
        while(listaNodosCerrados.size() != dimension)
        {
            // Nodo actual es igual al nodo mas cercano
            nodoActual = nodoMasCercano(nodoActual.getPos());
            // Cerramos el nodo actual
            listaNodosCerrados.add(nodoActual);
            
            
        }
        // Volvemos a la primera ciudad, ya que es la ciudad de inicio/fin
        listaNodosCerrados.add(listaNodosCerrados.get(0));
        
        return listaNodosCerrados;
        
    }
    
    public Nodo nodoMasCercano(int pos){
        
        double menorDistancia = Integer.MAX_VALUE;
        double distanciaActual;
        Nodo nodoMasCercano = null;
        pos = pos - 1;
       
        for(int i = 0 ; i< dimension ; i++)
        {
            distanciaActual = calculaDistanciaEuclidea(listaNodosAbiertos.get(i),devolverNodoenPosicion(pos +1)); 
           
             if (distanciaActual < menorDistancia && pos!=i && !nodoEstaCerrado(i+1))
            {
              
                    menorDistancia = distanciaActual;
                    nodoMasCercano = devolverNodoenPosicion(i+1);
                
            }
        }
        return nodoMasCercano;
    
    }
    
    
    
    public double calculaDistanciaEuclidea(Nodo a, Nodo b)
    {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
    
    public boolean nodoEstaCerrado(int posicion)
    {
        Boolean cerrado = false;
        
        for( Nodo n : listaNodosCerrados )
        {
            if(n.getPos() == posicion){
                cerrado = true;
            }
            
        }
        return cerrado;
        
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
