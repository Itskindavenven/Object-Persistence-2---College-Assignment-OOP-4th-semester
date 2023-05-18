package view;

/*
    210711365 - Titus Revi Unggul Pramudya
    210711233 - Bonaventura Octavito Cahyawan
 */

import control.KaryawanControl;
import control.PeminjamanRuangControl;
import control.RuanganControl;
import exception.InvalidJenisKaryawanException;
import exception.InvalidKaryawanIDException;
import exception.InvalidInputanKosongException;
import javax.swing.*;
import model.Karyawan;
import model.PeminjamanRuangan;
import model.Ruangan;
import table.TablePeminjamanRuangan;
import java.util.List;

public class PeminjamanRuanganView extends javax.swing.JFrame {
    private KaryawanControl karyawanControl;
    private PeminjamanRuangControl peminjamanControl;
    private RuanganControl ruanganControl;
    
    List<Karyawan> listKaryawan;
    List<Ruangan> listRuangan;
    
    String action = null;
    int selected=0;
    
    
    public PeminjamanRuanganView() {
        peminjamanControl = new PeminjamanRuangControl();
        ruanganControl = new RuanganControl();
        karyawanControl = new KaryawanControl();
        initComponents();
        setComponent(false);
        clearText();
        
        tombolUbah.setEnabled(false);
        tombolHapus.setEnabled(false);
        
        showData();
        setNamaDropDown();
        setRuanganDropDown();
    }

    public void setComponent(boolean value){
        namaDropdown.setEnabled(value);
        ruanganDropdown.setEnabled(value);
        inputLamaPeminjaman.setEnabled(value);
        inputTanggal.setEnabled(value);
        
        micBox.setEnabled(value);
        projectorBox.setEnabled(value);
        dispenserBox.setEnabled(value);
        
        tombolSimpan.setEnabled(value);
        tombolBatal.setEnabled(value);
    }
    
    public void clearText(){
        inputTanggal.setText("");
        inputLamaPeminjaman.setText("");
    }
    
    public void showData(){
        tabelData.setModel(peminjamanControl.showPeminjamanRuangan(""));
    }
    
    
    public void setNamaDropDown(){
        listKaryawan = karyawanControl.showListKaryawan();
        for(int i = 0; i < listKaryawan.size(); i++){
            namaDropdown.addItem(listKaryawan.get(i));
        }
    }
    
    public void setRuanganDropDown(){
        listRuangan = ruanganControl.showListRuangan();
        for(int i = 0; i < listRuangan.size(); i++){
            ruanganDropdown.addItem(listRuangan.get(i));
        }
    }
    
