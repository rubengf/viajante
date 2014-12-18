/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajantegit;

/**
 *
 * @author Ruben
 */


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileManager {
    
    private static String path = "";
    
    
	
	public static ArrayList<Nodo> loadAtributos(){
  
		String linea;
                   String pos = " ";
                String x = "" ;
                String y= "";
                Nodo nodo;
                ArrayList<Nodo> MatrizNodos = new ArrayList<>();
	
		
		JFileChooser chooser = new JFileChooser(path);
		chooser.setDialogTitle("Abrir Archivo tsp..");
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Archivos .tsp", "tsp");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			
			String name = chooser.getSelectedFile().getPath();
                        
                        path=name;
					
			FileInputStream file;
			
			try {

				file = new FileInputStream(name);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						file));

				while((linea = br.readLine()) !=null && !linea.equals("NODE_COORD_SECTION")){
                                    
                                }

                    while ((linea = br.readLine()) != null && !linea.equals("EOF")){

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

				br.close();
				
			} 
			catch (FileNotFoundException e) {

				JOptionPane.showMessageDialog(null, "Aqui falta un mensaje");

			} 
			catch (IOException e) {

				JOptionPane.showMessageDialog(null, "Aqui falta un mensaje");

			}
		}
                return MatrizNodos;
        }
}

