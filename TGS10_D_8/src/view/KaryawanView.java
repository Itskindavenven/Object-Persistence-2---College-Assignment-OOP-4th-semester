package view;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

import control.KaryawanControl;
import exception.InvalidJenisKaryawanException;
import exception.InvalidKaryawanIDException;
import javax.swing.*;
import model.Karyawan;

public class KaryawanView extends javax.swing.JFrame {
    
    private KaryawanControl karyawanControl;
    String action = null;
    
    public KaryawanView() {
        initComponents();
        setComponent(false);
        setComponentDosen(false);
        setComponentStaff(false);
        setEditDeleteBtn(false);
        karyawanControl = new KaryawanControl();
        showData();
    }
    
    public void setComponent(boolean value){
        inputID.setEnabled(value);
        inputNama.setEnabled(value);
        inputTahun.setEnabled(value);
        inputNoTelp.setEnabled(value);
        
        tombolSimpan.setEnabled(value);
        tombolBatal.setEnabled(value);
    }
    
    public void setComponentDosen(boolean value){
        dosenRadioButton.setEnabled(value);
        inputBebanMengajar.setEnabled(value);
    }
    
    public void setComponentStaff(boolean value){
        staffRadioButton.setEnabled(value);
         inputJamKerja.setEnabled(value);
    }
    
    public void setEditDeleteBtn(boolean value){
        tombolUbah.setEnabled(value);
        tombolHapus.setEnabled(value);
    }
    
    public void clearText(){
        inputID.setText("");
        inputNama.setText("");
        inputTahun.setText("");
        inputNoTelp.setText("");
        inputPencarian.setText("");
        inputBebanMengajar.setText("");
        inputJamKerja.setText("");
    }
    
    public void setDefaultID(String pilihan){
        if(pilihan.equals("Dosen")) {
            String AutoID = karyawanControl.AutoID("Dosen");
            inputID.setText(AutoID);
        }
        if(pilihan.equals("Staff")){
            String AutoID = karyawanControl.AutoID("Staff");
            inputID.setText(AutoID);
        }
    }
    
    public void showData(){
        tampilDosen.setText(karyawanControl.showAllDataDosen());
        tampilTU.setText(karyawanControl.showAllDataStaff());
    }
    
    public void invalidJenisKaryawanException() throws InvalidJenisKaryawanException {
        if(dosenRadioButton.getText()!="Dosen" || staffRadioButton.getText()!="Staff"){
                throw new InvalidJenisKaryawanException();
            }
    }
    
