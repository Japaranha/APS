/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author SHEILA
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    public Inicial() {
        initComponents();
    }
    /*
        public ExemploJFrame() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setSize(d);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        ExemploJFrame tela = new ExemploJFrame();
        tela.getContentPane().setBackground(Color.green);
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Tabela = new javax.swing.JPanel();
        lbl_col_Pais = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pnl_Botao = new javax.swing.JPanel();
        btn_busca_nome = new javax.swing.JButton();
        btn_busca_latitude = new javax.swing.JButton();
        btn_busca_longitude = new javax.swing.JButton();
        btn_busca_regiao = new javax.swing.JButton();
        btn_busca_pais = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_col_Pais.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lbl_col_Pais.setText("Georganização");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nomes", "Latitude", "Longitude", "Região", "País"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kazuo\\Documents\\NetBeansProjects\\Aps_2020\\src\\Resource\\map (2).png")); // NOI18N

        javax.swing.GroupLayout pnl_TabelaLayout = new javax.swing.GroupLayout(pnl_Tabela);
        pnl_Tabela.setLayout(pnl_TabelaLayout);
        pnl_TabelaLayout.setHorizontalGroup(
            pnl_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TabelaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnl_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_TabelaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_col_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_TabelaLayout.setVerticalGroup(
            pnl_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TabelaLayout.createSequentialGroup()
                .addGroup(pnl_TabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(pnl_TabelaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbl_col_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        btn_busca_nome.setText("Nome");

        btn_busca_latitude.setText("Latitude");

        btn_busca_longitude.setText("Longitude");

        btn_busca_regiao.setText("Região");

        btn_busca_pais.setText("País");

        btn_sair.setText("Sair");

        javax.swing.GroupLayout pnl_BotaoLayout = new javax.swing.GroupLayout(pnl_Botao);
        pnl_Botao.setLayout(pnl_BotaoLayout);
        pnl_BotaoLayout.setHorizontalGroup(
            pnl_BotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BotaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_busca_nome)
                .addGap(49, 49, 49)
                .addComponent(btn_busca_latitude)
                .addGap(62, 62, 62)
                .addComponent(btn_busca_longitude)
                .addGap(62, 62, 62)
                .addComponent(btn_busca_regiao)
                .addGap(67, 67, 67)
                .addComponent(btn_busca_pais)
                .addGap(35, 35, 35)
                .addComponent(btn_sair)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnl_BotaoLayout.setVerticalGroup(
            pnl_BotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BotaoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_BotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_busca_nome)
                    .addComponent(btn_busca_latitude)
                    .addComponent(btn_busca_longitude)
                    .addComponent(btn_busca_regiao)
                    .addComponent(btn_busca_pais)
                    .addComponent(btn_sair))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnl_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(pnl_Tabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pnl_Tabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_busca_latitude;
    private javax.swing.JButton btn_busca_longitude;
    private javax.swing.JButton btn_busca_nome;
    private javax.swing.JButton btn_busca_pais;
    private javax.swing.JButton btn_busca_regiao;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_col_Pais;
    private javax.swing.JPanel pnl_Botao;
    private javax.swing.JPanel pnl_Tabela;
    // End of variables declaration//GEN-END:variables
}
