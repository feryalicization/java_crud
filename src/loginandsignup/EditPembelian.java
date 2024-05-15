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
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Statement;
import java.sql.ResultSet;


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
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        editPembelian = new javax.swing.JButton();
        edit_jumlah = new javax.swing.JTextField();
        edit_tanggal = new com.toedter.calendar.JDateChooser();
        edit_jenis_transaksi = new javax.swing.JComboBox<>();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Edit Transaction");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tanggal");

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

        edit_jumlah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edit_jumlah.setForeground(new java.awt.Color(102, 102, 102));

        edit_jenis_transaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pembelian", "penjualan" }));
        edit_jenis_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_jenis_transaksiActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 51, 51));
        cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(edit_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(325, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_jenis_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(edit_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(edit_jenis_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(edit_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
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
                    String tanggalStr = rs.getString("tanggal");
                    String jenisTransaksi = rs.getString("jenis_transaksi");
                    double jumlah = rs.getDouble("jumlah");
                    edit_jenis_transaksi.setSelectedItem(jenisTransaksi);
                    edit_jumlah.setText(Double.toString(jumlah));

                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date parsedDate = dateFormat.parse(tanggalStr);
                    Date tanggalDate = new Date(parsedDate.getTime());

                    edit_tanggal.setDate(tanggalDate);
                    System.out.println("Tanggal: " + tanggalStr);
                    System.out.println("Jenis Transaksi: " + jenisTransaksi);
                    System.out.println("Jumlah: " + jumlah);
                } else {
                    JOptionPane.showMessageDialog(this, "Data not found for ID: " + id, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException | ParseException e) {
            JOptionPane.showMessageDialog(this, "Error fetching data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
    }
    
    
    
    private void editPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPembelianActionPerformed
        String url = "jdbc:mariadb://localhost:3307/test";
        String user = "root";
        String pass = "1234";
        String query;
        String fname = null;
        
        String newJenisTransaksi = (String) edit_jenis_transaksi.getSelectedItem(); 
        String newJumlahStr = edit_jumlah.getText();

        if (edit_tanggal.getDate() == null || newJenisTransaksi == null || newJumlahStr.isEmpty()) {
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

        java.util.Date selectedDate = edit_tanggal.getDate();
        java.sql.Date newTanggal = new java.sql.Date(selectedDate.getTime());

        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            String updateQuery = "UPDATE transaksi SET tanggal = ?, jenis_transaksi = ?, jumlah = ?, updated_at = NOW(), updated_by = ? WHERE id = ?";
            try (PreparedStatement pst = con.prepareStatement(updateQuery)) {
                pst.setDate(1, newTanggal);       
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

                query = "SELECT full_name FROM user WHERE id = " + userId;
                try (Statement st = con.createStatement(); ResultSet rs = st.executeQuery(query)) {
                    if (rs.next()) {
                        fname = rs.getString("full_name");
                    }
                }

                Home HomeFrame = new Home();
                HomeFrame.setUser(fname);
                HomeFrame.setUserId(userId);
                HomeFrame.setVisible(true);
                HomeFrame.pack();
                HomeFrame.setLocationRelativeTo(null);
                this.dispose();

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating transaction: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_editPembelianActionPerformed

    private void edit_jenis_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_jenis_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_jenis_transaksiActionPerformed

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
    private javax.swing.JButton cancel;
    private javax.swing.JButton editPembelian;
    private javax.swing.JComboBox<String> edit_jenis_transaksi;
    private javax.swing.JTextField edit_jumlah;
    private com.toedter.calendar.JDateChooser edit_tanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
