package model;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

public class Karyawan {
    private String id;
    private String nama;
    private String jenis;
    private int tahunMasuk;
    private String notelepon;
    private String bebanmengajar;
    private int jamkerja;

    public Karyawan(String id, String nama, String jenis, int tahunMasuk, String notelepon, String bebanmengajar, int jamkerja) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.tahunMasuk = tahunMasuk;
        this.notelepon = notelepon;
        this.bebanmengajar = bebanmengajar;
        this.jamkerja = jamkerja;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public int getTahunMasuk(){
        return tahunMasuk;
    }
    
    public void setTahunMasuk(int tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }
    
    public String getNoTelepon(){
        return notelepon;
    }
    
    public void setNoTelepon(String notelepon){
        this.notelepon = notelepon;
    }
    
    public String getBebanMengajar(){
        return bebanmengajar;
    }
    
    public void setBebanMengajar(String bebanmengajar){
        this.bebanmengajar = bebanmengajar;
    }
    
    public int getJamKerja(){
        return jamkerja;
    }
    
    public void setJamKerja(int jamkerja){
        this.jamkerja = jamkerja;
    }
    
    public String showData(){
        return
                this.id + " | "
                + this.nama + " | "
                + this.jenis + " | "
                + this.tahunMasuk + " | "
                + this.notelepon + " | "
                + this.bebanmengajar + " | "
                + this.jamkerja + " | ";
    }
    
    @Override
    public String toString(){
        return nama;
    }
}
