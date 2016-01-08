package patok_tanah;

import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ANDINA
 */
public class LihatData extends javax.swing.JFrame {
    private int index;        
    private String sql;
    private String [] title = {"No.","No. Tanah","Nama","Alamat","Persil","Kelas","Luas","Riwayat Perubahan"};    
    private Statement state;
    private ResultSet rsTanah;
    LinkedList<Data> data = new LinkedList<Data>();            
    
    public LihatData() {
        initComponents();                    
        fillTable();
        updateTable();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatok = new javax.swing.JTable();
        btnKembali = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lihat Data");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TABEL PATOK TANAH SUTOREJO");

        jLabel1.setText("Cari data :");

        txtCari.setToolTipText("");

        btnEdit.setBackground(new java.awt.Color(153, 153, 255));
        btnEdit.setText("Edit");
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(153, 153, 255));
        btnHapus.setText("Hapus");
        btnHapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblPatok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "No Tanah", "Nama", "Alamat", "Persil", "Kelas Tanah", "Luas", "Riwayat Perubahan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatok.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblPatok);
        if (tblPatok.getColumnModel().getColumnCount() > 0) {
            tblPatok.getColumnModel().getColumn(0).setResizable(false);
            tblPatok.getColumnModel().getColumn(0).setPreferredWidth(3);
            tblPatok.getColumnModel().getColumn(1).setResizable(false);
            tblPatok.getColumnModel().getColumn(1).setPreferredWidth(25);
            tblPatok.getColumnModel().getColumn(2).setResizable(false);
            tblPatok.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblPatok.getColumnModel().getColumn(3).setResizable(false);
            tblPatok.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblPatok.getColumnModel().getColumn(4).setResizable(false);
            tblPatok.getColumnModel().getColumn(4).setPreferredWidth(25);
            tblPatok.getColumnModel().getColumn(5).setResizable(false);
            tblPatok.getColumnModel().getColumn(5).setPreferredWidth(30);
            tblPatok.getColumnModel().getColumn(6).setResizable(false);
            tblPatok.getColumnModel().getColumn(6).setPreferredWidth(25);
            tblPatok.getColumnModel().getColumn(7).setResizable(false);
        }

        btnKembali.setBackground(new java.awt.Color(153, 153, 255));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(153, 153, 255));
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKembali)
                .addGap(272, 272, 272)
                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(278, 278, 278)
                .addComponent(btnLogOut)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(558, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addGap(278, 278, 278))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogOut)
                    .addComponent(btnKembali)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        MenuUtama menu = new MenuUtama();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            getIndex();
            if(JOptionPane.showConfirmDialog(this, "Hapus data?","Konfirmasi",JOptionPane.YES_NO_OPTION)==0){
                //hapus data dari database
                sql = "DELETE FROM patok_tanah WHERE no='"+index+"'";
                try{
                    state.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "Data Telah Dihapus", "Informasi",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(SQLException errMsg){
                    System.out.println("Terjadi kesalahan : "+errMsg.getMessage());
                }                        
                //hapus data dari linkedlist
                for (int i = 0; i < data.size(); i++) {
                    Data d = data.get(i);
                    if(d.getNo().equals(index)){
                        data.remove(i);
                    }
                }                                
                refillTable();                
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(this,"Klik kolom yang akan dihapus sebelum menekan Hapus!","Peringatan",JOptionPane.WARNING_MESSAGE);
        }        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {            
            getIndex();            
            EditData ed = new EditData();                
            ed.setLocationRelativeTo(null);
            ed.getData(index);
            ed.setVisible(true);
            dispose();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Klik kolom yang akan diedit sebelum menekan Edit!","Peringatan",JOptionPane.WARNING_MESSAGE);
        }        
    }//GEN-LAST:event_btnEditActionPerformed
        
    void fillTable() {        
        //mengisi linkedlist dengan data dari DB
        try{
            state = (Statement)Koneksi.GetConnection().createStatement();            
            rsTanah = state.executeQuery("SELECT * FROM patok_tanah");            
            
            while(rsTanah.next()){                
                data.add(new Data(
                    rsTanah.getString(1),
                    rsTanah.getString(2),
                    rsTanah.getString(3),
                    rsTanah.getString(4),
                    rsTanah.getString(5),
                    rsTanah.getString(6),
                    rsTanah.getString(7),
                    rsTanah.getString(8)
                ));
            }            
        }
        catch(SQLException errMsg){
            System.out.println("Terjadi kesalahan : "+errMsg.getMessage());
        }        
    }
    
    void updateTable(){   
        //memperbarui data yang ditampilkan di jTable
        Object[][] dataTanah = new Object[this.data.size()][8];
        int i = 0;
        for (Data dt : this.data){        
            dataTanah [i][0] = dt.getNo();
            dataTanah [i][1] = dt.getNoTanah();
            dataTanah [i][2] = dt.getNama();
            dataTanah [i][3] = dt.getAlamat();
            dataTanah [i][4] = dt.getPersil();
            dataTanah [i][5] = dt.getKelas();
            dataTanah [i][6] = dt.getLuas();
            dataTanah [i][7] = dt.getRiwayat();
            ++i;
        }
        
        DefaultTableModel tableModel = new DefaultTableModel(dataTanah,title) {
            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        tblPatok.setModel(tableModel);
        tblPatok.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        Dimension ukuran = tblPatok.getSize();
        int[] columnWidth = {40,70,160,160,70,70,70,(ukuran.width-640)};
        int j = 0;
        for(int width : columnWidth){
            TableColumn kolom = tblPatok.getColumnModel().getColumn(j++);
            kolom.setMinWidth(width);
            kolom.setPreferredWidth(width);
        }
        
        //memanggil fitur cari yang responsif
        filterSearch();        
    }    
    
    private void refillTable() {
        //merefill tabel sesuai perubahan DB
        data.clear();
        fillTable();
        updateTable();
    }
    
    private void getIndex() {
        //mendapatkan value no dari row yang dipilih
        String no = tblPatok.getValueAt(tblPatok.getSelectedRow(), 0).toString();
        this.index = Integer.parseInt(no);
    }
    
    private void filterSearch() {
        //meng-filter data yang dicari pada jTable sesuai input user
        TableRowSorter sorter = new TableRowSorter<TableModel>(tblPatok.getModel());
        tblPatok.setRowSorter(sorter);            
        
        txtCari.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String cari = txtCari.getText();
                if (cari.length() == 0) {
                  sorter.setRowFilter(null);
                } else {
                  sorter.setRowFilter(RowFilter.regexFilter("(?i)" + cari,2,4));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String cari = txtCari.getText();
                if (cari.length() == 0) {
                  sorter.setRowFilter(null);
                } else {
                  sorter.setRowFilter(RowFilter.regexFilter("(?i)" + cari,2,4));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
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
            java.util.logging.Logger.getLogger(LihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LihatData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LihatData ld = new LihatData();
                ld.setLocationRelativeTo(null);
                ld.setVisible(true);
            }
        });        
    }   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatok;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables

}
