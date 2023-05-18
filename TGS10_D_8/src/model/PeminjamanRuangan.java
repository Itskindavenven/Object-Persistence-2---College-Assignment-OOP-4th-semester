package model;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

public class PeminjamanRuangan {
    private int id;
    private String tanggal;
    private String lama_peminjaman;
    private String fasilitas;
    private Karyawan karyawan;
    private Ruangan ruangan;

    public PeminjamanRuangan(int id, String tanggal, String lama_peminjaman, String fasilitas, Karyawan karyawan, Ruangan ruangan) {
        this.id = id;
        this.tanggal = tanggal;
        this.lama_peminjaman = lama_peminjaman;
        this.fasilitas = fasilitas;
        this.karyawan = karyawan;
        this.ruangan = ruangan;
    }

    public PeminjamanRuangan(String tanggal, String lama_peminjaman, String fasilitas, Karyawan karyawan, Ruangan ruangan) {
        this.tanggal = tanggal;
        this.lama_peminjaman = lama_peminjaman;
        this.fasilitas = fasilitas;
        this.karyawan = karyawan;
        this.ruangan = ruangan;
    }

    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getTanggal(){
        return tanggal;
    }
    
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    
    public String getLamaPeminjaman(){
        return lama_peminjaman;
    }
    
    public void setLamaPeminjaman(String lamaPeminjaman){
        this.lama_peminjaman = lamaPeminjaman;
    }
    
    public String getFasilitas(){
        return fasilitas;
    }
    
    public void setFasilitas(String fasilitas){
        this.fasilitas = fasilitas;
    }
    
    public Karyawan getKaryawan(){
        return karyawan;
    }
    
    public void setKaryawan(Karyawan karyawan){
        this.karyawan = karyawan;
    }
    
    public Ruangan getRuangan(){
        return ruangan;
    }
    
    public void setRuangan(Ruangan ruangan){
        this.ruangan = ruangan;
    }

}
