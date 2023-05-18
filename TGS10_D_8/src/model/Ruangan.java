package model;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

public class Ruangan {
    private int id;
    private String nama;
    private String kapasitas;
    private String luas;

    public Ruangan(int id, String nama, String kapasitas, String luas) {
        this.id = id;
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.luas = luas;
    }

    public Ruangan(String nama, String kapasitas, String luas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.luas = luas;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getLuas() {
        return luas;
    }

    public void setLuas(String luas) {
        this.luas = luas;
    }
    
    @Override
    public String   toString(){
        return nama;
    }
    
    public String showDataRuangan(){
        return
                this.id+"|"
                +this.nama+"|"
                +this.kapasitas+"|"
                +this.luas+"|";
    }
}
