/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;
import controle.*;
import javax.swing.JOptionPane;

/**
 *
 * @author guylh
 */
public class TelaCadLivro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadLivro
     */
    Livraria livraria;
    
    public TelaCadLivro() {
        initComponents();
        livraria = new Livraria();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanelCadLivroFundoEsquerda = new javax.swing.JPanel();
        jLabelCadLivroFundoImgEsquerda = new javax.swing.JLabel();
        jPanelCadLivroFundoDireita = new javax.swing.JPanel();
        jLabelCadLivroTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCadLivroAutor = new javax.swing.JTextField();
        jComboBoxGenero = new javax.swing.JComboBox();
        jLabelCadLivroGenero = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEditora = new javax.swing.JTextField();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabelCadLivroFundoImgDireita = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelImgTitulo = new javax.swing.JLabel();
        jButtonExitCadLivro = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelCadLivroFundoEsquerda.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCadLivroFundoEsquerda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCadLivroFundoImgEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pilhalivro.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelCadLivroFundoEsquerdaLayout = new javax.swing.GroupLayout(jPanelCadLivroFundoEsquerda);
        jPanelCadLivroFundoEsquerda.setLayout(jPanelCadLivroFundoEsquerdaLayout);
        jPanelCadLivroFundoEsquerdaLayout.setHorizontalGroup(
            jPanelCadLivroFundoEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadLivroFundoEsquerdaLayout.createSequentialGroup()
                .addComponent(jLabelCadLivroFundoImgEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadLivroFundoEsquerdaLayout.setVerticalGroup(
            jPanelCadLivroFundoEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadLivroFundoEsquerdaLayout.createSequentialGroup()
                .addComponent(jLabelCadLivroFundoImgEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCadLivroFundoEsquerda);
        jPanelCadLivroFundoEsquerda.setBounds(10, 50, 136, 310);

        jPanelCadLivroFundoDireita.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCadLivroFundoDireita.setLayout(null);

        jLabelCadLivroTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCadLivroTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadLivroTitulo.setText("Título :");
        jPanelCadLivroFundoDireita.add(jLabelCadLivroTitulo);
        jLabelCadLivroTitulo.setBounds(30, 20, 60, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Autor:");
        jPanelCadLivroFundoDireita.add(jLabel2);
        jLabel2.setBounds(30, 60, 70, 17);

        jTextFieldCadLivroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadLivroAutorActionPerformed(evt);
            }
        });
        jPanelCadLivroFundoDireita.add(jTextFieldCadLivroAutor);
        jTextFieldCadLivroAutor.setBounds(100, 60, 170, 28);

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aventura", "Romance", "Drama", "Ficção", "Auto-Ajuda" }));
        jComboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGeneroActionPerformed(evt);
            }
        });
        jPanelCadLivroFundoDireita.add(jComboBoxGenero);
        jComboBoxGenero.setBounds(100, 100, 170, 30);

        jLabelCadLivroGenero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCadLivroGenero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCadLivroGenero.setText("Gênero: ");
        jPanelCadLivroFundoDireita.add(jLabelCadLivroGenero);
        jLabelCadLivroGenero.setBounds(30, 100, 80, 20);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelCadLivroFundoDireita.add(jButton1);
        jButton1.setBounds(40, 270, 90, 30);

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanelCadLivroFundoDireita.add(jButtonLimpar);
        jButtonLimpar.setBounds(170, 270, 90, 30);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Código:");
        jPanelCadLivroFundoDireita.add(jLabel3);
        jLabel3.setBounds(30, 140, 80, 18);
        jPanelCadLivroFundoDireita.add(jTextFieldCod);
        jTextFieldCod.setBounds(100, 140, 70, 28);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Preço:");
        jPanelCadLivroFundoDireita.add(jLabel4);
        jLabel4.setBounds(30, 180, 47, 18);
        jPanelCadLivroFundoDireita.add(jTextFieldPreco);
        jTextFieldPreco.setBounds(100, 180, 70, 30);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Editora:");
        jPanelCadLivroFundoDireita.add(jLabel5);
        jLabel5.setBounds(30, 220, 80, 18);
        jPanelCadLivroFundoDireita.add(jTextFieldEditora);
        jTextFieldEditora.setBounds(100, 220, 170, 28);
        jPanelCadLivroFundoDireita.add(jTextFieldTitulo);
        jTextFieldTitulo.setBounds(100, 20, 170, 28);

        jLabelCadLivroFundoImgDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo.jpg"))); // NOI18N
        jPanelCadLivroFundoDireita.add(jLabelCadLivroFundoImgDireita);
        jLabelCadLivroFundoImgDireita.setBounds(0, 0, 300, 310);

        getContentPane().add(jPanelCadLivroFundoDireita);
        jPanelCadLivroFundoDireita.setBounds(160, 50, 300, 310);

        jLabelTitulo.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabelTitulo.setText("Cadastro de Livros:");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(50, 20, 160, 20);

        jLabelImgTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadlivro (2).png"))); // NOI18N
        getContentPane().add(jLabelImgTitulo);
        jLabelImgTitulo.setBounds(0, 0, 50, 50);

        jButtonExitCadLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow_left.png"))); // NOI18N
        jButtonExitCadLivro.setToolTipText("Voltar");
        jButtonExitCadLivro.setBorderPainted(false);
        jButtonExitCadLivro.setContentAreaFilled(false);
        jButtonExitCadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitCadLivroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExitCadLivro);
        jButtonExitCadLivro.setBounds(393, 0, 80, 40);

        setSize(new java.awt.Dimension(476, 394));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitCadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitCadLivroActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonExitCadLivroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String titulo = jTextFieldTitulo.getText();
        String autor = jTextFieldCadLivroAutor.getText();
        String genero = (String) jComboBoxGenero.getSelectedItem();
        int cod = Integer.parseInt(jTextFieldCod.getText());
        double preco = Double.parseDouble(jTextFieldPreco.getText());
        String editora = jTextFieldEditora.getText();
        
        livraria.adquirirLivro(titulo, autor, genero, cod, preco, editora, 1);
        try {
            ControleArquivo.salvaArquivo(livraria);
            JOptionPane.showMessageDialog(null, "Livro Cadastrado com Sucesso!");
            jTextFieldTitulo.setText("");
            jTextFieldCadLivroAutor.setText("");
            jTextFieldCod.setText("");
            jTextFieldPreco.setText("");
            jTextFieldEditora.setText("");
        } 
        
        catch (IOException ex) {
            Logger.getLogger(TelaCadLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGeneroActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
       jTextFieldTitulo.setText("");
       jTextFieldCadLivroAutor.setText("");
       jComboBoxGenero.setName("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTextFieldCadLivroAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadLivroAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadLivroAutorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonExitCadLivro;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox jComboBoxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCadLivroFundoImgDireita;
    private javax.swing.JLabel jLabelCadLivroFundoImgEsquerda;
    private javax.swing.JLabel jLabelCadLivroGenero;
    private javax.swing.JLabel jLabelCadLivroTitulo;
    private javax.swing.JLabel jLabelImgTitulo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCadLivroFundoDireita;
    private javax.swing.JPanel jPanelCadLivroFundoEsquerda;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCadLivroAutor;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldEditora;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
