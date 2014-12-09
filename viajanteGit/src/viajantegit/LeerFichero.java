/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajantegit;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


/**
 *
 * @author Ruben
 */
public class LeerFichero {
    
    BufferedReader bf;
    FileReader fichero;
    Nodo nodo;
    ArrayList<Nodo> MatrizNodos;
    
    String pos;
    String x ;
    String y;
    
    String dimension;
    
    String linea;

    public LeerFichero() {
       
    }
    
    public void leer(){
        MatrizNodos = new ArrayList<>();
        
        try 
        {
        //leemos el fichero tsp, descargado de la tsplib quitandole toda la cabecera    
        this.fichero = new FileReader("a281.tsp");
        this.bf = new BufferedReader(fichero);
        
        while (( linea = bf.readLine())!=null) 
        {
                StringTokenizer st = new StringTokenizer(linea," ");
                    
                if(st.hasMoreElements())
                     pos = st.nextToken();
                if(st.hasMoreElements())
                     x = st.nextToken();
                if(st.hasMoreElements())
                     y = st.nextToken();
                if(!pos.equalsIgnoreCase("EOF"))        
                MatrizNodos.add(new Nodo(Integer.parseInt(pos), Integer.parseInt(x), Integer.parseInt(y)));
                   
                }
        System.out.println(MatrizNodos.size());
        
        
       
                
	}
        
        
        catch (FileNotFoundException fnfe){
		fnfe.printStackTrace();
	} catch (IOException ioe){
		ioe.printStackTrace();
	}
        
    }
    
    
    
}
