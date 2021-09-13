/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 *
 * @author bodet
 */
public class Personnage {
    private String nom;
    private Integer ptVie;
    private Integer ptMana;
    private Integer pourcentageAtt;
    private Integer pourcentagePar;
    private Integer pourcentageMag;
    private Integer pourcentageResistMag;
    private Integer degAtt;
    private Integer degMag;
    private Integer distAttMax;
    private Point2D pos;

    public Personnage(String nom, Integer ptV, Integer ptM, Integer pA, Integer pP, Integer pM, Integer rM, Integer dA, Integer dM, Integer distMax, Point2D pos) {
        this.nom = nom;
        this.ptVie = ptV;
        this.ptMana = ptM;
        this.pourcentageAtt = pA;
        this.pourcentagePar = pP;
        this.pourcentageMag = pM;
        this.pourcentageResistMag = rM;
        this.degAtt = dA;
        this.degMag = dM;
        this.distAttMax = distMax;
        this.pos = new Point2D(pos);
    }

    public Personnage(Personnage perso) {
        this.nom = perso.nom;
        this.ptVie = perso.ptVie;
        this.ptMana = perso.ptMana;
        this.pourcentageAtt = perso.pourcentageAtt;
        this.pourcentagePar = perso.pourcentagePar;
        this.pourcentageMag = perso.pourcentageMag;
        this.pourcentageResistMag = perso.pourcentageResistMag;
        this.degAtt = perso.degAtt;
        this.degMag = perso.degMag;
        this.distAttMax = perso.distAttMax;
        this.pos = new Point2D(perso.pos);        
    }

    public Personnage() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String value) {
        this.nom = value;
    }

    public void setPtVie(Integer value) {
        this.ptVie = value;
    }

    public Integer getPtVie() {
        return ptVie;
    }

    public void setPtMana(Integer value) {
        this.ptMana = value;
    }

    public Integer getPtMana() {
        return ptMana;
    }

    public void setPourcentageAtt(Integer value) {
        this.pourcentageAtt = value;
    }

    public Integer getPourcentageAtt() {
        return pourcentageAtt;
    }

    public void setPourcentagePar(Integer value) {
        this.pourcentagePar = value;
    }

    public Integer getPourcentagePar() {
        return pourcentagePar;
    }

    public void setPourcentageMag(Integer value) {
        this.pourcentageMag = value;
    }

    public Integer getPourcentageMag() {
        return pourcentageMag;
    }

    public void setPourcentageResistMag(Integer value) {
        this.pourcentageResistMag = value;
    }

    public Integer getPourcentageResistMag() {
        return pourcentageResistMag;
    }

    public Integer getDegAtt() {
        return degAtt;
    }

    public void setDegAtt(Integer value) {
        this.degAtt = value;
    }

    public void setDegMag(Integer value) {
        this.degMag = value;
    }

    public Integer getDegMag() {
        return degMag;
    }

    public void setDistAttMax(Integer value) {
        this.distAttMax = value;
    }

    public Integer getDistAttMax() {
        return distAttMax;
    }

    public void setPos(Point2D value) {
        this.pos = new Point2D(value);
    }

    public Point2D getPos() {
        return new Point2D(pos);
    }
    
    public void deplace() {
        // déplace le personnage à un endroit aléatoire
        Random generateurAleatoire = new Random();
        
        int entierAleaX = generateurAleatoire.nextInt(100);
        int entierAleaY = generateurAleatoire.nextInt(100);           
        Point2D position = new Point2D(entierAleaX, entierAleaY);
        
        this.setPos(position);
    }
    
    public void affiche() {
        System.out.println("Le personnage s'appelle "+this.nom);
        System.out.println(this.nom+" a "+ this.ptVie+" points de vie.");
        System.out.println(this.nom+" a "+ this.ptMana+" points de mana.");
        System.out.println(this.nom+" a "+ );
        System.out.println(this.nom+" a "+ );
        System.out.println(this.nom+" a "+ );
        
        
        System.out.println();
    }
}
