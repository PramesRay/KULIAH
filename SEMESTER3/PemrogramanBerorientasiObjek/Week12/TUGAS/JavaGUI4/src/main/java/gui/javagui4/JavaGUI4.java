/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.javagui4;

import javax.swing.JOptionPane;

/**
 *
 * @author prame
 */
public class JavaGUI4 extends javax.swing.JFrame {

    /**
     * Creates new form JavaGUI4
     */
    public JavaGUI4() {
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
        lblNamaFile = new javax.swing.JLabel();
        btnSelesai = new javax.swing.JButton();
        lblJudul = new javax.swing.JLabel();
        lblSubJudul = new javax.swing.JLabel();
        pnlInput = new javax.swing.JPanel();
        lblPanjang = new javax.swing.JLabel();
        lblLebar = new javax.swing.JLabel();
        lblLuasPersegiPanjang = new javax.swing.JLabel();
        fldPanjang = new javax.swing.JTextField();
        fldLebar = new javax.swing.JTextField();
        fldLuasPersegiPanjang = new javax.swing.JTextField();

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

        lblNamaFile.setFont(new java.awt.Font("Hack", 0, 8)); // NOI18N
        lblNamaFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNamaFile.setText("LuasPersegiPanjang.java");

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
                .addContainerGap()
                .addComponent(lblNamaFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProses, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(189, 189, 189)
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
        lblSubJudul.setText("PERSEGI PANJANG");
        lblSubJudul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pnlInput.setBackground(new java.awt.Color(255, 204, 51));
        pnlInput.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))), "Input", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Hack", 0, 18))); // NOI18N

        lblPanjang.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        lblPanjang.setText("Panjang                :");

        lblLebar.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        lblLebar.setText("Lebar                  :");

        lblLuasPersegiPanjang.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        lblLuasPersegiPanjang.setText("Luas Persegi Panjang   :");

        fldPanjang.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        fldPanjang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldPanjangFocusLost(evt);
            }
        });
        fldPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldPanjangActionPerformed(evt);
            }
        });
        fldPanjang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fldPanjangKeyPressed(evt);
            }
        });

        fldLebar.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        fldLebar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fldLebarFocusLost(evt);
            }
        });
        fldLebar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fldLebarKeyPressed(evt);
            }
        });

        fldLuasPersegiPanjang.setEditable(false);
        fldLuasPersegiPanjang.setFont(new java.awt.Font("Hack", 0, 14)); // NOI18N
        fldLuasPersegiPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldLuasPersegiPanjangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInputLayout = new javax.swing.GroupLayout(pnlInput);
        pnlInput.setLayout(pnlInputLayout);
        pnlInputLayout.setHorizontalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLuasPersegiPanjang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fldLebar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fldLuasPersegiPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addComponent(lblPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fldPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        pnlInputLayout.setVerticalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLebar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldLebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLuasPersegiPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldLuasPersegiPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnProsesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnProsesKeyPressed
        if (evt.getKeyCode()== 0x0A){
            prosesHitungLuas();
        }
    }//GEN-LAST:event_btnProsesKeyPressed

    private void btnBersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihkanActionPerformed
        fldPanjang.setText("");
        fldLebar.setText("");
        fldLuasPersegiPanjang.setText("");

        fldPanjang.requestFocus();
    }//GEN-LAST:event_btnBersihkanActionPerformed

    private void btnBersihkanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBersihkanKeyPressed
        if (evt.getKeyCode()== 0x0A){
            fldPanjang.setText("");
            fldLebar.setText("");
            fldLuasPersegiPanjang.setText("");

            fldPanjang.requestFocus();
        }
    }//GEN-LAST:event_btnBersihkanKeyPressed

    private void fldPanjangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldPanjangFocusLost
        float pjg;
        try{
            pjg = Float.parseFloat(fldPanjang.getText());
        }
        catch(Throwable t){
            JOptionPane.showMessageDialog(null, "Nilai non numerik, " + "silahkan dilengkapi", "Ada Kesalahan",1);
            fldPanjang.requestFocus();
        }
    }//GEN-LAST:event_fldPanjangFocusLost

    private void fldPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldPanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldPanjangActionPerformed

    private void fldPanjangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldPanjangKeyPressed
        if (evt.getKeyCode() == 0x0A ){
            fldLebar.requestFocus();
        }
    }//GEN-LAST:event_fldPanjangKeyPressed

    private void fldLebarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fldLebarFocusLost
        float lbr;
        try{
            lbr = Float.parseFloat(fldLebar.getText());
        }
        catch(Throwable t){
            JOptionPane.showMessageDialog(null, "Nilai non numerik, " + "silahkan dilengkapi", "Ada Kesalahan",1);
            fldLebar.requestFocus();
        }
    }//GEN-LAST:event_fldLebarFocusLost

    private void fldLebarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fldLebarKeyPressed
        if (evt.getKeyCode() == 0x0A ){
            btnProses.requestFocus();
        }
    }//GEN-LAST:event_fldLebarKeyPressed

    private void fldLuasPersegiPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldLuasPersegiPanjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldLuasPersegiPanjangActionPerformed

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelesaiActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSelesaiActionPerformed

    private void btnSelesaiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSelesaiKeyPressed
        if (evt.getKeyCode() == 0x0A ){
             System.exit(0);
        }
    }//GEN-LAST:event_btnSelesaiKeyPressed
    
    private float hitungLuas(float panjang, float lebar) {
        return (panjang*lebar);
    }
    
    private void prosesHitungLuas() {
        float panjang, lebar, luas;
        try{
            panjang = Float.parseFloat(fldPanjang.getText());
            lebar   = Float.parseFloat(fldLebar.getText());
            luas    = hitungLuas(panjang,lebar);
            fldLuasPersegiPanjang.setText(String.valueOf(luas));
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
            java.util.logging.Logger.getLogger(JavaGUI4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaGUI4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaGUI4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaGUI4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaGUI4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersihkan;
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btnSelesai;
    private javax.swing.JTextField fldLebar;
    private javax.swing.JTextField fldLuasPersegiPanjang;
    private javax.swing.JTextField fldPanjang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JLabel lblLebar;
    private javax.swing.JLabel lblLuasPersegiPanjang;
    private javax.swing.JLabel lblNamaFile;
    private javax.swing.JLabel lblPanjang;
    private javax.swing.JLabel lblSubJudul;
    private javax.swing.JPanel pnlInput;
    // End of variables declaration//GEN-END:variables
}
