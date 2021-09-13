/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;
import java.lang.Math;

import java.util.Random;

/**
 *
 * @author bodet
 */
public class World {
    
    public Archer robin; // Attribut en public pour les tests
    public Paysan peon;
    public Lapin bug1;
    public Lapin bug2;

    public World() {
        
    }
    
    public void creeMondeAlea(){
        
        Random generateurAleatoire = new Random();
        
        int posArcherX = generateurAleatoire.nextInt(100);
        int posArcherY = generateurAleatoire.nextInt(100);
        Point2D posArcher = new Point2D(posArcherX,posArcherY);
        robin = new Archer("Robin", 10, 20, 5, 0, 5, 10, 0, 20, posArcher, 32);
        
        int posPeonX = generateurAleatoire.nextInt(100);
        int posPeonY = generateurAleatoire.nextInt(100); 
        Point2D posPeon = new Point2D(posPeonX,posPeonY);
        while((Math.sqrt(Math.pow(posArcherX - posPeonX, 2) +Math.pow(posArcherY- posPeonY, 2))>5) && posArcher.equals(posPeon)){
            posPeonX = generateurAleatoire.nextInt(100);
            posPeonY = generateurAleatoire.nextInt(100); 
            posPeon.setX(posPeonX);
            posPeon.setY(posPeonY);
        }
        peon = new Paysan("Peon", 5, 10, 5, 0, 5, 5, 0, 5, posPeon);
        
        int posBug1X = generateurAleatoire.nextInt(100);
        int posBug1Y = generateurAleatoire.nextInt(100); 
        Point2D posBug1 = new Point2D(posBug1X,posBug1Y);
        while((Math.sqrt(Math.pow(posBug1X - posPeonX, 2) +Math.pow(posBug1Y- posPeonY, 2))>5) && (posArcher.equals(posBug1)) && (posPeon.equals(posBug1))){
            posBug1X = generateurAleatoire.nextInt(100);
            posBug1Y = generateurAleatoire.nextInt(100); 
            posBug1.setX(posBug1X);
            posBug1.setY(posBug1Y);
        }
        bug1 = new Lapin(1, 1, 1, 1, posBug1);
        
        int posBug2X = generateurAleatoire.nextInt(100);
        int posBug2Y = generateurAleatoire.nextInt(100); 
        Point2D posBug2 = new Point2D(posBug2X,posBug2Y);
        while((Math.sqrt(Math.pow(posBug2X - posPeonX, 2) +Math.pow(posBug2Y- posPeonY, 2))>5) && (posArcher.equals(posBug2)) && (posPeon.equals(posBug2)) && (posBug1.equals(posBug2))){
            posBug2X = generateurAleatoire.nextInt(100);
            posBug2Y = generateurAleatoire.nextInt(100); 
            posBug2.setX(posBug2X);
            posBug2.setY(posBug2Y);
        }
        bug2 = new Lapin(1, 1, 1, 1, posBug2);
      
    }
    
    
}
