/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.tambahPasien;
import View.tambahPasienInap;
import hospital.Aplikasi;
import hospital.Dokter;
import hospital.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Konjem_Family
 */
public class Controller_tambahPasienInap implements ActionListener{
    Aplikasi app;
    tambahPasienInap view;

    public Controller_tambahPasienInap(Aplikasi app) {
        this.app = app;
        view = new tambahPasienInap();
        view.addListen(this);
        view.setVisible(true);
    }
    
    public void load(){
        try{
            this.view.getDokterSelected().addItem(" -- PILIH -- ");
            this.view.getPasienSelected().addItem(" -- PILIH -- ");
            if (app.getDaftarDokter().size() > 0){
                for (Dokter d : app.getDaftarDokter()){
                    this.view.getDokterSelected().addItem(d.getName());
                }
            }
            if (app.getDaftarPasien().size() > 0){
                for (Pasien p : app.getDaftarPasien()){
                    this.view.getPasienSelected().addItem(p.getName());
                }
            }
        }
        catch(Exception e){
        }
        
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
            try{
//                if (source.equals(view.getBtnOk())){
//                    String id = view.getId();
//                    String title = view.getBoxTitle();
//                    String name = view.getNama();
//                    int age = view.getUmur();
//                    String gender = view.getBoxJenisKelamin();
//                    String disease = view.getPenyakit();
//                    String bloodType = view.getGolonganDarah();
                    app.addPasien(id, title, name, age, gender, disease, bloodType);
                    view.reset();
                }
                else if (source.equals(view.getBtnReset())){
                    view.reset();
                }
                else if (source.equals(view.getBtnMainMenu())){
                    new Controller_mainMenu(app);
                    this.view.setVisible(false);
                }
            }
      catch(Exception ae) {
            JOptionPane.showMessageDialog(view, ae.getMessage());
            view.reset();
      }
//            String disease =pi.getPenyakit();
//            String nama = pi.getNamaPasien();
//            String floor = pi.getBoxLantai(); 
//            String name = pi.getNamaDokter();
//            int nomorKamar = pi.getNoKamar(); 
//            String kelas = pi.getBoxKelas();
//            app.addPasien(disease, floor, name, name, nama, nomorKamar, kelas);
//            app.addRuangan(kelas, nomorKamar, nomorKamar);
//            app.addDokter(kelas, nomorKamar, name, name, nama, nomorKamar, kelas);
            
    }
    }
    
    
    
}
