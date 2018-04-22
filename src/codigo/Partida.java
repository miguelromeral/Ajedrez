
package codigo;

import javax.swing.JButton;

public class Partida {
    public Jugador blanco;
    public Jugador negro;
    public JButton tablero[][];
    public boolean turnoBlanco;
    
    public Partida(Jugador b, Jugador n, JButton[][] t){
        this.blanco = b;
        this.negro = n;
        this.turnoBlanco = true;
        this.tablero = new JButton[8][8];
        this.tablero = t;
        //sacarFichas(this.tablero);
    }
    
    public void cambiarTurno(){
        if(this.turnoBlanco){
            this.turnoBlanco = false;
        }else{
            this.turnoBlanco = true;
        }
    }
    
    public boolean casillaOcupada(JButton casilla, Jugador jugador) {
        boolean ocupada = false;
        for(int i=0; i<jugador.fichas.size(); i++){
            if(casilla.equals(jugador.fichas.get(i).casilla)){
                ocupada = true;
            }
        }
        return ocupada;
    }
    
    private void sacarFichas(JButton[][] tablero) {
        //Fichas blancas
        //Peones blancos
        System.out.println("1 A ver");
        Ficha peonBlanco0 = new Ficha(true, 0, 1, tablero[6][0]);
         Ficha peonBlanco1 = new Ficha(true, 1, 1, tablero[6][1]);
         Ficha peonBlanco2 = new Ficha(true, 2, 1, tablero[6][2]);
         Ficha peonBlanco3 = new Ficha(true, 3, 1, tablero[6][3]);
         Ficha peonBlanco4 = new Ficha(true, 4, 1, tablero[6][4]);
         Ficha peonBlanco5 = new Ficha(true, 5, 1, tablero[6][5]);
         Ficha peonBlanco6 = new Ficha(true, 6, 1, tablero[6][6]);
         Ficha peonBlanco7 = new Ficha(true, 7, 1, tablero[6][7]);
         System.out.println("2 A ver");
         JButton boton = new JButton();
         Ficha otra = new Ficha(true, 0, 1, boton);
         System.out.println("1 A ver");
         blanco.fichas.add(peonBlanco1);
         blanco.fichas.add(peonBlanco2);
         blanco.fichas.add(peonBlanco3);
         blanco.fichas.add(peonBlanco4);
         blanco.fichas.add(peonBlanco5);
         blanco.fichas.add(peonBlanco6);
         blanco.fichas.add(peonBlanco7);
         System.out.println("3 A ver");
        //Torres blancos
        Ficha torreBlanco0 = new Ficha(true, 8, 2, tablero[7][0]);
        Ficha torreBlanco1 = new Ficha(true, 9, 2, tablero[7][7]);
        blanco.fichas.add(torreBlanco0);
        blanco.fichas.add(torreBlanco1);
        //Caballos blancos
        Ficha caballoBlanco0 = new Ficha(true, 10, 3, tablero[7][1]);
        Ficha caballoBlanco1 = new Ficha(true, 11, 3, tablero[7][6]);
        blanco.fichas.add(caballoBlanco0);
        blanco.fichas.add(caballoBlanco1);
        //Alfiles blancos
        Ficha alfilBlanco0 = new Ficha(true, 12, 4, tablero[7][2]);
        Ficha alfilBlanco1 = new Ficha(true, 13, 4, tablero[7][5]);
        blanco.fichas.add(alfilBlanco0);
        blanco.fichas.add(alfilBlanco1);
        //Dama blanca
        Ficha damaBlanco = new Ficha(true, 14, 5, tablero[7][3]);
        blanco.fichas.add(damaBlanco);
        //Rey blanco
        Ficha reyBlanco = new Ficha(true, 15, 6, tablero[7][4]);
        blanco.fichas.add(reyBlanco);

        //Fichas negras
        //Peones negros
        Ficha peonNegro0 = new Ficha(false, 0, 1, tablero[1][0]);
         Ficha peonNegro1 = new Ficha(false, 1, 1, tablero[1][1]);
         Ficha peonNegro2 = new Ficha(false, 2, 1, tablero[1][2]);
         Ficha peonNegro3 = new Ficha(false, 3, 1, tablero[1][3]);
         Ficha peonNegro4 = new Ficha(false, 4, 1, tablero[1][4]);
         Ficha peonNegro5 = new Ficha(false, 5, 1, tablero[1][5]);
         Ficha peonNegro6 = new Ficha(false, 6, 1, tablero[1][6]);
         Ficha peonNegro7 = new Ficha(false, 7, 1, tablero[1][7]);
         negro.fichas.add(peonNegro0);
         negro.fichas.add(peonNegro1);
         negro.fichas.add(peonNegro2);
         negro.fichas.add(peonNegro3);
         negro.fichas.add(peonNegro4);
         negro.fichas.add(peonNegro5);
         negro.fichas.add(peonNegro6);
         negro.fichas.add(peonNegro7);
        //Torres negros
        Ficha torreNegro0 = new Ficha(false, 8, 2, tablero[0][0]);
        Ficha torreNegro1 = new Ficha(false, 9, 2, tablero[0][7]);
        negro.fichas.add(torreNegro0);
        negro.fichas.add(torreNegro1);
        //Caballos negros
        Ficha caballoNegro0 = new Ficha(false, 10, 3, tablero[0][1]);
        Ficha caballoNegro1 = new Ficha(false, 11, 3, tablero[0][6]);
        negro.fichas.add(caballoNegro0);
        negro.fichas.add(caballoNegro1);
        //Alfiles negros
        Ficha alfilNegro0 = new Ficha(false, 12, 4, tablero[0][2]);
        Ficha alfilNegro1 = new Ficha(false, 13, 4, tablero[0][5]);
        negro.fichas.add(alfilNegro0);
        negro.fichas.add(alfilNegro1);
        //Dama negros
        Ficha damaNegro = new Ficha(false, 14, 5, tablero[0][3]);
        negro.fichas.add(damaNegro);
        //Rey negros
        Ficha reyNegro = new Ficha(false, 15, 6, tablero[0][4]);
        negro.fichas.add(reyNegro);
    }
    
    //retorna si se  ha acabado la partida
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
    }
    
}
