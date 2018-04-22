package codigo;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ficha {

    public boolean fichaBlanca;
    public int id;
    public int tipo; //1 Peon - 2 Torre - 3 Caballo - 4 Alfil - 5 Dama - 6 Rey
    public JButton casilla;

    public Ficha(boolean fic, int id, int tip, JButton cas) {
        this.fichaBlanca = fic;
        this.id = id;
        this.tipo = tip;
        this.casilla = cas;
        poneImagenes(cas.getWidth(), cas.getHeight());
    }
    
    public void cambiarA(Ficha cambiar, JButton nueva){
        cambiar.casilla = nueva;
        cambiar.poneImagenes(nueva.getWidth(), nueva.getHeight());
    }

    public void poneImagenes(int w, int h) {
        try {
            if (fichaBlanca) {
                if (tipo == 1) {
                    ImageIcon pB = new ImageIcon("imagenes/peonBlanco.png");
                    ImageIcon pB2 = new ImageIcon(pB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(pB2);
                }
                if (tipo == 2) {
                    ImageIcon tB = new ImageIcon("imagenes/torreBlanco.png");
                    ImageIcon tB2 = new ImageIcon(tB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(tB2);
                }
                if (tipo == 3) {
                    ImageIcon cB = new ImageIcon("imagenes/caballoBlanco.png");
                    ImageIcon cB2 = new ImageIcon(cB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(cB2);
                }
                if (tipo == 4) {
                    ImageIcon aB = new ImageIcon("imagenes/alfilBlanco.png");
                    ImageIcon aB2 = new ImageIcon(aB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(aB2);
                }
                if (tipo == 5) {
                    ImageIcon dB = new ImageIcon("imagenes/damaBlanco.png");
                    ImageIcon dB2 = new ImageIcon(dB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(dB2);
                }
                if (tipo == 6) {
                    ImageIcon rB = new ImageIcon("imagenes/reyBlanco.png");
                    ImageIcon rB2 = new ImageIcon(rB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(rB2);
                }
            } else {
                if (tipo == 1) {
                    ImageIcon pN = new ImageIcon("imagenes/peonNegro.png");
                    ImageIcon pN2 = new ImageIcon(pN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(pN2);
                }
                if (tipo == 2) {
                    ImageIcon tN = new ImageIcon("imagenes/torreNegro.png");
                    ImageIcon tN2 = new ImageIcon(tN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(tN2);
                }
                if (tipo == 3) {
                    ImageIcon cN = new ImageIcon("imagenes/caballoNegro.png");
                    ImageIcon cN2 = new ImageIcon(cN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(cN2);
                }
                if (tipo == 4) {
                    ImageIcon aN = new ImageIcon("imagenes/alfilNegro.png");
                    ImageIcon aN2 = new ImageIcon(aN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(aN2);
                }
                if (tipo == 5) {
                    ImageIcon dN = new ImageIcon("imagenes/damaNegro.png");
                    ImageIcon dN2 = new ImageIcon(dN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(dN2);
                }
                if (tipo == 6) {
                    ImageIcon rN = new ImageIcon("imagenes/reyNegro.png");
                    ImageIcon rN2 = new ImageIcon(rN.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(rN2);
                }
            }
        } catch (Exception e) {
            System.out.println("Error en la imagen: " + e.toString());
        }
    }
    public void quitaCasilla(){
        casilla.setIcon(null);
    }
    
    public String toString(){
        return "Ficha blanca: "+fichaBlanca+" de tipo: "+tipo;
    }
}
