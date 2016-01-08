package patok_tanah;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EditData extends javax.swing.JFrame {    
    private static LihatData lihat = new LihatData();    
    private String sql;
    private Statement state;
    private ResultSet rsAnggota;            
    
    public EditData() {
        initComponents();       
        connectToDB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPersil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtKelas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRiwayat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLuas = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();
        txtAlamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Data");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT DATA");

        jLabel2.setText("No Tanah :");

        jLabel3.setText("Nama :");

        jLabel9.setText("Luas :");

        jLabel8.setText("No :");

        jLabel4.setText("Alamat :");

        btnSimpan.setBackground(new java.awt.Color(153, 153, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnKembali.setBackground(new java.awt.Color(153, 153, 255));
        btnKembali.setText("Kembali");
        btnKembali.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel5.setText("Persil :");

        jLabel6.setText("Kelas Tanah :");

        jLabel7.setText("Riwayat Perubahan :");

        jLabel10.setText("m2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKelas, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(txtPersil)
                    .addComponent(txtAlamat)
                    .addComponent(txtNama)
                    .addComponent(txtNota)
                    .addComponent(txtNo)
                    .addComponent(txtRiwayat)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtLuas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPersil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKelas)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLuas)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRiwayat)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnKembali))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        LihatData ld = new LihatData();
        ld.setLocationRelativeTo(null);
        ld.setVisible(true);        
        dispose();        
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if(verif()&&valid()){            
            //update data pada linkedlist
            for (int j = 0; j < lihat.data.size(); j++) {
                Data tanah = lihat.data.get(j);   
                if(tanah.getNo().equals(txtNo.getText())){
                    tanah.setNoTanah(txtNota.getText());
                    tanah.setNama(txtNama.getText());
                    tanah.setAlamat(txtAlamat.getText());
                    tanah.setPersil(txtPersil.getText());
                    tanah.setKelas(txtKelas.getText());
                    tanah.setLuas(txtLuas.getText());
                    tanah.setRiwayat(txtRiwayat.getText());                
                }
            }
            
            //update data pada DB
            sql = "UPDATE patok_tanah SET no="+ 
                     "'" + txtNo.getText() + "', no_urut=" + 
                     "'" + txtNota.getText() + "', nama=" +
                     "'" + txtNama.getText() + "', alamat=" +
                     "'" + txtAlamat.getText() + "', persil=" +
                     "'" + txtPersil.getText() + "', kelas=" +
                     "'" + txtKelas.getText() + "', luas=" +
                     "'" + txtLuas.getText() + "',riwayat=" +
                     "'" + txtRiwayat.getText() + "' WHERE no='"+txtNo.getText()+"'" ;        
            try{
                state.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui","Informasi",JOptionPane.INFORMATION_MESSAGE);                
            }
            catch(SQLException errMsg){
                System.out.println("Terjadi kesalahan : "+errMsg.getMessage());
            }        

            LihatData ld = new LihatData();
            ld.setLocationRelativeTo(null);
            ld.setVisible(true);                        
            dispose();                
        }
        else{
            if(!verif()){
                JOptionPane.showMessageDialog(this,"Isi semua kolom sebelum klik Simpan!","Peringatan",JOptionPane.WARNING_MESSAGE);                
            }
            else{
                JOptionPane.showMessageDialog(this,"Data input salah! Periksa kembali data anda.","Peringatan",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditData ed = new EditData();
                ed.setLocationRelativeTo(null);
                ed.setVisible(true);                
            }
        });
    }
    
    private void connectToDB() {
        try{
            state = (Statement)Koneksi.GetConnection().createStatement();                                 
        }
        catch(SQLException errMsg){
            System.out.println("Terjadi kesalahan : "+errMsg.getMessage());
        }       
    }    
    
    public void getData(int i){        
        //tampilkan data ke dalam field sesuai index record yang ingin diiedit dari linkedlist
        String x = Integer.toString(i);        
        for (int j = 0; j < lihat.data.size(); j++) {
            Data tanah = lihat.data.get(j);                        
            if(tanah.getNo().equals(x)){
                this.txtNo.setText(tanah.getNo());
                this.txtNo.setEditable(false);
                this.txtNota.setText(tanah.getNoTanah());
                this.txtNama.setText(tanah.getNama());
                this.txtAlamat.setText(tanah.getAlamat());
                this.txtPersil.setText(tanah.getPersil());
                this.txtKelas.setText(tanah.getKelas());
                this.txtLuas.setText(tanah.getLuas());
                this.txtRiwayat.setText(tanah.getRiwayat());
            }
        }        
    }
    
    private boolean verif() {        
        //cek semua kolom sudah terisi sebelum di submit
        if(txtNota.getText().isEmpty() || txtNama.getText().isEmpty() || 
           txtAlamat.getText().isEmpty() || txtPersil.getText().isEmpty() ||
           txtKelas.getText().isEmpty() || txtLuas.getText().isEmpty()){
            return false;
        }
        return true;
    }
    
    private boolean valid() {
        String n = txtNota.getText();
        String l = txtLuas.getText();
        if(isNaN(n,l)){
            return false;
        }
        else{
            return true;
        }
    }    
    
    private boolean isNaN(String noTanah, String luas){     
        try {
            int a = 0; int b = 1;
            for (int i = 0; i < noTanah.length(); i++) {
                Integer.parseInt(noTanah.substring(a, b));
                a++; b++;
            }            
            int c = 0; int d = 1;
            for (int i = 0; i < luas.length(); i++) {
                Integer.parseInt(luas.substring(c, d));
                c++; d++;
            }
            return false;
        }        
        catch(NumberFormatException ex){
            return true;
        }                    
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
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
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtLuas;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtPersil;
    private javax.swing.JTextField txtRiwayat;
    // End of variables declaration//GEN-END:variables
   
}
