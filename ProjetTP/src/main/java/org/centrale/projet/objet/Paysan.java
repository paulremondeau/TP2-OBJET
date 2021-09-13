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
public class Paysan extends Personnage {
    // Hérite de la classe Personnage
    
    public Paysan(String nom, int pV, int pA, int pP, int pM, int rM, int dA, int dM, int distMax, Point2D pos){
        super(nom, pV, 0, pA, pP, pM, rM, dA, dM, distMax, pos);
    }
    
    public Paysan(Paysan p){
        super(p);
    }
    
    public Paysan(){
        super();
    }
}
