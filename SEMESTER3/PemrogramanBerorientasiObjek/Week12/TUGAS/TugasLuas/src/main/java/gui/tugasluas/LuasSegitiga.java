/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.tugasluas;

import javax.swing.JOptionPane;

/**
 *
 * @author prame
 */
public class LuasSegitiga extends javax.swing.JFrame {

    /**
     * Creates new form LuasSegitiga
     */
    public LuasSegitiga() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnProses = new javax.swing.JButton();
        btnBersihkan = new javax.swing.JButton();
        btnBeranda = new javax.swing.JButton();
        lblNamaFile = new javax.swing.JLabel();
        btnSelesai = new javax.swing.JButton();
        lblJudul = new javax.swing.JLabel();
        lblSubJudul = new javax.swing.JLabel();
        pnlInput = new javax.swing.JPanel();
        lblAlas = new javax.swing.JLabel();
        lblTinggi = new javax.swing.JLabel();
        lblLuasSegitiga = new javax.swing.JLabel();
        fldAlas = new javax.swing.JTextField();
        fldTinggi = new javax.swing.JTextField();
        fldLuasSegitiga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnProses.setBackground(new java.awt.Color(255, 204, 51));
        btnProses.setFont(new java.awt.Font("Hack", 0, 18)); // NOI18N
        btnProses.setText("PROSES");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });
        btnProses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnProsesKeyPressed(evt);
            }
        });

        btnBersihkan.setBackground(new java.awt.Color(255, 204, 51));
        btnBersihkan.setFont(new java.awt.Font("Hack", 0, 18)); // NOI18N
        btnBersihkan.setText("BERSIHKAN");
        btnBersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihkanActionPerformed(evt);
            }
        });
        btnBersihkan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBersihkanKeyPressed(evt);
            }
        });

        btnBeranda.setBackground(new java.awt.Color(255, 204, 51));
        btnBeranda.setFont(new java.awt.Font("Hack", 0, 18)); // NOI18N
        btnBeranda.setText("BERANDA");
        btnBeranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBerandaActionPerformed(evt);
            }
        });
        btnBeranda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnBerandaKeyPressed(evt);
            }
        });

        lblNamaFile.setFont(new java.awt.Font("Hack", 0, 8)); // NOI18N
        lblNamaFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNamaFile.setText("LuasSegitiga.java");

        btnSelesai.setBackground(new java.awt.Color(255, 204, 51));
        btnSelesai.setFont(new java.awt.Font("Hack", 0, 18)); // NOI18N
        btnSelesai.setText("SELESAI");
        btnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelesaiActionPerformed(evt);
            }
        });
        btnSelesai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSelesaiKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNamaFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBeranda, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(btnBersihkan, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(btnProses, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addComponent(btnSelesai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnBeranda)
                .addGap(112, 112, 112)
                .addComponent(btnProses)
                .addGap(18, 18, 18)
                .addComponent(btnBersihkan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSelesai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNamaFile)
                .addContainerGap())
        );

        lblJudul.setFont(new java.awt.Font("Hack", 1, 36)); // NOI18N
        lblJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJudul.setText("PROGRAM PENCARI LUAS");
        lblJudul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblSubJudul.setFont(new java.awt.Font("Hack", 0, 18)); // NOI18N
        lblSubJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubJudul.setText("SEGITIGA");
        lblSubJudul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pnlInput.setBackground(new java.awt.Color(255, 204, 51));
        pnlInput.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))), "Input", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Hack", 0, 18))); // NOI18N

        lblAlas.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        lblAlas.setText("Alas                   :");

        lblTinggi.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        lblTinggi.setText("Tinggi                 :");

        lblLuasSegitiga.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        lblLuasSegitiga.setText("Luas Segitiga          :");

        fldAlas.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        fldAlas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldAlasFocusLost(evt);
            }
        });
        fldAlas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldAlasActionPerformed(evt);
            }
        });
        fldAlas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fldAlasKeyPressed(evt);
            }
        });

        fldTinggi.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        fldTinggi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldTinggiFocusLost(evt);
            }
        });
        fldTinggi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fldTinggiKeyPressed(evt);
            }
        });

        fldLuasSegitiga.setEditable(false);
        fldLuasSegitiga.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlInputLayout = new javax.swing.GroupLayout(pnlInput);
        pnlInput.setLayout(pnlInputLayout);
        pnlInputLayout.setHorizontalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLuasSegitiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTinggi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fldTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fldLuasSegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addComponent(lblAlas, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fldAlas, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        pnlInputLayout.setVerticalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldAlas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLuasSegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldLuasSegitiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSubJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pnlInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        prosesHitungLuas();
    }//GEN-LAST:event_btnProsesActionPerformed

    private void btnBersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihkanActionPerformed
        fldAlas.setText("");
        fldTinggi.setText("");
            
        fldAlas.requestFocus();
    }//GEN-LAST:event_btnBersihkanActionPerformed

    private void btnBerandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBerandaActionPerformed
        TugasLuas obj = new TugasLuas();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBerandaActionPerformed

    private void fldAlasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldAlasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldAlasActionPerformed

    private void fldAlasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldAlasKeyPressed
        if (evt.getKeyCode() == 0x0A ){
            fldTinggi.requestFocus();
        }
    }//GEN-LAST:event_fldAlasKeyPressed

    private void fldAlasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldAlasFocusLost
        float alas;
        try{
            alas = Float.parseFloat(fldAlas.getText());
        }
        catch(Throwable t){
            JOptionPane.showMessageDialog(null, "Nilai non numerik, " + "silahkan dilengkapi", "Ada Kesalahan",1);
            fldAlas.requestFocus();
        }
    }//GEN-LAST:event_fldAlasFocusLost

    private void fldTinggiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldTinggiFocusLost
        float tinggi;
        try{
            tinggi = Float.parseFloat(fldTinggi.getText());
        }
        catch(Throwable t){
            JOptionPane.showMessageDialog(null, "Nilai non numerik, " + "silahkan dilengkapi", "Ada Kesalahan",1);
            fldTinggi.requestFocus();
        }
    }//GEN-LAST:event_fldTinggiFocusLost

    private void fldTinggiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldTinggiKeyPressed
        if (evt.getKeyCode() == 0x0A ){
            btnProses.requestFocus();
        }
    }//GEN-LAST:event_fldTinggiKeyPressed

    private void btnProsesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnProsesKeyPressed
        if (evt.getKeyCode() == 0x0A ){
            prosesHitungLuas();
        }
    }//GEN-LAST:event_btnProsesKeyPressed

    private void btnBersihkanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBersihkanKeyPressed
        if (evt.getKeyCode() == 0x0A ){
            fldAlas.setText("");
            fldTinggi.setText("");
            
            fldAlas.requestFocus();
        }
    }//GEN-LAST:event_btnBersihkanKeyPressed

    private void btnBerandaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBerandaKeyPressed
        if (evt.getKeyCode() == 0x0A ){
            TugasLuas obj = new TugasLuas();
            obj.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnBerandaKeyPressed

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelesaiActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSelesaiActionPerformed

    private void btnSelesaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSelesaiKeyPressed
        if (evt.getKeyCode() == 0x0A ){
             System.exit(0);
        }
    }//GEN-LAST:event_btnSelesaiKeyPressed
    
    private float hitungLuas(float alas, float tinggi) {
        return (alas*tinggi)/2;
    }
    
    private void prosesHitungLuas() {
        float alas, tinggi, luas;
        try{
            alas    = Float.parseFloat(fldAlas.getText());
            tinggi  = Float.parseFloat(fldTinggi.getText());
            luas    = hitungLuas(alas,tinggi);
            fldLuasSegitiga.setText(String.valueOf(luas));
        } catch(Throwable t) {
            JOptionPane.showMessageDialog(null,"Nilai bukan numerik, " + "silahkan diperbaiki untuk bisa diproses");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LuasSegitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LuasSegitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LuasSegitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LuasSegitiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LuasSegitiga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeranda;
    private javax.swing.JButton btnBersihkan;
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JTextField fldAlas;
    private javax.swing.JTextField fldLuasSegitiga;
    private javax.swing.JTextField fldTinggi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAlas;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblLuasSegitiga;
    private javax.swing.JLabel lblNamaFile;
    private javax.swing.JLabel lblSubJudul;
    private javax.swing.JLabel lblTinggi;
    private javax.swing.JPanel pnlInput;
    // End of variables declaration//GEN-END:variables
}