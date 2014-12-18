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


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.TitledBorder;


/**
 *
 * @author Ruben
 */
public class GUI extends JFrame{
    
    JPanel panel_menu;
    JPanel panel_principal;
    JTable tabla = new JTable();
    JTextArea recorridofinal = new JTextArea();
    JMenuBar barra_menu = new JMenuBar();
    JMenu menu_inicio = new JMenu("Inicio");
    JMenuItem item_CargaFicheroAtributos = new JMenuItem("Cargar fichero de atributos...");
    JMenuItem item_CargaFicheroEjemplo = new JMenuItem("Cargar fichero de ejemplo...");
    JMenu menu_ayuda = new JMenu("Ayuda");
    JMenuItem item_Instrucciones = new JMenuItem("Instrucciones");
    JMenuItem item_Nosotros = new JMenuItem("Sobre nosotros..");
    JButton boton_empezar = new JButton("Empezar");
    JSeparator sep_ver = new JSeparator(SwingConstants.VERTICAL);
    JSeparator sep_hor = new JSeparator();
    
    private ArrayList<Nodo> atributos;
    private Container contenedorPrincipal;
    
    Font fuente = new Font("Verdana", Font.BOLD,14);

            
    
    public GUI (){
        setTitle("Practica 2 - Algoritmo ID3");
        
        panel_menu = new JPanel(new BorderLayout(1, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setBounds(100, 100, 1000, 800);
        contenedorPrincipal = new JPanel();
        contenedorPrincipal = this.getContentPane();
        contenedorPrincipal.setLayout(new BorderLayout(2,1));
        setContentPane(contenedorPrincipal);
        this.setLocationRelativeTo(null);
        setVisible(true);
        boton_empezar.setBackground(Color.CYAN);
        boton_empezar.setFont(fuente);
        menu_inicio.setFont(fuente);
        menu_inicio.setBackground(Color.GRAY);
        item_CargaFicheroAtributos.setFont(fuente);
        item_CargaFicheroEjemplo.setFont(fuente);
        item_Instrucciones.setFont(fuente);
        item_Nosotros.setFont(fuente);
        menu_ayuda.setFont(fuente);
        panel_principal= new JPanel();

        barra_menu.add(menu_inicio);
    //    barra_menu.add(sep_ver);
	barra_menu.add(menu_ayuda);
	
        menu_ayuda.add(item_Instrucciones);
        menu_ayuda.add(item_Nosotros);
	menu_inicio.add(item_CargaFicheroAtributos);

	menu_inicio.add(item_CargaFicheroEjemplo);
        menu_inicio.add(boton_empezar);
      
       
        barra_menu.add(sep_ver);
        barra_menu.add(boton_empezar);
        

      //  barra_menu.add(boton_empezar);
        panel_menu.add(barra_menu);
      //  panel_menu.add(boton_empezar);
        //recorridofinal = null;
         //boton_empezar.setPreferredSize(new Dimension(90,40));
        panel_principal.add(recorridofinal);
        
        item_CargaFicheroAtributos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                try{ atributos = FileManager.loadAtributos();
                 
                    TSP algoritmo = new TSP(atributos);
                    algoritmo.CrearMatrizBidimensional();
                    
                    StringBuffer sb = new StringBuffer();
                    sb.append("De:");
                    for (Nodo nodo : algoritmo.RecorrerMatrizBidimensional())
                        sb.append(nodo.getPos()+" a ");
                    
                    recorridofinal.setText(sb.toString());
                    
                    
                }
                
		catch(Exception e){
					
					
				}
                
            }
        });
        ;
        
        
      
        boton_empezar.setEnabled(false);

         
        
     //   panel_menu.add(barra_menu, BorderLayout.WEST);
     //   panel_menu.add( boton_empezar, BorderLayout.EAST);
        

        
        contenedorPrincipal.add(panel_menu, BorderLayout.NORTH);
        contenedorPrincipal.add(panel_principal, BorderLayout.CENTER);
        this.pack();


        
    }


    
    
    
    
}

