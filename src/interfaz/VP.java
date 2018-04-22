/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import codigo.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class VP extends javax.swing.JFrame {

  //  JButton[] ArrayButtons = new JButton[64];
  //  JButton[][] MatrizCasillas = new JButton[8][8];
 //   Jugador blanco;
  //  Jugador negro;
    JButton seleccionado;
    Ficha seleccionada;
 //   ArrayList<Ficha> blancas = new ArrayList<Ficha>();
 //   ArrayList<Ficha> negras = new ArrayList<Ficha>();
    
    Partida juego;

    /**
     * Creates new form VP
     */
    public VP() {
        initComponents();
        JButton[][] MatrizCasillas = new JButton[8][8];
        //MatrizCasillas = anadeBotones();
        JButton ArrayButtons[] = {A1, B1, C1, D1, E1, F1, G1, H1,
         A2, B2, C2, D2, E2, F2, G2, H2,
         A3, B3, C3, D3, E3, F3, G3, H3, 
         A4, B4, C4, D4, E4, F4, G4, H4, 
         A5, B5, C5, D5, E5, F5, G5, H5, 
         A6, B6, C6, D6, E6, F6, G6, H6, 
         A7, B7, C7, D7, E7, F7, G7, H7, 
         A8, B8, C8, D8, E8, F8, G8, H8};
        int n = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++, n++) {
                MatrizCasillas[i][j] = ArrayButtons[n];
            }
        }
        pintarCasillasNormal(MatrizCasillas);
        Jugador blanco = new Jugador(true);
        Jugador negro = new Jugador(false);
        juego = new Partida(blanco, negro, MatrizCasillas);
        sacarFichas();
        this.setBackground(Color.yellow);
        tfTurno.setText("BLANCO");
        tfTurno.setBackground(Color.WHITE);
        tfTurno.setForeground(Color.BLACK);
        // poneImagenes();
       /* ListenerCasilla elListener = new ListenerCasilla();
         A1.addActionListener(elListener);*/
    }

    private void sacarFichas() {
        //Fichas blancas
        //Peones blancos
       Ficha peonBlanco0 = new Ficha(true, 0, 1, juego.tablero[6][0]);
         Ficha peonBlanco1 = new Ficha(true, 1, 1, juego.tablero[6][1]);
         Ficha peonBlanco2 = new Ficha(true, 2, 1, juego.tablero[6][2]);
         Ficha peonBlanco3 = new Ficha(true, 3, 1, juego.tablero[6][3]);
         Ficha peonBlanco4 = new Ficha(true, 4, 1, juego.tablero[6][4]);
         Ficha peonBlanco5 = new Ficha(true, 5, 1, juego.tablero[6][5]);
         Ficha peonBlanco6 = new Ficha(true, 6, 1, juego.tablero[6][6]);
         Ficha peonBlanco7 = new Ficha(true, 7, 1, juego.tablero[6][7]);
         juego.blanco.fichas.add(peonBlanco0);
         juego.blanco.fichas.add(peonBlanco1);
         juego.blanco.fichas.add(peonBlanco2);
         juego.blanco.fichas.add(peonBlanco3);
         juego.blanco.fichas.add(peonBlanco4);
         juego.blanco.fichas.add(peonBlanco5);
         juego.blanco.fichas.add(peonBlanco6);
         juego.blanco.fichas.add(peonBlanco7);
        //Torres blancos
        Ficha torreBlanco0 = new Ficha(true, 8, 2, juego.tablero[7][0]);
        Ficha torreBlanco1 = new Ficha(true, 9, 2, juego.tablero[7][7]);
        juego.blanco.fichas.add(torreBlanco0);
        juego.blanco.fichas.add(torreBlanco1);
        //Caballos blancos
        Ficha caballoBlanco0 = new Ficha(true, 10, 3, juego.tablero[7][1]);
        Ficha caballoBlanco1 = new Ficha(true, 11, 3, juego.tablero[7][6]);
        juego.blanco.fichas.add(caballoBlanco0);
        juego.blanco.fichas.add(caballoBlanco1);
        //Alfiles blancos
        Ficha alfilBlanco0 = new Ficha(true, 12, 4, juego.tablero[7][2]);
        Ficha alfilBlanco1 = new Ficha(true, 13, 4, juego.tablero[7][5]);
        juego.blanco.fichas.add(alfilBlanco0);
        juego.blanco.fichas.add(alfilBlanco1);
        //Dama blanca
        Ficha damaBlanco = new Ficha(true, 14, 5, juego.tablero[7][3]);
        juego.blanco.fichas.add(damaBlanco);
        //Rey blanco
        Ficha reyBlanco = new Ficha(true, 15, 6, juego.tablero[7][4]);
        juego.blanco.fichas.add(reyBlanco);

        //Fichas negras
        //Peones negros
        Ficha peonNegro0 = new Ficha(false, 0, 1, juego.tablero[1][0]);
         Ficha peonNegro1 = new Ficha(false, 1, 1, juego.tablero[1][1]);
         Ficha peonNegro2 = new Ficha(false, 2, 1, juego.tablero[1][2]);
         Ficha peonNegro3 = new Ficha(false, 3, 1, juego.tablero[1][3]);
         Ficha peonNegro4 = new Ficha(false, 4, 1, juego.tablero[1][4]);
         Ficha peonNegro5 = new Ficha(false, 5, 1, juego.tablero[1][5]);
         Ficha peonNegro6 = new Ficha(false, 6, 1, juego.tablero[1][6]);
         Ficha peonNegro7 = new Ficha(false, 7, 1, juego.tablero[1][7]);
         juego.negro.fichas.add(peonNegro0);
         juego.negro.fichas.add(peonNegro1);
         juego.negro.fichas.add(peonNegro2);
         juego.negro.fichas.add(peonNegro3);
         juego.negro.fichas.add(peonNegro4);
         juego.negro.fichas.add(peonNegro5);
         juego.negro.fichas.add(peonNegro6);
         juego.negro.fichas.add(peonNegro7);
        //Torres negros
        Ficha torreNegro0 = new Ficha(false, 8, 2, juego.tablero[0][0]);
        Ficha torreNegro1 = new Ficha(false, 9, 2, juego.tablero[0][7]);
        juego.negro.fichas.add(torreNegro0);
        juego.negro.fichas.add(torreNegro1);
        //Caballos negros
        Ficha caballoNegro0 = new Ficha(false, 10, 3, juego.tablero[0][1]);
        Ficha caballoNegro1 = new Ficha(false, 11, 3, juego.tablero[0][6]);
        juego.negro.fichas.add(caballoNegro0);
        juego.negro.fichas.add(caballoNegro1);
        //Alfiles negros
        Ficha alfilNegro0 = new Ficha(false, 12, 4, juego.tablero[0][2]);
        Ficha alfilNegro1 = new Ficha(false, 13, 4, juego.tablero[0][5]);
        juego.negro.fichas.add(alfilNegro0);
        juego.negro.fichas.add(alfilNegro1);
        //Dama negros
        Ficha damaNegro = new Ficha(false, 14, 5, juego.tablero[0][3]);
        juego.negro.fichas.add(damaNegro);
        //Rey negros
        Ficha reyNegro = new Ficha(false, 15, 6, juego.tablero[0][4]);
        juego.negro.fichas.add(reyNegro);
    }

    private void pintarCasillasNormal(JButton[][] MatrizCasillas) {
        int i, j;
        for (i = 0; i < 8; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 6) {
                for (j = 0; j < 8; j += 2) {
                    MatrizCasillas[i][j].setBackground(Color.WHITE);
                }
            } else {
                for (j = 1; j < 8; j += 2) {
                    MatrizCasillas[i][j].setBackground(Color.WHITE);
                }
            }
        }
        for (i = 0; i < 8; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7) {
                for (j = 0; j < 8; j += 2) {
                    MatrizCasillas[i][j].setBackground(Color.BLACK);
                }
            } else {
                for (j = 1; j < 8; j += 2) {
                    MatrizCasillas[i][j].setBackground(Color.BLACK);
                }
            }
        }
    }

    private void poneImagenes(JButton[][] MatrizCasillas) {
        try {
            //Peones
            ImageIcon pB = new ImageIcon("imagenes/peonBlanco.png");
            ImageIcon pB2 = new ImageIcon(pB.getImage().getScaledInstance(MatrizCasillas[0][0].getWidth(), MatrizCasillas[0][0].getHeight(), 1));
            MatrizCasillas[6][0].setIcon(pB2);
            MatrizCasillas[6][1].setIcon(pB2);
            MatrizCasillas[6][2].setIcon(pB2);
            MatrizCasillas[6][3].setIcon(pB2);
            MatrizCasillas[6][4].setIcon(pB2);
            MatrizCasillas[6][5].setIcon(pB2);
            MatrizCasillas[6][6].setIcon(pB2);
            MatrizCasillas[6][7].setIcon(pB2);

            ImageIcon pN = new ImageIcon("imagenes/peonNegro.png");
            ImageIcon pN2 = new ImageIcon(pN.getImage().getScaledInstance(MatrizCasillas[0][0].getWidth(), MatrizCasillas[0][0].getHeight(), 1));
            MatrizCasillas[1][0].setIcon(pN2);
            MatrizCasillas[1][1].setIcon(pN2);
            MatrizCasillas[1][2].setIcon(pN2);
            MatrizCasillas[1][3].setIcon(pN2);
            MatrizCasillas[1][4].setIcon(pN2);
            MatrizCasillas[1][5].setIcon(pN2);
            MatrizCasillas[1][6].setIcon(pN2);
            MatrizCasillas[1][7].setIcon(pN2);

            //Torres
            ImageIcon tB = new ImageIcon("imagenes/torreBlanco.png");
            ImageIcon tB2 = new ImageIcon(tB.getImage().getScaledInstance(MatrizCasillas[0][0].getWidth(), MatrizCasillas[0][0].getHeight(), 1));
            MatrizCasillas[7][0].setIcon(tB2);
            MatrizCasillas[7][7].setIcon(tB2);

            ImageIcon tN = new ImageIcon("imagenes/torreNegro.png");
            ImageIcon tN2 = new ImageIcon(tN.getImage().getScaledInstance(MatrizCasillas[0][0].getWidth(), MatrizCasillas[0][0].getHeight(), 1));
            MatrizCasillas[0][7].setIcon(tN2);
            MatrizCasillas[0][0].setIcon(tN2);

            //Caballos
            ImageIcon cB = new ImageIcon("imagenes/caballoBlanco.png");
            ImageIcon cB2 = new ImageIcon(cB.getImage().getScaledInstance(MatrizCasillas[0][0].getWidth(), MatrizCasillas[0][0].getHeight(), 1));
            MatrizCasillas[7][1].setIcon(cB2);
            MatrizCasillas[7][6].setIcon(cB2);

            ImageIcon cN = new ImageIcon("imagenes/caballoNegro.png");
            ImageIcon cN2 = new ImageIcon(cN.getImage().getScaledInstance(MatrizCasillas[0][0].getWidth(), MatrizCasillas[0][0].getHeight(), 1));
            MatrizCasillas[0][6].setIcon(cN2);
            MatrizCasillas[0][1].setIcon(cN2);

            //Alfiles
            ImageIcon aB = new ImageIcon("imagenes/alfilBlanco.png");
            ImageIcon aB2 = new ImageIcon(aB.getImage().getScaledInstance(MatrizCasillas[0][0].getWidth(), MatrizCasillas[0][0].getHeight(), 1));
            MatrizCasillas[7][2].setIcon(aB2);
            MatrizCasillas[7][5].setIcon(aB2);

            ImageIcon aN = new ImageIcon("imagenes/alfilNegro.png");
            ImageIcon aN2 = new ImageIcon(aN.getImage().getScaledInstance(MatrizCasillas[0][0].getWidth(), MatrizCasillas[0][0].getHeight(), 1));
            MatrizCasillas[0][5].setIcon(aN2);
            MatrizCasillas[0][2].setIcon(aN2);

            //Damas
            ImageIcon dB = new ImageIcon("imagenes/damaBlanco.png");
            ImageIcon dB2 = new ImageIcon(dB.getImage().getScaledInstance(MatrizCasillas[0][0].getWidth(), MatrizCasillas[0][0].getHeight(), 1));
            MatrizCasillas[7][3].setIcon(dB2);

            ImageIcon dN = new ImageIcon("imagenes/damaNegro.png");
            ImageIcon dN2 = new ImageIcon(dN.getImage().getScaledInstance(MatrizCasillas[0][0].getWidth(), MatrizCasillas[0][0].getHeight(), 1));
            MatrizCasillas[0][3].setIcon(dN2);

            //Reyes
            ImageIcon rB = new ImageIcon("imagenes/reyBlanco.png");
            ImageIcon rB2 = new ImageIcon(rB.getImage().getScaledInstance(MatrizCasillas[0][0].getWidth(), MatrizCasillas[0][0].getHeight(), 1));
            MatrizCasillas[7][4].setIcon(rB2);

            ImageIcon rN = new ImageIcon("imagenes/reyNegro.png");
            ImageIcon rN2 = new ImageIcon(rN.getImage().getScaledInstance(MatrizCasillas[0][0].getWidth(), MatrizCasillas[0][0].getHeight(), 1));
            MatrizCasillas[0][4].setIcon(rN2);

        } catch (Exception e) {
            System.out.println("Error en la imagen: " + e.toString());
        }
    }

    private JButton[][] anadeBotones() {
        JButton ArrayButtons[] = {A1, B1, C1, D1, E1, F1, G1, H1,
         A2, B2, C2, D2, E2, F2, G2, H2,
         A3, B3, C3, D3, E3, F3, G3, H3, 
         A4, B4, C4, D4, E4, F4, G4, H4, 
         A5, B5, C5, D5, E5, F5, G5, H5, 
         A6, B6, C6, D6, E6, F6, G6, H6, 
         A7, B7, C7, D7, E7, F7, G7, H7, 
         A8, B8, C8, D8, E8, F8, G8, H8};
        /*ArrayButtons = new JButton[64];
        ArrayButtons[0] = A1;
        ArrayButtons[1] = B1;
        ArrayButtons[2] = C1;
        ArrayButtons[3] = D1;
        ArrayButtons[4] = E1;
        ArrayButtons[5] = F1;
        ArrayButtons[6] = G1;
        ArrayButtons[7] = H1;
        ArrayButtons[8] = A2;
        ArrayButtons[9] = B2;
        ArrayButtons[10] = C2;
        ArrayButtons[11] = D2;
        ArrayButtons[12] = E2;
        ArrayButtons[13] = F2;
        ArrayButtons[14] = G2;
        ArrayButtons[15] = H2;
        ArrayButtons[16] = A3;
        ArrayButtons[17] = B3;
        ArrayButtons[18] = C3;
        ArrayButtons[19] = D3;
        ArrayButtons[20] = E3;
        ArrayButtons[21] = F3;
        ArrayButtons[22] = G3;
        ArrayButtons[23] = H3;
        ArrayButtons[24] = A4;
        ArrayButtons[25] = B4;
        ArrayButtons[26] = C4;
        ArrayButtons[27] = D4;
        ArrayButtons[28] = E4;
        ArrayButtons[29] = F4;
        ArrayButtons[30] = G4;
        ArrayButtons[31] = H4;
        ArrayButtons[32] = A5;
        ArrayButtons[33] = B5;
        ArrayButtons[34] = C5;
        ArrayButtons[35] = D5;
        ArrayButtons[36] = E5;
        ArrayButtons[37] = F5;
        ArrayButtons[38] = G5;
        ArrayButtons[39] = H5;
        ArrayButtons[40] = A6;
        ArrayButtons[41] = B6;
        ArrayButtons[42] = C6;
        ArrayButtons[43] = D6;
        ArrayButtons[44] = E6;
        ArrayButtons[45] = F6;
        ArrayButtons[46] = G6;
        ArrayButtons[47] = H6;
        ArrayButtons[48] = A7;
        ArrayButtons[49] = B7;
        ArrayButtons[50] = C7;
        ArrayButtons[51] = D7;
        ArrayButtons[52] = E7;
        ArrayButtons[53] = F7;
        ArrayButtons[54] = G7;
        ArrayButtons[55] = H7;
        ArrayButtons[56] = A8;
        ArrayButtons[57] = B8;
        ArrayButtons[58] = C8;
        ArrayButtons[59] = D8;
        ArrayButtons[60] = E8;
        ArrayButtons[61] = F8;
        ArrayButtons[62] = G8;
        ArrayButtons[63] = H8;*/
        JButton[][] MatrizCasillas = new JButton[8][8];
        int n = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++, n++) {
                MatrizCasillas[i][j] = ArrayButtons[n];
            }
        }
        return MatrizCasillas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCasillas = new javax.swing.JPanel();
        A1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        H1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        G2 = new javax.swing.JButton();
        H2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        G3 = new javax.swing.JButton();
        H3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        G4 = new javax.swing.JButton();
        H4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        C5 = new javax.swing.JButton();
        D5 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        G5 = new javax.swing.JButton();
        H5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        C6 = new javax.swing.JButton();
        D6 = new javax.swing.JButton();
        E6 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        G6 = new javax.swing.JButton();
        H6 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        C7 = new javax.swing.JButton();
        D7 = new javax.swing.JButton();
        E7 = new javax.swing.JButton();
        F7 = new javax.swing.JButton();
        G7 = new javax.swing.JButton();
        H7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        C8 = new javax.swing.JButton();
        D8 = new javax.swing.JButton();
        E8 = new javax.swing.JButton();
        F8 = new javax.swing.JButton();
        G8 = new javax.swing.JButton();
        H8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tfTurno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajedrez");
        setResizable(false);

        panelCasillas.setPreferredSize(new java.awt.Dimension(400, 400));
        panelCasillas.setRequestFocusEnabled(false);
        panelCasillas.setLayout(new java.awt.GridLayout(8, 8));

        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        panelCasillas.add(A1);

        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        panelCasillas.add(B1);

        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        panelCasillas.add(C1);

        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });
        panelCasillas.add(D1);

        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });
        panelCasillas.add(E1);

        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });
        panelCasillas.add(F1);

        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });
        panelCasillas.add(G1);

        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });
        panelCasillas.add(H1);

        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        panelCasillas.add(A2);

        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        panelCasillas.add(B2);

        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        panelCasillas.add(C2);

        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });
        panelCasillas.add(D2);

        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });
        panelCasillas.add(E2);

        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });
        panelCasillas.add(F2);

        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });
        panelCasillas.add(G2);

        H2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2ActionPerformed(evt);
            }
        });
        panelCasillas.add(H2);

        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        panelCasillas.add(A3);

        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        panelCasillas.add(B3);

        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        panelCasillas.add(C3);

        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });
        panelCasillas.add(D3);

        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });
        panelCasillas.add(E3);

        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });
        panelCasillas.add(F3);

        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });
        panelCasillas.add(G3);

        H3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H3ActionPerformed(evt);
            }
        });
        panelCasillas.add(H3);

        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        panelCasillas.add(A4);

        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        panelCasillas.add(B4);

        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });
        panelCasillas.add(C4);

        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });
        panelCasillas.add(D4);

        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });
        panelCasillas.add(E4);

        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });
        panelCasillas.add(F4);

        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });
        panelCasillas.add(G4);

        H4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H4ActionPerformed(evt);
            }
        });
        panelCasillas.add(H4);

        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });
        panelCasillas.add(A5);

        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        panelCasillas.add(B5);

        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });
        panelCasillas.add(C5);

        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });
        panelCasillas.add(D5);

        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });
        panelCasillas.add(E5);

        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });
        panelCasillas.add(F5);

        G5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G5ActionPerformed(evt);
            }
        });
        panelCasillas.add(G5);

        H5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H5ActionPerformed(evt);
            }
        });
        panelCasillas.add(H5);

        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });
        panelCasillas.add(A6);

        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        panelCasillas.add(B6);

        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });
        panelCasillas.add(C6);

        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });
        panelCasillas.add(D6);

        E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E6ActionPerformed(evt);
            }
        });
        panelCasillas.add(E6);

        F6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F6ActionPerformed(evt);
            }
        });
        panelCasillas.add(F6);

        G6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G6ActionPerformed(evt);
            }
        });
        panelCasillas.add(G6);

        H6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H6ActionPerformed(evt);
            }
        });
        panelCasillas.add(H6);

        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });
        panelCasillas.add(A7);

        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        panelCasillas.add(B7);

        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });
        panelCasillas.add(C7);

        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });
        panelCasillas.add(D7);

        E7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E7ActionPerformed(evt);
            }
        });
        panelCasillas.add(E7);

        F7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F7ActionPerformed(evt);
            }
        });
        panelCasillas.add(F7);

        G7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G7ActionPerformed(evt);
            }
        });
        panelCasillas.add(G7);

        H7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H7ActionPerformed(evt);
            }
        });
        panelCasillas.add(H7);

        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });
        panelCasillas.add(A8);

        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        panelCasillas.add(B8);

        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });
        panelCasillas.add(C8);

        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });
        panelCasillas.add(D8);

        E8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E8ActionPerformed(evt);
            }
        });
        panelCasillas.add(E8);

        F8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F8ActionPerformed(evt);
            }
        });
        panelCasillas.add(F8);

        G8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G8ActionPerformed(evt);
            }
        });
        panelCasillas.add(G8);

        H8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H8ActionPerformed(evt);
            }
        });
        panelCasillas.add(H8);

        jPanel1.setLayout(new java.awt.GridLayout(8, 1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("1");
        jPanel1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("2");
        jPanel1.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("3");
        jPanel1.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("4");
        jPanel1.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("5");
        jPanel1.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("6");
        jPanel1.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("7");
        jPanel1.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("8");
        jPanel1.add(jLabel8);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("A");
        jPanel3.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("B");
        jPanel3.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("C");
        jPanel3.add(jLabel11);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("D");
        jPanel3.add(jLabel12);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("E");
        jPanel3.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("F");
        jPanel3.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("G");
        jPanel3.add(jLabel15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("H");
        jPanel3.add(jLabel16);

        tfTurno.setEditable(false);
        tfTurno.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        tfTurno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTurno.setText("BLANCO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfTurno)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelCasillas, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCasillas, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        accionBoton(A1, 0);
    }//GEN-LAST:event_A1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        accionBoton(B1, 1);
    }//GEN-LAST:event_B1ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        accionBoton(A7, 48);
    }//GEN-LAST:event_A7ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
        accionBoton(D8, 59);
    }//GEN-LAST:event_D8ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        accionBoton(C8, 58);
    }//GEN-LAST:event_C8ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        accionBoton(B8, 57);
    }//GEN-LAST:event_B8ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        accionBoton(A8, 56);
    }//GEN-LAST:event_A8ActionPerformed

    private void E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E8ActionPerformed
        accionBoton(E8, 60);
    }//GEN-LAST:event_E8ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        accionBoton(A6, 40);
    }//GEN-LAST:event_A6ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        accionBoton(A5, 32);
    }//GEN-LAST:event_A5ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        accionBoton(C1, 2);
    }//GEN-LAST:event_C1ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        accionBoton(D1, 3);
    }//GEN-LAST:event_D1ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        accionBoton(E1, 4);
    }//GEN-LAST:event_E1ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        accionBoton(F1, 5);
    }//GEN-LAST:event_F1ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        accionBoton(G1, 6);
    }//GEN-LAST:event_G1ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
        accionBoton(H1, 7);
    }//GEN-LAST:event_H1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        accionBoton(A2, 8);
    }//GEN-LAST:event_A2ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        accionBoton(B2, 9);
    }//GEN-LAST:event_B2ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        accionBoton(C2, 10);
    }//GEN-LAST:event_C2ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        accionBoton(D2, 11);
    }//GEN-LAST:event_D2ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        accionBoton(E2, 12);
    }//GEN-LAST:event_E2ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        accionBoton(F2, 13);
    }//GEN-LAST:event_F2ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        accionBoton(G2, 14);
    }//GEN-LAST:event_G2ActionPerformed

    private void H2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2ActionPerformed
        accionBoton(H2, 15);
    }//GEN-LAST:event_H2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        accionBoton(A3, 16);
    }//GEN-LAST:event_A3ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        accionBoton(B3, 17);
    }//GEN-LAST:event_B3ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        accionBoton(C3, 18);
    }//GEN-LAST:event_C3ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        accionBoton(D3, 19);
    }//GEN-LAST:event_D3ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        accionBoton(E3, 20);
    }//GEN-LAST:event_E3ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        accionBoton(F3, 21);
    }//GEN-LAST:event_F3ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
        accionBoton(G3, 22);
    }//GEN-LAST:event_G3ActionPerformed

    private void H3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H3ActionPerformed
        accionBoton(H3, 23);
    }//GEN-LAST:event_H3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        accionBoton(A4, 24);
    }//GEN-LAST:event_A4ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        accionBoton(B4, 25);
    }//GEN-LAST:event_B4ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        accionBoton(C4, 26);
    }//GEN-LAST:event_C4ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        accionBoton(D4, 27);
    }//GEN-LAST:event_D4ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        accionBoton(E4, 28);
    }//GEN-LAST:event_E4ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        accionBoton(F4, 29);
    }//GEN-LAST:event_F4ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        accionBoton(G4, 30);
    }//GEN-LAST:event_G4ActionPerformed

    private void H4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H4ActionPerformed
        accionBoton(H4, 31);
    }//GEN-LAST:event_H4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        accionBoton(B5, 33);
    }//GEN-LAST:event_B5ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        accionBoton(C5, 34);
    }//GEN-LAST:event_C5ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        accionBoton(D5, 35);
    }//GEN-LAST:event_D5ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
        accionBoton(E5, 36);
    }//GEN-LAST:event_E5ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
        accionBoton(F5, 37);
    }//GEN-LAST:event_F5ActionPerformed

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G5ActionPerformed
        accionBoton(G5, 38);
    }//GEN-LAST:event_G5ActionPerformed

    private void H5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H5ActionPerformed
        accionBoton(H5, 39);
    }//GEN-LAST:event_H5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        accionBoton(B6, 41);
    }//GEN-LAST:event_B6ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        accionBoton(C6, 42);
    }//GEN-LAST:event_C6ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
        accionBoton(D6, 43);
    }//GEN-LAST:event_D6ActionPerformed

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E6ActionPerformed
        accionBoton(E6, 44);
    }//GEN-LAST:event_E6ActionPerformed

    private void F6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F6ActionPerformed
        accionBoton(F6, 45);
    }//GEN-LAST:event_F6ActionPerformed

    private void G6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G6ActionPerformed
        accionBoton(G6, 46);
    }//GEN-LAST:event_G6ActionPerformed

    private void H6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H6ActionPerformed
        accionBoton(H6, 47);
    }//GEN-LAST:event_H6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        accionBoton(B7, 49);
    }//GEN-LAST:event_B7ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        accionBoton(C7, 50);
    }//GEN-LAST:event_C7ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        accionBoton(D7, 51);
    }//GEN-LAST:event_D7ActionPerformed

    private void E7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E7ActionPerformed
        accionBoton(E7, 52);
    }//GEN-LAST:event_E7ActionPerformed

    private void F7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F7ActionPerformed
        accionBoton(F7, 53);
    }//GEN-LAST:event_F7ActionPerformed

    private void G7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G7ActionPerformed
        accionBoton(G7, 54);
    }//GEN-LAST:event_G7ActionPerformed

    private void H7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H7ActionPerformed
        accionBoton(H7, 55);
    }//GEN-LAST:event_H7ActionPerformed

    private void F8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F8ActionPerformed
        accionBoton(F8, 61);
    }//GEN-LAST:event_F8ActionPerformed

    private void G8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G8ActionPerformed
        accionBoton(G8, 62);
    }//GEN-LAST:event_G8ActionPerformed

    private void H8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H8ActionPerformed
        accionBoton(H8, 63);
    }//GEN-LAST:event_H8ActionPerformed
    private void calcularPosicionesAlfil(int posicion, boolean turnoBlanco) {
        int x = posicion / 8;
        int y = posicion % 8;
        int i = x - 1;
        int j = y - 1;
        boolean ocupada = false;
        if (turnoBlanco) {
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if(!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)){
                    juego.tablero[i][j].setBackground(Color.blue);
                } else {
                    ocupada = true;
                    if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                        juego.tablero[i][j].setBackground(Color.red);
                    }
                }
                i--;
                j--;
            }
            ocupada = false;
            i = x + 1;
            j = y + 1;
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.blue);
                } else {
                    ocupada = true;
                    if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                        juego.tablero[i][j].setBackground(Color.red);
                    }
                }
                i++;
                j++;
            }
            ocupada = false;
            i = x + 1;
            j = y - 1;
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.blue);
                } else {
                    ocupada = true;
                    if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                        juego.tablero[i][j].setBackground(Color.red);
                    }
                }
                i++;
                j--;
            }
            ocupada = false;
            i = x - 1;
            j = y + 1;
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.blue);
                } else {
                    ocupada = true;
                    if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                        juego.tablero[i][j].setBackground(Color.red);
                    }
                }
                i--;
                j++;
            }
        } else {
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.blue);
                } else {
                    ocupada = true;
                    if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                        juego.tablero[i][j].setBackground(Color.red);
                    }
                }
                i--;
                j--;
            }
            ocupada = false;
            i = x + 1;
            j = y + 1;
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.blue);
                } else {
                    ocupada = true;
                    if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                        juego.tablero[i][j].setBackground(Color.red);
                    }
                }
                i++;
                j++;
            }
            ocupada = false;
            i = x + 1;
            j = y - 1;
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.blue);
                } else {
                    ocupada = true;
                    if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                        juego.tablero[i][j].setBackground(Color.red);
                    }
                }
                i++;
                j--;
            }
            ocupada = false;
            i = x - 1;
            j = y + 1;
            while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
                if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.blue);
                } else {
                    ocupada = true;
                    if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                        juego.tablero[i][j].setBackground(Color.red);
                    }
                }
                i--;
                j++;
            }
        }
    }

    private void calcularPosicionesTorre(int posicion, boolean turnoBlanco) {
        int x = posicion / 8;
        int y = posicion % 8;
        int i = x - 1;
        int j = y;
        boolean ocupada = false;
        while ((i >= 0) && (i < 8) && !ocupada) {
            if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                juego.tablero[i][j].setBackground(Color.blue);
            } else {
                ocupada = true;
                if (turnoBlanco && juego.casillaOcupada(juego.tablero[i][j], juego.negro) || !turnoBlanco && juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.red);
                }
            }
            i--;
        }
        i = x + 1;
        j = y;
        ocupada = false;
        while ((i >= 0) && (i < 8) && !ocupada) {
            if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                juego.tablero[i][j].setBackground(Color.blue);
            } else {
                ocupada = true;
                if (turnoBlanco && juego.casillaOcupada(juego.tablero[i][j], juego.negro) || !turnoBlanco && juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.red);
                }
            }
            i++;
        }
        i = x;
        j = y + 1;
        ocupada = false;
        while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
            if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                juego.tablero[i][j].setBackground(Color.blue);
            } else {
                ocupada = true;
                if (turnoBlanco && juego.casillaOcupada(juego.tablero[i][j], juego.negro) || !turnoBlanco && juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.red);
                }
            }
            j++;
        }
        i = x;
        j = y - 1;
        ocupada = false;
        while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
            if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                juego.tablero[i][j].setBackground(Color.blue);
            } else {
                ocupada = true;
                if (turnoBlanco && juego.casillaOcupada(juego.tablero[i][j], juego.negro) || !turnoBlanco && juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.red);
                }
            }
            j--;
        }
    }

    private void calcularPosicionesCaballo(int posicion, boolean turnoBlanco) {
        int x = posicion / 8;
        int y = posicion % 8;
        int i = x;
        int j = y;
        if (turnoBlanco) {
            i = x - 1;
            j = y + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x - 2;
            j = y + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x + 1;
            j = y + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x + 2;
            j = y + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x - 1;
            j = y - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x - 2;
            j = y - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x + 1;
            j = y - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x + 2;
            j = y - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
        } else {
            i = x - 1;
            j = y + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x - 2;
            j = y + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x + 1;
            j = y + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x + 2;
            j = y + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x - 1;
            j = y - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x - 2;
            j = y - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x + 1;
            j = y - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
            i = x + 2;
            j = y - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                    juego.tablero[i][j].setBackground(Color.red);
                } else {
                    if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                        juego.tablero[i][j].setBackground(Color.blue);
                    }
                }
            }
        }

    }

    private void calcularPosicionesDama(int posicion, boolean turnoBlanco) {
        calcularPosicionesAlfil(posicion, turnoBlanco);
        calcularPosicionesTorre(posicion, turnoBlanco);
    }

    private void calcularPosicionesRey(int posicion, boolean turnoBlanco) {
        int x = posicion / 8;
        int y = posicion % 8;
        int i = x;
        int j = y;
        if (turnoBlanco) {
            for(i=x-1; i<x+2; i++){
                for(j=y-1; j<y+2; j++){
                    if((i != x) || (j != y)){
                        if ((i >= 0) && (i < 8) && (j >= 0) && (j < 8)) {
                            if (juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                                juego.tablero[i][j].setBackground(Color.red);
                            } else {
                                if (!juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                                    juego.tablero[i][j].setBackground(Color.blue);
                                }
                            }
                        }
                    }
                }
            }
        }else{
            for(i=x-1; i<x+2; i++){
                for(j=y-1; j<y+2; j++){
                    if((i != x) || (j != y)){
                        if ((i >= 0) && (i < 8) && (j >= 0) && (j < 8)) {
                            if (juego.casillaOcupada(juego.tablero[i][j], juego.blanco)) {
                                juego.tablero[i][j].setBackground(Color.red);
                            } else {
                                if (!juego.casillaOcupada(juego.tablero[i][j], juego.negro)) {
                                    juego.tablero[i][j].setBackground(Color.blue);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void calcularPosicionesPeon(int posicion, boolean turnoBlanco, boolean primerTurno) {
        int x = posicion / 8;
        int y = posicion % 8;
        int i, j;
        //Las fichas blancan irán hacia arriba.
        if (turnoBlanco) {
            i = x-1; j = y;
            if((i >= 0) && (i < 8) && (j < 8) && (j >= 0)){
                if(!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)){
                    juego.tablero[i][j].setBackground(Color.blue);
                }
            }
            i = x-2; j = y;
            if((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && primerTurno){
                if(!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)){
                    juego.tablero[i][j].setBackground(Color.blue);
                }
            }
            i = x-1; j = y-1;
            if((i >= 0) && (i < 8) && (j < 8) && (j >= 0)){
                if(juego.casillaOcupada(juego.tablero[i][j], juego.negro)){
                    juego.tablero[i][j].setBackground(Color.red);
                }
            }
            i = x-1; j = y+1;
            if((i >= 0) && (i < 8) && (j < 8) && (j >= 0)){
                if(juego.casillaOcupada(juego.tablero[i][j], juego.negro)){
                    juego.tablero[i][j].setBackground(Color.red);
                }
            }
        } else {
            i = x+1; j = y;
            if((i >= 0) && (i < 8) && (j < 8) && (j >= 0)){
                if(!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)){
                    juego.tablero[i][j].setBackground(Color.blue);
                }
            }
            i = x+2; j = y;
            if((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && primerTurno){
                if(!juego.casillaOcupada(juego.tablero[i][j], juego.negro) && !juego.casillaOcupada(juego.tablero[i][j], juego.blanco)){
                    juego.tablero[i][j].setBackground(Color.blue);
                }
            }
            i = x+1; j = y-1;
            if((i >= 0) && (i < 8) && (j < 8) && (j >= 0)){
                if(juego.casillaOcupada(juego.tablero[i][j], juego.blanco)){
                    juego.tablero[i][j].setBackground(Color.red);
                }
            }
            i = x+1; j = y+1;
            if((i >= 0) && (i < 8) && (j < 8) && (j >= 0)){
                if(juego.casillaOcupada(juego.tablero[i][j], juego.blanco)){
                    juego.tablero[i][j].setBackground(Color.red);
                }
            }
        }
    }

    private void accionBoton(JButton boton, int posicion) {
        boolean turnoBlanco = juego.turnoBlanco;
        if (boton.getBackground().equals(Color.blue)) {
            seleccionada.casilla = null;
            seleccionado.setIcon(null);
            seleccionada.casilla = boton;
            if(seleccionada.tipo == 1 && ((posicion >= 0) && (posicion <=7) || (posicion >= 56) && (posicion <=63))){
                String []opciones = new String[4];
                opciones[0] = "Torre";
                opciones[1] = "Caballo";
                opciones[2] = "Alfil";
                opciones[3] = "Dama";
                if(turnoBlanco && (posicion >= 0) && (posicion <=7)){
                    int n = JOptionPane.showOptionDialog(rootPane, "Tu peón ha llegado al final del tablero"
                            + ", ¿en qué nueva figura desea convertirla?", "Level UP", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, opciones, null);
                    if(n == 0){
                        seleccionada.tipo = 2;
                        ImageIcon tB = new ImageIcon("imagenes/torreBlanco.png");
                        ImageIcon tB2 = new ImageIcon(tB.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                        boton.setIcon(tB2);
                    }
                    if(n == 1){
                        seleccionada.tipo = 3;
                        ImageIcon cB = new ImageIcon("imagenes/caballoBlanco.png");
                        ImageIcon cB2 = new ImageIcon(cB.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                        boton.setIcon(cB2);
                    }
                    if(n == 2){
                        seleccionada.tipo = 4;
                        ImageIcon aB = new ImageIcon("imagenes/alfilBlanco.png");
                        ImageIcon aB2 = new ImageIcon(aB.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                        boton.setIcon(aB2);
                    }
                    if(n == 3){
                        seleccionada.tipo = 5;
                        ImageIcon dB = new ImageIcon("imagenes/damaBlanco.png");
                        ImageIcon dB2 = new ImageIcon(dB.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                        boton.setIcon(dB2);
                    }
                }else{
                    if(!turnoBlanco && (posicion >= 56) && (posicion <=63)){
                        int n = JOptionPane.showOptionDialog(rootPane, "Tu peón ha llegado al final del tablero"
                            + ", ¿en qué nueva figura desea convertirla?", "Level UP", JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE, null, opciones, null);
                        if(n == 0){
                            seleccionada.tipo = 2;
                            ImageIcon tN = new ImageIcon("imagenes/torreNegro.png");
                            ImageIcon tN2 = new ImageIcon(tN.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                            boton.setIcon(tN2);
                        }
                        if(n == 1){
                            seleccionada.tipo = 3;
                            ImageIcon cN = new ImageIcon("imagenes/caballoNegro.png");
                            ImageIcon cN2 = new ImageIcon(cN.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                            boton.setIcon(cN2);
                        }
                        if(n == 2){
                            seleccionada.tipo = 4;
                            ImageIcon aN = new ImageIcon("imagenes/alfilNegro.png");
                            ImageIcon aN2 = new ImageIcon(aN.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                            boton.setIcon(aN2);
                        }
                        if(n == 3){
                            seleccionada.tipo = 5;
                            ImageIcon dN = new ImageIcon("imagenes/damaNegro.png");
                            ImageIcon dN2 = new ImageIcon(dN.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                            boton.setIcon(dN2);
                        }
                    }else{
                        System.out.println("Error");
                    }
                }
            }else{
                seleccionada.poneImagenes(boton.getWidth(), boton.getHeight());
            }
            pintarCasillasNormal(juego.tablero);
            if(turnoBlanco){
                tfTurno.setText("NEGRO");
                tfTurno.setBackground(Color.BLACK);
                tfTurno.setForeground(Color.WHITE);
            }else{
                tfTurno.setText("BLANCO");
                tfTurno.setBackground(Color.WHITE);
                tfTurno.setForeground(Color.BLACK);
            }
            juego.cambiarTurno();
            seleccionado = null;
            seleccionada = null;
        } else {
            if (boton.getBackground().equals(Color.red)) {
                Ficha comida = null;
                if (turnoBlanco) {
                    if (juego.casillaOcupada(boton, juego.negro)) {
                        for (int i = 0; i < juego.negro.fichas.size(); i++) {
                            if (juego.negro.fichas.get(i).casilla.equals(boton)) {
                                comida = juego.negro.fichas.get(i);
                            }
                        }
                    }
                } else {
                    if (juego.casillaOcupada(boton, juego.blanco)) {
                        for (int i = 0; i < juego.blanco.fichas.size(); i++) {
                            if (juego.blanco.fichas.get(i).casilla.equals(boton)) {
                                comida = juego.blanco.fichas.get(i);
                            }
                        }
                    }
                }
                if (comida != null) {
                    if (turnoBlanco) {
                        if (juego.comer(juego.negro, comida)) {
                            JOptionPane.showMessageDialog(rootPane, "¡Las fichas BLANCAS gana la partida!");
                            this.dispose();
                        }
                    } else {
                        if (juego.comer(juego.blanco, comida)) {
                            JOptionPane.showMessageDialog(rootPane, "¡Las fichas NEGRAS gana la partida!");
                            this.dispose();
                        }
                    }
                    seleccionada.casilla = null;
                    seleccionado.setIcon(null);
                    seleccionada.casilla = boton;
                    if(seleccionada.tipo == 1 && ((posicion >= 0) && (posicion <=7) || (posicion >= 56) && (posicion <=63))){
                        String []opciones = new String[4];
                        opciones[0] = "Torre";
                        opciones[1] = "Caballo";
                        opciones[2] = "Alfil";
                        opciones[3] = "Dama";
                        if(turnoBlanco && (posicion >= 0) && (posicion <=7)){
                            int n = JOptionPane.showOptionDialog(rootPane, "Tu peón ha llegado al final del tablero"
                                    + ", ¿en qué nueva figura desea convertirla?", "Level UP", JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE, null, opciones, null);
                            if(n == 0){
                                seleccionada.tipo = 2;
                                ImageIcon tB = new ImageIcon("imagenes/torreBlanco.png");
                                ImageIcon tB2 = new ImageIcon(tB.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                                boton.setIcon(tB2);
                            }
                            if(n == 1){
                                seleccionada.tipo = 3;
                                ImageIcon cB = new ImageIcon("imagenes/caballoBlanco.png");
                                ImageIcon cB2 = new ImageIcon(cB.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                                boton.setIcon(cB2);
                            }
                            if(n == 2){
                                seleccionada.tipo = 4;
                                ImageIcon aB = new ImageIcon("imagenes/alfilBlanco.png");
                                ImageIcon aB2 = new ImageIcon(aB.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                                boton.setIcon(aB2);
                            }
                            if(n == 3){
                                seleccionada.tipo = 5;
                                ImageIcon dB = new ImageIcon("imagenes/damaBlanco.png");
                                ImageIcon dB2 = new ImageIcon(dB.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                                boton.setIcon(dB2);
                            }
                        }else{
                            if(!turnoBlanco && (posicion >= 56) && (posicion <=63)){
                                int n = JOptionPane.showOptionDialog(rootPane, "Tu peón ha llegado al final del tablero"
                                    + ", ¿en qué nueva figura desea convertirla?", "Level UP", JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.QUESTION_MESSAGE, null, opciones, null);
                                if(n == 0){
                                    seleccionada.tipo = 2;
                                    ImageIcon tN = new ImageIcon("imagenes/torreNegro.png");
                                    ImageIcon tN2 = new ImageIcon(tN.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                                    boton.setIcon(tN2);
                                }
                                if(n == 1){
                                    seleccionada.tipo = 3;
                                    ImageIcon cN = new ImageIcon("imagenes/caballoNegro.png");
                                    ImageIcon cN2 = new ImageIcon(cN.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                                    boton.setIcon(cN2);
                                }
                                if(n == 2){
                                    seleccionada.tipo = 4;
                                    ImageIcon aN = new ImageIcon("imagenes/alfilNegro.png");
                                    ImageIcon aN2 = new ImageIcon(aN.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                                    boton.setIcon(aN2);
                                }
                                if(n == 3){
                                    seleccionada.tipo = 5;
                                    ImageIcon dN = new ImageIcon("imagenes/damaNegro.png");
                                    ImageIcon dN2 = new ImageIcon(dN.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), 1));
                                    boton.setIcon(dN2);
                                }
                            }else{
                                System.out.println("Error");
                            }
                        }
                    }else{
                        seleccionada.poneImagenes(boton.getWidth(), boton.getHeight());
                    }
                    pintarCasillasNormal(juego.tablero);
                    if(turnoBlanco){
                        tfTurno.setText("NEGRO");
                        tfTurno.setBackground(Color.BLACK);
                        tfTurno.setForeground(Color.WHITE);
                    }else{
                        tfTurno.setText("BLANCO");
                        tfTurno.setBackground(Color.WHITE);
                        tfTurno.setForeground(Color.BLACK);
                    }
                    juego.cambiarTurno();
                    seleccionado = null;
                    seleccionada = null;
                }
            } else {
                seleccionado = null;
                seleccionada = null;
                pintarCasillasNormal(juego.tablero);
                int i;
                i = 0;
                while (seleccionada == null && (i < juego.negro.fichas.size() || i < juego.blanco.fichas.size())) {
                    if (i < juego.negro.fichas.size() && !turnoBlanco) {
                        if (juego.negro.fichas.get(i).casilla.equals(boton)) {
                            seleccionado = juego.negro.fichas.get(i).casilla;
                            seleccionada = juego.negro.fichas.get(i);
                        }
                    } else {
                        if (i < juego.blanco.fichas.size() && turnoBlanco) {
                            if (juego.blanco.fichas.get(i).casilla.equals(boton)) {
                                seleccionado = juego.blanco.fichas.get(i).casilla;
                                seleccionada = juego.blanco.fichas.get(i);
                            }
                        }
                    }
                    i++;
                }
                if (seleccionada != null) {
                    if (seleccionada.tipo == 1) {
                        if((posicion >= 48) && (posicion <= 55) || (posicion >= 8) && (posicion <= 15)){
                                calcularPosicionesPeon(posicion, turnoBlanco, true);
                        }else{
                            calcularPosicionesPeon(posicion, turnoBlanco, false);
                        }
                        System.out.println("1");
                    }
                    if (seleccionada.tipo == 2) {
                        calcularPosicionesTorre(posicion, turnoBlanco);
                        System.out.println("2");
                    }
                    if (seleccionada.tipo == 3) {
                        calcularPosicionesCaballo(posicion, turnoBlanco);
                        System.out.println("3");
                    }
                    if (seleccionada.tipo == 4) {
                        calcularPosicionesAlfil(posicion, turnoBlanco);
                        System.out.println("4");
                    }
                    if (seleccionada.tipo == 5) {
                        calcularPosicionesDama(posicion, turnoBlanco);
                        System.out.println("5");
                    }
                    if (seleccionada.tipo == 6) {
                        calcularPosicionesRey(posicion, turnoBlanco);
                        System.out.println("6");
                    }
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VP.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VP.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VP.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VP.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton D5;
    private javax.swing.JButton D6;
    private javax.swing.JButton D7;
    private javax.swing.JButton D8;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton E6;
    private javax.swing.JButton E7;
    private javax.swing.JButton E8;
    private javax.swing.JButton F1;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JButton F7;
    private javax.swing.JButton F8;
    private javax.swing.JButton G1;
    private javax.swing.JButton G2;
    private javax.swing.JButton G3;
    private javax.swing.JButton G4;
    private javax.swing.JButton G5;
    private javax.swing.JButton G6;
    private javax.swing.JButton G7;
    private javax.swing.JButton G8;
    private javax.swing.JButton H1;
    private javax.swing.JButton H2;
    private javax.swing.JButton H3;
    private javax.swing.JButton H4;
    private javax.swing.JButton H5;
    private javax.swing.JButton H6;
    private javax.swing.JButton H7;
    private javax.swing.JButton H8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelCasillas;
    private javax.swing.JTextField tfTurno;
    // End of variables declaration//GEN-END:variables
}
