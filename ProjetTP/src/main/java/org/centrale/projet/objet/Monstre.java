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
public class Monstre {
    
    private Integer ptVie;
    private Integer pourcentageAtt;
    private Integer pourcentagePar;
    private Integer degAtt;
    private Point2D pos;

    public Monstre(Integer pV, Integer pA, Integer pP, Integer dA, Point2D pos) {
        this.ptVie = pV;
        this.pourcentageAtt = pA;
        this.pourcentagePar = pP;
        this.degAtt = dA;
        this.pos = new Point2D(pos);
    }

    public Monstre(Monstre m) {
        this.ptVie = m.ptVie;
        this.pourcentageAtt = m.pourcentageAtt;
        this.pourcentagePar = m.pourcentagePar;
        this.degAtt = m.degAtt;
        this.pos = new Point2D(m.pos);
    }

    public Monstre() {
    }

    public Integer getPtVie() {
        return ptVie;
    }

    public void setPtVie(Integer value) {
        this.ptVie = ptVie;
    }

    public Integer getPourcentageAtt() {
        return pourcentageAtt;
    }

    public void setPourcentageAtt(Integer value) {
        this.pourcentageAtt = value;
    }

    public Integer getPourcentagePar() {
        return pourcentagePar;
    }

    public void setPourcentagePar(Integer value) {
        this.pourcentagePar = value;
    }
    
    public Integer getDegAtt() {
        return degAtt;
    }

    public void setDegAtt(Integer value) {
        this.degAtt = value;
    }
    
    public Point2D getPos() {
        return new Point2D(pos);
    }

    public void setPos(Point2D pos) {
        this.pos = new Point2D(pos);
    }
    
    
    
    
}
