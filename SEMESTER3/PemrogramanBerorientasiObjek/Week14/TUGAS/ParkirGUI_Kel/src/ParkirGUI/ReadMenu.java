/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ParkirGUI;

import DataStructure.ElementList;
import DataStructure.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Windows 10
 */
public class ReadMenu extends javax.swing.JFrame {

    /**
     * Creates new form ReadMenu
     */
    LinkedList list;
    public ReadMenu(LinkedList list) {
        this.list = list;
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelParkir = new javax.swing.JTable();
        hapusButton = new javax.swing.JButton();
        editMenuButton = new javax.swing.JButton();
        tambahButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel1.setText("Parkir Kendaraan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jButton1.setText("Kembali Ke Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelParkir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "No Kendaraan", "Jenis", "Jam Masuk", "Jam Keluar", "Lama Parkir", "Lama Jam", "Biaya"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelParkir.getTableHeader().setReorderingAllowed(false);
        tabelParkir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelParkirMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelParkir);

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        editMenuButton.setText("Ubah");
        editMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuButtonActionPerformed(evt);
            }
        });

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tambahButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editMenuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(hapusButton)
                    .addComponent(editMenuButton)
                    .addComponent(tambahButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void backToMain(){
        //tabelParkir.removeAll();
        MainMenu obj = new MainMenu(this.list);
        obj.setVisible(true);
        dispose();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        backToMain();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuButtonActionPerformed
        // TODO add your handling code here:
        this.prosesEdit();
    }//GEN-LAST:event_editMenuButtonActionPerformed

    private void tabelParkirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelParkirMouseClicked
        // TODO add your handling code here:
        int a = tabelParkir.getSelectedRow();
        
    }//GEN-LAST:event_tabelParkirMouseClicked
    private void changeToCreateMenu(){
        CreateMenu obj = new CreateMenu(this.list);
        obj.setVisible(true);
        dispose(); 
    }
    
    private void changeToEditMenu(String plat){
        EditMenu obj = new EditMenu(this.list);
        obj.setPlatText(plat);
        obj.setVisible(true);
        
        dispose(); 
    }
    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        this.changeToCreateMenu();
    }//GEN-LAST:event_tambahButtonActionPerformed
    
   
    
    private void prosesHapus(){
        try{
        DefaultTableModel j = (DefaultTableModel)tabelParkir.getModel();
        int index = tabelParkir.getSelectedRow();
        int tanya=JOptionPane.showConfirmDialog(null, "Yakin dihapus?","Hapus",1);
        
        if(tanya==0){
        String plat = tabelParkir.getValueAt(index, 1).toString();
        ElementList cari = this.list.search(plat);
        j.removeRow(index);
        this.list.deleteIt(cari);
        this.showTable();
        
        
          }
        }
        
        catch (Exception e){
                JOptionPane.showMessageDialog(null, "Terdapat Error ", "Error", 1);

        }
    }
    
    private void prosesEdit(){
        try{
        DefaultTableModel j = (DefaultTableModel)tabelParkir.getModel();
        int index = tabelParkir.getSelectedRow();
        int tanya=JOptionPane.showConfirmDialog(null, "Yakin Akan mengedit?","Edit",1);
        
        if(tanya==0){
        String plat = tabelParkir.getValueAt(index, 1).toString();
        this.changeToEditMenu(plat);
        this.showTable();
        
        
          }
        }
        
        catch (Exception e){
                JOptionPane.showMessageDialog(null, "Terdapat Error ", "Error", 1);

        }
    
    }
    
    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
            this.prosesHapus();
    }//GEN-LAST:event_hapusButtonActionPerformed
    
    
    
    public void showTable(){
      DefaultTableModel j = (DefaultTableModel)tabelParkir.getModel();
      if(this.list.isEmpty()==true){
         JOptionPane.showMessageDialog(null, "Data kosong ! ", "Informasi", 1);

      }
      
      else{
      ElementList bantu = this.list.getFirst();
      int i =0;
      int no = 1;
      do{
      
       j.setValueAt(no, i, 0);
       j.setValueAt(bantu.getData().getNoKendaraan(), i, 1);
       j.setValueAt(bantu.getData().getJenis(), i, 2);
       j.setValueAt(bantu.getData().getWaktudatang().getWaktu(), i, 3);
       j.setValueAt(bantu.getData().getWaktuPulang().getWaktu(), i, 4);
       j.setValueAt(bantu.getData().getLamaParkir().getWaktu(), i, 5);
       j.setValueAt(bantu.getData().getLamaJam(), i, 6);
       j.setValueAt(bantu.getData().getBiayaParkir(), i, 7);
       
       
       i++;
       no++;
       bantu = bantu.next;
      }while(bantu!=null);
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
            java.util.logging.Logger.getLogger(ReadMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReadMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReadMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
         
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editMenuButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelParkir;
    private javax.swing.JButton tambahButton;
    // End of variables declaration//GEN-END:variables
}