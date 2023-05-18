package control;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

import dao.KaryawanDAO;
import model.Karyawan;
import java.util.List;

public class KaryawanControl {
    private final KaryawanDAO karyawanDAO = new KaryawanDAO();

  public void insertDataKaryawan(Karyawan k) {
    karyawanDAO.insertKaryawan(k);
  }

  public void updateDataKaryawan(Karyawan k, String id) {
    karyawanDAO.updateKaryawan(k, id);
  }

  public void deleteDataKaryawan(String id) {
    karyawanDAO.deleteKaryawan(id);
  }

  public Karyawan fetchDataKaryawan(String id) {
    return karyawanDAO.fetchKaryawan(id);
  }

  public String showAllDataKaryawan() {
    var karyawanList = karyawanDAO.fetchAllKaryawan();
    StringBuilder result = new StringBuilder();
    for (Karyawan k : karyawanList)
      result.append(k.showData()).append("\n");
    return result.toString();
  }

  public String showAllDataDosen() {
    var karyawanList = karyawanDAO.fetchAllDosen();
    StringBuilder result = new StringBuilder();
    for (Karyawan k : karyawanList)
      result.append(k.showData()).append("\n");
    return result.toString();
  }

  public String showAllDataStaff() {
    var karyawanList = karyawanDAO.fetchAllStaff();
    StringBuilder result = new StringBuilder();
    for (Karyawan k : karyawanList)
      result.append(k.showData()).append("\n");
    return result.toString();
  }
  
  public String AutoID(String Jenis){
        return karyawanDAO.autoID(Jenis);
    }
  
  public List<Karyawan> showListKaryawan(){
      List<Karyawan> dataKaryawan = karyawanDAO.fetchAllKaryawan();
      return dataKaryawan;
  }
}
