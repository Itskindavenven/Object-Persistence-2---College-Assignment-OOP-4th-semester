package dao;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya  
 */

import conncection.DbConnection;
import exception.InvalidJenisKaryawanException;
import exception.InvalidKaryawanIDException;
import model.Karyawan;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KaryawanDAO {
  private final DbConnection dbConnection = new DbConnection();
  
  private Karyawan fetch(String query, Connection connection) throws SQLException, InvalidJenisKaryawanException, InvalidKaryawanIDException {
    Karyawan k = null;

    Statement statement = connection.createStatement();
    statement.execute(query);
    var resultSet = statement.getResultSet();

    while (resultSet.next()) {
      k = new Karyawan(
              resultSet.getString("id"),
              resultSet.getString("nama"),
              resultSet.getString("jenis"),
              resultSet.getInt("tahunmasuk"),
              resultSet.getString("notelepon"),
              resultSet.getString("bebanmengajar"),
              resultSet.getInt("jamkerja")
      );
    }

    statement.close();
    return k;
  }

  private List<Karyawan> fetchAll(String query, Connection connection) throws SQLException, InvalidJenisKaryawanException, InvalidKaryawanIDException {
    List<Karyawan> karyawanList = new ArrayList<>();

    Statement statement = connection.createStatement();
    statement.execute(query);
    var resultSet = statement.getResultSet();

    while (resultSet.next()) {
      Karyawan k = new Karyawan(
              resultSet.getString("id"),
              resultSet.getString("nama"),
              resultSet.getString("jenis"),
              resultSet.getInt("tahunmasuk"),
              resultSet.getString("notelepon"),
              resultSet.getString("bebanmengajar"),
              resultSet.getInt("jamkerja")
      );
      karyawanList.add(k);
    }

    statement.close();
    return karyawanList;
  }

  public void insertKaryawan(Karyawan k) {
    Connection connection = dbConnection.makeConnection();

    String query = "INSERT INTO karyawan VALUES ('" + k.getId() + "', '" + k.getNama() + "', '" + k.getJenis() + "', '" + k.getTahunMasuk() + "', '" + k.getNoTelepon() + "', '" + k.getBebanMengajar() + "', '" + k.getJamKerja() + "')";
    System.out.println("Adding new karyawan...");

    try {
      Statement statement = connection.createStatement();
      int result = statement.executeUpdate(query);
      System.out.println("Added " + result + " karyawan!");
      statement.close();
    } catch (Exception e) {
      System.out.println("Error while trying to add new karyawan!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }

  public List<Karyawan> fetchAllKaryawan() {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM karyawan";
    System.out.println("Fetching all karyawan...");

    List<Karyawan> karyawanList = new ArrayList<>();

    try {
      karyawanList = fetchAll(query, connection);
    } catch (Exception e) {
      System.out.println("Error while trying to fetch karyawan!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return karyawanList;
  }

  public Karyawan fetchKaryawan(String id) {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM karyawan WHERE id = '" + id + "'";
    System.out.println("Fetching karyawan...");

    Karyawan k = null;

    try {
      k = fetch(query, connection);
    } catch (Exception e) {
      System.out.println("Error while trying to fetch karyawan!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return k;
  }

  public void updateKaryawan(Karyawan k, String id) {
    Connection connection = dbConnection.makeConnection();

    String query = "UPDATE karyawan SET id = '" + k.getId() + "', nama = '" + k.getNama() + "', jenis = '" + k.getJenis() + "', tahunmasuk = '" + k.getTahunMasuk() + "', notelepon = '" + k.getNoTelepon() + "', bebanmengajar = '" + k.getBebanMengajar() + "', jamkerja = '" + k.getJamKerja() + "' WHERE id = '" + id + "'";
    System.out.println("Updating karyawan...");

    try {
      Statement statement = connection.createStatement();
      int result = statement.executeUpdate(query);
      System.out.println("Updated " + result + " karyawan!");
      statement.close();
    } catch (Exception e) {
      System.out.println("Error while trying to update karyawan!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }

  public void deleteKaryawan(String id) {
    Connection connection = dbConnection.makeConnection();

    String query = "DELETE FROM karyawan WHERE id = '" + id + "'";
    System.out.println("Deleting karyawan...");

    try {
      Statement statement = connection.createStatement();
      int result = statement.executeUpdate(query);
      System.out.println("Deleted " + result + " karyawan!");
      statement.close();
    } catch (Exception e) {
      System.out.println("Error while trying to delete karyawan!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
  }

  public List<Karyawan> fetchAllDosen() {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM karyawan WHERE jenis = 'Dosen'";
    System.out.println("Fetching all dosen...");

    List<Karyawan> karyawanList = new ArrayList<>();

    try {
      karyawanList = fetchAll(query, connection);
    } catch (Exception e) {
      System.out.println("Error while trying to fetch dosen!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return karyawanList;
  }

  public Karyawan fetchDosen(String id) {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM karyawan WHERE id = '" + id + "' AND jenis = 'Dosen'";
    System.out.println("Fetching dosen...");

    Karyawan k = null;

    try {
      k = fetch(query, connection);
    } catch (Exception e) {
      System.out.println("Error while trying to fetch dosen!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return k;
  }

  public List<Karyawan> fetchAllStaff() {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM karyawan WHERE jenis = 'Staff'";
    System.out.println("Fetching all staff...");

    List<Karyawan> karyawanList = new ArrayList<>();

    try {
      karyawanList = fetchAll(query, connection);
    } catch (Exception e) {
      System.out.println("Error while trying to fetch staff!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return karyawanList;
  }

  public Karyawan fetchStaff(String id) {
    Connection connection = dbConnection.makeConnection();

    String query = "SELECT * FROM karyawan WHERE id = '" + id + "' AND jenis = 'Staff'";
    System.out.println("Fetching staff...");

    Karyawan k = null;

    try {
      k = fetch(query, connection);
    } catch (Exception e) {
      System.out.println("Error while trying to fetch staff!");
      System.out.println(e.getMessage());
    } finally {
      dbConnection.closeConnection();
    }
    return k;
  }
  
  public String autoID(String Jenis){
        String template = null;
        String idFull = null;
        Connection connection = dbConnection.makeConnection();
        String SQL = "SELECT id FROM karyawan WHERE jenis = '" +Jenis+ "' order by id desc";
        if(Jenis.equals("Dosen")){
            template = "DSN-";
        }else if(Jenis.equals("Staff")){
            template = "STU-";
        }
       try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL);

            if (rs.next()) {
                String id = rs.getString("id");
                if (id.length() > template.length()) {
                    int num = Integer.parseInt(id.substring(template.length()));
                    int n = num + 1;
                    String Snum = Integer.toString(n);
                    idFull = template + Snum;
                } else {
                    idFull = template + "1";
                }
            } else {
                idFull = template + "1";
            }
        }catch (Exception e){
            System.out.println("Error Auto ID");
            System.out.println(e);
        }
        dbConnection.closeConnection();
        return idFull;
    }



}
