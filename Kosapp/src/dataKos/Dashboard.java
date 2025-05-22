package dataKos;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.text.Format;
import javax.swing.*;
import javax.swing.table.*;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;

public class Dashboard extends javax.swing.JFrame {
    public String tgl_lahir;
    private String pattern;
    private ButtonGroup genderGroup; 
    public Dashboard() {
        initComponents();
        tampil_data();
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        int row = jTable1.getSelectedRow();
            if (row != -1) { // Check if a row is selected
                lblNAnak.setText(jTable1.getValueAt(row, 0).toString());
                tgl_lahir = jTable1.getValueAt(row, 1).toString(); // Assuming tgl_lahir is in the second column
                lblNWali.setText(jTable1.getValueAt(row, 2).toString());
                String gender = jTable1.getValueAt(row, 3).toString();
                    if (gender.equals("Pria")) {
                        rbPria.setSelected(true);
                    }  else {
                        rbWanita.setSelected(true);
                    }
                jcbKamar.setSelectedItem(jTable1.getValueAt(row, 4).toString());
                lblNoAnak.setText(jTable1.getValueAt(row, 5).toString());
                lblNoWali.setText(jTable1.getValueAt(row, 6).toString());
                lblAsal.setText(jTable1.getValueAt(row, 7).toString());
            }
        }                                    
    });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jcbCari = new javax.swing.JComboBox<>();
        btnCari = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNAnak = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbKamar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jctL = new de.wannawork.jcalendar.JCalendarComboBox();
        jLabel6 = new javax.swing.JLabel();
        lblNWali = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblNoWali = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbPria = new javax.swing.JRadioButton();
        rbWanita = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        lblAsal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblNoAnak = new javax.swing.JTextField();
        btnBatal = new javax.swing.JButton();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 213, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Cari Kamar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 20));

        jcbCari.setBackground(new java.awt.Color(255, 255, 255));
        jcbCari.setForeground(new java.awt.Color(0, 0, 0));
        jcbCari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jPanel1.add(jcbCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        btnCari.setBackground(new java.awt.Color(255, 255, 255));
        btnCari.setForeground(new java.awt.Color(0, 0, 0));
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        jPanel1.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, -1));

        btnTambah.setBackground(new java.awt.Color(255, 255, 255));
        btnTambah.setForeground(new java.awt.Color(0, 0, 0));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 100, -1));

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setForeground(new java.awt.Color(0, 0, 0));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 100, -1));

        btnHapus.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus.setForeground(new java.awt.Color(0, 0, 0));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, 100, -1));

        jPanel2.setBackground(new java.awt.Color(200, 235, 255));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Data Kos SHL");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nama");

        lblNAnak.setForeground(new java.awt.Color(30, 30, 30));
        lblNAnak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNAnakActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("No. Kamar");

        jcbKamar.setBackground(new java.awt.Color(255, 255, 255));
        jcbKamar.setForeground(new java.awt.Color(30, 30, 30));
        jcbKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        jcbKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbKamarActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tanggal Lahir");

        jLabel5.setBackground(new java.awt.Color(221, 221, 221));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nama Ortu/Wali");

        jctL.setBackground(new java.awt.Color(255, 255, 255));
        jctL.setForeground(new java.awt.Color(255, 255, 255));
        jctL.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jctLPropertyChange(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("No HP Anak");

        lblNWali.setForeground(new java.awt.Color(30, 30, 30));

        jLabel7.setBackground(new java.awt.Color(221, 221, 221));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("No HP Ortu/Wali");

        lblNoWali.setForeground(new java.awt.Color(30, 30, 30));

        jLabel8.setBackground(new java.awt.Color(221, 221, 221));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Jenis Kelamin");

        rbPria.setForeground(new java.awt.Color(0, 0, 0));
        rbPria.setText("Pria");

        rbWanita.setForeground(new java.awt.Color(0, 0, 0));
        rbWanita.setText("Wanita");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Asal");

        lblAsal.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblNoAnak.setForeground(new java.awt.Color(0, 0, 0));
        lblNoAnak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNoAnakActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(255, 255, 255));
        btnBatal.setForeground(new java.awt.Color(0, 0, 0));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblLogout.setText(" ⍈");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jctL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblNAnak)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNWali))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(23, 23, 23)
                                .addComponent(rbPria, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbWanita, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(lblAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcbKamar, 0, 181, Short.MAX_VALUE)
                                        .addComponent(lblNoAnak)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblNoWali, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(173, 173, 173))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblNAnak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jcbKamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jctL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lblNoAnak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblNWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(lblNoWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lblAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(rbWanita)
                        .addComponent(rbPria)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBatal)
                    .addComponent(lblLogout))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jcbKamar.getAccessibleContext().setAccessibleParent(jcbKamar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbKamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbKamarActionPerformed

    private void lblNAnakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNAnakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNAnakActionPerformed

    private void jctLPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jctLPropertyChange
        if (jctL.getDate() != null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            tgl_lahir = format.format(jctL.getDate());
            
        }
    }//GEN-LAST:event_jctLPropertyChange

    private boolean isRoomOccupied(String room) {
        boolean occupied = false;
        try {
            java.sql.Connection conn = (java.sql.Connection) dataKos.Config.configDB();
            String sql = "SELECT COUNT(*) FROM data WHERE no_kamar = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, room);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                occupied = rs.getInt(1) > 0; // If count is greater than 0, the room is occupied
            }
        } catch (SQLException e) {
            System.out.println("Error checking room occupancy: " + e.getMessage());
        }
        return occupied;
    }

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
            String pilihanKamar = (String) jcbKamar.getSelectedItem();
                if (isRoomOccupied(pilihanKamar)) {
                    JOptionPane.showMessageDialog(null, "Kamar sudah diisi", "peringatan", JOptionPane.WARNING_MESSAGE);
                    return; 
            }
            String jenisKelamin = "";
               if (rbPria.isSelected()) {
                jenisKelamin = "Pria";
                } else if (rbWanita.isSelected()) {
                    jenisKelamin = "Wanita";
                }
        
        // Modifikasi SQL untuk tidak menyertakan kolom primary key
            String sql = "INSERT INTO data (nama_anak, tgl_lahir, nama_ortu, jenis_kelamin, no_kamar, no_hp_anak, no_hp_ortu, asal) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
            java.sql.Connection conn = (java.sql.Connection) dataKos.Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); // Tambahkan RETURN_GENERATED_KEYS
        
        // Set parameter untuk prepared statement
            pst.setString(1, lblNAnak.getText());
            pst.setString(2, tgl_lahir);
            pst.setString(3, lblNWali.getText());
            pst.setString(4, jenisKelamin);
            pst.setString(5, jcbKamar.getSelectedItem().toString());
            pst.setString(6, lblNoAnak.getText());
            pst.setString(7, lblNoWali.getText());
            pst.setString(8, lblAsal.getText());
        
            int affectedRows = pst.executeUpdate();
        
            if(affectedRows > 0){
                ResultSet generatedKeys = pst.getGeneratedKeys();
                if(generatedKeys.next()){
                    int newNo = generatedKeys.getInt(1);
                    JOptionPane.showMessageDialog(null,"Berhasil disimpan dengan ID : " + newNo);
                }
                tampil_data();
                } else {
                JOptionPane.showMessageDialog(null,"Gagal Disimpan");
            }
        
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Disimpan");
            
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void lblNoAnakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNoAnakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNoAnakActionPerformed


    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
                                     
        try {
        
            if (tgl_lahir == null || tgl_lahir.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Tanggal lahir harus diisi");
                return;
            }
            
            String pilihanKamar = (String) jcbKamar.getSelectedItem();
            if (pilihanKamar == null || pilihanKamar.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No kamar harus dipilih untuk update data");
                return;
            }

            java.sql.Connection conn = (java.sql.Connection) dataKos.Config.configDB();
        
            String sql = "UPDATE data SET nama_anak=?, tgl_lahir=?, nama_ortu=?, jenis_kelamin=?, no_kamar=?, no_hp_anak=?, no_hp_ortu=?, WHERE asal=?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

            String jenisKelamin = rbPria.isSelected() ? "Pria" : "Wanita";

            pst.setString(2, lblNAnak.getText());
            pst.setString(3, tgl_lahir);
            pst.setString(4, lblNWali.getText());
            pst.setString(5, jenisKelamin);
            pst.setString(6, pilihanKamar);
            pst.setString(7, lblNoAnak.getText());
            pst.setString(8, lblNoWali.getText());
            pst.setString(9, lblAsal.getText());

            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil di Koreksi");
                tampil_data();
            } else {
                JOptionPane.showMessageDialog(null, "Data dengan no kamar tersebut tidak ditemukan");
            }
            pst.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Proses Edit data Gagal: " + e.getMessage());
            System.out.println(e.getMessage());
        }        

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
       try {
            java.sql.Connection conn = (java.sql.Connection) dataKos.Config.configDB();
            String sql = "DELETE FROM data WHERE no_kamar = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            String pilihanKamar = (String) jcbKamar.getSelectedItem();
            pst.setString(1, pilihanKamar); // Use the text from the name field as identifier
            int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus data ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                int affectedRows = pst.executeUpdate();
                    if (affectedRows > 0) {
                        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                        tampil_data(); 
                } else {
                    JOptionPane.showMessageDialog(null, "Data tidak ditemukan atau gagal dihapus");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Proses Penghapusan Gagal");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        lblNAnak.setText("");
        tgl_lahir = null;
        lblNWali.setText("");
        genderGroup.clearSelection(); 
        jcbKamar.setSelectedIndex(0);
        lblNoAnak.setText("");
        lblNoWali.setText("");
        lblAsal.setText("");
        lblNAnak.requestFocus(); 
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
                                           
    try { 
        String pilihanKamar = (String) jcbCari.getSelectedItem(); // Ambil nomor kamar yang dipilih
        String sql = "SELECT * FROM data WHERE no_kamar = ?"; // Query untuk mencari data berdasarkan no_kamar
        java.sql.Connection conn = (java.sql.Connection) dataKos.Config.configDB();
        java.sql.PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, pilihanKamar); // Set parameter no_kamar

        ResultSet rs = pst.executeQuery(); // Eksekusi query
        
        if (rs.next()) { // Cek apakah ada hasil
            // Ambil data dari hasil query dan set ke field di form
            lblNAnak.setText(rs.getString("nama_anak")); // Ambil nama anak
            tgl_lahir = rs.getString("tanggal_lahir"); // Ambil tanggal lahir
            lblNWali.setText(rs.getString("nama_ortu")); // Ambil nama ortu
            if (rs.getString("jenis_kelamin").equals("Pria")) {
                rbPria.setSelected(true);
            } else {
                rbWanita.setSelected(true);
            }
            jcbKamar.setSelectedItem(rs.getString("no_kamar")); // Ambil no kamar
            lblNoAnak.setText(rs.getString("no_hp_anak")); // Ambil no hp anak
            lblNoWali.setText(rs.getString("no_hp_ortu")); // Ambil no hp ortu
            lblAsal.setText(rs.getString("asal")); // Ambil asal
            JOptionPane.showMessageDialog(null, "Data Kos ditemukan, Apakah Anda Ingin Mengedit atau Menghapus?");
        } else {
            JOptionPane.showMessageDialog(null, "Data Kos tidak ditemukan", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
        
        pst.close();
        conn.close(); 
    } catch (SQLException exc) {
        JOptionPane.showMessageDialog(null, "Proses pencarian gagal: " + exc.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        System.out.println(exc.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        System.out.println(e.getMessage());
    }

    }//GEN-LAST:event_btnCariActionPerformed
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
  
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
      
    }//GEN-LAST:event_jTable1MousePressed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        this.dispose();
        Login loginframe = new Login();
        loginframe.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    public void tampil_data(){
        DefaultTableModel tabel=new DefaultTableModel();
        tabel.addColumn("NAMA");
        tabel.addColumn("TANGGAL LAHIR");
        tabel.addColumn("NAMA ORTU");
        tabel.addColumn("JENIS KELAMIN");
        tabel.addColumn("NO. KAMAR");
        tabel.addColumn("NO. HP ANAK");
        tabel.addColumn("NO. HP ORTU");
        tabel.addColumn("ASAL");
        try {
            java.sql.Connection conn = (java.sql.Connection) dataKos. Config.configDB();
            String sql = "SELECT nama_anak, tanggal_lahir, nama_ortu, jenis_kelamin, no_kamar, no_hp_anak, no_hp_ortu, asal FROM data";
            java.sql.PreparedStatement pst= conn.prepareStatement ( sql);
            ResultSet rs = pst.executeQuery( sql);
            while(rs.next())
            {
                tabel.addRow(new Object[]{
                    rs.getString(1),
                        rs.getString(2),
                            rs.getString(3),
                                rs.getString(4),
                                    rs.getString(5),
                                        rs.getString(6),
                                            rs.getString(7),
                                                rs.getString(8)
                });
            }
            jTable1.setModel(tabel);
        } catch (Exception e){
        
        }
    }
    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbCari;
    private javax.swing.JComboBox<String> jcbKamar;
    private de.wannawork.jcalendar.JCalendarComboBox jctL;
    private javax.swing.JTextField lblAsal;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JTextField lblNAnak;
    private javax.swing.JTextField lblNWali;
    private javax.swing.JTextField lblNoAnak;
    private javax.swing.JTextField lblNoWali;
    private javax.swing.JRadioButton rbPria;
    private javax.swing.JRadioButton rbWanita;
    // End of variables declaration//GEN-END:variables

    private void tgl_lahir(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
