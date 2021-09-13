/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author bodet
 */
public class TestSeance1 {
    public static void main(String[] args) {
        
        
        World monde = new World();
        monde.creeMondeAlea();
        
        monde.robin.affiche();
        System.out.println("\n");
        
        monde.peon.affiche();
        System.out.println("\n");
        
        monde.bug1.affiche();
        System.out.println("\n");
        
        monde.bug2.affiche();
        System.out.println("\n");
        
    }
    
    
}
