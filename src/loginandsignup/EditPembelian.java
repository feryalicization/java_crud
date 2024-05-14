/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandsignup;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author HP
 */
public class EditPembelian extends javax.swing.JFrame {

    /**
     * Creates new form EditPembelian
     */
    
    private int id;
    private int userId;
    
    public EditPembelian(int id) {
        initComponents();
        this.id = id;
        fetchDataAndPopulateForm();
        System.out.println("EditPembelian created with ID: " + id);
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
        edit_tanggal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        editPembelian = new javax.swing.JButton();
        edit_jenis_transaksi = new javax.swing.JTextField();
        edit_jumlah = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Edit Transaction");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tanggal");

        edit_tanggal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edit_tanggal.setForeground(new java.awt.Color(102, 102, 102));
        edit_tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_tanggalActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Transaksi");

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Jumlah");

        editPembelian.setBackground(new java.awt.Color(0, 102, 102));
        editPembelian.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editPembelian.setForeground(new java.awt.Color(255, 255, 255));
        editPembelian.setText("Edit");
        editPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPembelianActionPerformed(evt);
            }
        });

        edit_jenis_transaksi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edit_jenis_transaksi.setForeground(new java.awt.Color(102, 102, 102));

        edit_jumlah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edit_jumlah.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(edit_jenis_transaksi, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editPembelian, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_tanggal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_jumlah, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edit_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(edit_jenis_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(edit_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(editPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void fetchDataAndPopulateForm() {
        String url = "jdbc:mariadb://localhost:3307/test";
        String user = "root";
        String pass = "1234";

        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            String query = "SELECT tanggal, jenis_transaksi, jumlah FROM transaksi WHERE id = ?";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setInt(1, id);
                var rs = pst.executeQuery();
                if (rs.next()) {
                    edit_tanggal.setText(rs.getString("tanggal"));
                    edit_jenis_transaksi.setText(rs.getString("jenis_transaksi"));
                    edit_jumlah.setText(Double.toString(rs.getDouble("jumlah")));
                    System.out.println("Data transaksi sikses for ID: " + id);
                    System.out.println("Tanggal: " + rs.getString("tanggal"));
                    System.out.println("Jenis Transaksi: " + rs.getString("jenis_transaksi"));
                    System.out.println("Jumlah: " + rs.getDouble("jumlah"));
                } else {
                    JOptionPane.showMessageDialog(this, "Data not found for ID: " + id, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
        
        
    }
    
    
    
    private void edit_tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_tanggalActionPerformed

    private void editPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPembelianActionPerformed
        
        
        String url = "jdbc:mariadb://localhost:3307/test";
        String user = "root";
        String pass = "1234";

        String newTanggal = edit_tanggal.getText();
        String newJenisTransaksi = edit_jenis_transaksi.getText();
        String newJumlahStr = edit_jumlah.getText();

        if (newTanggal.isEmpty() || newJenisTransaksi.isEmpty() || newJumlahStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double newJumlah;
        try {
            newJumlah = Double.parseDouble(newJumlahStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input for jumlah.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            String updateQuery = "UPDATE transaksi SET tanggal = ?, jenis_transaksi = ?, jumlah = ? , updated_at = NOW(), updated_by = ? WHERE id = ?";
            try (PreparedStatement pst = con.prepareStatement(updateQuery)) {
                pst.setString(1, newTanggal);
                pst.setString(2, newJenisTransaksi);
                pst.setDouble(3, newJumlah);
                pst.setInt(4, userId);
                pst.setInt(5, id);

                System.out.println("Executing SQL Query: " + pst.toString());

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Transaction updated successfully!");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update transaction.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Home().setVisible(true);
                    }
                });
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating transaction: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
        

    }//GEN-LAST:event_editPembelianActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new EditPembelian(3));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editPembelian;
    private javax.swing.JTextField edit_jenis_transaksi;
    private javax.swing.JTextField edit_jumlah;
    private javax.swing.JTextField edit_tanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