    public void inputKosongException() throws InvalidInputanKosongException{
        if(inputLamaPeminjaman.getText().isEmpty() || inputTanggal.getText().isEmpty() || namaDropdown.getSelectedIndex() == -1 || ruanganDropdown.getSelectedIndex() == -1){
            throw new InvalidInputanKosongException();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelJudul = new javax.swing.JPanel();
        labelNamaUniv = new javax.swing.JLabel();
        labelNPM1 = new javax.swing.JLabel();
        labelNPM2 = new javax.swing.JLabel();
        labelKelompok = new javax.swing.JLabel();
        panelKaryawan = new javax.swing.JPanel();
        panelPeminjaman = new javax.swing.JPanel();
        labelPeminjaman = new javax.swing.JLabel();
        panelRuangan = new javax.swing.JPanel();
        labelRuangan = new javax.swing.JLabel();
        labelKaryawan = new javax.swing.JLabel();
        panelInput = new javax.swing.JPanel();
        labelJudul = new javax.swing.JLabel();
        tombolCari = new javax.swing.JButton();
        inputCari = new javax.swing.JTextField();
        tombolTambah = new javax.swing.JButton();
        tombolUbah = new javax.swing.JButton();
        tombolHapus = new javax.swing.JButton();
        labelNamaKaryawan = new javax.swing.JLabel();
        labelNamaRuangan = new javax.swing.JLabel();
        labelTanggal = new javax.swing.JLabel();
        inputTanggal = new javax.swing.JTextField();
        labelLamaPeminjaman = new javax.swing.JLabel();
        inputLamaPeminjaman = new javax.swing.JTextField();
        labelFasilitas = new javax.swing.JLabel();
        micBox = new javax.swing.JCheckBox();
        projectorBox = new javax.swing.JCheckBox();
        dispenserBox = new javax.swing.JCheckBox();
        tombolBatal = new javax.swing.JButton();
        tombolSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        ruanganDropdown = new javax.swing.JComboBox<>();
        namaDropdown = new javax.swing.JComboBox<>();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelJudul.setBackground(new java.awt.Color(51, 51, 255));
        panelJudul.setMaximumSize(new java.awt.Dimension(700, 150));
        panelJudul.setPreferredSize(new java.awt.Dimension(700, 107));

        labelNamaUniv.setFont(new java.awt.Font("Calibri", 3, 25)); // NOI18N
        labelNamaUniv.setForeground(new java.awt.Color(255, 204, 0));
        labelNamaUniv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNamaUniv.setText("Universitas Palangkarna");
        labelNamaUniv.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelNamaUniv.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        labelNPM1.setBackground(new java.awt.Color(51, 51, 255));
        labelNPM1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelNPM1.setForeground(new java.awt.Color(255, 255, 255));
        labelNPM1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelNPM1.setText("210711233");
        labelNPM1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        labelNPM2.setBackground(new java.awt.Color(51, 51, 255));
        labelNPM2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelNPM2.setForeground(new java.awt.Color(255, 255, 255));
        labelNPM2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelNPM2.setText("210711365");
        labelNPM2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        labelKelompok.setBackground(new java.awt.Color(51, 51, 255));
        labelKelompok.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 20)); // NOI18N
        labelKelompok.setForeground(new java.awt.Color(255, 204, 0));
        labelKelompok.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelKelompok.setText("KELOMPOK 8");
        labelKelompok.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        panelKaryawan.setBackground(new java.awt.Color(51, 51, 255));
        panelKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelKaryawanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelKaryawanLayout = new javax.swing.GroupLayout(panelKaryawan);
        panelKaryawan.setLayout(panelKaryawanLayout);
        panelKaryawanLayout.setHorizontalGroup(
            panelKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelKaryawanLayout.setVerticalGroup(
            panelKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );

        panelPeminjaman.setBackground(new java.awt.Color(51, 51, 255));
        panelPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPeminjamanMouseClicked(evt);
            }
        });

        labelPeminjaman.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelPeminjaman.setForeground(new java.awt.Color(255, 255, 255));
        labelPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icons8-document-50.png"))); // NOI18N
        labelPeminjaman.setText("Peminjaman");

        javax.swing.GroupLayout panelPeminjamanLayout = new javax.swing.GroupLayout(panelPeminjaman);
        panelPeminjaman.setLayout(panelPeminjamanLayout);
        panelPeminjamanLayout.setHorizontalGroup(
            panelPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPeminjaman)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPeminjamanLayout.setVerticalGroup(
            panelPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeminjamanLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(labelPeminjaman)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        panelRuangan.setBackground(new java.awt.Color(51, 51, 255));
        panelRuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRuanganMouseClicked(evt);
            }
        });

        labelRuangan.setForeground(new java.awt.Color(255, 255, 255));
        labelRuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icons8-room-64.png"))); // NOI18N
        labelRuangan.setText("Ruangan");

        javax.swing.GroupLayout panelRuanganLayout = new javax.swing.GroupLayout(panelRuangan);
        panelRuangan.setLayout(panelRuanganLayout);
        panelRuanganLayout.setHorizontalGroup(
            panelRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRuanganLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelRuangan)
                .addGap(24, 24, 24))
        );
        panelRuanganLayout.setVerticalGroup(
            panelRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRuanganLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelRuangan)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        labelKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        labelKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icons8-lecturer-64.png"))); // NOI18N
        labelKaryawan.setText("Karyawan");

        javax.swing.GroupLayout panelJudulLayout = new javax.swing.GroupLayout(panelJudul);
        panelJudul.setLayout(panelJudulLayout);
        panelJudulLayout.setHorizontalGroup(
            panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJudulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNamaUniv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJudulLayout.createSequentialGroup()
                        .addComponent(labelKaryawan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelNPM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNPM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelKelompok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelJudulLayout.setVerticalGroup(
            panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJudulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJudulLayout.createSequentialGroup()
                        .addComponent(labelNamaUniv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75))
                    .addGroup(panelJudulLayout.createSequentialGroup()
                        .addComponent(labelKelompok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNPM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNPM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelJudulLayout.createSequentialGroup()
                .addGroup(panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelJudulLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(labelKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelInput.setBackground(new java.awt.Color(255, 255, 255));

        labelJudul.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        labelJudul.setForeground(new java.awt.Color(51, 51, 255));
        labelJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudul.setText("Peminjaman");
        labelJudul.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelJudul.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        tombolCari.setBackground(new java.awt.Color(255, 204, 0));
        tombolCari.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tombolCari.setForeground(new java.awt.Color(51, 51, 255));
        tombolCari.setText("Cari");
        tombolCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCariActionPerformed(evt);
            }
        });

        inputCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCariActionPerformed(evt);
            }
        });

        tombolTambah.setBackground(new java.awt.Color(255, 255, 255));
        tombolTambah.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tombolTambah.setForeground(new java.awt.Color(51, 51, 255));
        tombolTambah.setText("Tambah");
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahActionPerformed(evt);
            }
        });

        tombolUbah.setBackground(new java.awt.Color(255, 255, 255));
        tombolUbah.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tombolUbah.setForeground(new java.awt.Color(51, 51, 255));
        tombolUbah.setText("Ubah");
        tombolUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUbahActionPerformed(evt);
            }
        });

        tombolHapus.setBackground(new java.awt.Color(255, 255, 255));
        tombolHapus.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tombolHapus.setForeground(new java.awt.Color(51, 51, 255));
        tombolHapus.setText("Hapus");
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });

        labelNamaKaryawan.setText("Nama Karyawan");

        labelNamaRuangan.setText("Ruangan");

        labelTanggal.setText("Tanggal");

        inputTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTanggalActionPerformed(evt);
            }
        });

        labelLamaPeminjaman.setText("Lama Peminjaman");

        labelFasilitas.setText("Fasilitas");

        micBox.setText("Microphone");

        projectorBox.setText("Projector");

        dispenserBox.setText("Dispenser");

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

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama Karyawan", "Jenis Karyawan", "Nama Ruangan", "Tanggal", "Lama Pinjam", "Fasilitas", "Beban Mengajar", "Jam Kerja"
            }
        ));
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelData);

        ruanganDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruanganDropdownActionPerformed(evt);
            }
        });

        namaDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaDropdownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(labelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(labelNamaKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(336, 336, 336))
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(labelNamaRuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(375, 375, 375))
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(labelTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(380, 380, 380))
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(tombolTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tombolUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tombolHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(namaDropdown, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ruanganDropdown, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputTanggal, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(143, 143, 143)))
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(inputCari)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tombolCari, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(labelLamaPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(306, 306, 306))
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(inputLamaPeminjaman)
                                .addGap(149, 149, 149))
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(labelFasilitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(361, 361, 361))
                            .addGroup(panelInputLayout.createSequentialGroup()
                                .addComponent(micBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(projectorBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dispenserBox))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tombolSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolCari)
                    .addComponent(inputCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolTambah)
                    .addComponent(tombolUbah)
                    .addComponent(tombolHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaKaryawan)
                    .addComponent(labelLamaPeminjaman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLamaPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNamaRuangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFasilitas)
                    .addComponent(ruanganDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(labelTanggal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(micBox)
                        .addComponent(projectorBox)
                        .addComponent(dispenserBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolBatal)
                    .addComponent(tombolSimpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                    .addComponent(panelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCariActionPerformed

    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
        setComponent(true);
        clearText();
        action = "Tambah";
        namaDropdown.getSelectedIndex();
        ruanganDropdown.getSelectedIndex();
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void inputTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTanggalActionPerformed

    private void tombolBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBatalActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Batal?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if(getAnswer == JOptionPane.YES_OPTION){
            try{
                setComponent(false);
        clearText();
            }catch(Exception e){
                System.out.println("Error:  "+e.getMessage());
            }
        }else{
            
        }
    }//GEN-LAST:event_tombolBatalActionPerformed

    private void tombolSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSimpanActionPerformed
        try{
            inputKosongException();
            String fasilitas = "";
            
            int selectedNama = namaDropdown.getSelectedIndex();
            Karyawan selectedKaryawan  = listKaryawan.get(selectedNama);
            
            int selectedRuangan = ruanganDropdown.getSelectedIndex();
            Ruangan selectedRuang = listRuangan.get(selectedRuangan);
            
            if(micBox.isSelected() && dispenserBox.isSelected() && projectorBox.isSelected()){
                fasilitas = "mic, projector, dispenser";
            }else if(micBox.isSelected() && dispenserBox.isSelected()){
                fasilitas = "mic, dispenser";
            }else if(dispenserBox.isSelected() && projectorBox.isSelected()){
                fasilitas  = "projector, dispenser";
            }else if(micBox.isSelected() && projectorBox.isSelected()){
                fasilitas  = "mic, projector";
            }else if(micBox.isSelected()){
                fasilitas = "mic";
            }else if(projectorBox.isSelected()){
                fasilitas = "projector";
            }else if(dispenserBox.isSelected()){
                fasilitas = "dispenser";
            }else{
            }
            
            if(action.equals("Tambah")){
                PeminjamanRuangan pinjam = new PeminjamanRuangan(inputTanggal.getText(), inputLamaPeminjaman.getText(), fasilitas, selectedKaryawan, selectedRuang);
                peminjamanControl.insertDataPeminjamanRuangan(pinjam);
                JOptionPane.showMessageDialog(rootPane, "Berhasil Menambah Data");
            }else if(action.equals("Ubah")){
                PeminjamanRuangan pinjam = new PeminjamanRuangan(selected, inputTanggal.getText(), inputLamaPeminjaman.getText(), fasilitas, selectedKaryawan, selectedRuang);
                peminjamanControl.updateDataPeminjamanRuangan(pinjam);
                JOptionPane.showMessageDialog(rootPane, "Berhasil Mengubah Data");
            }
            
            clearText();
            showData();
            setComponent(false);
            action = " ";
        }catch(InvalidInputanKosongException e){
            JOptionPane.showConfirmDialog(this, e.message());
        }
    }//GEN-LAST:event_tombolSimpanActionPerformed

    private void tombolUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUbahActionPerformed
        setComponent(true);
        action = "Ubah";
    }//GEN-LAST:event_tombolUbahActionPerformed

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ignin menghapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if(getAnswer == JOptionPane.YES_OPTION){
            try{
                peminjamanControl.deleteDataPeminjamanRuangan(selected);
                clearText();
                showData();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            }catch(Exception e){
                System.out.println("Error:  "+e.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Data tidak jadi dihapus");
        }
    }//GEN-LAST:event_tombolHapusActionPerformed

    private void tombolCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCariActionPerformed
        tombolUbah.setEnabled(true);
        tombolHapus.setEnabled(true);

        try{
            TablePeminjamanRuangan tabelPinjam = peminjamanControl.showPeminjamanRuangan(inputCari.getText());
            int peminjamanInt;
            String peminjamanStr = inputCari.getText().trim();
            peminjamanInt = Integer.parseInt(peminjamanStr);
            PeminjamanRuangan peminjaman = peminjamanControl.fetchDataPeminjamanRuangan(peminjamanInt);
            if( tabelPinjam== null){
                clearText();
                tombolUbah.setEnabled(false);
                tombolHapus.setEnabled(false);
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
                setComponent(false);
            }else{
                tabelData.setModel(tabelPinjam);
                inputLamaPeminjaman.setText(peminjaman.getLamaPeminjaman());
                inputTanggal.setText(peminjaman.getTanggal());
                JOptionPane.showMessageDialog(this, "Data Ditemukan");
            }
        }catch(Exception e){
            System.out.println("Error:  "+e.getMessage());

        }
    }//GEN-LAST:event_tombolCariActionPerformed

    private void panelKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelKaryawanMouseClicked
        KaryawanView karyawanView = new KaryawanView();
        this.dispose();
        karyawanView.setVisible(true);
    }//GEN-LAST:event_panelKaryawanMouseClicked

    private void panelRuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRuanganMouseClicked
        RuanganView ruanganView = new RuanganView();
        this.dispose();
        ruanganView.setVisible(true);
    }//GEN-LAST:event_panelRuanganMouseClicked

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        int indexKaryawan = -1;
        int indexRuangan = -1;
        setComponent(false);
        
        tombolUbah.setEnabled(true);
        tombolHapus.setEnabled(true);
        
        int clickedRow = tabelData.getSelectedRow();
        TablePeminjamanRuangan tabelPinjam = (TablePeminjamanRuangan) tabelData.getModel();
        
        selected = Integer.parseInt(tabelPinjam.getValueAt(clickedRow, 10).toString());
        
        String namaKaryawan = tabelPinjam.getValueAt(clickedRow, 0).toString();
        for(Karyawan karyawan : listKaryawan){
            if(karyawan.getNama().equals(namaKaryawan)){
                indexKaryawan = listKaryawan.indexOf(karyawan);
            }
        }
       namaDropdown.setSelectedIndex(indexKaryawan);
        
        String jenisKaryawan = tabelPinjam.getValueAt(clickedRow, 1).toString();  
        
        String namaRuangan = tabelPinjam.getValueAt(clickedRow, 2).toString();
        for(Ruangan ruangan : listRuangan){
            if(ruangan.getNama().equals(namaRuangan)){
                indexRuangan = listRuangan.indexOf(ruangan);
            }
        }
        ruanganDropdown.setSelectedIndex(indexRuangan);
        
        inputTanggal.setText(tabelPinjam.getValueAt(clickedRow, 3).toString());
        inputLamaPeminjaman.setText(tabelPinjam.getValueAt(clickedRow, 4).toString());
        
        String fasilitas = tabelPinjam.getValueAt(clickedRow, 5).toString();
        switch(fasilitas){
            case "mic, projector, dispenser":
                micBox.isSelected();
                dispenserBox.isSelected();
                projectorBox.isSelected();
            break;
            
            case "mic, dispenser":
                micBox.isSelected();
                dispenserBox.isSelected();
            break;
            
            case "projector, dispenser":
                projectorBox.isSelected();
                dispenserBox.isSelected();
            break;
            
            case "mic, projector" : 
                micBox.isSelected();
                projectorBox.isSelected();
            break;    
            
            case "mic":
                micBox.isSelected();
            break;
                
            case "projector":
                projectorBox.isSelected();
            break;    
            
            case "dispenser":
                dispenserBox.isSelected();
            break;
            
            case "":
            break;
        }
        
        String bebanMengajar = tabelPinjam.getValueAt(clickedRow, 6).toString();
        String jamKerja = tabelPinjam.getValueAt(clickedRow, 7).toString();
        
        
    }//GEN-LAST:event_tabelDataMouseClicked

    private void namaDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaDropdownActionPerformed

    private void panelPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPeminjamanMouseClicked
        JOptionPane.showMessageDialog(rootPane, "[!] Udah di halaman Peminjaman [!]");
    }//GEN-LAST:event_panelPeminjamanMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void ruanganDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruanganDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruanganDropdownActionPerformed

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
            java.util.logging.Logger.getLogger(PeminjamanRuanganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeminjamanRuanganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeminjamanRuanganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeminjamanRuanganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeminjamanRuanganView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox dispenserBox;
    private javax.swing.JTextField inputCari;
    private javax.swing.JTextField inputLamaPeminjaman;
    private javax.swing.JTextField inputTanggal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelFasilitas;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelKaryawan;
    private javax.swing.JLabel labelKelompok;
    private javax.swing.JLabel labelLamaPeminjaman;
    private javax.swing.JLabel labelNPM1;
    private javax.swing.JLabel labelNPM2;
    private javax.swing.JLabel labelNamaKaryawan;
    private javax.swing.JLabel labelNamaRuangan;
    private javax.swing.JLabel labelNamaUniv;
    private javax.swing.JLabel labelPeminjaman;
    private javax.swing.JLabel labelRuangan;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JCheckBox micBox;
    private javax.swing.JComboBox<Karyawan> namaDropdown;
    private javax.swing.JPanel panelInput;
    private javax.swing.JPanel panelJudul;
    private javax.swing.JPanel panelKaryawan;
    private javax.swing.JPanel panelPeminjaman;
    private javax.swing.JPanel panelRuangan;
    private javax.swing.JCheckBox projectorBox;
    private javax.swing.JComboBox<Ruangan> ruanganDropdown;
    private javax.swing.JTable tabelData;
    private javax.swing.JButton tombolBatal;
    private javax.swing.JButton tombolCari;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolSimpan;
    private javax.swing.JButton tombolTambah;
    private javax.swing.JButton tombolUbah;
    // End of variables declaration//GEN-END:variables
}
