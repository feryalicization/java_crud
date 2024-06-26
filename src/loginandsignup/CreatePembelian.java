/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandsignup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.sql.PreparedStatement;

import java.text.SimpleDateFormat;
import java.sql.Date;


/**
 *
 * @author HP
 */
public class CreatePembelian extends javax.swing.JFrame {

    /**
     * Creates new form CreatePembelian
     */
    
    private int userId;
    
    public CreatePembelian() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        tanggal = new com.toedter.calendar.JDateChooser();
        jumlah1 = new javax.swing.JTextField();
        jenis_transaksi = new javax.swing.JComboBox<>();
        createPembelian1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Create Transaction");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tanggal");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Transaksi");

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Jumlah");

        cancel.setBackground(new java.awt.Color(255, 51, 51));
        cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jumlah1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jumlah1.setForeground(new java.awt.Color(102, 102, 102));

        jenis_transaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pembelian", "penjualan" }));
        jenis_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenis_transaksiActionPerformed(evt);
            }
        });

        createPembelian1.setBackground(new java.awt.Color(0, 102, 102));
        createPembelian1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createPembelian1.setForeground(new java.awt.Color(255, 255, 255));
        createPembelian1.setText("Create");
        createPembelian1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPembelian1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jumlah1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(0, 156, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jenis_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(createPembelian1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(372, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jenis_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(421, Short.MAX_VALUE)
                    .addComponent(createPembelian1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(55, 55, 55)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        
        String fname = null;
        String SUrl = "jdbc:mariadb://localhost:3307/test";
        String SUser = "root";
        String SPass = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();

            String query = "SELECT * FROM user WHERE id = " + userId;

            ResultSet rs = st.executeQuery(query);
            boolean userFound = false;

            if (rs.next()) {
                fname = rs.getString("full_name");
                userFound = true;
            }

            if (userFound) {
                Home HomeFrame = new Home();
                HomeFrame.setUser(fname);
                HomeFrame.setUserId(userId);
                HomeFrame.setVisible(true);
                HomeFrame.pack();
                HomeFrame.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "User not found", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_cancelActionPerformed

    private void jenis_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenis_transaksiActionPerformed

    private void createPembelian1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPembelian1ActionPerformed
        // TODO add your handling code here:
        String tanggal_, jenis_transaksi_, jumlah_, query;
        String SUrl = "jdbc:mariadb://localhost:3307/test";
        String SUser = "root";
        String SPass = "1234";
        String fname = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if (tanggal.getDate() == null) {
                JOptionPane.showMessageDialog(new JFrame(), "Tanggal is required", "Error",
                    JOptionPane.ERROR_MESSAGE);
            } else if (jenis_transaksi.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(new JFrame(), "Jenis Transaksi is required", "Error",
                    JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(jumlah1.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Jumlah is required", "Error",
                    JOptionPane.ERROR_MESSAGE);
            } else {
                java.util.Date selectedDate = tanggal.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                tanggal_ = sdf.format(selectedDate);
                jenis_transaksi_ = (String) jenis_transaksi.getSelectedItem();  // Get selected item from JComboBox
                jumlah_ = jumlah1.getText();

                query = "INSERT INTO transaksi(tanggal, jenis_transaksi, jumlah, created_at, created_by) " +
                        "VALUES('" + tanggal_ + "', '" + jenis_transaksi_ + "' , '" + jumlah_ + "', NOW(), '" + userId + "')";

                st.execute(query);
                tanggal.setDate(null);
                jenis_transaksi.setSelectedIndex(0);
                jumlah1.setText("");
                showMessageDialog(null, "Transaksi pembelian created successfully!");
                this.dispose();

                query = "SELECT full_name FROM user WHERE id = " + userId;
                ResultSet rs = st.executeQuery(query);
                if (rs.next()) {
                    fname = rs.getString("full_name");
                }
                Home HomeFrame = new Home();
                HomeFrame.setUser(fname);
                HomeFrame.setUserId(userId);
                HomeFrame.setVisible(true);
                HomeFrame.pack();
                HomeFrame.setLocationRelativeTo(null);
                this.dispose();
            }
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_createPembelian1ActionPerformed

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
            java.util.logging.Logger.getLogger(CreatePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePembelian().setVisible(true);
            }
        });
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton createPembelian1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jenis_transaksi;
    private javax.swing.JTextField jumlah1;
    private com.toedter.calendar.JDateChooser tanggal;
    // End of variables declaration//GEN-END:variables
}
