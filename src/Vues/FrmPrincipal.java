package Vues;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrmPrincipal extends JFrame {
    private JPanel rootPane;
    private JLabel lblTitre;
    private JTabbedPane tbExercices;
    private JPanel pnlExo1;
    private JPanel pnlExo2;
    private JPanel pnlExo3;
    private JPanel pnlExo4;
    private JButton btnAfficherTableauExo1;
    private JTextField txtTabExo1;
    private JButton btnPlusGrandeValeur;
    private JTextField txtPlusGrandeValeur;
    private JTextField txtValeurRecherchee;
    private JTextField txtPosition;
    private JButton btnRechercherValeur;
    private JLabel lblValeurRecherchee;
    private JLabel lblPosition;
    private JButton btnAfficherTableauExo2;
    private JTextField txtTabExo2;
    private JButton btnDecomposer;
    private JLabel lblValeursPaires;
    private JLabel lblValeursImpaires;
    private JLabel lblSommePaire;
    private JLabel lblSommeImpaire;
    private JTextField txtValeursPaires;
    private JTextField txtValeursImpaires;
    private JTextField txtSommePaire;
    private JTextField txtSommeImpaire;
    private JButton btnAfficherTableauExo3;
    private JTextField txtTab1Exo3;
    private JTextField txtTab2Exo3;
    private JButton btnSchtroumpf;
    private JTextField txtSchtroumpf;
    private JButton btnAfficherTableauExo4;
    private JButton btnResultat;
    private JTextField txtValeurs;
    private JTextField txtLignes;
    private JTextField txtColonnes;
    private JTextArea txtExo4;
    private JLabel lblValeurs;
    private JLabel lblLignes;
    private JLabel lblColonnes;

    int[] tabExo1;
    int[] tabExo2;
    int[] tab1Exo3;
    int[] tab2Exo3;
    int[][] tabExo4;

    public FrmPrincipal() {
        this.setTitle("TP5");
        this.setContentPane(rootPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
                tabExo1 = new int[]{31, 61, 17, 4, 9};
                tabExo2 = new int[]{11, 3, 4, 63, 10};
                tab1Exo3 = new int[]{4, 8, 7, 12};
                tab2Exo3 = new int[]{3, 6};
                tabExo4 = new int[4][4];

                // Exemple n°1



                tabExo4[0][0] = 1;tabExo4[0][1] = 0;tabExo4[0][2] = 0;tabExo4[0][3] = 0;
                tabExo4[1][0] = 0;tabExo4[1][1] = 3;tabExo4[1][2] = 0;tabExo4[1][3] = 6;
                tabExo4[2][0] = 0;tabExo4[2][1] = 0;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
                tabExo4[3][0] = 0;tabExo4[3][1] = 0;tabExo4[3][2] = 0;tabExo4[3][3] = 0;



                // Exemple n°2
/*
                tabExo4[0][0] = 1;
                tabExo4[0][1] = 2;
                tabExo4[0][2] = 0;
                tabExo4[0][3] = 0;
                tabExo4[1][0] = 3;
                tabExo4[1][1] = 4;
                tabExo4[1][2] = 0;
                tabExo4[1][3] = 0;
                tabExo4[2][0] = 5;
                tabExo4[2][1] = 6;
                tabExo4[2][2] = 0;
                tabExo4[2][3] = 0;
                tabExo4[3][0] = 7;
                tabExo4[3][1] = 8;
                tabExo4[3][2] = 0;
                tabExo4[3][3] = 0;
*/
            }
        });

        btnAfficherTableauExo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//for(int nb : tab) {chaine = chaine +nb +" - ";} Pour chaque partie que j'appelle nb et qui se trouve dans tab
                //  for(int nb : tabExo1){
                //   txtTabExo1.setText(txtTabExo1.getText()+nb + " - ");
                //}
