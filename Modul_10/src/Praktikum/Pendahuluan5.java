package Praktikum;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Pendahuluan5 extends javax.swing.JFrame {

    public Pendahuluan5() {
        initComponents();
        setTitle("Lembar Penilaian");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        a = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        c = new javax.swing.JRadioButton();
        matkul = new javax.swing.JComboBox();
        edit = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        jLabel2.setText("NIM");

        jLabel3.setText("Kelas");

        jLabel5.setText("Matakuliah");

        nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimActionPerformed(evt);
            }
        });

        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        buttonGroup1.add(a);
        a.setText("A");

        buttonGroup1.add(b);
        b.setText("B");

        buttonGroup1.add(c);
        c.setText("C");

        matkul.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kalkulus", "Algoritma dan Pemrograman", "Komputasi" }));
        matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matkulActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nim)
                                        .addGap(104, 104, 104)
                                        .addComponent(cari))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(a)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(c)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(nama)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(keluar)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari)
                    .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(a)
                    .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit)
                    .addComponent(keluar)
                    .addComponent(simpan)
                    .addComponent(hapus))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimActionPerformed

    }//GEN-LAST:event_nimActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        String NIMValue = nim.getText();
        try {
            Connection conn = (Connection) koneksi.koneksiDB();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("SELECT * FROM mahasiswa "
                    + "WHERE nim = " + NIMValue);
            if (result.next()) {
                String NAMAResult = result.getString("nama");
                String kelasResult = result.getString("kelas");
                String matkulResult = result.getString("matakuliah");
                nama.setText(NAMAResult);
                if (kelasResult.equals("A")) {
                    a.setSelected(true);
                } else if (kelasResult.equals("B")) {
                    b.setSelected(true);
                } else {
                    c.setSelected(true);
                }
                matkul.getModel().setSelectedItem(matkulResult);
                JOptionPane.showMessageDialog(null, "Data Mahasiswa "
                        + "" + NAMAResult + " ditemukan");
                this.componentForm("Cari");
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
                kosongForm();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_cariActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void matkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matkulActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        String NIMValue = nim.getText();
        String NAMAValue = nama.getText();
        a.setActionCommand("A");
        b.setActionCommand("B");
        c.setActionCommand("C");
        String kelasValue = buttonGroup1.getSelection().getActionCommand();
        String mataValue = matkul.getSelectedItem().toString();

        try {
            String sql = "update mahasiswa set "
                    + "nama ='" + NAMAValue 
                    + "', kelas ='" + kelasValue 
                    + "', matakuliah ='" + mataValue 
                    + "'where nim=" +NIMValue;
            Connection conn = (Connection) koneksi.koneksiDB();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
            kosongForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_editActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        String NIMValue = nim.getText();
        String NAMAValue = nama.getText();
        a.setActionCommand("A");
        b.setActionCommand("B");
        c.setActionCommand("C");
        String kelasValue = buttonGroup1.getSelection().getActionCommand();
        String mataValue = matkul.getSelectedItem().toString();

        try {
            String sql = "INSERT INTO mahasiswa "
                    + " values("
                    + "'" + NIMValue + "',"
                    + "'" + NAMAValue + "',"
                    + "'" + kelasValue + "',"
                    + "'" + mataValue + "'"
                    + ")";
            Connection conn = (Connection) koneksi.koneksiDB();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
            kosongForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        String NIMValue = nim.getText();
        try {
            String sql = "DELETE FROM mahasiswa  WHERE nim = " + NIMValue;
            Connection conn = (Connection) koneksi.koneksiDB();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            this.componentForm("Hapus");
            kosongForm();
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (SQLException ex) {
Logger.getLogger(Pendahuluan5.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_hapusActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pendahuluan5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a;
    private javax.swing.JRadioButton b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton c;
    private javax.swing.JButton cari;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton keluar;
    private javax.swing.JComboBox matkul;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JButton simpan;
    // End of variables declaration//GEN-END:variables

    private void componentForm(String action) {
        switch (action) {
            case "Awal":
                edit.setEnabled(false);
                hapus.setEnabled(false);
                break;
            case "Cari":
                cari.setEnabled(false);
                simpan.setEnabled(false);
                nim.setEnabled(false);
                break;
            case "Edit":
                nim.setEnabled(false);
                simpan.setEnabled(false);
                edit.setEnabled(false);
                hapus.setEnabled(false);
                cari.setEnabled(false);
                break;
            case "Hapus":
                nim.setEnabled(false);
                simpan.setEnabled(false);
                cari.setEnabled(false);
                edit.setEnabled(false);
                hapus.setEnabled(true);
                break;
            default:
                return;
        }}

    private void kosongForm() {
        nim.setText(null);
        nama.setText(null);
        buttonGroup1.clearSelection();
    }
}
