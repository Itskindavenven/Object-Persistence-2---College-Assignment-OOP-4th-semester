package dao;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

import conncection.DbConnection;
import model.Ruangan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RuanganDAO {
    private final DbConnection dbConnection = new DbConnection();
    private Connection con;
    
    private Ruangan fetch(String query) throws SQLException{
        Ruangan r = null;
        
        Statement statement = con.createStatement();
        statement.execute(query);
        var resultSet = statement.getResultSet();
        
        while (resultSet.next()){
            r = new Ruangan(resultSet.getInt("id"), 
                    resultSet.getString("nama"),
                    resultSet.getString("kapasitas"),
                    resultSet.getString("luas"));
        }
        
        statement.close();
        return r;
    }
    
    public void insertRuangan(Ruangan r){
        con = dbConnection.makeConnection();
        String query = "INSERT INTO ruangan VALUES ('" + r.getId()+ "', '"+ r.getNama() + "', '" + r.getKapasitas() + "', '" + r.getLuas() + "')";
        System.out.println("Adding new ruangan..");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Added "+result+" ruangan");
            statement.close();
        }catch(Exception e){
            System.out.println("Error while tring to add new ruangan");
            System.out.println(e);
        }finally{
            dbConnection.closeConnection();
        }
    }
    
    public List<Ruangan> showRuangan(String query) {
        con = dbConnection.makeConnection();
        
        String sql = "SELECT * FROM ruangan";
        System.out.println("Mengambil data Ruangan...");
        
        List<Ruangan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Ruangan r = new Ruangan(
                                rs.getInt("id"),
                                rs.getString("nama"),
                                rs.getString("kapasitas"),
                                rs.getString("luas")
                    );
                list.add(r);
                }
            }
            rs.close();
            statement.close();
        }catch (Exception e){
            System.out.println("Error reading database");
            System.out.println(e);
        }
        dbConnection.closeConnection();
        return list;
    }
    
    public void updateRuangan(Ruangan r, int id){
        con = dbConnection.makeConnection();
        
        String query = "UPDATE ruangan SET id = '" + r.getId() + "', nama = '" + r.getNama() + "', kapasitas = '" + r.getKapasitas() + "', luas = '" + r.getLuas() + "' WHERE id = '" + id + "'";
        System.out.println("Updating Ruangan..");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Updated "+result + " ruangan!");
            statement.close();
        }catch (Exception e){
            System.out.println("Error while trying to update ruangan!");
            System.out.println(e);
        }finally{
            dbConnection.closeConnection();
        }
    }
    
    public void deleteRuangan(int id){
        con = dbConnection.makeConnection();
        
        String query = "DELETE FROM ruangan WHERE id = '"+id+"'";
        System.out.println("Deleting ruangan..");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(query);
            System.out.println("Deleted " + result + " ruangan!");
            statement.close();
        }catch (Exception e){
            System.out.println("Error while trying to delete ruangan!");
        }finally {
            dbConnection.closeConnection();
        }
    }

    public Ruangan fetchRuangan(int id) {
        con = dbConnection.makeConnection();
        
        String query = "SELECT * FROM ruangan WHERE id = '" + id + "'";
        System.out.println("Fetching Ruangan...");
        
        Ruangan r = null;
        
        try{
            r = fetch(query);
        }catch (Exception e){
            System.out.println("Error while trying to fetching Ruangan!");
            System.out.println(e.getMessage());
        }finally{
            dbConnection.closeConnection();
        }
        
        return r;
    }
}