//String chaine = " ";
                //      for(int nb : tabExo1) {
                //  chaine = chaine+nb +" - ";
                //  }
                //  txtTabExo1.setText(chaine);


                for (int i = 0; i < tabExo1.length; i++) {
                    txtTabExo1.setText(txtTabExo1.getText() + tabExo1[i] + " - ");
                }
            }
        });

        btnPlusGrandeValeur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int max = tabExo1[0];
                for (int i = 1; i < tabExo1.length; i++) {
                    if (tabExo1[i] > max) {
                        max = tabExo1[i];
                    }

                }
                txtPlusGrandeValeur.setText(String.valueOf(max));


            }
        });

        btnRechercherValeur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                while (i < tabExo1.length - 1 && tabExo1[i] != Integer.parseInt(txtValeurRecherchee.getText())) {
                    i++;
                }
                if (tabExo1[i] == Integer.parseInt(txtValeurRecherchee.getText())) {
                    txtPosition.setText(String.valueOf(i));
                } else {
                    txtPosition.setText("Valeur non Présente");
                }
            }
        });

        btnDecomposer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int j = 0;
                int k = 0;
                int sommeP = 0;
                int sommeI = 0;
                int[] tabExoP = new int[tabExo2.length];
                int[] tabExoI = new int[5];
                for (int i = 0; i < tabExo2.length; i++) {
                    if (tabExoP[i] % 2 == 0) {
                        tabExoP[j] = tabExo2[i];
                        j++;
                        sommeP = sommeP + tabExo2[i];
                    } else {
                        tabExoI[k] = tabExo2[i];
                        k++;
                        sommeI = sommeI + tabExo2[i];
                    }
                }
                txtSommePaire.setText(String.valueOf(sommeP));
                txtSommeImpaire.setText(String.valueOf(sommeI));
                //Parcourir le tableau des valeur paire
                for (int i = 0; i < j; i++) {
                    txtValeursPaires.setText(txtValeursPaires.getText() + tabExoP[i] + " - ");

                }
                for (int i = 0; i < k; i++) {
                    txtValeursImpaires.setText(txtValeursImpaires.getText() + tabExoP[i] + " - ");
                }
            }
        });

        btnAfficherTableauExo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int nb : tabExo2) {
                    txtTabExo2.setText(txtTabExo2.getText() + nb + " - ");

                }

      /*          for (int i=0 ; i < tabExo2.length;i++){
                    txtTabExo2.setText(txtTabExo2.getText()+ tabExo2[i] + " - ");

                }

int i = 0;
                while (i < tabExo2.length){
                    txtTabExo2.setText(txtTabExo2.getText()+ tabExo2[i] + " - ");
                }

*/


            }
        });

        btnAfficherTableauExo3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for (int i = 0; i < tab1Exo3.length; i++) {
                    txtTab1Exo3.setText(txtTab1Exo3.getText() + tab1Exo3[i] + " - ");
                }
                for (int j = 0; j < tabExo1.length; j++) {
                    txtTab2Exo3.setText(txtTab2Exo3.getText() + tab2Exo3[j] + " - ");
                }
            }
        });


        btnSchtroumpf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int produit = 0;
                for (int i = 0; i < tab1Exo3.length; i++) {
                    for (int j = 0; j < tab2Exo3.length; j++) {
                        produit = tab1Exo3[i] * tab2Exo3[j] + produit;
                    }
                }
                txtSchtroumpf.setText(String.valueOf(produit));
            }
        });


        btnAfficherTableauExo4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                for (int i = 0; i < tabExo4.length; i++) {
                    for (int j = 0; j < tabExo4.length; j++) {
                        txtExo4.setText(txtExo4.getText() + tabExo4[i][j] + " - ");
                    }
                    txtExo4.setText(txtExo4.getText() + "\n");
                }

            }
        });

        btnResultat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                for (int i = 0; i < tabExo4.length; i++) {
                    for (int j = 0; j < tabExo4.length; j++) {
                        if (tabExo4[i][j] !=0) {
                            txtValeurs.setText(txtValeurs.getText() + tabExo4[i][j] + " - ");
                            txtLignes.setText(txtLignes.getText() + i + " - ");
                            txtColonnes.setText(txtColonnes.getText() + j + " - ");
                        }
                    }

                }
                }
        });
    }
}
