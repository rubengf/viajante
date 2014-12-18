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
    String Nombre;
    String comentario;
    String tipo;
    String dimension_cabecero;

    public LeerFichero() {
       
    }
    
    public void leerEncabezado(String a , StringTokenizer tok){
        
        while(!a.equalsIgnoreCase("NODE_COORD_SECTION")){
            a = tok.nextToken();
        }
        
    }
    
    
    public void leer(){
        MatrizNodos = new ArrayList<>();
        String a;
        try 
        {
        //leemos el fichero tsp   
        this.fichero = new FileReader("dj38.tsp");
        this.bf = new BufferedReader(fichero);
        
        //Me salto el encabezado
        while ((linea = bf.readLine()) != null && !linea.equals("NODE_COORD_SECTION")){
            
        }
        
        while ((linea = bf.readLine()) != null && !linea.equals("EOF")){
            
            StringTokenizer st = new StringTokenizer(linea," ");
            
            if(st.hasMoreElements()){
                     pos = st.nextToken();
                }
                if(st.hasMoreElements())
                     x = st.nextToken();
                if(st.hasMoreElements())
                     y = st.nextToken();
                if(!pos.equalsIgnoreCase("EOF"))        
                MatrizNodos.add(new Nodo(Integer.parseInt(pos), Double.parseDouble(x), Double.parseDouble(y)));
            
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
