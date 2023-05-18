package dao;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

import conncection.DbConnection;
import model.Karyawan;
import model.PeminjamanRuangan;
import model.Ruangan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PeminjamanRuangDAO {
    private final DbConnection dbCon = new DbConnection();
    private Connection con;
    
    private PeminjamanRuangan fetch(String query) throws SQLException{
        PeminjamanRuangan pr = null;
        Karyawan k = null;
        Ruangan r = null;
        
        Statement statement = con.createStatement();
        statement.execute(query);
        var rs = statement.getResultSet();
        while (rs.next()){
            k = new Karyawan(
                        rs.getString("k.id"),
                        rs.getString("k.nama"),
                        rs.getString("k.jenis"),
                        rs.getInt("k.tahunmasuk"),
                        rs.getString("k.notelepon"),
                        rs.getString("k.bebanmengajar"),
                        rs.getInt("k.jamkerja")
                    );
                    
            r = new Ruangan(
                                rs.getInt("r.id"),
                                rs.getString("r.nama"),
                                rs.getString("r.kapasitas"),
                                rs.getString("r.luas")
                    );
                    
            pr = new PeminjamanRuangan(Integer.parseInt(rs.getString("p.id")),
                            rs.getString("p.tanggal"),
                            rs.getString("p.lama_peminjaman"),
                            rs.getString("p.fasilitas"),
                            k, r);
        }
        statement.close();
        return pr;
    }
    
    public void insertPeminjamanRuangan(PeminjamanRuangan pr){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO peminjaman_ruangan(id_karyawan, id_ruangan, tanggal, lama_peminjaman, fasilitas)" 
                + "VALUES ('" + pr.getKaryawan().getId() 
                + "', '"+pr.getRuangan().getId()
                +"', '"+pr.getTanggal()
                +"', '"+pr.getLamaPeminjaman()
                +"', '"+pr.getFasilitas()
                +"')";
                
        System.out.println("Adding Peminjaman Ruangan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added"+result+" Peminjaman Ruangan");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Peminjaman Ruangan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<PeminjamanRuangan> showPeminjamanRuangan(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT p.*, k.*, r.* FROM peminjaman_ruangan as p JOIN karyawan as k ON p.id_karyawan = k.id JOIN ruangan as r ON p.id_ruangan = r.id WHERE (k.nama LIKE " + "'%" + query + "%'"
                + "OR k.jenis LIKE '%" + query + "%'" + "OR r.nama LIKE '%" + query + "%'"
                + "OR p.tanggal LIKE '%" + query + "%'"  + "OR p.lama_peminjaman LIKE '%" + query + "%'"
                + "OR p.fasilitas LIKE '%" + query + "%'" + "OR k.bebanMengajar LIKE '%" + query + "%'"
                + "OR k.jamKerja LIKE '%" + query + "%') " + "ORDER BY p.id";
        System.out.println("Mengambil data Peminjaman ruangan..");
        
        List<PeminjamanRuangan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Karyawan k = new Karyawan(
                        rs.getString("k.id"),
                        rs.getString("k.nama"),
                        rs.getString("k.jenis"),
                        rs.getInt("k.tahunmasuk"),
                        rs.getString("k.notelepon"),
                        rs.getString("k.bebanmengajar"),
                        rs.getInt("k.jamkerja")
                    );
                    
                    Ruangan r = new Ruangan(
                                rs.getInt("r.id"),
                                rs.getString("r.nama"),
                                rs.getString("r.kapasitas"),
                                rs.getString("r.luas")
                    );
                    
                    PeminjamanRuangan pr = new PeminjamanRuangan(Integer.parseInt(rs.getString("p.id")),
                            rs.getString("p.tanggal"),
                            rs.getString("p.lama_peminjaman"),
                            rs.getString("p.fasilitas"),
                            k, r);
                    
                    list.add(pr);
                }
            }
            rs.close();
            statement.close();
        }catch (Exception e){
            System.out.println("Error reading database....");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        return list;
    }
    
    public void updatePeminjamanRuangan(PeminjamanRuangan pr){
        con = dbCon.makeConnection();
        
        String sql =  "UPDATE peminjaman_ruangan SET id_karyawan = '" + pr.getKaryawan().getId()
                + "', id_ruangan = '" + pr.getRuangan().getId()
                + "', tanggal = '" + pr.getTanggal()
                + "', lama_peminjaman = '" + pr.getLamaPeminjaman()
                + "', fasilitas = '" + pr.getFasilitas()
                + "' WHERE id = '" + pr.getId() + "'";
        
        System.out.println(sql);
        System.out.println("Editing Peminjaman Ruangan...");
        
        try{
            Statement statement = con.createStatement();
            int result  = statement.executeUpdate(sql);
            System.out.println("Edited " + result +" Peminjaman Ruangan" + pr.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing mata kuliah...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void deletePeminjamanRuangan(int id){
        Connection connection = dbCon.makeConnection();
        String sql = "DELETE FROM peminjaman_ruangan WHERE id = '" + id + "'";
        
        System.out.println("Deleting peminjaman ruangan...");
        
        try{
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Deleted "+result+" Peminjaman Ruangan id "+id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting peminjaman ruangan...");
            System.out.println(e.getMessage());
        }finally{
            dbCon.closeConnection();
        }
    }
    
    public PeminjamanRuangan fetchPeminjaman(int id){
        con = dbCon.makeConnection();
        
        String query = "SELECT * FROM peminjaman_ruangan WHERE id = '" + id + "'";
        System.out.println("Fetching Peminjaman Ruangan...");
        
        PeminjamanRuangan pr = null;
        
        try{
            pr = fetch(query);
        }catch (Exception e){
            System.out.println("Error while trying to fetching Peminjaman Ruangan!");
            System.out.println(e.getMessage());
        }finally{
            dbCon.closeConnection();
        }
        
        return pr;
    }
}
