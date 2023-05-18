package view;

/**
 * 210711365 - Titus Revi Unggul Pramudya
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
import table.TableRuangan;
import table.TablePeminjamanRuangan;
import java.util.List;

public class RuanganView extends javax.swing.JFrame {
    private PeminjamanRuangControl peminjamanControl;
    private RuanganControl ruanganControl;
    
    List<Ruangan> listRuangan;
   
    String action = null;
    int selected = 0;
    
    public RuanganView() {
        ruanganControl = new RuanganControl();
        
        initComponents();
        setComponent(false);
        clearText();
        
        tombolUbah.setEnabled(false);
        tombolHapus.setEnabled(false);
        
        showDataRuangan();
    }
    
    public void setComponent(boolean value){
        inputNamaRuang.setEnabled(value);
        inputKapasitas.setEnabled(value);
        inputLuas.setEnabled(value);
        
        tombolSimpan.setEnabled(value);
        tombolBatal.setEnabled(value);
    }
    
    public void clearText(){
        inputNamaRuang.setText("");
        inputKapasitas.setText("");
        inputLuas.setText("");
    }
    
    public void showDataRuangan(){
        tabelDataRuangan.setModel(ruanganControl.showRuangan(""));
    }
    
    public void inputKosongException() throws InvalidInputanKosongException{
        if(inputNamaRuang.getText().isEmpty() || inputKapasitas.getText().isEmpty() || inputLuas.getText().isEmpty()){
            throw new InvalidInputanKosongException();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJudul = new javax.swing.JPanel();
        labelNamaUniv = new javax.swing.JLabel();
        labelNPM1 = new javax.swing.JLabel();
        labelNPM2 = new javax.swing.JLabel();
        labelKelompok = new javax.swing.JLabel();
        panelKaryawan = new javax.swing.JPanel();
        labelKaryawan = new javax.swing.JLabel();
        panelPeminjaman = new javax.swing.JPanel();
        labelPeminjaman = new javax.swing.JLabel();
        panelRuangan = new javax.swing.JPanel();
        labelRuangan = new javax.swing.JLabel();
        panelInput = new javax.swing.JPanel();
        labelJudul = new javax.swing.JLabel();
        tombolCari = new javax.swing.JButton();
        inputCari = new javax.swing.JTextField();
        tombolTambah = new javax.swing.JButton();
        tombolUbah = new javax.swing.JButton();
        tombolHapus = new javax.swing.JButton();
        tombolBatal = new javax.swing.JButton();
        tombolSimpan = new javax.swing.JButton();
        labelNamaRuang = new javax.swing.JLabel();
        inputNamaRuang = new javax.swing.JTextField();
        labelKapasitas = new javax.swing.JLabel();
        inputKapasitas = new javax.swing.JTextField();
        labelLuas = new javax.swing.JLabel();
        inputLuas = new javax.swing.JTextField();
        labelData = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataRuangan = new javax.swing.JTable();

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

        labelKaryawan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        labelKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icons8-lecturer-64.png"))); // NOI18N
        labelKaryawan.setText("Karyawan");

        javax.swing.GroupLayout panelKaryawanLayout = new javax.swing.GroupLayout(panelKaryawan);
        panelKaryawan.setLayout(panelKaryawanLayout);
        panelKaryawanLayout.setHorizontalGroup(
            panelKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKaryawanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelKaryawan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelKaryawanLayout.setVerticalGroup(
            panelKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKaryawanLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelKaryawan)
                .addContainerGap(54, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPeminjamanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelPeminjaman)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPeminjamanLayout.setVerticalGroup(
            panelPeminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeminjamanLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(labelPeminjaman)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        panelRuangan.setBackground(new java.awt.Color(51, 51, 255));
        panelRuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRuanganMouseClicked(evt);
            }
        });

        labelRuangan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelRuangan.setForeground(new java.awt.Color(255, 255, 255));
        labelRuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icons8-room-64.png"))); // NOI18N
        labelRuangan.setText("Ruangan");

        javax.swing.GroupLayout panelRuanganLayout = new javax.swing.GroupLayout(panelRuangan);
        panelRuangan.setLayout(panelRuanganLayout);
        panelRuanganLayout.setHorizontalGroup(
            panelRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRuanganLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(labelRuangan)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelRuanganLayout.setVerticalGroup(
            panelRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRuanganLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labelRuangan)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelJudulLayout = new javax.swing.GroupLayout(panelJudul);
        panelJudul.setLayout(panelJudulLayout);
        panelJudulLayout.setHorizontalGroup(
            panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJudulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNamaUniv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addComponent(panelPeminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelNPM1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNPM2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelKelompok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelJudulLayout.setVerticalGroup(
            panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJudulLayout.createSequentialGroup()
                .addGroup(panelJudulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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
        );

        panelInput.setBackground(new java.awt.Color(255, 255, 255));

        labelJudul.setFont(new java.awt.Font("Calibri", 3, 36)); // NOI18N
        labelJudul.setForeground(new java.awt.Color(51, 51, 255));
        labelJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudul.setText("RUANGAN");
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

        labelNamaRuang.setText("Ruangan");

        labelKapasitas.setText("Kapasitas");

        labelLuas.setText("Luas");

        labelData.setText("Data");

        tabelDataRuangan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama Ruangan", "Kapasitas", "Luas"
            }
        ));
        tabelDataRuangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataRuanganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDataRuangan);
        if (tabelDataRuangan.getColumnModel().getColumnCount() > 0) {
            tabelDataRuangan.getColumnModel().getColumn(0).setHeaderValue("ID");
            tabelDataRuangan.getColumnModel().getColumn(1).setHeaderValue("Nama Ruangan");
            tabelDataRuangan.getColumnModel().getColumn(2).setHeaderValue("Kapasitas");
            tabelDataRuangan.getColumnModel().getColumn(3).setHeaderValue("Luas");
        }

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelInputLayout.createSequentialGroup()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(tombolTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tombolUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tombolHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tombolSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLuas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNamaRuang)
                            .addComponent(inputNamaRuang)
                            .addComponent(labelKapasitas)
                            .addComponent(inputKapasitas)
                            .addComponent(inputLuas))))
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(inputCari, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolCari, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(labelData))
                        .addContainerGap())))
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(labelJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolCari)
                    .addComponent(inputCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolTambah)
                    .addComponent(tombolUbah)
                    .addComponent(tombolHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaRuang)
                    .addComponent(labelData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(inputNamaRuang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelKapasitas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelLuas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputLuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tombolBatal)
                            .addComponent(tombolSimpan))
                        .addGap(183, 183, 183))
                    .addGroup(panelInputLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelJudul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                    .addComponent(panelInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void panelKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelKaryawanMouseClicked
        KaryawanView karyawanView = new KaryawanView();
        this.dispose();
        karyawanView.setVisible(true);
    }//GEN-LAST:event_panelKaryawanMouseClicked

    private void panelRuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRuanganMouseClicked
        JOptionPane.showMessageDialog(rootPane, "[!] Udah di halaman Ruangan [!]");
    }//GEN-LAST:event_panelRuanganMouseClicked

    private void tombolSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSimpanActionPerformed
        try{
            inputKosongException();
            
            if(action.equals("Tambah")){
                Ruangan r = new Ruangan(selected, inputNamaRuang.getText(), inputKapasitas.getText(), inputLuas.getText());
                        ruanganControl.insertDataRuangan(r);
                        JOptionPane.showMessageDialog(rootPane, "Berhasil Menambah Data");
            }else if(action.equals("Ubah")){
                Ruangan r = new Ruangan(selected, inputNamaRuang.getText(), inputKapasitas.getText(), inputLuas.getText());
                        ruanganControl.updateDataRuangan(r, selected);
                        JOptionPane.showMessageDialog(rootPane, "Berhasil Mengubah Data");
            }
            
            clearText();
            showDataRuangan();
            setComponent(false);
        }catch(InvalidInputanKosongException e){
            JOptionPane.showConfirmDialog(this, e.message());
        }
    }//GEN-LAST:event_tombolSimpanActionPerformed

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

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ignin menghapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        if(getAnswer == JOptionPane.YES_OPTION){
            try{
                ruanganControl.deleteDataRuangan(selected);
                clearText();
                showDataRuangan();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            }catch(Exception e){
                System.out.println("Error:  "+e.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Data tidak jadi dihapus");
        }
    }//GEN-LAST:event_tombolHapusActionPerformed

    private void tombolUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUbahActionPerformed
        setComponent(true);
        action = "Ubah";
    }//GEN-LAST:event_tombolUbahActionPerformed

    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
        setComponent(true);
        clearText();
        action = "Tambah";
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void inputCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCariActionPerformed

    private void tombolCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCariActionPerformed
        tombolUbah.setEnabled(true);
        tombolHapus.setEnabled(true);

        try{
            TableRuangan tabelRuangan = ruanganControl.showRuangan(inputCari.getText());
            int ruanganInt;
            String ruanganStr = inputCari.getText().trim();
            ruanganInt = Integer.parseInt(ruanganStr);
            Ruangan ruangan = ruanganControl.fetchDataRuangan(ruanganInt);
            if( tabelRuangan== null){
                clearText();
                tombolUbah.setEnabled(false);
                tombolHapus.setEnabled(false);
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
                setComponent(false);
            }else{
                tabelDataRuangan.setModel(tabelRuangan);
                inputNamaRuang.setText(ruangan.getNama());
                inputKapasitas.setText(ruangan.getKapasitas());
                inputLuas.setText(ruangan.getLuas());
                JOptionPane.showMessageDialog(this, "Data Ditemukan");
            }
        }catch(Exception e){
            System.out.println("Error:  "+e.getMessage());
        }
    }//GEN-LAST:event_tombolCariActionPerformed

    private void panelPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPeminjamanMouseClicked
        PeminjamanRuanganView peminjamanRuanganView = new PeminjamanRuanganView();
        this.dispose();
        peminjamanRuanganView.setVisible(true);
    }//GEN-LAST:event_panelPeminjamanMouseClicked

    private void tabelDataRuanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataRuanganMouseClicked
        setComponent(false);
        
        tombolUbah.setEnabled(true);
        tombolHapus.setEnabled(true);
        
        int clickedRow = tabelDataRuangan.getSelectedRow();
        TableRuangan tabelRuangan = (TableRuangan) tabelDataRuangan.getModel();
        
        selected = Integer.parseInt(tabelRuangan.getValueAt(clickedRow, 0).toString());
        
        String namaRuangan = tabelRuangan.getValueAt(clickedRow, 1).toString();
        String kapasitas = tabelRuangan.getValueAt(clickedRow, 2).toString();
        String luas = tabelRuangan.getValueAt(clickedRow, 3).toString();
    }//GEN-LAST:event_tabelDataRuanganMouseClicked

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
            java.util.logging.Logger.getLogger(Ruangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ruangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ruangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ruangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RuanganView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputCari;
    private javax.swing.JTextField inputKapasitas;
    private javax.swing.JTextField inputLuas;
    private javax.swing.JTextField inputNamaRuang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelKapasitas;
    private javax.swing.JLabel labelKaryawan;
    private javax.swing.JLabel labelKelompok;
    private javax.swing.JLabel labelLuas;
    private javax.swing.JLabel labelNPM1;
    private javax.swing.JLabel labelNPM2;
    private javax.swing.JLabel labelNamaRuang;
    private javax.swing.JLabel labelNamaUniv;
    private javax.swing.JLabel labelPeminjaman;
    private javax.swing.JLabel labelRuangan;
    private javax.swing.JPanel panelInput;
    private javax.swing.JPanel panelJudul;
    private javax.swing.JPanel panelKaryawan;
    private javax.swing.JPanel panelPeminjaman;
    private javax.swing.JPanel panelRuangan;
    private javax.swing.JTable tabelDataRuangan;
    private javax.swing.JButton tombolBatal;
    private javax.swing.JButton tombolCari;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolSimpan;
    private javax.swing.JButton tombolTambah;
    private javax.swing.JButton tombolUbah;
    // End of variables declaration//GEN-END:variables
}
