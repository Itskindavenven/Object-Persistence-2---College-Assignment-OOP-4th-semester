package control;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

import java.util.List;
import model.Ruangan;
import dao.RuanganDAO;
import table.TableRuangan;

public class RuanganControl {
    private RuanganDAO rDao = new RuanganDAO();
    
    public Ruangan fetchDataRuangan(int id){
        return rDao.fetchRuangan(id);
    }
    
    public void insertDataRuangan(Ruangan r){
        rDao.insertRuangan(r);
    }
    
    public void updateDataRuangan(Ruangan r, int id){
        rDao.updateRuangan(r, id);
    }
    
    public void deleteDataRuangan(int id){
        rDao.deleteRuangan(id);
    }
    
    public List<Ruangan> showListRuangan() {
        List<Ruangan> dataRuangan = rDao.showRuangan("");
        return dataRuangan;
    }
    
    
    public TableRuangan showRuangan(String query){
        List<Ruangan> dataRuangan = rDao.showRuangan(query);
        TableRuangan tableRuangan = new TableRuangan(dataRuangan);
        
        return tableRuangan;
    }
    
}
