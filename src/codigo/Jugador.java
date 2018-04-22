package codigo;

import java.util.ArrayList;
import javax.swing.JButton;

public class Jugador {

    public boolean blanco;
 //   public boolean turno;
    public ArrayList<Ficha> fichas;

    public Jugador(boolean bla) {
        this.blanco = bla;
        this.fichas = new ArrayList<Ficha>();
    }
/*
    public void cambiarTurno() {
        if (turno) {
            turno = false;
        } else {
            turno = true;
        }
    }*/

    public boolean estaLaFicha(int id) {
        boolean esta = false;
        for (int i = 0; i < fichas.size(); i++) {
            if (fichas.get(i).id == id) {
                esta = true;
            }
        }
        return true;
    }
    
/*
    public boolean casillaOcupada(JButton casilla, Jugador jugador) {
        boolean ocupada = false;
        for(int i=0; i<jugador.fichas.size(); i++){
            if(casilla.equals(jugador.fichas.get(i).casilla)){
                ocupada = true;
            }
        }
        return ocupada;
    }
    
    //retorna si se ha acabado la partida
    public boolean comer(Jugador rival, Ficha eliminada){
        boolean acabado = false;
        for(int i=0; i<rival.fichas.size(); i++){
            if(rival.fichas.get(i).equals(eliminada)){
                if(rival.fichas.get(i).tipo == 6){
                    acabado = true;
                }
                rival.fichas.remove(i);
            }
        }
        return acabado;
    }*/
}