    public void invalidKaryawanIDException() throws InvalidKaryawanIDException{
        if(inputID.getText().length()<5 || inputID.getText().length()>8) {
            throw new InvalidKaryawanIDException();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupKaryawan = new javax.swing.ButtonGroup();
        panelInput = new javax.swing.JPanel();
        tombolTambah = new javax.swing.JButton();
        tombolUbah = new javax.swing.JButton();
        tombolHapus = new javax.swing.JButton();
        inputPencarian = new javax.swing.JTextField();
        tombolPencarian = new javax.swing.JButton();
        labelID = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        labelNama = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        labelTahun = new javax.swing.JLabel();
        inputTahun = new javax.swing.JTextField();
        labelNoTelp = new javax.swing.JLabel();
        inputNoTelp = new javax.swing.JTextField();
        tombolBatal = new javax.swing.JButton();
        tombolSimpan = new javax.swing.JButton();
        inputJamKerja = new javax.swing.JTextField();
        labelJamKerja = new javax.swing.JLabel();
        inputBebanMengajar = new javax.swing.JTextField();
        labelBebanMengajar = new javax.swing.JLabel();
        dosenRadioButton = new javax.swing.JRadioButton();
        staffRadioButton = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelTampil = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tampilDosen = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tampilTU = new javax.swing.JTextArea();
        panelJudul = new javax.swing.JPanel();
        labelJudul = new javax.swing.JLabel();
        labelKelompok = new javax.swing.JLabel();
        labelNPM1 = new javax.swing.JLabel();
        labelNPM2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tombolTambah.setText("Tambah");
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahActionPerformed(evt);
            }
        });

        tombolUbah.setText("Ubah");
        tombolUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUbahActionPerformed(evt);
            }
        });

        tombolHapus.setText("Hapus");
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });

        inputPencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPencarianActionPerformed(evt);
            }
        });

        tombolPencarian.setText("Cari");
        tombolPencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolPencarianActionPerformed(evt);
            }
        });

        labelID.setText("ID Karyawan");

        inputID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDActionPerformed(evt);
            }
        });

        labelNama.setText("Nama Karyawan");

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        labelTahun.setText("Tahun Masuk");

        inputTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTahunActionPerformed(evt);
            }
        });

        labelNoTelp.setText("Nomor Telepon");

        tombolBatal.setText("Batal");
        tombolBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBatalActionPerformed(evt);
            }
        });

        tombolSimpan.setText("Simpan");
        tombolSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSimpanActionPerformed(evt);
            }
        });

        inputJamKerja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJamKerjaActionPerformed(evt);
            }
        });

        labelJamKerja.setText("Jam Kerja");

        inputBebanMengajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBebanMengajarActionPerformed(evt);
            }
        });

        labelBebanMengajar.setText("Beban Mengajar");

        buttonGroupKaryawan.add(dosenRadioButton);
        dosenRadioButton.setText("Dosen");
        dosenRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosenRadioButtonActionPerformed(evt);
            }
        });

        buttonGroupKaryawan.add(staffRadioButton);
        staffRadioButton.setText("Staff");
        staffRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffRadioButtonActionPerformed(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tampilDosen.setEditable(false);
        tampilDosen.setColumns(20);
        tampilDosen.setRows(5);
        jScrollPane1.setViewportView(tampilDosen);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tampilTU.setEditable(false);
        tampilTU.setColumns(20);
        tampilTU.setRows(5);
        jScrollPane2.setViewportView(tampilTU);

        javax.swing.GroupLayout panelTampilLayout = new javax.swing.GroupLayout(panelTampil);
        panelTampil.setLayout(panelTampilLayout);
        panelTampilLayout.setHorizontalGroup(
            panelTampilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTampilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTampilLayout.setVerticalGroup(
            panelTampilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTampilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTampilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jScrollPane3.setViewportView(panelTampil);

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                        .addComponent(tombolTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelID)
                            .addComponent(inputID)
                            .addComponent(inputNama)
                            .addComponent(inputTahun, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addComponent(labelNama)
                            .addComponent(labelTahun)
                            .addComponent(labelNoTelp)
                            .addComponent(inputNoTelp))
                        .addGap(150, 150, 150)))
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputJamKerja)
                            .addComponent(inputPencarian)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                                .addComponent(staffRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelJamKerja))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                                .addComponent(dosenRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                                .addComponent(labelBebanMengajar))
                            .addComponent(inputBebanMengajar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                        .addComponent(tombolSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
            .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelInputLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tombolTambah)
                            .addComponent(tombolUbah)
                            .addComponent(tombolHapus)
                            .addComponent(inputPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tombolPencarian))
                        .addGap(18, 18, 18)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelBebanMengajar)
                            .addComponent(dosenRadioButton))
                        .addGap(18, 18, 18)
                        .addComponent(inputBebanMengajar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelJamKerja)
                            .addComponent(staffRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputJamKerja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tombolBatal)
                            .addComponent(tombolSimpan)))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(labelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelTahun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNoTelp)
                        .addGap(20, 20, 20)
                        .addComponent(inputNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(291, Short.MAX_VALUE))
            .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                    .addContainerGap(346, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        panelJudul.setBackground(new java.awt.Color(255, 255, 255));

        labelJudul.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        labelJudul.setForeground(new java.awt.Color(0, 0, 204));
        labelJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudul.setText("OBJECT PERSISTENCE 1");

        labelKelompok.setText("Kelompok 8");

        labelNPM1.setText("210711233");

        labelNPM2.setText("210711365");

        javax.swing.GroupLayout panelJudulLayout = new javax.swing.GroupLayout(panelJudul);
        panelJudul.setLayout(panelJudulLayout);
        panelJudulLayout.setHorizontalGroup(
            panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJudulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelKelompok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNPM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNPM2)
                .addGap(185, 185, 185)
                .addComponent(labelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        panelJudulLayout.setVerticalGroup(
            panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJudulLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJudulLayout.createSequentialGroup()
                        .addComponent(labelKelompok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNPM1)
                            .addComponent(labelNPM2)))
                    .addComponent(labelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(640, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addComponent(panelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void dosenRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosenRadioButtonActionPerformed
        
        setComponentDosen(true);
        setComponent(true);
        inputID.setEnabled(false);
        inputJamKerja.setEnabled(false);
        inputBebanMengajar.setText(" ");
        action="Tambah";
        dosenRadioButton.setText("Dosen");
        setDefaultID("Dosen");
        
    }//GEN-LAST:event_dosenRadioButtonActionPerformed

    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
        
        setComponentDosen(true);
        setComponentStaff(true);
        inputBebanMengajar.setEnabled(false);
        inputJamKerja.setEnabled(false);
        inputPencarian.setText(" ");
        action="Tambah";
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void tombolUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUbahActionPerformed
        setComponent(true);
        if(inputID.getText().startsWith("DSN-")){
            inputJamKerja.setEnabled(false);
            inputBebanMengajar.setEnabled(true);
        }else{
            inputJamKerja.setEnabled(true);
        }
        inputID.setEnabled(false);
        action="Ubah";
    }//GEN-LAST:event_tombolUbahActionPerformed

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ignin menghapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if(getAnswer == JOptionPane.YES_OPTION){
            try{
                karyawanControl.deleteDataKaryawan(inputID.getText());
                clearText();
                showData();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
                tombolUbah.setEnabled(false);
                tombolHapus.setEnabled(false);
            }catch(Exception e){
                System.out.println("Error:  "+e.getMessage());
            }
        }
        else{
            JOptionPane.showConfirmDialog(null, "Data tidak jadi dihapus");
        }
    }//GEN-LAST:event_tombolHapusActionPerformed

    private void tombolPencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolPencarianActionPerformed
        setEditDeleteBtn(true);
        
        try{
            Karyawan karyawan = karyawanControl.fetchDataKaryawan(inputPencarian.getText());
            if( karyawan== null){
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
                setComponentDosen(false);
                setComponentStaff(false);
            }else{
                inputID.setText(karyawan.getId());
                inputNama.setText(karyawan.getNama());
                buttonGroupKaryawan.getSelection();
                
            }
        }catch(Exception e){
            System.out.println("Error:  "+e.getMessage());
        }
    }//GEN-LAST:event_tombolPencarianActionPerformed

    private void tombolSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSimpanActionPerformed
            try{
                invalidJenisKaryawanException();
                invalidKaryawanIDException();
            
//                Karyawan d = new Karyawan(inputID.getText(), inputNama.getText(), buttonGroupKaryawan.toString(), inputTahun.getX(), inputNoTelp.getText(), inputBebanMengajar.getText(), inputJamKerja.getX());
                
                if(action.equals("Tambah")){
                    if (dosenRadioButton.isSelected()) {
                        
                        String tahunMasukStr = inputTahun.getText().trim();
                        int tahunMasuk = Integer.parseInt(tahunMasukStr);
                        Karyawan k = new Karyawan(inputID.getText(), inputNama.getText(), "Dosen", tahunMasuk, inputNoTelp.getText(), inputBebanMengajar.getText(), 0);
                        karyawanControl.insertDataKaryawan(k);
                    } else {
                        
                        String tahunMasukStr = inputTahun.getText().trim();
                        int tahunMasuk = Integer.parseInt(tahunMasukStr);
                        String jamKerjaStr = inputJamKerja.getText().trim();
                        int jamKerja = Integer.parseInt(jamKerjaStr);

                        Karyawan k = new Karyawan(inputID.getText(), inputNama.getText(), "Staff", tahunMasuk, inputNoTelp.getText(), "0", jamKerja);
                        karyawanControl.insertDataKaryawan(k);
                    }
                    JOptionPane.showMessageDialog(panelTampil, "Data Berhasil Disimpan");
                } else {
                    if (inputID.getText().startsWith("DSN-")) {
                        String tahunMasukStr = inputTahun.getText().trim();
                        int tahunMasuk = Integer.parseInt(tahunMasukStr);
                        Karyawan k = new Karyawan(inputID.getText(), inputNama.getText(), "Dosen", tahunMasuk, inputNoTelp.getText(), inputBebanMengajar.getText(), 0);
                        karyawanControl.updateDataKaryawan(k, inputID.getText());
                    } else {
                        String tahunMasukStr = inputTahun.getText().trim();
                        int tahunMasuk = Integer.parseInt(tahunMasukStr);
                        String jamKerjaStr = inputJamKerja.getText().trim();
                        int jamKerja = Integer.parseInt(jamKerjaStr);

                        Karyawan k = new Karyawan(inputID.getText(), inputNama.getText(), "Staff", tahunMasuk, inputNoTelp.getText(), "0", jamKerja);
                        karyawanControl.updateDataKaryawan(k, inputID.getText());
                    }
                        JOptionPane.showMessageDialog(panelTampil, "Data Berhasil Diubah");
    //                    karyawanControl.updateDataKaryawan(d, inputID.getText());
                }
                clearText();
                showData();
                setComponent(false);
                setComponentDosen(false);
                setComponentStaff(false);
                setEditDeleteBtn(false);
        }catch (InvalidJenisKaryawanException e){
            JOptionPane.showConfirmDialog(this, e.message());
        }catch (InvalidKaryawanIDException e){
            JOptionPane.showConfirmDialog(this, e.message());
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Input tidak valid. Pastikan Anda memasukkan angka yang benar.");
            e.printStackTrace();
        }
    }//GEN-LAST:event_tombolSimpanActionPerformed

    private void tombolBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBatalActionPerformed
        setComponent(false);
        setComponentDosen(false);
        setComponentStaff(false);
        setEditDeleteBtn(false);
        clearText();
    }//GEN-LAST:event_tombolBatalActionPerformed

    private void staffRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffRadioButtonActionPerformed
        setComponentStaff(true);
        setComponent(true);
        inputID.setEnabled(false);
        inputBebanMengajar.setEnabled(false);
        inputJamKerja.setText("");
        action="Tambah";
        staffRadioButton.setText("Staff");
        setDefaultID("Staff");
    }//GEN-LAST:event_staffRadioButtonActionPerformed

    private void inputIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDActionPerformed

    private void inputJamKerjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJamKerjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJamKerjaActionPerformed

    private void inputBebanMengajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBebanMengajarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBebanMengajarActionPerformed

    private void inputTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTahunActionPerformed

    private void inputPencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPencarianActionPerformed

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
            java.util.logging.Logger.getLogger(KaryawanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaryawanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaryawanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaryawanView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KaryawanView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupKaryawan;
    private javax.swing.JRadioButton dosenRadioButton;
    private javax.swing.JTextField inputBebanMengajar;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputJamKerja;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNoTelp;
    private javax.swing.JTextField inputPencarian;
    private javax.swing.JTextField inputTahun;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelBebanMengajar;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelJamKerja;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelKelompok;
    private javax.swing.JLabel labelNPM1;
    private javax.swing.JLabel labelNPM2;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNoTelp;
    private javax.swing.JLabel labelTahun;
    private javax.swing.JPanel panelInput;
    private javax.swing.JPanel panelJudul;
    private javax.swing.JPanel panelTampil;
    private javax.swing.JRadioButton staffRadioButton;
    private javax.swing.JTextArea tampilDosen;
    private javax.swing.JTextArea tampilTU;
    private javax.swing.JButton tombolBatal;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolPencarian;
    private javax.swing.JButton tombolSimpan;
    private javax.swing.JButton tombolTambah;
    private javax.swing.JButton tombolUbah;
    // End of variables declaration//GEN-END:variables
}
