/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viajantegit;


import javax.swing.UIManager;

/**
 *
 * @author Ruben
 */
public class Main {
    public static void main(String[] args) {
 

		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	    } 
	    catch (Exception e) {}
		
		new GUI();
		
		
	}
    
}
