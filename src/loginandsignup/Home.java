/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandsignup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Rahemet
 */
public class Home extends javax.swing.JFrame {
    
    private int userId;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        displayTransactionData();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JButton();
        createButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        transaksiTable = new javax.swing.JTable();
        editButton1 = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");
        popupMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupMenu1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("iTasoft");

        user.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        user.setForeground(new java.awt.Color(0, 51, 102));
        user.setText("John");

        LogoutBtn.setText("LOGOUT");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });

        createButton1.setText("Create");
        createButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButton1ActionPerformed(evt);
            }
        });

        transaksiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "TANGGAL", "JENIS TRANSAKSI", "JUMLAH"
            }
        ));
        jScrollPane2.setViewportView(transaksiTable);

        editButton1.setText("Edit");
        editButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton1ActionPerformed(evt);
            }
        });

        deleteButton1.setText("Delete");
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoutBtn)
                    .addComponent(user))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createButton1)
                        .addGap(30, 30, 30)
                        .addComponent(editButton1)
                        .addGap(31, 31, 31)
                        .addComponent(deleteButton1)))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton1)
                    .addComponent(editButton1)
                    .addComponent(deleteButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void displayTransactionData() {
        String url = "jdbc:mariadb://localhost:3307/test";
        String user = "root";
        String pass = "1234";

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(url, user, pass);
                 PreparedStatement pst = con.prepareStatement("SELECT id, tanggal, jenis_transaksi, jumlah FROM transaksi where deleted_at is null");
                 ResultSet rs = pst.executeQuery()) {

                DefaultTableModel model = (DefaultTableModel) transaksiTable.getModel();
                model.setRowCount(0); // Clear existing rows

                while (rs.next()) {
                    String id = rs.getString("id");
                    String tanggal = rs.getString("tanggal");
                    String jenisTransaksi = rs.getString("jenis_transaksi");
                    double jumlah = rs.getDouble("jumlah");

                    // Add row to the table model
                    model.addRow(new Object[]{id, tanggal, jenisTransaksi, jumlah});
                }

            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching transaction data: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void popupMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_popupMenu1ActionPerformed

    private void createButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButton1ActionPerformed
        CreatePembelian CreatePembelianFrame = new CreatePembelian();
        CreatePembelianFrame.setVisible(true);
        CreatePembelianFrame.pack();
        CreatePembelianFrame.setLocationRelativeTo(null);
        CreatePembelianFrame.setUserId(userId);
        this.dispose();
    }//GEN-LAST:event_createButton1ActionPerformed

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = transaksiTable.getSelectedRow();

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Pilih transaksi yang akan dihapus",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) transaksiTable.getModel();
        String transactionIdStr = (String) model.getValueAt(selectedRowIndex, 0);

        int transactionId = Integer.parseInt(transactionIdStr);

        String url = "jdbc:mariadb://localhost:3307/test";
        String user = "root";
        String pass = "1234";

        try {
            Class.forName("org.mariadb.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(url, user, pass);
                 PreparedStatement pst = con.prepareStatement("UPDATE transaksi SET deleted_at = NOW(), deleted_by = ? WHERE id = ?")) {
                
                pst.setInt(1, userId);
                pst.setInt(2, transactionId);

                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    model.removeRow(selectedRowIndex);
                    JOptionPane.showMessageDialog(this, "Transaksi berhasil dihapus!");
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal transaksi berhasil dihapus.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting transaction: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_deleteButton1ActionPerformed

    private void editButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = transaksiTable.getSelectedRow();
//        this.dispose();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to edit.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Assuming the ID is stored in the first column (index 0) of your table model
    Object idObj = transaksiTable.getValueAt(selectedRow, 0);
    if (idObj == null) {
        JOptionPane.showMessageDialog(this, "No ID found for the selected row.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int id = Integer.parseInt(idObj.toString());

        EditPembelian editPembelian = new EditPembelian(id);
        editPembelian.setUserId(userId);
        editPembelian.setVisible(true);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid ID format.", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
        
        
    }//GEN-LAST:event_editButton1ActionPerformed
    
    public void setUser(String name){
        user.setText(name);
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton createButton1;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JButton editButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable transaksiTable;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
