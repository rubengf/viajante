/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajantegit;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Ruben
 */
public class Viajante {

    public int num_ciudades;
    public int max_ciudades;
    int[][] lista = new int[10][10];
    String[] Array_ciudades = new String[]{"A","B","C","D","E","F","G","H","I","J"};
    
    String ciudad_ini_fin;
    
    public Viajante(){
        super();
    }
    
    public void recibir_parametros_de_consola(){
        max_ciudades=9;
        //num_iter=12;
        
        Scanner leer_de_consola = new Scanner(System.in);
        System.out.println("Numero de ciudades (MAX "+max_ciudades+"): ");
        num_ciudades = leer_de_consola.nextInt();
       
        System.out.println("has marcado "+num_ciudades+" ciudades");
        
        if(num_ciudades>9){
            System.out.println("El valor maximo debe ser "+max_ciudades+" ");
        }
        else{
            
            for(int i=0;i<num_ciudades;i++){
                for(int j=i+1;j<num_ciudades;j++){
                    
		    System.out.println("Distancia entre "+Array_ciudades[i]+" y "+Array_ciudades[j]+" ");
                    lista[i][j]=leer_de_consola.nextInt();
                    lista[j][i]=lista[i][j];
                    //num_iter++;
                }
            }
            System.out.println("Marcar ciudad de Inicio: ");
            ciudad_ini_fin=leer_de_consola.next().toUpperCase();
            //algoritmo.realizaAlgoritmo(lista[][] lista , Arrayciudades ciudades, String ciudad_ini_fin)
            
            }
                
        }
            
      public String comparar_ciudad(){
        for(int i=0;i<num_ciudades;i++){
                
		if(ciudad_ini_fin==Array_ciudades[i]){
                    return ciudad_ini_fin;
                }     
            
    }
    
    
        
    }

        
        
        
}
    
    

    

