/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Konjem_Family
 */
public class tambahPasien extends javax.swing.JFrame {

    /** Creates new form tambahPasien */
    public tambahPasien() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labNama = new javax.swing.JLabel();
        labUmur = new javax.swing.JLabel();
        labTitle = new javax.swing.JLabel();
        labJk = new javax.swing.JLabel();
        labPenyakit = new javax.swing.JLabel();
        labdarah = new javax.swing.JLabel();
        labId = new javax.swing.JLabel();
        labtambahPasien = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        tfPenyakit = new javax.swing.JTextField();
        tfUmur = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfId = new javax.swing.JTextField();
        boxTitle = new javax.swing.JComboBox<>();
        boxJenisKelamin = new javax.swing.JComboBox<>();
        boxGolDar = new javax.swing.JComboBox<>();
        btnOk = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labNama.setText("Nama");

        labUmur.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labUmur.setText("Umur");

        labTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labTitle.setText("Title");

        labJk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labJk.setText("Jenis Kelamin");

        labPenyakit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labPenyakit.setText("Penyakit ");

        labdarah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labdarah.setText("Gol.Darah");

        labId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labId.setText("ID");

        labtambahPasien.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labtambahPasien.setText("Tambah Pasien");

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setText("Reset");

        boxTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Title", "Mr", "Mrs" }));

        boxJenisKelamin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Kelamin", "Laki-laki", "Perempuan" }));

        boxGolDar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxGolDar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Gol.Darah", "A", "B", "AB", "O" }));

        btnOk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOk.setText("Ok");
        btnOk.setMargin(new java.awt.Insets(2, 14, 2, 2));

        btnMainMenu.setIcon(new javax.swing.ImageIcon("D:\\Java\\Tugas Besar PBO\\Home.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMainMenu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 78, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(labtambahPasien))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labPenyakit)
                            .addComponent(labdarah)
                            .addComponent(labJk)
                            .addComponent(labUmur)
                            .addComponent(labNama)
                            .addComponent(labTitle)
                            .addComponent(labId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPenyakit)
                            .addComponent(tfUmur)
                            .addComponent(boxJenisKelamin, 0, 212, Short.MAX_VALUE)
                            .addComponent(boxGolDar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfId)
                            .addComponent(boxTitle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNama))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMainMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labtambahPasien)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labId)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTitle)
                    .addComponent(boxTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNama)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labUmur)
                    .addComponent(tfUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labJk)
                    .addComponent(boxJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labPenyakit)
                    .addComponent(tfPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labdarah)
                    .addComponent(boxGolDar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public String getId() {
        return tfId.getText();
    }
    
    public String getBoxTitle() {
        return boxTitle.getSelectedItem().toString();
    }

    public String getNama() {
        return tfNama.getText();
    }
    
    public int getUmur() {
        return Integer.parseInt(tfUmur.getText());
    }

    public String getBoxJenisKelamin() {
        return boxJenisKelamin.getSelectedItem().toString();
    }
    
    public String getPenyakit(){
        return tfPenyakit.getText();
    }
    
    public String getGolonganDarah(){
        return boxGolDar.getSelectedItem().toString();
    }

    public Object getBtnOk(){
        return btnOk;
    }
    
    public Object getBtnReset(){
        return btnReset;
    }
    
    public Object getBtnMainMenu(){
        return btnMainMenu;
    }
    
    public void reset(){
        tfId.setText("");
        tfNama.setText("");
        tfUmur.setText("");
        tfPenyakit.setText("");
        boxTitle.setSelectedIndex(0);
        boxJenisKelamin.setSelectedIndex(0);
        boxGolDar.setSelectedIndex(0);
    }
    
    public void addListen (ActionListener a){
        this.btnOk.addActionListener(a);
        this.btnReset.addActionListener(a);
        this.btnMainMenu.addActionListener(a);
    }
    
    
    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(tambahPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(tambahPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(tambahPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(tambahPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new tambahPasien().setVisible(true);
//            }
//        });
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxGolDar;
    private javax.swing.JComboBox<String> boxJenisKelamin;
    private javax.swing.JComboBox<String> boxTitle;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnReset;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labId;
    private javax.swing.JLabel labJk;
    private javax.swing.JLabel labNama;
    private javax.swing.JLabel labPenyakit;
    private javax.swing.JLabel labTitle;
    private javax.swing.JLabel labUmur;
    private javax.swing.JLabel labdarah;
    private javax.swing.JLabel labtambahPasien;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfPenyakit;
    private javax.swing.JTextField tfUmur;
    // End of variables declaration//GEN-END:variables

}
